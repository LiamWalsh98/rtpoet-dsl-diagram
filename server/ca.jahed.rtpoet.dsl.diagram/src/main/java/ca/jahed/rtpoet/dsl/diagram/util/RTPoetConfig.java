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
package ca.jahed.rtpoet.dsl.diagram.util;

public final class RTPoetConfig {

	public static final class Types {

		public static final String LABEL_NAME = "label:name";
		public static final String LABEL_TEXT = "label:text";
		public static final String LABEL_EDGE_NAME = "label:edge-name";
		public static final String ATTRIBUTE = "node:attribute";

		// States
        public static final String SIMPLE_STATE = "node:state";
        public static final String COMPOSITE_STATE = "node:state:composite";

        public static final String INITIAL_POINT = "node:state:initial-point";
        public static final String ENTRY_POINT = "node:state:entry-point";
        public static final String EXIT_POINT = "node:state:exit-point";
        public static final String CHOICE_POINT = "node:state:choice-point";
        public static final String JUNCTION_POINT = "node:state:junction-point";
        public static final String DEEP_HISTORY = "node:state:deep-history";

        public static final String TRANSITION = "edge:transition";

        public static final String TRANSITION_GUARD = "label:transition:guard";
        public static final String STATE_NAME = "label:state:name";

        // Values


        private Types() {
		};
	}

	public static final class CSS {

		public static final String NODE = "rtpoet-node";
		public static final String EDGE = "rtpoet-edge";
		public static final String TRANSITION = "transition";

		private CSS() {
		};
	}

	private RTPoetConfig() {
	};
}
