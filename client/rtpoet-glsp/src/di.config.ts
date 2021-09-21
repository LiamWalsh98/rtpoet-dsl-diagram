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
import '../css/diagram.css';

import {
    boundsModule,
    buttonModule, CircularNode, CircularNodeView,
    configureModelElement,
    ConsoleLogger,
    defaultGLSPModule,
    defaultModule,
    edgeLayoutModule,
    expandModule,
    exportModule,
    fadeModule,
    glspDecorationModule,
    GLSPGraph,
    glspHoverModule,
    glspMouseToolModule,
    glspSelectModule,
    glspServerCopyPasteModule,
    layoutCommandsModule,
    LogLevel,
    modelHintsModule,
    modelSourceModule,
    openModule,
    overrideViewerOptions,
    paletteModule,
    RectangularNode,
    RectangularNodeView,
    routingModule,
    SGraphView,
    toolFeedbackModule,
    toolsModule,
    TYPES,
    validationModule,
    viewportModule,
    zorderModule
} from '@eclipse-glsp/client';
import {
    ArrowEdge, SEditableLabel
} from './model';
import {
    ArrowEdgeView
} from './views';
import { Container, ContainerModule } from 'inversify';
import {SLabelView} from 'sprotty/lib';

const rtpoetDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
    rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope();
    rebind(TYPES.LogLevel).toConstantValue(LogLevel.warn);
    const context = { bind, unbind, isBound, rebind };
    configureModelElement(context, 'graph', GLSPGraph, SGraphView);
    configureModelElement(context, 'node', RectangularNode, RectangularNodeView);

    configureModelElement(context, 'node:state', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:composite', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:initial-point', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:entry-point', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:exit-point', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:choice-point', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:junction-point', CircularNode, CircularNodeView);
    configureModelElement(context, 'node:state:deep-history', CircularNode, CircularNodeView);

    configureModelElement(context, 'label:transition:guard', SEditableLabel, SLabelView);

    configureModelElement(context, 'edge:transition', ArrowEdge, ArrowEdgeView);
});

export default function createContainer(widgetId: string): Container {
    const container = new Container();

    container.load(validationModule, defaultModule, glspMouseToolModule, defaultGLSPModule, glspSelectModule, boundsModule, viewportModule, toolsModule,
        glspHoverModule, fadeModule, exportModule, expandModule, openModule, buttonModule, modelSourceModule,
        rtpoetDiagramModule, toolFeedbackModule, modelHintsModule, glspServerCopyPasteModule, paletteModule, routingModule, glspDecorationModule, edgeLayoutModule, zorderModule,
        layoutCommandsModule);

    overrideViewerOptions(container, {
        baseDiv: widgetId,
        hiddenDiv: widgetId + '_hidden',
        needsClientLayout: true
    });

    return container;
}
