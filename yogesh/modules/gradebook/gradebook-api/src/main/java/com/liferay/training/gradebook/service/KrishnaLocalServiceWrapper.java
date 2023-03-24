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
 * Provides a wrapper for {@link KrishnaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KrishnaLocalService
 * @generated
 */
public class KrishnaLocalServiceWrapper
	implements KrishnaLocalService, ServiceWrapper<KrishnaLocalService> {

	public KrishnaLocalServiceWrapper() {
		this(null);
	}

	public KrishnaLocalServiceWrapper(KrishnaLocalService krishnaLocalService) {
		_krishnaLocalService = krishnaLocalService;
	}

	/**
	 * Adds the krishna to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KrishnaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param krishna the krishna
	 * @return the krishna that was added
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna addKrishna(
		com.liferay.training.gradebook.model.Krishna krishna) {

		return _krishnaLocalService.addKrishna(krishna);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna AddVamshiKrishna(
		String name, String desc, int userId) {

		return _krishnaLocalService.AddVamshiKrishna(name, desc, userId);
	}

	/**
	 * Creates a new krishna with the primary key. Does not add the krishna to the database.
	 *
	 * @param userId the primary key for the new krishna
	 * @return the new krishna
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna createKrishna(
		int userId) {

		return _krishnaLocalService.createKrishna(userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _krishnaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the krishna with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KrishnaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna that was removed
	 * @throws PortalException if a krishna with the primary key could not be found
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna deleteKrishna(
			int userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _krishnaLocalService.deleteKrishna(userId);
	}

	/**
	 * Deletes the krishna from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KrishnaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param krishna the krishna
	 * @return the krishna that was removed
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna deleteKrishna(
		com.liferay.training.gradebook.model.Krishna krishna) {

		return _krishnaLocalService.deleteKrishna(krishna);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _krishnaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna DeleteVamshiKrishna(
		int userId) {

		return _krishnaLocalService.DeleteVamshiKrishna(userId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _krishnaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _krishnaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _krishnaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _krishnaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _krishnaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _krishnaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _krishnaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _krishnaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna fetchKrishna(
		int userId) {

		return _krishnaLocalService.fetchKrishna(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _krishnaLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.training.gradebook.model.Krishna>
		GetAllVamshiKrishna(int start, int end) {

		return _krishnaLocalService.GetAllVamshiKrishna(start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _krishnaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the krishna with the primary key.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna
	 * @throws PortalException if a krishna with the primary key could not be found
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna getKrishna(int userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _krishnaLocalService.getKrishna(userId);
	}

	/**
	 * Returns a range of all the krishnas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.gradebook.model.impl.KrishnaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of krishnas
	 * @param end the upper bound of the range of krishnas (not inclusive)
	 * @return the range of krishnas
	 */
	@Override
	public java.util.List<com.liferay.training.gradebook.model.Krishna>
		getKrishnas(int start, int end) {

		return _krishnaLocalService.getKrishnas(start, end);
	}

	/**
	 * Returns the number of krishnas.
	 *
	 * @return the number of krishnas
	 */
	@Override
	public int getKrishnasCount() {
		return _krishnaLocalService.getKrishnasCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _krishnaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _krishnaLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna GetVamshiKrishna(
		int userId) {

		return _krishnaLocalService.GetVamshiKrishna(userId);
	}

	/**
	 * Updates the krishna in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KrishnaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param krishna the krishna
	 * @return the krishna that was updated
	 */
	@Override
	public com.liferay.training.gradebook.model.Krishna updateKrishna(
		com.liferay.training.gradebook.model.Krishna krishna) {

		return _krishnaLocalService.updateKrishna(krishna);
	}

	@Override
	public com.liferay.training.gradebook.model.Krishna UpdateVamshiKrishna(
		String name, String desc, int userId) {

		return _krishnaLocalService.UpdateVamshiKrishna(name, desc, userId);
	}

	@Override
	public KrishnaLocalService getWrappedService() {
		return _krishnaLocalService;
	}

	@Override
	public void setWrappedService(KrishnaLocalService krishnaLocalService) {
		_krishnaLocalService = krishnaLocalService;
	}

	private KrishnaLocalService _krishnaLocalService;

}