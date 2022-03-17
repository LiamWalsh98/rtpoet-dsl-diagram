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
    DiagramWidgetOptions,
    GLSPDiagramManager,
    GLSPWidgetOpenerOptions,
    GLSPWidgetOptions
} from "@eclipse-glsp/theia-integration/lib/browser";
import URI from "@theia/core/lib/common/uri";
import { WorkspaceService } from "@theia/workspace/lib/browser";
import { inject, injectable, postConstruct } from "inversify";

import { RTPoetLanguage } from '../../common/rtpoet-language';

export interface RTPoetDiagramWidgetOptions extends DiagramWidgetOptions, GLSPWidgetOptions {
    workspaceRoot: string;
}
// import { RTPoetGLSPDiagramClient } from './rtpoet-glsp-diagram-client';
// import {TheiaGLSPConnectorRegistry} from "@eclipse-glsp/theia-integration/src/browser/diagram/theia-glsp-connector";

@injectable()
export class RTPoetDiagramManager extends GLSPDiagramManager {

    @inject(WorkspaceService) workspaceService: WorkspaceService;

    readonly diagramType = RTPoetLanguage.diagramType;
    readonly label = RTPoetLanguage.label + " Editor";

    private workspaceRoot: string;

    @postConstruct()
    protected async initialize(): Promise<void> {
        super.initialize();
        this.workspaceService.roots.then(roots => this.workspaceRoot = roots[0].resource.toString());
    }

    get fileExtensions(): string[] {
        return RTPoetLanguage.fileExtensions;
    }

    protected createWidgetOptions(uri: URI, options?: GLSPWidgetOpenerOptions): RTPoetDiagramWidgetOptions {
        return {
            ...super.createWidgetOptions(uri, options),
            workspaceRoot: this.workspaceRoot
        } as RTPoetDiagramWidgetOptions;
    }

    get iconClass(): string {
        return RTPoetLanguage.iconClass!;
    }
}
