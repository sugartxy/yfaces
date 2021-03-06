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

import java.util.Map;

import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.event.FacesEvent;

/**
 * Common event which gets thrown by a {@link YModel}<br/>
 * <br/>
 * Or more detailed:<br/>
 * This type of event gets created and thrown from within a {@link YEventHandler}<br/>
 * The {@link YEventHandler} takes the FacesEvent which was thrown by JSF, wraps it into
 * this event and notifies each registered {@link YEventListener}<br/>
 * 
 * @author Denny Strietzbaum
 */
public interface YEvent<T extends YModel> {
	/**
	 * Returns the nearest enclosing {@link UIForm} of the {@link UICommand} who fired this action.<br/>
	 * 
	 * @return {@link UIForm}
	 */
	public UIForm getUIForm();

	/**
	 * Returns the {@link UICommand} who fired this action.<br/>
	 * 
	 * @return {@link UICommand}
	 */
	public UIComponent getUIComponent();

	/**
	 * The {@link YModel} which was responsible for this event.
	 * 
	 * @return {@link YModel}
	 */
	public T getComponent();

	/**
	 * The {@link FacesEvent} which was thrown by JSF.<br/>
	 * 
	 * @return {@link FacesEvent}
	 */
	public FacesEvent getFacesEvent();

	/**
	 * A map of custom attributes. These are useful when a queue of {@link YEventListener}
	 * are registered at a {@link YEventHandler}. Using these attributes are a possibility to
	 * pass additional parameters (processing results etc.) to following listeners which are getting
	 * executed next.
	 * 
	 * @return map of custom attributes
	 */
	public Map<String, Object> getAttributes();

}
