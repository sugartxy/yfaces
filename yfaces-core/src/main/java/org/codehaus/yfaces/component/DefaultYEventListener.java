/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.yfaces.component;

/**
 * Default implementation for an {@link YEventListener}.<br/>
 * Does nothing when an event occurs.<br/>
 * 
 * @author Denny Strietzbaum
 */
public class DefaultYEventListener<T extends YModel> extends
		AbstractYEventListener<T> {

	private static final long serialVersionUID = 1L;

	//private static final Logger log = Logger.getLogger(DefaultYComponentEventListener.class);

	public DefaultYEventListener() {

	}

	public DefaultYEventListener(final String action) {
		super.setAction(action);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see storefoundation.yfaces.AbstractYComponentEventListener#action()
	 */
	@Override
	public String action() {
		// NOP
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see storefoundation.yfaces.AbstractYComponentEventListener#actionListener
	 * (storefoundation.yfaces.YComponentEvent)
	 */
	@Override
	public void actionListener(final YEvent<T> event) {
		// NOP
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see storefoundation.yfaces.AbstractYComponentEventListener#valueChangeListener
	 * (storefoundation.yfaces.YComponentEvent)
	 */
	@Override
	public void valueChangeListener(final YEvent<T> event) {
		// NOP
	}

}
