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
import 'sprotty-theia/css/theia-sprotty.css';

import { createRTPoetDiagramContainer } from '@rtpoet/rtpoet-glsp/lib';
// import { GLSP_TYPES } from '@eclipse-glsp/client';
import {
    configureDiagramServer,
    GLSPDiagramConfiguration,
    GlspSelectionDataService,
    TheiaDiagramServer
} from '@eclipse-glsp/theia-integration/lib/browser';
import { Container, injectable } from 'inversify';
// import { DiagramConfiguration } from 'sprotty-theia';
import { RTPoetGlspSelectionDataService } from "./selection-data-service";
import { RTPoetLanguage } from '../../common/rtpoet-language';
import { RTPoetGLSPTheiaDiagramServer } from "./rtpoet-glsp-theia-diagram-server";

@injectable()
export class RTPoetDiagramConfiguration extends GLSPDiagramConfiguration {

    diagramType: string = RTPoetLanguage.diagramType;

    // createContainer(widgetId: string): Container {
    //     const container = createRTPoetDiagramContainer(widgetId);
    //     container.bind(TYPES.ModelSource).to(GLSPTheiaDiagramServer).inSingletonScope();
    //     return container;
    // }

    doCreateContainer(widgetId: string): Container {
        const container = createRTPoetDiagramContainer(widgetId);
        configureDiagramServer(container, RTPoetGLSPTheiaDiagramServer);
        container.bind(TheiaDiagramServer).toService(RTPoetGLSPTheiaDiagramServer);
        container.bind(GlspSelectionDataService).to(RTPoetGlspSelectionDataService);
        return container;
    }
}
