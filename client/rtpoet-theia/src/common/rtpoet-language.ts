/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
import {GLSPDiagramLanguage} from "@eclipse-glsp/theia-integration";

export const RTPoetLanguage: GLSPDiagramLanguage = {
    contributionId: 'RTPoet',
    label: 'RTPoet diagram',
    // consider changing to 'rtpoet' as 'diagram' is added elsewhere to element
    diagramType: 'rtpoet-diagram',
    fileExtensions: ['.rt'],
    iconClass: 'codicon codicon-type-hierarchy-sub file-icon'
};
