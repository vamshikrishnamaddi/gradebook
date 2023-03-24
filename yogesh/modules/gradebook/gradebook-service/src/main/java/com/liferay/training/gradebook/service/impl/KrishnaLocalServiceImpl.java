/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.gradebook.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.gradebook.model.Krishna;
import com.liferay.training.gradebook.service.base.KrishnaLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.gradebook.model.Krishna",
	service = AopService.class
)
public class KrishnaLocalServiceImpl extends KrishnaLocalServiceBaseImpl {
	public Krishna AddVamshiKrishna(String name,String desc,int userId)
	{
		Krishna krishna = krishnaLocalService.createKrishna(userId);
		krishna.setDescription(desc);
		krishna.setName(name);
		krishnaLocalService.addKrishna(krishna);
		return krishna;
	}
	public Krishna GetVamshiKrishna(int userId)
	{
		try {
			Krishna krishna=krishnaLocalService.getKrishna(userId);
			return krishna;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public Krishna UpdateVamshiKrishna(String name,String desc,int userId)
	{
		Krishna krishna = krishnaLocalService.fetchKrishna(userId);
		krishna.setDescription(desc);
		krishna.setName(name);
		krishnaLocalService.updateKrishna(krishna);
		return krishna;
	}
	public Krishna DeleteVamshiKrishna(int userId)
	{
		try {
			Krishna krishna=krishnaLocalService.deleteKrishna(userId);
			return krishna;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
	}
	public List<Krishna> GetAllVamshiKrishna(int start, int end)
	{
		
		return krishnaLocalService.getKrishnas(0,krishnaLocalService.getKrishnasCount());
	}
}