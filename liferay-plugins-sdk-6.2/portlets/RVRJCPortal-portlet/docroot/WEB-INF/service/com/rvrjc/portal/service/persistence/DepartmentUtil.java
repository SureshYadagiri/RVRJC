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

import com.rvrjc.portal.model.Department;

import java.util.List;

/**
 * The persistence utility for the department service. This utility wraps {@link DepartmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see DepartmentPersistence
 * @see DepartmentPersistenceImpl
 * @generated
 */
public class DepartmentUtil {
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
	public static void clearCache(Department department) {
		getPersistence().clearCache(department);
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
	public static List<Department> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Department> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Department> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Department update(Department department)
		throws SystemException {
		return getPersistence().update(department);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Department update(Department department,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(department, serviceContext);
	}

	/**
	* Returns the department where dname = &#63; or throws a {@link com.rvrjc.portal.NoSuchDepartmentException} if it could not be found.
	*
	* @param dname the dname
	* @return the matching department
	* @throws com.rvrjc.portal.NoSuchDepartmentException if a matching department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department findBydeptName(
		java.lang.String dname)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchDepartmentException {
		return getPersistence().findBydeptName(dname);
	}

	/**
	* Returns the department where dname = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dname the dname
	* @return the matching department, or <code>null</code> if a matching department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department fetchBydeptName(
		java.lang.String dname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydeptName(dname);
	}

	/**
	* Returns the department where dname = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dname the dname
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching department, or <code>null</code> if a matching department could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department fetchBydeptName(
		java.lang.String dname, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydeptName(dname, retrieveFromCache);
	}

	/**
	* Removes the department where dname = &#63; from the database.
	*
	* @param dname the dname
	* @return the department that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department removeBydeptName(
		java.lang.String dname)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchDepartmentException {
		return getPersistence().removeBydeptName(dname);
	}

	/**
	* Returns the number of departments where dname = &#63;.
	*
	* @param dname the dname
	* @return the number of matching departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydeptName(java.lang.String dname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydeptName(dname);
	}

	/**
	* Caches the department in the entity cache if it is enabled.
	*
	* @param department the department
	*/
	public static void cacheResult(com.rvrjc.portal.model.Department department) {
		getPersistence().cacheResult(department);
	}

	/**
	* Caches the departments in the entity cache if it is enabled.
	*
	* @param departments the departments
	*/
	public static void cacheResult(
		java.util.List<com.rvrjc.portal.model.Department> departments) {
		getPersistence().cacheResult(departments);
	}

	/**
	* Creates a new department with the primary key. Does not add the department to the database.
	*
	* @param dno the primary key for the new department
	* @return the new department
	*/
	public static com.rvrjc.portal.model.Department create(long dno) {
		return getPersistence().create(dno);
	}

	/**
	* Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dno the primary key of the department
	* @return the department that was removed
	* @throws com.rvrjc.portal.NoSuchDepartmentException if a department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department remove(long dno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchDepartmentException {
		return getPersistence().remove(dno);
	}

	public static com.rvrjc.portal.model.Department updateImpl(
		com.rvrjc.portal.model.Department department)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(department);
	}

	/**
	* Returns the department with the primary key or throws a {@link com.rvrjc.portal.NoSuchDepartmentException} if it could not be found.
	*
	* @param dno the primary key of the department
	* @return the department
	* @throws com.rvrjc.portal.NoSuchDepartmentException if a department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department findByPrimaryKey(long dno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchDepartmentException {
		return getPersistence().findByPrimaryKey(dno);
	}

	/**
	* Returns the department with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dno the primary key of the department
	* @return the department, or <code>null</code> if a department with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Department fetchByPrimaryKey(long dno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dno);
	}

	/**
	* Returns all the departments.
	*
	* @return the departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Department> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.DepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of departments
	* @param end the upper bound of the range of departments (not inclusive)
	* @return the range of departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Department> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the departments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.DepartmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of departments
	* @param end the upper bound of the range of departments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of departments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Department> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the departments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of departments.
	*
	* @return the number of departments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DepartmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DepartmentPersistence)PortletBeanLocatorUtil.locate(com.rvrjc.portal.service.ClpSerializer.getServletContextName(),
					DepartmentPersistence.class.getName());

			ReferenceRegistry.registerReference(DepartmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DepartmentPersistence persistence) {
	}

	private static DepartmentPersistence _persistence;
}