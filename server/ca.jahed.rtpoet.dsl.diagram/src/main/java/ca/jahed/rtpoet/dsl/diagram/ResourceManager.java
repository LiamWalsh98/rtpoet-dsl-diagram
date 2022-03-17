/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package ca.jahed.rtpoet.dsl.diagram;

import ca.jahed.rtpoet.dsl.diagram.model.RTPoetModelState;
import ca.jahed.rtpoet.dsl.rt.RtPackage;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.glsp.server.protocol.GLSPServerException;
import org.eclipse.glsp.server.utils.ClientOptions;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class ResourceManager {
	public static final String RTPOET_EXTENSION = ".rt";

	private static Logger LOG = Logger.getLogger(ResourceManager.class);

	private ResourceSet resourceSet;
	private String baseSourceUri;
	private RTPoetFacade rtpoetFacade;
	private EditingDomain editingDomain;

	public ResourceManager(RTPoetModelState modelState) {
		String sourceURI = ClientOptions.getValue(modelState.getClientOptions(), ClientOptions.SOURCE_URI)
				.orElseThrow(() -> new GLSPServerException("No source uri given to load model!"));

		this.baseSourceUri = sourceURI.substring(0, sourceURI.lastIndexOf('.'));
		this.resourceSet = setupResourceSet();
		createRTPoetFacade(modelState.getIndex());
	}

	protected ResourceSet setupResourceSet() {
		editingDomain = new AdapterFactoryEditingDomain(new EcoreAdapterFactory(), new BasicCommandStack());
		ResourceSet resourceSet = editingDomain.getResourceSet();
		resourceSet.getPackageRegistry().put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(RtPackage.eINSTANCE.getNsURI(), RtPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		return resourceSet;
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public RTPoetFacade getRTPoetFacade() {
		return rtpoetFacade;
	}

	protected RTPoetFacade createRTPoetFacade(RTPoetModelIndex modelIndex) {
		try {
			Resource resource = loadResource(convertToFile(getSemanticURI()));
			rtpoetFacade = new RTPoetFacade(resource);
			return rtpoetFacade;
		} catch (IOException e) {
			LOG.error(e);
			throw new GLSPServerException("Error during mode loading", e);
		}
	}

	public String getSemanticURI() {
		return baseSourceUri + RTPOET_EXTENSION;
	}

	private File convertToFile(String sourceURI) {
		if (sourceURI != null) {
			return new File(sourceURI);
		}
		return null;
	}

	private Resource loadResource(File file) throws IOException {
		Resource resource = createResource(file.getAbsolutePath());
		configureResource(resource);
		if (file.exists()) {
			resource.load(Collections.EMPTY_MAP);
		}
		return resource;
	}

	private void configureResource(Resource resource) {
		if (resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource)resource;
			xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
		}
	}

	private Resource createResource(String path) {
		return resourceSet.createResource(URI.createFileURI(path));
	}

	public void save() {
		try {
			rtpoetFacade.getResource().save(Collections.EMPTY_MAP);
			handleSaveErrors(rtpoetFacade.getResource());
		} catch (IOException e) {
			throw new GLSPServerException("Could not save resource", e);
		}
	}

	private void handleSaveErrors(Resource resource) {
		if (resource.getErrors().isEmpty()) {
			return;
		}
		
		LOG.error("Some errors have been found while saving "+resource.getURI().lastSegment()+":");
		for (Diagnostic d : resource.getErrors()) {
			if (d instanceof Exception) {
				LOG.error(d.getMessage(), (Exception) d);
			}
		}
	
	}

}
