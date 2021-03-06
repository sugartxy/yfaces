/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2009 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package ystorefoundationpackage.yfaces.component.user;

import org.codehaus.yfaces.component.YModel;
import org.codehaus.yfaces.component.YEventHandler;


/**
 * The user can log in with this component. SSL mode is optional.
 */
public interface LoginComponent extends YModel
{
	public String getLogin();

	public void setLogin(String login);

	public String getPassword();

	public void setPassword(String password);

	public boolean isLoggedIn();


	public String getSuccessForward();

	public void setSuccessForward(String forward);

	public String getErrorForward();

	public void setErrorForward(String forward);

	public int getHTTPPort();

	public void setHTTPPort(int port);

	public int getSSLPort();

	public void setSSLPort(int port);


	public YEventHandler<LoginComponent> getLoginEvent();

	public YEventHandler<LoginComponent> getLogoutEvent();

	public YEventHandler<LoginComponent> getRegisterEvent();

	public YEventHandler<LoginComponent> getDemoLoginEvent();

	public YEventHandler<LoginComponent> getForgotPasswordEvent();

}
