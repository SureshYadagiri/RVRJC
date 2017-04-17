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
 * Provides the local service utility for Student. This utility wraps
 * {@link com.rvrjc.portal.service.impl.StudentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author suresh
 * @see StudentLocalService
 * @see com.rvrjc.portal.service.base.StudentLocalServiceBaseImpl
 * @see com.rvrjc.portal.service.impl.StudentLocalServiceImpl
 * @generated
 */
public class StudentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rvrjc.portal.service.impl.StudentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the student to the database. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student addStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudent(student);
	}

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param sno the primary key for the new student
	* @return the new student
	*/
	public static com.rvrjc.portal.model.Student createStudent(long sno) {
		return getService().createStudent(sno);
	}

	/**
	* Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sno the primary key of the student
	* @return the student that was removed
	* @throws PortalException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student deleteStudent(long sno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudent(sno);
	}

	/**
	* Deletes the student from the database. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student deleteStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudent(student);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.rvrjc.portal.model.Student fetchStudent(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStudent(sno);
	}

	/**
	* Returns the student with the primary key.
	*
	* @param sno the primary key of the student
	* @return the student
	* @throws PortalException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student getStudent(long sno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudent(sno);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.rvrjc.portal.model.Student> getStudents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudents(start, end);
	}

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentsCount();
	}

	/**
	* Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Student updateStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStudent(student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourseStudent(long cno,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCourseStudent(cno, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addCourseStudents(long cno,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addCourseStudents(cno, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearCourseStudents(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCourseStudent(long cno,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCourseStudent(cno, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteCourseStudents(long cno,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCourseStudents(cno, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseStudents(cno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseStudents(cno, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getCourseStudentsCount(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseStudentsCount(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasCourseStudents(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addParentStudent(long parentId,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addParentStudent(parentId, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addParentStudents(parentId, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addParentStudents(long parentId,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addParentStudents(parentId, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearParentStudents(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteParentStudent(long parentId,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteParentStudent(parentId, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteParentStudents(parentId, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteParentStudents(long parentId,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteParentStudents(parentId, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentStudents(parentId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getParentStudents(parentId, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getParentStudentsCount(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentStudentsCount(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasParentStudents(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setParentStudents(parentId, snos);
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

	public static StudentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StudentLocalService.class.getName());

			if (invokableLocalService instanceof StudentLocalService) {
				_service = (StudentLocalService)invokableLocalService;
			}
			else {
				_service = new StudentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StudentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(StudentLocalService service) {
	}

	private static StudentLocalService _service;
}