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

package com.liferay.training.gradebook.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.gradebook.model.Krishna;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the krishna service. This utility wraps <code>com.liferay.training.gradebook.service.persistence.impl.KrishnaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KrishnaPersistence
 * @generated
 */
public class KrishnaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Krishna krishna) {
		getPersistence().clearCache(krishna);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Krishna> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Krishna> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Krishna> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Krishna> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Krishna> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Krishna update(Krishna krishna) {
		return getPersistence().update(krishna);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Krishna update(
		Krishna krishna, ServiceContext serviceContext) {

		return getPersistence().update(krishna, serviceContext);
	}

	/**
	 * Returns all the krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching krishnas
	 */
	public static List<Krishna> findByField2(int userId) {
		return getPersistence().findByField2(userId);
	}

	/**
	 * Returns a range of all the krishnas where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @return the range of matching krishnas
	 */
	public static List<Krishna> findByField2(int userId, int start, int end) {
		return getPersistence().findByField2(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the krishnas where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching krishnas
	 */
	public static List<Krishna> findByField2(
		int userId, int start, int end,
		OrderByComparator<Krishna> orderByComparator) {

		return getPersistence().findByField2(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the krishnas where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching krishnas
	 */
	public static List<Krishna> findByField2(
		int userId, int start, int end,
		OrderByComparator<Krishna> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByField2(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public static Krishna findByField2_First(
			int userId, OrderByComparator<Krishna> orderByComparator)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().findByField2_First(userId, orderByComparator);
	}

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public static Krishna fetchByField2_First(
		int userId, OrderByComparator<Krishna> orderByComparator) {

		return getPersistence().fetchByField2_First(userId, orderByComparator);
	}

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public static Krishna findByField2_Last(
			int userId, OrderByComparator<Krishna> orderByComparator)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().findByField2_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public static Krishna fetchByField2_Last(
		int userId, OrderByComparator<Krishna> orderByComparator) {

		return getPersistence().fetchByField2_Last(userId, orderByComparator);
	}

	/**
	 * Removes all the krishnas where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByField2(int userId) {
		getPersistence().removeByField2(userId);
	}

	/**
	 * Returns the number of krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching krishnas
	 */
	public static int countByField2(int userId) {
		return getPersistence().countByField2(userId);
	}

	/**
	 * Returns the krishna where description = &#63; or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param description the description
	 * @return the matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public static Krishna findBydescription(String description)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().findBydescription(description);
	}

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param description the description
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public static Krishna fetchBydescription(String description) {
		return getPersistence().fetchBydescription(description);
	}

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param description the description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public static Krishna fetchBydescription(
		String description, boolean useFinderCache) {

		return getPersistence().fetchBydescription(description, useFinderCache);
	}

	/**
	 * Removes the krishna where description = &#63; from the database.
	 *
	 * @param description the description
	 * @return the krishna that was removed
	 */
	public static Krishna removeBydescription(String description)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().removeBydescription(description);
	}

	/**
	 * Returns the number of krishnas where description = &#63;.
	 *
	 * @param description the description
	 * @return the number of matching krishnas
	 */
	public static int countBydescription(String description) {
		return getPersistence().countBydescription(description);
	}

	/**
	 * Caches the krishna in the entity cache if it is enabled.
	 *
	 * @param krishna the krishna
	 */
	public static void cacheResult(Krishna krishna) {
		getPersistence().cacheResult(krishna);
	}

	/**
	 * Caches the krishnas in the entity cache if it is enabled.
	 *
	 * @param krishnas the krishnas
	 */
	public static void cacheResult(List<Krishna> krishnas) {
		getPersistence().cacheResult(krishnas);
	}

	/**
	 * Creates a new krishna with the primary key. Does not add the krishna to the database.
	 *
	 * @param userId the primary key for the new krishna
	 * @return the new krishna
	 */
	public static Krishna create(int userId) {
		return getPersistence().create(userId);
	}

	/**
	 * Removes the krishna with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna that was removed
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	public static Krishna remove(int userId)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().remove(userId);
	}

	public static Krishna updateImpl(Krishna krishna) {
		return getPersistence().updateImpl(krishna);
	}

	/**
	 * Returns the krishna with the primary key or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	public static Krishna findByPrimaryKey(int userId)
		throws com.liferay.training.gradebook.exception.NoSuchKrishnaException {

		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	 * Returns the krishna with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna, or <code>null</code> if a krishna with the primary key could not be found
	 */
	public static Krishna fetchByPrimaryKey(int userId) {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	 * Returns all the krishnas.
	 *
	 * @return the krishnas
	 */
	public static List<Krishna> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the krishnas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @return the range of krishnas
	 */
	public static List<Krishna> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the krishnas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of krishnas
	 */
	public static List<Krishna> findAll(
		int start, int end, OrderByComparator<Krishna> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the krishnas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of krishnas
	 */
	public static List<Krishna> findAll(
		int start, int end, OrderByComparator<Krishna> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the krishnas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of krishnas.
	 *
	 * @return the number of krishnas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static KrishnaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile KrishnaPersistence _persistence;

}