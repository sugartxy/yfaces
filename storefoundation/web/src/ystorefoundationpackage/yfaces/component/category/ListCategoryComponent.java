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
package ystorefoundationpackage.yfaces.component.category;



import de.hybris.platform.category.model.CategoryModel;
import de.hybris.yfaces.component.YComponent;

import java.util.List;


/**
 * This component lists all sub-categories of the selected category.
 */
public interface ListCategoryComponent extends YComponent
{

	List<CategoryModel> getCategoryList();

	void setCategoryList(List<CategoryModel> categoryList);

}