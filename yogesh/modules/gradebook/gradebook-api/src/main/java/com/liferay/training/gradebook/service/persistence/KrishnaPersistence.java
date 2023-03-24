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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.gradebook.exception.NoSuchKrishnaException;
import com.liferay.training.gradebook.model.Krishna;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the krishna service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KrishnaUtil
 * @generated
 */
@ProviderType
public interface KrishnaPersistence extends BasePersistence<Krishna> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KrishnaUtil} to access the krishna persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching krishnas
	 */
	public java.util.List<Krishna> findByField2(int userId);

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
	public java.util.List<Krishna> findByField2(int userId, int start, int end);

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
	public java.util.List<Krishna> findByField2(
		int userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator);

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
	public java.util.List<Krishna> findByField2(
		int userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public Krishna findByField2_First(
			int userId,
			com.liferay.portal.kernel.util.OrderByComparator<Krishna>
				orderByComparator)
		throws NoSuchKrishnaException;

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public Krishna fetchByField2_First(
		int userId,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator);

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public Krishna findByField2_Last(
			int userId,
			com.liferay.portal.kernel.util.OrderByComparator<Krishna>
				orderByComparator)
		throws NoSuchKrishnaException;

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public Krishna fetchByField2_Last(
		int userId,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator);

	/**
	 * Removes all the krishnas where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByField2(int userId);

	/**
	 * Returns the number of krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching krishnas
	 */
	public int countByField2(int userId);

	/**
	 * Returns the krishna where description = &#63; or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param description the description
	 * @return the matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	public Krishna findBydescription(String description)
		throws NoSuchKrishnaException;

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param description the description
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public Krishna fetchBydescription(String description);

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param description the description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	public Krishna fetchBydescription(
		String description, boolean useFinderCache);

	/**
	 * Removes the krishna where description = &#63; from the database.
	 *
	 * @param description the description
	 * @return the krishna that was removed
	 */
	public Krishna removeBydescription(String description)
		throws NoSuchKrishnaException;

	/**
	 * Returns the number of krishnas where description = &#63;.
	 *
	 * @param description the description
	 * @return the number of matching krishnas
	 */
	public int countBydescription(String description);

	/**
	 * Caches the krishna in the entity cache if it is enabled.
	 *
	 * @param krishna the krishna
	 */
	public void cacheResult(Krishna krishna);

	/**
	 * Caches the krishnas in the entity cache if it is enabled.
	 *
	 * @param krishnas the krishnas
	 */
	public void cacheResult(java.util.List<Krishna> krishnas);

	/**
	 * Creates a new krishna with the primary key. Does not add the krishna to the database.
	 *
	 * @param userId the primary key for the new krishna
	 * @return the new krishna
	 */
	public Krishna create(int userId);

	/**
	 * Removes the krishna with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna that was removed
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	public Krishna remove(int userId) throws NoSuchKrishnaException;

	public Krishna updateImpl(Krishna krishna);

	/**
	 * Returns the krishna with the primary key or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	public Krishna findByPrimaryKey(int userId) throws NoSuchKrishnaException;

	/**
	 * Returns the krishna with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna, or <code>null</code> if a krishna with the primary key could not be found
	 */
	public Krishna fetchByPrimaryKey(int userId);

	/**
	 * Returns all the krishnas.
	 *
	 * @return the krishnas
	 */
	public java.util.List<Krishna> findAll();

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
	public java.util.List<Krishna> findAll(int start, int end);

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
	public java.util.List<Krishna> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator);

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
	public java.util.List<Krishna> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Krishna>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the krishnas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of krishnas.
	 *
	 * @return the number of krishnas
	 */
	public int countAll();

}