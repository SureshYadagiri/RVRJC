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

import com.rvrjc.portal.model.Student;

import java.util.List;

/**
 * The persistence utility for the student service. This utility wraps {@link StudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see StudentPersistence
 * @see StudentPersistenceImpl
 * @generated
 */
public class StudentUtil {
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
	public static void clearCache(Student student) {
		getPersistence().clearCache(student);
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
	public static List<Student> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Student update(Student student) throws SystemException {
		return getPersistence().update(student);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Student update(Student student, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(student, serviceContext);
	}

	/**
	* Returns all the students where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystudentFirstName(firstName);
	}

	/**
	* Returns a range of all the students where firstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystudentFirstName(firstName, start, end);
	}

	/**
	* Returns an ordered range of all the students where firstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentFirstName(firstName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBystudentFirstName_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentFirstName_First(firstName, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBystudentFirstName_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentFirstName_First(firstName, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBystudentFirstName_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentFirstName_Last(firstName, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBystudentFirstName_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentFirstName_Last(firstName, orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where firstName = &#63;.
	*
	* @param sno the primary key of the current student
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student[] findBystudentFirstName_PrevAndNext(
		long sno, java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentFirstName_PrevAndNext(sno, firstName,
			orderByComparator);
	}

	/**
	* Removes all the students where firstName = &#63; from the database.
	*
	* @param firstName the first name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystudentFirstName(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystudentFirstName(firstName);
	}

	/**
	* Returns the number of students where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystudentFirstName(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystudentFirstName(firstName);
	}

	/**
	* Returns all the students where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystudentNameDeptNo(firstName, dno);
	}

	/**
	* Returns a range of all the students where firstName = &#63; and dno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param dno the dno
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentNameDeptNo(firstName, dno, start, end);
	}

	/**
	* Returns an ordered range of all the students where firstName = &#63; and dno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstName the first name
	* @param dno the dno
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystudentNameDeptNo(firstName, dno, start, end,
			orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBystudentNameDeptNo_First(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentNameDeptNo_First(firstName, dno,
			orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBystudentNameDeptNo_First(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentNameDeptNo_First(firstName, dno,
			orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBystudentNameDeptNo_Last(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentNameDeptNo_Last(firstName, dno,
			orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBystudentNameDeptNo_Last(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystudentNameDeptNo_Last(firstName, dno,
			orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param sno the primary key of the current student
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student[] findBystudentNameDeptNo_PrevAndNext(
		long sno, java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBystudentNameDeptNo_PrevAndNext(sno, firstName, dno,
			orderByComparator);
	}

	/**
	* Removes all the students where firstName = &#63; and dno = &#63; from the database.
	*
	* @param firstName the first name
	* @param dno the dno
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystudentNameDeptNo(java.lang.String firstName,
		long dno) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystudentNameDeptNo(firstName, dno);
	}

	/**
	* Returns the number of students where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystudentNameDeptNo(java.lang.String firstName,
		long dno) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystudentNameDeptNo(firstName, dno);
	}

	/**
	* Returns all the students where dno = &#63;.
	*
	* @param dno the dno
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydepartmentNo(dno);
	}

	/**
	* Returns a range of all the students where dno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dno the dno
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydepartmentNo(dno, start, end);
	}

	/**
	* Returns an ordered range of all the students where dno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dno the dno
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydepartmentNo(dno, start, end, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBydepartmentNo_First(
		long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence().findBydepartmentNo_First(dno, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBydepartmentNo_First(
		long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydepartmentNo_First(dno, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findBydepartmentNo_Last(
		long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence().findBydepartmentNo_Last(dno, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchBydepartmentNo_Last(
		long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydepartmentNo_Last(dno, orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where dno = &#63;.
	*
	* @param sno the primary key of the current student
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student[] findBydepartmentNo_PrevAndNext(
		long sno, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence()
				   .findBydepartmentNo_PrevAndNext(sno, dno, orderByComparator);
	}

	/**
	* Removes all the students where dno = &#63; from the database.
	*
	* @param dno the dno
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydepartmentNo(long dno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydepartmentNo(dno);
	}

	/**
	* Returns the number of students where dno = &#63;.
	*
	* @param dno the dno
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydepartmentNo(long dno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydepartmentNo(dno);
	}

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public static void cacheResult(com.rvrjc.portal.model.Student student) {
		getPersistence().cacheResult(student);
	}

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public static void cacheResult(
		java.util.List<com.rvrjc.portal.model.Student> students) {
		getPersistence().cacheResult(students);
	}

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param sno the primary key for the new student
	* @return the new student
	*/
	public static com.rvrjc.portal.model.Student create(long sno) {
		return getPersistence().create(sno);
	}

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sno the primary key of the student
	* @return the student that was removed
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student remove(long sno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence().remove(sno);
	}

	public static com.rvrjc.portal.model.Student updateImpl(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(student);
	}

	/**
	* Returns the student with the primary key or throws a {@link com.rvrjc.portal.NoSuchStudentException} if it could not be found.
	*
	* @param sno the primary key of the student
	* @return the student
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student findByPrimaryKey(long sno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException {
		return getPersistence().findByPrimaryKey(sno);
	}

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sno the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student fetchByPrimaryKey(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sno);
	}

	/**
	* Returns all the students.
	*
	* @return the students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the courses associated with the student.
	*
	* @param pk the primary key of the student
	* @return the courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getCourses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCourses(pk);
	}

	/**
	* Returns a range of all the courses associated with the student.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the student
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getCourses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCourses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the courses associated with the student.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the student
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getCourses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCourses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of courses associated with the student.
	*
	* @param pk the primary key of the student
	* @return the number of courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static int getCoursesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCoursesSize(pk);
	}

	/**
	* Returns <code>true</code> if the course is associated with the student.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @return <code>true</code> if the course is associated with the student; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsCourse(pk, coursePK);
	}

	/**
	* Returns <code>true</code> if the student has any courses associated with it.
	*
	* @param pk the primary key of the student to check for associations with courses
	* @return <code>true</code> if the student has any courses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCourses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsCourses(pk);
	}

	/**
	* Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCourse(pk, coursePK);
	}

	/**
	* Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param course the course
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourse(long pk, com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCourse(pk, course);
	}

	/**
	* Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCourses(pk, coursePKs);
	}

	/**
	* Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCourses(pk, courses);
	}

	/**
	* Clears all associations between the student and its courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student to clear the associated courses from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearCourses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearCourses(pk);
	}

	/**
	* Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCourse(pk, coursePK);
	}

	/**
	* Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param course the course
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCourse(long pk,
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCourse(pk, course);
	}

	/**
	* Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCourses(pk, coursePKs);
	}

	/**
	* Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCourses(pk, courses);
	}

	/**
	* Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static void setCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCourses(pk, coursePKs);
	}

	/**
	* Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static void setCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCourses(pk, courses);
	}

	/**
	* Returns all the parents associated with the student.
	*
	* @param pk the primary key of the student
	* @return the parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getParents(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getParents(pk);
	}

	/**
	* Returns a range of all the parents associated with the student.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the student
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getParents(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getParents(pk, start, end);
	}

	/**
	* Returns an ordered range of all the parents associated with the student.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the student
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getParents(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getParents(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of parents associated with the student.
	*
	* @param pk the primary key of the student
	* @return the number of parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static int getParentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getParentsSize(pk);
	}

	/**
	* Returns <code>true</code> if the parent is associated with the student.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @return <code>true</code> if the parent is associated with the student; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsParent(pk, parentPK);
	}

	/**
	* Returns <code>true</code> if the student has any parents associated with it.
	*
	* @param pk the primary key of the student to check for associations with parents
	* @return <code>true</code> if the student has any parents associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsParents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsParents(pk);
	}

	/**
	* Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void addParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addParent(pk, parentPK);
	}

	/**
	* Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parent the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void addParent(long pk, com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addParent(pk, parent);
	}

	/**
	* Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents
	* @throws SystemException if a system exception occurred
	*/
	public static void addParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addParents(pk, parentPKs);
	}

	/**
	* Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents
	* @throws SystemException if a system exception occurred
	*/
	public static void addParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addParents(pk, parents);
	}

	/**
	* Clears all associations between the student and its parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student to clear the associated parents from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearParents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearParents(pk);
	}

	/**
	* Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void removeParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeParent(pk, parentPK);
	}

	/**
	* Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parent the parent
	* @throws SystemException if a system exception occurred
	*/
	public static void removeParent(long pk,
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeParent(pk, parent);
	}

	/**
	* Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents
	* @throws SystemException if a system exception occurred
	*/
	public static void removeParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeParents(pk, parentPKs);
	}

	/**
	* Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents
	* @throws SystemException if a system exception occurred
	*/
	public static void removeParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeParents(pk, parents);
	}

	/**
	* Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static void setParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setParents(pk, parentPKs);
	}

	/**
	* Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public static void setParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setParents(pk, parents);
	}

	public static StudentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StudentPersistence)PortletBeanLocatorUtil.locate(com.rvrjc.portal.service.ClpSerializer.getServletContextName(),
					StudentPersistence.class.getName());

			ReferenceRegistry.registerReference(StudentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StudentPersistence persistence) {
	}

	private static StudentPersistence _persistence;
}