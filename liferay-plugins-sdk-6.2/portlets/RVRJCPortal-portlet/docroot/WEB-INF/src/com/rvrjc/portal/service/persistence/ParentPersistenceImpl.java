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

package com.rvrjc.portal.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.rvrjc.portal.NoSuchParentException;
import com.rvrjc.portal.model.Parent;
import com.rvrjc.portal.model.impl.ParentImpl;
import com.rvrjc.portal.model.impl.ParentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the parent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see ParentPersistence
 * @see ParentUtil
 * @generated
 */
public class ParentPersistenceImpl extends BasePersistenceImpl<Parent>
	implements ParentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ParentUtil} to access the parent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ParentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentModelImpl.FINDER_CACHE_ENABLED, ParentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentModelImpl.FINDER_CACHE_ENABLED, ParentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ParentPersistenceImpl() {
		setModelClass(Parent.class);
	}

	/**
	 * Caches the parent in the entity cache if it is enabled.
	 *
	 * @param parent the parent
	 */
	@Override
	public void cacheResult(Parent parent) {
		EntityCacheUtil.putResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentImpl.class, parent.getPrimaryKey(), parent);

		parent.resetOriginalValues();
	}

	/**
	 * Caches the parents in the entity cache if it is enabled.
	 *
	 * @param parents the parents
	 */
	@Override
	public void cacheResult(List<Parent> parents) {
		for (Parent parent : parents) {
			if (EntityCacheUtil.getResult(
						ParentModelImpl.ENTITY_CACHE_ENABLED, ParentImpl.class,
						parent.getPrimaryKey()) == null) {
				cacheResult(parent);
			}
			else {
				parent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all parents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ParentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ParentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the parent.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Parent parent) {
		EntityCacheUtil.removeResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentImpl.class, parent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Parent> parents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Parent parent : parents) {
			EntityCacheUtil.removeResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
				ParentImpl.class, parent.getPrimaryKey());
		}
	}

	/**
	 * Creates a new parent with the primary key. Does not add the parent to the database.
	 *
	 * @param parentId the primary key for the new parent
	 * @return the new parent
	 */
	@Override
	public Parent create(long parentId) {
		Parent parent = new ParentImpl();

		parent.setNew(true);
		parent.setPrimaryKey(parentId);

		return parent;
	}

	/**
	 * Removes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parentId the primary key of the parent
	 * @return the parent that was removed
	 * @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent remove(long parentId)
		throws NoSuchParentException, SystemException {
		return remove((Serializable)parentId);
	}

	/**
	 * Removes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the parent
	 * @return the parent that was removed
	 * @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent remove(Serializable primaryKey)
		throws NoSuchParentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Parent parent = (Parent)session.get(ParentImpl.class, primaryKey);

			if (parent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(parent);
		}
		catch (NoSuchParentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Parent removeImpl(Parent parent) throws SystemException {
		parent = toUnwrappedModel(parent);

		parentToStudentTableMapper.deleteLeftPrimaryKeyTableMappings(parent.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(parent)) {
				parent = (Parent)session.get(ParentImpl.class,
						parent.getPrimaryKeyObj());
			}

			if (parent != null) {
				session.delete(parent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (parent != null) {
			clearCache(parent);
		}

		return parent;
	}

	@Override
	public Parent updateImpl(com.rvrjc.portal.model.Parent parent)
		throws SystemException {
		parent = toUnwrappedModel(parent);

		boolean isNew = parent.isNew();

		Session session = null;

		try {
			session = openSession();

			if (parent.isNew()) {
				session.save(parent);

				parent.setNew(false);
			}
			else {
				session.merge(parent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
			ParentImpl.class, parent.getPrimaryKey(), parent);

		return parent;
	}

	protected Parent toUnwrappedModel(Parent parent) {
		if (parent instanceof ParentImpl) {
			return parent;
		}

		ParentImpl parentImpl = new ParentImpl();

		parentImpl.setNew(parent.isNew());
		parentImpl.setPrimaryKey(parent.getPrimaryKey());

		parentImpl.setParentId(parent.getParentId());
		parentImpl.setNickName(parent.getNickName());
		parentImpl.setFirstName(parent.getFirstName());
		parentImpl.setMiddleName(parent.getMiddleName());
		parentImpl.setLastName(parent.getLastName());
		parentImpl.setPhNo(parent.getPhNo());
		parentImpl.setEmail(parent.getEmail());
		parentImpl.setRelationShip(parent.getRelationShip());
		parentImpl.setCreatedOn(parent.getCreatedOn());
		parentImpl.setCreatedBy(parent.getCreatedBy());
		parentImpl.setModifiedOn(parent.getModifiedOn());
		parentImpl.setModifiedBy(parent.getModifiedBy());

		return parentImpl;
	}

	/**
	 * Returns the parent with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the parent
	 * @return the parent
	 * @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParentException, SystemException {
		Parent parent = fetchByPrimaryKey(primaryKey);

		if (parent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return parent;
	}

	/**
	 * Returns the parent with the primary key or throws a {@link com.rvrjc.portal.NoSuchParentException} if it could not be found.
	 *
	 * @param parentId the primary key of the parent
	 * @return the parent
	 * @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent findByPrimaryKey(long parentId)
		throws NoSuchParentException, SystemException {
		return findByPrimaryKey((Serializable)parentId);
	}

	/**
	 * Returns the parent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the parent
	 * @return the parent, or <code>null</code> if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Parent parent = (Parent)EntityCacheUtil.getResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
				ParentImpl.class, primaryKey);

		if (parent == _nullParent) {
			return null;
		}

		if (parent == null) {
			Session session = null;

			try {
				session = openSession();

				parent = (Parent)session.get(ParentImpl.class, primaryKey);

				if (parent != null) {
					cacheResult(parent);
				}
				else {
					EntityCacheUtil.putResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
						ParentImpl.class, primaryKey, _nullParent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ParentModelImpl.ENTITY_CACHE_ENABLED,
					ParentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return parent;
	}

	/**
	 * Returns the parent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parentId the primary key of the parent
	 * @return the parent, or <code>null</code> if a parent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Parent fetchByPrimaryKey(long parentId) throws SystemException {
		return fetchByPrimaryKey((Serializable)parentId);
	}

	/**
	 * Returns all the parents.
	 *
	 * @return the parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parents
	 * @param end the upper bound of the range of parents (not inclusive)
	 * @return the range of parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parent> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the parents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parents
	 * @param end the upper bound of the range of parents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Parent> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Parent> list = (List<Parent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PARENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PARENT;

				if (pagination) {
					sql = sql.concat(ParentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Parent>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Parent>(list);
				}
				else {
					list = (List<Parent>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the parents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Parent parent : findAll()) {
			remove(parent);
		}
	}

	/**
	 * Returns the number of parents.
	 *
	 * @return the number of parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PARENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns all the students associated with the parent.
	 *
	 * @param pk the primary key of the parent
	 * @return the students associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Student> getStudents(long pk)
		throws SystemException {
		return getStudents(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the students associated with the parent.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the parent
	 * @param start the lower bound of the range of parents
	 * @param end the upper bound of the range of parents (not inclusive)
	 * @return the range of students associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Student> getStudents(long pk, int start,
		int end) throws SystemException {
		return getStudents(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the students associated with the parent.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the parent
	 * @param start the lower bound of the range of parents
	 * @param end the upper bound of the range of parents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of students associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Student> getStudents(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return parentToStudentTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of students associated with the parent.
	 *
	 * @param pk the primary key of the parent
	 * @return the number of students associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStudentsSize(long pk) throws SystemException {
		long[] pks = parentToStudentTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the student is associated with the parent.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPK the primary key of the student
	 * @return <code>true</code> if the student is associated with the parent; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStudent(long pk, long studentPK)
		throws SystemException {
		return parentToStudentTableMapper.containsTableMapping(pk, studentPK);
	}

	/**
	 * Returns <code>true</code> if the parent has any students associated with it.
	 *
	 * @param pk the primary key of the parent to check for associations with students
	 * @return <code>true</code> if the parent has any students associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStudents(long pk) throws SystemException {
		if (getStudentsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPK the primary key of the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStudent(long pk, long studentPK) throws SystemException {
		parentToStudentTableMapper.addTableMapping(pk, studentPK);
	}

	/**
	 * Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param student the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStudent(long pk, com.rvrjc.portal.model.Student student)
		throws SystemException {
		parentToStudentTableMapper.addTableMapping(pk, student.getPrimaryKey());
	}

	/**
	 * Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPKs the primary keys of the students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStudents(long pk, long[] studentPKs)
		throws SystemException {
		for (long studentPK : studentPKs) {
			parentToStudentTableMapper.addTableMapping(pk, studentPK);
		}
	}

	/**
	 * Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param students the students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStudents(long pk,
		List<com.rvrjc.portal.model.Student> students)
		throws SystemException {
		for (com.rvrjc.portal.model.Student student : students) {
			parentToStudentTableMapper.addTableMapping(pk,
				student.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the parent and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent to clear the associated students from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearStudents(long pk) throws SystemException {
		parentToStudentTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPK the primary key of the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStudent(long pk, long studentPK)
		throws SystemException {
		parentToStudentTableMapper.deleteTableMapping(pk, studentPK);
	}

	/**
	 * Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param student the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStudent(long pk, com.rvrjc.portal.model.Student student)
		throws SystemException {
		parentToStudentTableMapper.deleteTableMapping(pk,
			student.getPrimaryKey());
	}

	/**
	 * Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPKs the primary keys of the students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStudents(long pk, long[] studentPKs)
		throws SystemException {
		for (long studentPK : studentPKs) {
			parentToStudentTableMapper.deleteTableMapping(pk, studentPK);
		}
	}

	/**
	 * Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param students the students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStudents(long pk,
		List<com.rvrjc.portal.model.Student> students)
		throws SystemException {
		for (com.rvrjc.portal.model.Student student : students) {
			parentToStudentTableMapper.deleteTableMapping(pk,
				student.getPrimaryKey());
		}
	}

	/**
	 * Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param studentPKs the primary keys of the students to be associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStudents(long pk, long[] studentPKs)
		throws SystemException {
		Set<Long> newStudentPKsSet = SetUtil.fromArray(studentPKs);
		Set<Long> oldStudentPKsSet = SetUtil.fromArray(parentToStudentTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeStudentPKsSet = new HashSet<Long>(oldStudentPKsSet);

		removeStudentPKsSet.removeAll(newStudentPKsSet);

		for (long removeStudentPK : removeStudentPKsSet) {
			parentToStudentTableMapper.deleteTableMapping(pk, removeStudentPK);
		}

		newStudentPKsSet.removeAll(oldStudentPKsSet);

		for (long newStudentPK : newStudentPKsSet) {
			parentToStudentTableMapper.addTableMapping(pk, newStudentPK);
		}
	}

	/**
	 * Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the parent
	 * @param students the students to be associated with the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStudents(long pk,
		List<com.rvrjc.portal.model.Student> students)
		throws SystemException {
		try {
			long[] studentPKs = new long[students.size()];

			for (int i = 0; i < students.size(); i++) {
				com.rvrjc.portal.model.Student student = students.get(i);

				studentPKs[i] = student.getPrimaryKey();
			}

			setStudents(pk, studentPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(ParentModelImpl.MAPPING_TABLE_RVRJC_STUDENT_PARENT_NAME);
		}
	}

	/**
	 * Initializes the parent persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rvrjc.portal.model.Parent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Parent>> listenersList = new ArrayList<ModelListener<Parent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Parent>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		parentToStudentTableMapper = TableMapperFactory.getTableMapper("rvrjc_Student_Parent",
				"parentId", "sno", this, studentPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ParentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rvrjc_Student_Parent");
	}

	@BeanReference(type = StudentPersistence.class)
	protected StudentPersistence studentPersistence;
	protected TableMapper<Parent, com.rvrjc.portal.model.Student> parentToStudentTableMapper;
	private static final String _SQL_SELECT_PARENT = "SELECT parent FROM Parent parent";
	private static final String _SQL_COUNT_PARENT = "SELECT COUNT(parent) FROM Parent parent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "parent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Parent exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ParentPersistenceImpl.class);
	private static Parent _nullParent = new ParentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Parent> toCacheModel() {
				return _nullParentCacheModel;
			}
		};

	private static CacheModel<Parent> _nullParentCacheModel = new CacheModel<Parent>() {
			@Override
			public Parent toEntityModel() {
				return _nullParent;
			}
		};
}