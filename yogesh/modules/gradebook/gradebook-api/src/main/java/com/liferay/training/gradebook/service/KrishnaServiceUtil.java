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

import com.liferay.training.gradebook.model.Krishna;

import java.util.List;

/**
 * Provides the remote service utility for Krishna. This utility wraps
 * <code>com.liferay.training.gradebook.service.impl.KrishnaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see KrishnaService
 * @generated
 */
public class KrishnaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.gradebook.service.impl.KrishnaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Krishna adds(String name, String desc, int userId) {
		return getService().adds(name, desc, userId);
	}

	public static Krishna deletes(int userId) {
		return getService().deletes(userId);
	}

	public static List<Krishna> GetAll() {
		return getService().GetAll();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Krishna gets(int userId) {
		return getService().gets(userId);
	}

	public static Krishna updates(String name, String desc, int userId) {
		return getService().updates(name, desc, userId);
	}

	public static KrishnaService getService() {
		return _service;
	}

	private static volatile KrishnaService _service;

}