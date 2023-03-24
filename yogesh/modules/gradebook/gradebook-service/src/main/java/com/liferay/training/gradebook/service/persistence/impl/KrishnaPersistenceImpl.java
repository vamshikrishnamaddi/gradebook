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

package com.liferay.training.gradebook.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.training.gradebook.exception.NoSuchKrishnaException;
import com.liferay.training.gradebook.model.Krishna;
import com.liferay.training.gradebook.model.KrishnaTable;
import com.liferay.training.gradebook.model.impl.KrishnaImpl;
import com.liferay.training.gradebook.model.impl.KrishnaModelImpl;
import com.liferay.training.gradebook.service.persistence.KrishnaPersistence;
import com.liferay.training.gradebook.service.persistence.KrishnaUtil;
import com.liferay.training.gradebook.service.persistence.impl.constants.GradebookPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the krishna service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = KrishnaPersistence.class)
public class KrishnaPersistenceImpl
	extends BasePersistenceImpl<Krishna> implements KrishnaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>KrishnaUtil</code> to access the krishna persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		KrishnaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByField2;
	private FinderPath _finderPathWithoutPaginationFindByField2;
	private FinderPath _finderPathCountByField2;

	/**
	 * Returns all the krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching krishnas
	 */
	@Override
	public List<Krishna> findByField2(int userId) {
		return findByField2(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Krishna> findByField2(int userId, int start, int end) {
		return findByField2(userId, start, end, null);
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
	@Override
	public List<Krishna> findByField2(
		int userId, int start, int end,
		OrderByComparator<Krishna> orderByComparator) {

		return findByField2(userId, start, end, orderByComparator, true);
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
	@Override
	public List<Krishna> findByField2(
		int userId, int start, int end,
		OrderByComparator<Krishna> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByField2;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByField2;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<Krishna> list = null;

		if (useFinderCache) {
			list = (List<Krishna>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Krishna krishna : list) {
					if (userId != krishna.getUserId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_KRISHNA_WHERE);

			sb.append(_FINDER_COLUMN_FIELD2_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(KrishnaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<Krishna>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	@Override
	public Krishna findByField2_First(
			int userId, OrderByComparator<Krishna> orderByComparator)
		throws NoSuchKrishnaException {

		Krishna krishna = fetchByField2_First(userId, orderByComparator);

		if (krishna != null) {
			return krishna;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchKrishnaException(sb.toString());
	}

	/**
	 * Returns the first krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	@Override
	public Krishna fetchByField2_First(
		int userId, OrderByComparator<Krishna> orderByComparator) {

		List<Krishna> list = findByField2(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	@Override
	public Krishna findByField2_Last(
			int userId, OrderByComparator<Krishna> orderByComparator)
		throws NoSuchKrishnaException {

		Krishna krishna = fetchByField2_Last(userId, orderByComparator);

		if (krishna != null) {
			return krishna;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchKrishnaException(sb.toString());
	}

	/**
	 * Returns the last krishna in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	@Override
	public Krishna fetchByField2_Last(
		int userId, OrderByComparator<Krishna> orderByComparator) {

		int count = countByField2(userId);

		if (count == 0) {
			return null;
		}

		List<Krishna> list = findByField2(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the krishnas where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByField2(int userId) {
		for (Krishna krishna :
				findByField2(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(krishna);
		}
	}

	/**
	 * Returns the number of krishnas where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching krishnas
	 */
	@Override
	public int countByField2(int userId) {
		FinderPath finderPath = _finderPathCountByField2;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_KRISHNA_WHERE);

			sb.append(_FINDER_COLUMN_FIELD2_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIELD2_USERID_2 =
		"krishna.userId = ?";

	private FinderPath _finderPathFetchBydescription;
	private FinderPath _finderPathCountBydescription;

	/**
	 * Returns the krishna where description = &#63; or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param description the description
	 * @return the matching krishna
	 * @throws NoSuchKrishnaException if a matching krishna could not be found
	 */
	@Override
	public Krishna findBydescription(String description)
		throws NoSuchKrishnaException {

		Krishna krishna = fetchBydescription(description);

		if (krishna == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("description=");
			sb.append(description);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchKrishnaException(sb.toString());
		}

		return krishna;
	}

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param description the description
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	@Override
	public Krishna fetchBydescription(String description) {
		return fetchBydescription(description, true);
	}

	/**
	 * Returns the krishna where description = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param description the description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching krishna, or <code>null</code> if a matching krishna could not be found
	 */
	@Override
	public Krishna fetchBydescription(
		String description, boolean useFinderCache) {

		description = Objects.toString(description, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {description};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBydescription, finderArgs, this);
		}

		if (result instanceof Krishna) {
			Krishna krishna = (Krishna)result;

			if (!Objects.equals(description, krishna.getDescription())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_KRISHNA_WHERE);

			boolean bindDescription = false;

			if (description.isEmpty()) {
				sb.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3);
			}
			else {
				bindDescription = true;

				sb.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDescription) {
					queryPos.add(description);
				}

				List<Krishna> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBydescription, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {description};
							}

							_log.warn(
								"KrishnaPersistenceImpl.fetchBydescription(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Krishna krishna = list.get(0);

					result = krishna;

					cacheResult(krishna);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Krishna)result;
		}
	}

	/**
	 * Removes the krishna where description = &#63; from the database.
	 *
	 * @param description the description
	 * @return the krishna that was removed
	 */
	@Override
	public Krishna removeBydescription(String description)
		throws NoSuchKrishnaException {

		Krishna krishna = findBydescription(description);

		return remove(krishna);
	}

	/**
	 * Returns the number of krishnas where description = &#63;.
	 *
	 * @param description the description
	 * @return the number of matching krishnas
	 */
	@Override
	public int countBydescription(String description) {
		description = Objects.toString(description, "");

		FinderPath finderPath = _finderPathCountBydescription;

		Object[] finderArgs = new Object[] {description};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_KRISHNA_WHERE);

			boolean bindDescription = false;

			if (description.isEmpty()) {
				sb.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3);
			}
			else {
				bindDescription = true;

				sb.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDescription) {
					queryPos.add(description);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2 =
		"krishna.description = ?";

	private static final String _FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3 =
		"(krishna.description IS NULL OR krishna.description = '')";

	public KrishnaPersistenceImpl() {
		setModelClass(Krishna.class);

		setModelImplClass(KrishnaImpl.class);
		setModelPKClass(int.class);

		setTable(KrishnaTable.INSTANCE);
	}

	/**
	 * Caches the krishna in the entity cache if it is enabled.
	 *
	 * @param krishna the krishna
	 */
	@Override
	public void cacheResult(Krishna krishna) {
		entityCache.putResult(
			KrishnaImpl.class, krishna.getPrimaryKey(), krishna);

		finderCache.putResult(
			_finderPathFetchBydescription,
			new Object[] {krishna.getDescription()}, krishna);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the krishnas in the entity cache if it is enabled.
	 *
	 * @param krishnas the krishnas
	 */
	@Override
	public void cacheResult(List<Krishna> krishnas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (krishnas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Krishna krishna : krishnas) {
			if (entityCache.getResult(
					KrishnaImpl.class, krishna.getPrimaryKey()) == null) {

				cacheResult(krishna);
			}
		}
	}

	/**
	 * Clears the cache for all krishnas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(KrishnaImpl.class);

		finderCache.clearCache(KrishnaImpl.class);
	}

	/**
	 * Clears the cache for the krishna.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Krishna krishna) {
		entityCache.removeResult(KrishnaImpl.class, krishna);
	}

	@Override
	public void clearCache(List<Krishna> krishnas) {
		for (Krishna krishna : krishnas) {
			entityCache.removeResult(KrishnaImpl.class, krishna);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(KrishnaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(KrishnaImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(KrishnaModelImpl krishnaModelImpl) {
		Object[] args = new Object[] {krishnaModelImpl.getDescription()};

		finderCache.putResult(
			_finderPathCountBydescription, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBydescription, args, krishnaModelImpl);
	}

	/**
	 * Creates a new krishna with the primary key. Does not add the krishna to the database.
	 *
	 * @param userId the primary key for the new krishna
	 * @return the new krishna
	 */
	@Override
	public Krishna create(int userId) {
		Krishna krishna = new KrishnaImpl();

		krishna.setNew(true);
		krishna.setPrimaryKey(userId);

		return krishna;
	}

	/**
	 * Removes the krishna with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna that was removed
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	@Override
	public Krishna remove(int userId) throws NoSuchKrishnaException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the krishna with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the krishna
	 * @return the krishna that was removed
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	@Override
	public Krishna remove(Serializable primaryKey)
		throws NoSuchKrishnaException {

		Session session = null;

		try {
			session = openSession();

			Krishna krishna = (Krishna)session.get(
				KrishnaImpl.class, primaryKey);

			if (krishna == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKrishnaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(krishna);
		}
		catch (NoSuchKrishnaException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Krishna removeImpl(Krishna krishna) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(krishna)) {
				krishna = (Krishna)session.get(
					KrishnaImpl.class, krishna.getPrimaryKeyObj());
			}

			if (krishna != null) {
				session.delete(krishna);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (krishna != null) {
			clearCache(krishna);
		}

		return krishna;
	}

	@Override
	public Krishna updateImpl(Krishna krishna) {
		boolean isNew = krishna.isNew();

		if (!(krishna instanceof KrishnaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(krishna.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(krishna);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in krishna proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Krishna implementation " +
					krishna.getClass());
		}

		KrishnaModelImpl krishnaModelImpl = (KrishnaModelImpl)krishna;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(krishna);
			}
			else {
				krishna = (Krishna)session.merge(krishna);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(KrishnaImpl.class, krishnaModelImpl, false, true);

		cacheUniqueFindersCache(krishnaModelImpl);

		if (isNew) {
			krishna.setNew(false);
		}

		krishna.resetOriginalValues();

		return krishna;
	}

	/**
	 * Returns the krishna with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the krishna
	 * @return the krishna
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	@Override
	public Krishna findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKrishnaException {

		Krishna krishna = fetchByPrimaryKey(primaryKey);

		if (krishna == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKrishnaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return krishna;
	}

	/**
	 * Returns the krishna with the primary key or throws a <code>NoSuchKrishnaException</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna
	 * @throws NoSuchKrishnaException if a krishna with the primary key could not be found
	 */
	@Override
	public Krishna findByPrimaryKey(int userId) throws NoSuchKrishnaException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the krishna with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the krishna
	 * @return the krishna, or <code>null</code> if a krishna with the primary key could not be found
	 */
	@Override
	public Krishna fetchByPrimaryKey(int userId) {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the krishnas.
	 *
	 * @return the krishnas
	 */
	@Override
	public List<Krishna> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Krishna> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Krishna> findAll(
		int start, int end, OrderByComparator<Krishna> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Krishna> findAll(
		int start, int end, OrderByComparator<Krishna> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Krishna> list = null;

		if (useFinderCache) {
			list = (List<Krishna>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_KRISHNA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_KRISHNA;

				sql = sql.concat(KrishnaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Krishna>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the krishnas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Krishna krishna : findAll()) {
			remove(krishna);
		}
	}

	/**
	 * Returns the number of krishnas.
	 *
	 * @return the number of krishnas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_KRISHNA);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "userId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_KRISHNA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return KrishnaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the krishna persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByField2 = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField2",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"userId"}, true);

		_finderPathWithoutPaginationFindByField2 = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField2",
			new String[] {Integer.class.getName()}, new String[] {"userId"},
			true);

		_finderPathCountByField2 = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField2",
			new String[] {Integer.class.getName()}, new String[] {"userId"},
			false);

		_finderPathFetchBydescription = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBydescription",
			new String[] {String.class.getName()}, new String[] {"description"},
			true);

		_finderPathCountBydescription = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydescription",
			new String[] {String.class.getName()}, new String[] {"description"},
			false);

		_setKrishnaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setKrishnaUtilPersistence(null);

		entityCache.removeCache(KrishnaImpl.class.getName());
	}

	private void _setKrishnaUtilPersistence(
		KrishnaPersistence krishnaPersistence) {

		try {
			Field field = KrishnaUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, krishnaPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = GradebookPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = GradebookPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = GradebookPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_KRISHNA =
		"SELECT krishna FROM Krishna krishna";

	private static final String _SQL_SELECT_KRISHNA_WHERE =
		"SELECT krishna FROM Krishna krishna WHERE ";

	private static final String _SQL_COUNT_KRISHNA =
		"SELECT COUNT(krishna) FROM Krishna krishna";

	private static final String _SQL_COUNT_KRISHNA_WHERE =
		"SELECT COUNT(krishna) FROM Krishna krishna WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "krishna.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Krishna exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Krishna exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		KrishnaPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}