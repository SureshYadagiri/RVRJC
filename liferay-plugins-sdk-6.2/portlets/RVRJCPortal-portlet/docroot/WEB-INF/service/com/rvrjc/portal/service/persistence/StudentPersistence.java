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

import com.liferay.portal.service.persistence.BasePersistence;

import com.rvrjc.portal.model.Student;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see StudentPersistenceImpl
 * @see StudentUtil
 * @generated
 */
public interface StudentPersistence extends BasePersistence<Student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the students where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentFirstName(
		java.lang.String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student findBystudentFirstName_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the first student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBystudentFirstName_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student findBystudentFirstName_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the last student in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBystudentFirstName_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.rvrjc.portal.model.Student[] findBystudentFirstName_PrevAndNext(
		long sno, java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Removes all the students where firstName = &#63; from the database.
	*
	* @param firstName the first name
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystudentFirstName(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public int countBystudentFirstName(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBystudentNameDeptNo(
		java.lang.String firstName, long dno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.rvrjc.portal.model.Student findBystudentNameDeptNo_First(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the first student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBystudentNameDeptNo_First(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.rvrjc.portal.model.Student findBystudentNameDeptNo_Last(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the last student in the ordered set where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBystudentNameDeptNo_Last(
		java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.rvrjc.portal.model.Student[] findBystudentNameDeptNo_PrevAndNext(
		long sno, java.lang.String firstName, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Removes all the students where firstName = &#63; and dno = &#63; from the database.
	*
	* @param firstName the first name
	* @param dno the dno
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystudentNameDeptNo(java.lang.String firstName, long dno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students where firstName = &#63; and dno = &#63;.
	*
	* @param firstName the first name
	* @param dno the dno
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public int countBystudentNameDeptNo(java.lang.String firstName, long dno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students where dno = &#63;.
	*
	* @param dno the dno
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findBydepartmentNo(
		long dno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student findBydepartmentNo_First(long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the first student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBydepartmentNo_First(long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student findBydepartmentNo_Last(long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the last student in the ordered set where dno = &#63;.
	*
	* @param dno the dno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchBydepartmentNo_Last(long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.rvrjc.portal.model.Student[] findBydepartmentNo_PrevAndNext(
		long sno, long dno,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Removes all the students where dno = &#63; from the database.
	*
	* @param dno the dno
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydepartmentNo(long dno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students where dno = &#63;.
	*
	* @param dno the dno
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public int countBydepartmentNo(long dno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public void cacheResult(com.rvrjc.portal.model.Student student);

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public void cacheResult(
		java.util.List<com.rvrjc.portal.model.Student> students);

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param sno the primary key for the new student
	* @return the new student
	*/
	public com.rvrjc.portal.model.Student create(long sno);

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sno the primary key of the student
	* @return the student that was removed
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student remove(long sno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	public com.rvrjc.portal.model.Student updateImpl(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student with the primary key or throws a {@link com.rvrjc.portal.NoSuchStudentException} if it could not be found.
	*
	* @param sno the primary key of the student
	* @return the student
	* @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student findByPrimaryKey(long sno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchStudentException;

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sno the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Student fetchByPrimaryKey(long sno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students.
	*
	* @return the students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the courses associated with the student.
	*
	* @param pk the primary key of the student
	* @return the courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> getCourses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Course> getCourses(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Course> getCourses(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of courses associated with the student.
	*
	* @param pk the primary key of the student
	* @return the number of courses associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public int getCoursesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the course is associated with the student.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @return <code>true</code> if the course is associated with the student; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the student has any courses associated with it.
	*
	* @param pk the primary key of the student to check for associations with courses
	* @return <code>true</code> if the student has any courses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCourses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @throws SystemException if a system exception occurred
	*/
	public void addCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param course the course
	* @throws SystemException if a system exception occurred
	*/
	public void addCourse(long pk, com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses
	* @throws SystemException if a system exception occurred
	*/
	public void addCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses
	* @throws SystemException if a system exception occurred
	*/
	public void addCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the student and its courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student to clear the associated courses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearCourses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePK the primary key of the course
	* @throws SystemException if a system exception occurred
	*/
	public void removeCourse(long pk, long coursePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param course the course
	* @throws SystemException if a system exception occurred
	*/
	public void removeCourse(long pk, com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses
	* @throws SystemException if a system exception occurred
	*/
	public void removeCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses
	* @throws SystemException if a system exception occurred
	*/
	public void removeCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param coursePKs the primary keys of the courses to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public void setCourses(long pk, long[] coursePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param courses the courses to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public void setCourses(long pk,
		java.util.List<com.rvrjc.portal.model.Course> courses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the parents associated with the student.
	*
	* @param pk the primary key of the student
	* @return the parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Parent> getParents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Parent> getParents(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Parent> getParents(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of parents associated with the student.
	*
	* @param pk the primary key of the student
	* @return the number of parents associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public int getParentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the parent is associated with the student.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @return <code>true</code> if the parent is associated with the student; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the student has any parents associated with it.
	*
	* @param pk the primary key of the student to check for associations with parents
	* @return <code>true</code> if the student has any parents associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsParents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @throws SystemException if a system exception occurred
	*/
	public void addParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parent the parent
	* @throws SystemException if a system exception occurred
	*/
	public void addParent(long pk, com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents
	* @throws SystemException if a system exception occurred
	*/
	public void addParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents
	* @throws SystemException if a system exception occurred
	*/
	public void addParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the student and its parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student to clear the associated parents from
	* @throws SystemException if a system exception occurred
	*/
	public void clearParents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPK the primary key of the parent
	* @throws SystemException if a system exception occurred
	*/
	public void removeParent(long pk, long parentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parent the parent
	* @throws SystemException if a system exception occurred
	*/
	public void removeParent(long pk, com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents
	* @throws SystemException if a system exception occurred
	*/
	public void removeParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents
	* @throws SystemException if a system exception occurred
	*/
	public void removeParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parentPKs the primary keys of the parents to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public void setParents(long pk, long[] parentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the student
	* @param parents the parents to be associated with the student
	* @throws SystemException if a system exception occurred
	*/
	public void setParents(long pk,
		java.util.List<com.rvrjc.portal.model.Parent> parents)
		throws com.liferay.portal.kernel.exception.SystemException;
}