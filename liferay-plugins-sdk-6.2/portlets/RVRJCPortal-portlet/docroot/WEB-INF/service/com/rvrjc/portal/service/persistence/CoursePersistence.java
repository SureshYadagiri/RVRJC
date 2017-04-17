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

import com.rvrjc.portal.model.Course;

/**
 * The persistence interface for the course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see CoursePersistenceImpl
 * @see CourseUtil
 * @generated
 */
public interface CoursePersistence extends BasePersistence<Course> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseUtil} to access the course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the courses where cname = &#63;.
	*
	* @param cname the cname
	* @return the matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseName(
		java.lang.String cname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the courses where cname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cname the cname
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @return the range of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseName(
		java.lang.String cname, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the courses where cname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cname the cname
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseName(
		java.lang.String cname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course in the ordered set where cname = &#63;.
	*
	* @param cname the cname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course
	* @throws com.rvrjc.portal.NoSuchCourseException if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course findBycourseName_First(
		java.lang.String cname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Returns the first course in the ordered set where cname = &#63;.
	*
	* @param cname the cname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course, or <code>null</code> if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course fetchBycourseName_First(
		java.lang.String cname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course in the ordered set where cname = &#63;.
	*
	* @param cname the cname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course
	* @throws com.rvrjc.portal.NoSuchCourseException if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course findBycourseName_Last(
		java.lang.String cname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Returns the last course in the ordered set where cname = &#63;.
	*
	* @param cname the cname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course, or <code>null</code> if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course fetchBycourseName_Last(
		java.lang.String cname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the courses before and after the current course in the ordered set where cname = &#63;.
	*
	* @param cno the primary key of the current course
	* @param cname the cname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course
	* @throws com.rvrjc.portal.NoSuchCourseException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course[] findBycourseName_PrevAndNext(
		long cno, java.lang.String cname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Removes all the courses where cname = &#63; from the database.
	*
	* @param cname the cname
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycourseName(java.lang.String cname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of courses where cname = &#63;.
	*
	* @param cname the cname
	* @return the number of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycourseName(java.lang.String cname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the courses where cfee = &#63;.
	*
	* @param cfee the cfee
	* @return the matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseFee(
		int cfee) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the courses where cfee = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cfee the cfee
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @return the range of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseFee(
		int cfee, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the courses where cfee = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cfee the cfee
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findBycourseFee(
		int cfee, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course in the ordered set where cfee = &#63;.
	*
	* @param cfee the cfee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course
	* @throws com.rvrjc.portal.NoSuchCourseException if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course findBycourseFee_First(int cfee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Returns the first course in the ordered set where cfee = &#63;.
	*
	* @param cfee the cfee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course, or <code>null</code> if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course fetchBycourseFee_First(int cfee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course in the ordered set where cfee = &#63;.
	*
	* @param cfee the cfee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course
	* @throws com.rvrjc.portal.NoSuchCourseException if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course findBycourseFee_Last(int cfee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Returns the last course in the ordered set where cfee = &#63;.
	*
	* @param cfee the cfee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course, or <code>null</code> if a matching course could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course fetchBycourseFee_Last(int cfee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the courses before and after the current course in the ordered set where cfee = &#63;.
	*
	* @param cno the primary key of the current course
	* @param cfee the cfee
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course
	* @throws com.rvrjc.portal.NoSuchCourseException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course[] findBycourseFee_PrevAndNext(
		long cno, int cfee,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Removes all the courses where cfee = &#63; from the database.
	*
	* @param cfee the cfee
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycourseFee(int cfee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of courses where cfee = &#63;.
	*
	* @param cfee the cfee
	* @return the number of matching courses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycourseFee(int cfee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the course in the entity cache if it is enabled.
	*
	* @param course the course
	*/
	public void cacheResult(com.rvrjc.portal.model.Course course);

	/**
	* Caches the courses in the entity cache if it is enabled.
	*
	* @param courses the courses
	*/
	public void cacheResult(
		java.util.List<com.rvrjc.portal.model.Course> courses);

	/**
	* Creates a new course with the primary key. Does not add the course to the database.
	*
	* @param cno the primary key for the new course
	* @return the new course
	*/
	public com.rvrjc.portal.model.Course create(long cno);

	/**
	* Removes the course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cno the primary key of the course
	* @return the course that was removed
	* @throws com.rvrjc.portal.NoSuchCourseException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course remove(long cno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	public com.rvrjc.portal.model.Course updateImpl(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course with the primary key or throws a {@link com.rvrjc.portal.NoSuchCourseException} if it could not be found.
	*
	* @param cno the primary key of the course
	* @return the course
	* @throws com.rvrjc.portal.NoSuchCourseException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course findByPrimaryKey(long cno)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchCourseException;

	/**
	* Returns the course with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cno the primary key of the course
	* @return the course, or <code>null</code> if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Course fetchByPrimaryKey(long cno)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the courses.
	*
	* @return the courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @return the range of courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of courses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Course> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the courses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of courses.
	*
	* @return the number of courses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students associated with the course.
	*
	* @param pk the primary key of the course
	* @return the students associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the students associated with the course.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the course
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @return the range of students associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the students associated with the course.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the course
	* @param start the lower bound of the range of courses
	* @param end the upper bound of the range of courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students associated with the course.
	*
	* @param pk the primary key of the course
	* @return the number of students associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public int getStudentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the student is associated with the course.
	*
	* @param pk the primary key of the course
	* @param studentPK the primary key of the student
	* @return <code>true</code> if the student is associated with the course; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the course has any students associated with it.
	*
	* @param pk the primary key of the course to check for associations with students
	* @return <code>true</code> if the course has any students associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public void addStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public void addStudent(long pk, com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public void addStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public void addStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the course and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course to clear the associated students from
	* @throws SystemException if a system exception occurred
	*/
	public void clearStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudent(long pk, com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param studentPKs the primary keys of the students to be associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public void setStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the course
	* @param students the students to be associated with the course
	* @throws SystemException if a system exception occurred
	*/
	public void setStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;
}