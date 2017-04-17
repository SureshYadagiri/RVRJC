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

package com.rvrjc.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CourseLocalService}.
 *
 * @author suresh
 * @see CourseLocalService
 * @generated
 */
public class CourseLocalServiceWrapper implements CourseLocalService,
	ServiceWrapper<CourseLocalService> {
	public CourseLocalServiceWrapper(CourseLocalService courseLocalService) {
		_courseLocalService = courseLocalService;
	}

	/**
	* Adds the course to the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Course addCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.addCourse(course);
	}

	/**
	* Creates a new course with the primary key. Does not add the course to the database.
	*
	* @param cno the primary key for the new course
	* @return the new course
	*/
	@Override
	public com.rvrjc.portal.model.Course createCourse(long cno) {
		return _courseLocalService.createCourse(cno);
	}

	/**
	* Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cno the primary key of the course
	* @return the course that was removed
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Course deleteCourse(long cno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.deleteCourse(cno);
	}

	/**
	* Deletes the course from the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Course deleteCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.deleteCourse(course);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _courseLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rvrjc.portal.model.Course fetchCourse(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.fetchCourse(cno);
	}

	/**
	* Returns the course with the primary key.
	*
	* @param cno the primary key of the course
	* @return the course
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Course getCourse(long cno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getCourse(cno);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.rvrjc.portal.model.Course> getCourses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getCourses(start, end);
	}

	/**
	* Returns the number of courses.
	*
	* @return the number of courses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCoursesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getCoursesCount();
	}

	/**
	* Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Course updateCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.updateCourse(course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.addStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentCourse(long sno, com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.addStudentCourse(sno, course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.addStudentCourses(sno, cnos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentCourses(long sno,
		java.util.List<com.rvrjc.portal.model.Course> Courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.addStudentCourses(sno, Courses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearStudentCourses(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.clearStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.deleteStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentCourse(long sno,
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.deleteStudentCourse(sno, course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.deleteStudentCourses(sno, cnos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentCourses(long sno,
		java.util.List<com.rvrjc.portal.model.Course> Courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.deleteStudentCourses(sno, Courses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno) throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getStudentCourses(sno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getStudentCourses(sno, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStudentCoursesCount(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.getStudentCoursesCount(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.hasStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStudentCourses(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseLocalService.hasStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseLocalService.setStudentCourses(sno, cnos);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _courseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_courseLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _courseLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CourseLocalService getWrappedCourseLocalService() {
		return _courseLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCourseLocalService(
		CourseLocalService courseLocalService) {
		_courseLocalService = courseLocalService;
	}

	@Override
	public CourseLocalService getWrappedService() {
		return _courseLocalService;
	}

	@Override
	public void setWrappedService(CourseLocalService courseLocalService) {
		_courseLocalService = courseLocalService;
	}

	private CourseLocalService _courseLocalService;
}