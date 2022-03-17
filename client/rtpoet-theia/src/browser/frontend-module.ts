/********************************************************************************
 * Copyright (c) 2019-2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
import {
    ContainerContext,
    GLSPClientContribution, GLSPDiagramManager,
    GLSPTheiaFrontendModule,
    registerDiagramManager,
    TheiaGLSPConnector
} from "@eclipse-glsp/theia-integration/lib/browser";
// import { CommandContribution, MenuContribution } from "@theia/core";
// import { WebSocketConnectionProvider } from "@theia/core/lib/browser";
// import { WorkspaceDeleteHandler } from "@theia/workspace/lib/browser/workspace-delete-handler";
import { DiagramConfiguration } from "sprotty-theia/lib";
import {RTPoetLanguage} from "../common/rtpoet-language";
import {RTPoetTheiaGLSPConnector} from "./diagram/rtpoet-theia-glsp-connector";
import {RTPoetDiagramConfiguration} from "./diagram/rtpoet-diagram-configuration";
import {RTPoetGLSPClientContribution} from "./language/rtpoet-glsp-client-contribution";
import {RTPoetDiagramManager} from "./diagram/rtpoet-diagram-manager";

// import { EcoreLanguage } from "../common/ecore-language";
// import { EcoreModelServerClient } from "../common/ecore-model-server-client";
// import { FILEGEN_SERVICE_PATH, FileGenServer } from "../common/generate-protocol";
// import { EcoreCommandContribution } from "./command-contribution";
// import { EcoreDiagramConfiguration } from "./diagram/ecore-diagram-configuration";
// import { EcoreDiagramManager } from "./diagram/ecore-diagram-manager";
// import { EcoreTheiaGLSPConnector } from "./diagram/ecore-theia-glsp-connector";
// import { EcoreGLSPClientContribution } from "./glsp-client-contribution";
// import { EcoreWorkspaceDeleteHandler } from "./workspace-delete-handler";

export class RTPoetTheiaFrontendModule extends GLSPTheiaFrontendModule {

    readonly diagramLanguage = RTPoetLanguage;

    bindTheiaGLSPConnector(context: ContainerContext): void {
        context.bind(TheiaGLSPConnector).toDynamicValue(dynamicContext => {
            const connector = dynamicContext.container.resolve(RTPoetTheiaGLSPConnector);
            connector.doConfigure(this.diagramLanguage);
            return connector;
        });
        // context.bind(TheiaGLSPConnector).to(RTPoetTheiaGLSPConnector);
    }

    bindDiagramConfiguration(context: ContainerContext): void {
        context.bind(DiagramConfiguration).to(RTPoetDiagramConfiguration);
    }

    // todo: maybe this was the fix to the unfound path
    bindGLSPClientContribution(context: ContainerContext): void {
        context.bind(GLSPClientContribution).to(RTPoetGLSPClientContribution);
    }

    // configure(context: ContainerContext): void {
        // context.bind(CommandContribution).to(EcoreCommandContribution);
        // context.bind(MenuContribution).to(EcoreCommandContribution);
        // context.bind(EcoreWorkspaceDeleteHandler).toSelf().inSingletonScope();
        // context.rebind(WorkspaceDeleteHandler).toService(EcoreWorkspaceDeleteHandler);

        // context.bind(FileGenServer).toDynamicValue(ctx => {
        //     const connection = ctx.container.get(WebSocketConnectionProvider);
        //     return connection.createProxy<FileGenServer>(FILEGEN_SERVICE_PATH);
        // }).inSingletonScope();

        // context.bind(EcoreModelServerClient).toService(ModelServerClient);
    // }

    configureDiagramManager(context: ContainerContext): void {
        // context.bind(GLSPDiagramManager).to(RTPoetDiagramManager).inSingletonScope();
        registerDiagramManager(context.bind, RTPoetDiagramManager);
    }

}

export default new RTPoetTheiaFrontendModule();

// /********************************************************************************
//  * Copyright (c) 2020 EclipseSource and others.
//  *
//  * This program and the accompanying materials are made available under the
//  * terms of the Eclipse Public License v. 2.0 which is available at
//  * http://www.eclipse.org/legal/epl-2.0.
//  *
//  * This Source Code may also be made available under the following Secondary
//  * Licenses when the conditions for such availability set forth in the Eclipse
//  * Public License v. 2.0 are satisfied: GNU General Public License, version 2
//  * with the GNU Classpath Exception which is available at
//  * https://www.gnu.org/software/classpath/license.html.
//  *
//  * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
//  ********************************************************************************/
// import {
//     GLSPClientContribution,
//     registerCopyPasteContextMenu,
//     registerDiagramLayoutCommands,
//     registerDiagramManager
// } from '@eclipse-glsp/theia-integration/lib/browser';
// import { ContainerModule, interfaces } from 'inversify';
// import { DiagramConfiguration } from 'sprotty-theia';
//
// import { RTPoetDiagramConfiguration } from './diagram/rtpoet-diagram-configuration';
// import { RTPoetDiagramManager } from './diagram/rtpoet-diagram-manager';
// // import { RTPoetGLSPDiagramClient } from './diagram/rtpoet-glsp-diagram-client';
// import { RTPoetGLSPClientContribution } from './language/rtpoet-glsp-client-contribution';
//
// export default new ContainerModule((bind: interfaces.Bind) => {
//     bind(RTPoetGLSPClientContribution).toSelf().inSingletonScope();
//     bind(GLSPClientContribution).toService(RTPoetGLSPClientContribution);
//     bind(DiagramConfiguration).to(RTPoetDiagramConfiguration).inSingletonScope();
//     // bind(RTPoetGLSPDiagramClient).toSelf().inSingletonScope();
//     registerDiagramManager(bind, RTPoetDiagramManager);
//
//     // Optional default commands and menus
//     registerDiagramLayoutCommands(bind);
//     registerCopyPasteContextMenu(bind);
// });
