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
import { getPort } from '@eclipse-glsp/protocol';
import {
    JavaSocketServerContribution,
    JavaSocketServerLaunchOptions
} from '@eclipse-glsp/theia-integration/lib/node';
import { injectable } from 'inversify';
import { createSocketConnection, IConnection } from "vscode-ws-jsonrpc/lib/server";

import { RTPoetLanguage } from '../common/rtpoet-language';
import {join, resolve} from 'path';
import * as net from 'net';

export const DEFAULT_PORT = 5007;
export const PORT_ARG_KEY = 'RTPOET_GLSP';
export const SERVER_DIR = join(__dirname, '..', '..', 'server');
export const JAR_FILE = resolve(join(__dirname, '..', '..', 'server', 'ca.jahed.rtpoet.dsl.diagram-0.1.0-ls.jar'));

@injectable()
export class RTPoetGLSPServerContribution extends JavaSocketServerContribution {
    readonly id = RTPoetLanguage.contributionId;

    createLaunchOptions(): Partial<JavaSocketServerLaunchOptions> {
        return {
            jarPath: JAR_FILE,
            socketConnectionOptions: {
                port: getPort(PORT_ARG_KEY, DEFAULT_PORT)
            },
            additionalArgs: ['--consoleLog', 'false',
                '--fileLog', 'true',
                '--logDir', SERVER_DIR],
        };
    }

}
