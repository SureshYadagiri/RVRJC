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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Course. This utility wraps
 * {@link com.rvrjc.portal.service.impl.CourseLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author suresh
 * @see CourseLocalService
 * @see com.rvrjc.portal.service.base.CourseLocalServiceBaseImpl
 * @see com.rvrjc.portal.service.impl.CourseLocalServiceImpl
 * @generated
 */
public class CourseLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rvrjc.portal.service.impl.CourseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the course to the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Course addCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCourse(course);
	}

	/**
	* Creates a new course with the primary key. Does not add the course to the database.
	*
	* @param cno the primary key for the new course
	* @return the new course
	*/
	public static com.rvrjc.portal.model.Course createCourse(long cno) {
		return getService().createCourse(cno);
	}

	/**
	* Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cno the primary key of the course
	* @return the course that was removed
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Course deleteCourse(long cno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourse(cno);
	}

	/**
	* Deletes the course from the database. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Course deleteCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourse(course);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rvrjc.portal.model.Course fetchCourse(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCourse(cno);
	}

	/**
	* Returns the course with the primary key.
	*
	* @param cno the primary key of the course
	* @return the course
	* @throws PortalException if a course with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Course getCourse(long cno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourse(cno);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.rvrjc.portal.model.Course> getCourses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourses(start, end);
	}

	/**
	* Returns the number of courses.
	*
	* @return the number of courses
	* @throws SystemException if a system exception occurred
	*/
	public static int getCoursesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoursesCount();
	}

	/**
	* Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param course the course
	* @return the course that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Course updateCourse(
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCourse(course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentCourse(long sno,
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentCourse(sno, course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentCourses(sno, cnos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentCourses(long sno,
		java.util.List<com.rvrjc.portal.model.Course> Courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentCourses(sno, Courses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStudentCourses(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentCourse(long sno,
		com.rvrjc.portal.model.Course course)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentCourse(sno, course);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentCourses(sno, cnos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentCourses(long sno,
		java.util.List<com.rvrjc.portal.model.Course> Courses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentCourses(sno, Courses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentCourses(sno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Course> getStudentCourses(
		long sno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentCourses(sno, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentCoursesCount(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentCoursesCount(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStudentCourse(long sno, long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStudentCourse(sno, cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStudentCourses(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStudentCourses(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setStudentCourses(long sno, long[] cnos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setStudentCourses(sno, cnos);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static CourseLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CourseLocalService.class.getName());

			if (invokableLocalService instanceof CourseLocalService) {
				_service = (CourseLocalService)invokableLocalService;
			}
			else {
				_service = new CourseLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CourseLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CourseLocalService service) {
	}

	private static CourseLocalService _service;
}