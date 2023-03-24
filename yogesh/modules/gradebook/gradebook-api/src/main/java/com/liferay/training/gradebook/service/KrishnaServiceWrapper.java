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

package com.liferay.training.gradebook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KrishnaService}.
 *
 * @author Brian Wing Shun Chan
 * @see KrishnaService
 * @generated
 */
public class KrishnaServiceWrapper
	implements KrishnaService, ServiceWrapper<KrishnaService> {

	public KrishnaServiceWrapper() {
		this(null);
	}

	public KrishnaServiceWrapper(KrishnaService krishnaService) {
		_krishnaService = krishnaService;
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna adds(
		String name, String desc, int userId) {

		return _krishnaService.adds(name, desc, userId);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna deletes(int userId) {
		return _krishnaService.deletes(userId);
	}

	@Override
	public java.util.List<com.liferay.training.gradebook.model.Krishna>
		GetAll() {

		return _krishnaService.GetAll();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _krishnaService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna gets(int userId) {
		return _krishnaService.gets(userId);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna updates(
		String name, String desc, int userId) {

		return _krishnaService.updates(name, desc, userId);
	}

	@Override
	public KrishnaService getWrappedService() {
		return _krishnaService;
	}

	@Override
	public void setWrappedService(KrishnaService krishnaService) {
		_krishnaService = krishnaService;
	}

	private KrishnaService _krishnaService;

}