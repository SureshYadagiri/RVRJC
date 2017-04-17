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
 * Provides a wrapper for {@link StudentLocalService}.
 *
 * @author suresh
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceWrapper implements StudentLocalService,
	ServiceWrapper<StudentLocalService> {
	public StudentLocalServiceWrapper(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	/**
	* Adds the student to the database. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Student addStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.addStudent(student);
	}

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param sno the primary key for the new student
	* @return the new student
	*/
	@Override
	public com.rvrjc.portal.model.Student createStudent(long sno) {
		return _studentLocalService.createStudent(sno);
	}

	/**
	* Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sno the primary key of the student
	* @return the student that was removed
	* @throws PortalException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Student deleteStudent(long sno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.deleteStudent(sno);
	}

	/**
	* Deletes the student from the database. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Student deleteStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.deleteStudent(student);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentLocalService.dynamicQuery();
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
		return _studentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _studentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _studentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rvrjc.portal.model.Student fetchStudent(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.fetchStudent(sno);
	}

	/**
	* Returns the student with the primary key.
	*
	* @param sno the primary key of the student
	* @return the student
	* @throws PortalException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Student getStudent(long sno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getStudent(sno);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getStudents(start, end);
	}

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStudentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getStudentsCount();
	}

	/**
	* Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param student the student
	* @return the student that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Student updateStudent(
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.updateStudent(student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCourseStudent(long cno,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addCourseStudent(cno, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCourseStudents(long cno,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addCourseStudents(cno, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearCourseStudents(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.clearCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCourseStudent(long cno,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteCourseStudent(cno, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCourseStudents(long cno,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteCourseStudents(cno, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno) throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getCourseStudents(cno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getCourseStudents(
		long cno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getCourseStudents(cno, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCourseStudentsCount(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getCourseStudentsCount(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCourseStudent(long cno, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.hasCourseStudent(cno, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCourseStudents(long cno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.hasCourseStudents(cno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setCourseStudents(long cno, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.setCourseStudents(cno, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addParentStudent(long parentId,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addParentStudent(parentId, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addParentStudents(parentId, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addParentStudents(long parentId,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.addParentStudents(parentId, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearParentStudents(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.clearParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteParentStudent(long parentId,
		com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteParentStudent(parentId, student);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteParentStudents(parentId, snos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteParentStudents(long parentId,
		java.util.List<com.rvrjc.portal.model.Student> Students)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.deleteParentStudents(parentId, Students);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getParentStudents(parentId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Student> getParentStudents(
		long parentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getParentStudents(parentId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getParentStudentsCount(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.getParentStudentsCount(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasParentStudent(long parentId, long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.hasParentStudent(parentId, sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasParentStudents(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentLocalService.hasParentStudents(parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setParentStudents(long parentId, long[] snos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentLocalService.setParentStudents(parentId, snos);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _studentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_studentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _studentLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StudentLocalService getWrappedStudentLocalService() {
		return _studentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStudentLocalService(
		StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	@Override
	public StudentLocalService getWrappedService() {
		return _studentLocalService;
	}

	@Override
	public void setWrappedService(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	private StudentLocalService _studentLocalService;
}