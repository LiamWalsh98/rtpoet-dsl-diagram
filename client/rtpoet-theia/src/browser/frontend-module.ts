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
import {
    GLSPClientContribution,
    registerCopyPasteContextMenu,
    registerDiagramLayoutCommands,
    registerDiagramManager
} from '@eclipse-glsp/theia-integration/lib/browser';
import { ContainerModule, interfaces } from 'inversify';
import { DiagramConfiguration } from 'sprotty-theia';

import { RTPoetDiagramConfiguration } from './diagram/rtpoet-diagram-configuration';
import { RTPoetDiagramManager } from './diagram/rtpoet-diagram-manager';
import { RTPoetGLSPDiagramClient } from './diagram/rtpoet-glsp-diagram-client';
import { RTPoetGLSPClientContribution } from './language/rtpoet-glsp-client-contribution';

export default new ContainerModule((bind: interfaces.Bind) => {
    bind(RTPoetGLSPClientContribution).toSelf().inSingletonScope();
    bind(GLSPClientContribution).toService(RTPoetGLSPClientContribution);
    bind(DiagramConfiguration).to(RTPoetDiagramConfiguration).inSingletonScope();
    bind(RTPoetGLSPDiagramClient).toSelf().inSingletonScope();
    registerDiagramManager(bind, RTPoetDiagramManager);

    // Optional default commands and menus
    registerDiagramLayoutCommands(bind);
    registerCopyPasteContextMenu(bind);
});
