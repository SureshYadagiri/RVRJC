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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rvrjc.portal.model.Parent;

import java.util.List;

/**
 * The persistence utility for the parent service. This utility wraps {@link ParentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see ParentPersistence
 * @see ParentPersistenceImpl
 * @generated
 */
public class ParentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Parent parent) {
		getPersistence().clearCache(parent);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Parent> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Parent> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Parent> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Parent update(Parent parent) throws SystemException {
		return getPersistence().update(parent);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Parent update(Parent parent, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(parent, serviceContext);
	}

	/**
	* Caches the parent in the entity cache if it is enabled.
	*
	* @param parent the parent
	*/
	public static void cacheResult(com.rvrjc.portal.model.Parent parent) {
		getPersistence().cacheResult(parent);
	}

	/**
	* Caches the parents in the entity cache if it is enabled.
	*
	* @param parents the parents
	*/
	public static void cacheResult(
		java.util.List<com.rvrjc.portal.model.Parent> parents) {
		getPersistence().cacheResult(parents);
	}

	/**
	* Creates a new parent with the primary key. Does not add the parent to the database.
	*
	* @param parentId the primary key for the new parent
	* @return the new parent
	*/
	public static com.rvrjc.portal.model.Parent create(long parentId) {
		return getPersistence().create(parentId);
	}

	/**
	* Removes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parentId the primary key of the parent
	* @return the parent that was removed
	* @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent remove(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchParentException {
		return getPersistence().remove(parentId);
	}

	public static com.rvrjc.portal.model.Parent updateImpl(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(parent);
	}

	/**
	* Returns the parent with the primary key or throws a {@link com.rvrjc.portal.NoSuchParentException} if it could not be found.
	*
	* @param parentId the primary key of the parent
	* @return the parent
	* @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent findByPrimaryKey(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchParentException {
		return getPersistence().findByPrimaryKey(parentId);
	}

	/**
	* Returns the parent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param parentId the primary key of the parent
	* @return the parent, or <code>null</code> if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent fetchByPrimaryKey(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(parentId);
	}

	/**
	* Returns all the parents.
	*
	* @return the parents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.rvrjc.portal.model.Parent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.rvrjc.portal.model.Parent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the parents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of parents.
	*
	* @return the number of parents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the students associated with the parent.
	*
	* @param pk the primary key of the parent
	* @return the students associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getStudents(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStudents(pk);
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
	public static java.util.List<com.rvrjc.portal.model.Student> getStudents(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStudents(pk, start, end);
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
	public static java.util.List<com.rvrjc.portal.model.Student> getStudents(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStudents(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of students associated with the parent.
	*
	* @param pk the primary key of the parent
	* @return the number of students associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStudentsSize(pk);
	}

	/**
	* Returns <code>true</code> if the student is associated with the parent.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @return <code>true</code> if the student is associated with the parent; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStudent(pk, studentPK);
	}

	/**
	* Returns <code>true</code> if the parent has any students associated with it.
	*
	* @param pk the primary key of the parent to check for associations with students
	* @return <code>true</code> if the parent has any students associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStudents(pk);
	}

	/**
	* Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStudent(pk, studentPK);
	}

	/**
	* Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudent(long pk,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStudent(pk, student);
	}

	/**
	* Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStudents(pk, studentPKs);
	}

	/**
	* Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStudents(pk, students);
	}

	/**
	* Clears all associations between the parent and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent to clear the associated students from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearStudents(pk);
	}

	/**
	* Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStudent(pk, studentPK);
	}

	/**
	* Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStudent(long pk,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStudent(pk, student);
	}

	/**
	* Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStudents(pk, studentPKs);
	}

	/**
	* Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStudents(pk, students);
	}

	/**
	* Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students to be associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void setStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStudents(pk, studentPKs);
	}

	/**
	* Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students to be associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void setStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStudents(pk, students);
	}

	public static ParentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ParentPersistence)PortletBeanLocatorUtil.locate(com.rvrjc.portal.service.ClpSerializer.getServletContextName(),
					ParentPersistence.class.getName());

			ReferenceRegistry.registerReference(ParentUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ParentPersistence persistence) {
	}

	private static ParentPersistence _persistence;
}