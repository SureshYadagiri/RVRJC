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

package com.rvrjc.portal.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.rvrjc.portal.model.Student;
import com.rvrjc.portal.service.StudentLocalService;
import com.rvrjc.portal.service.persistence.AddressPersistence;
import com.rvrjc.portal.service.persistence.CoursePersistence;
import com.rvrjc.portal.service.persistence.DepartmentPersistence;
import com.rvrjc.portal.service.persistence.InvoicePersistence;
import com.rvrjc.portal.service.persistence.ParentPersistence;
import com.rvrjc.portal.service.persistence.StudentPersistence;
import com.rvrjc.portal.service.persistence.TeacherPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the student local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.rvrjc.portal.service.impl.StudentLocalServiceImpl}.
 * </p>
 *
 * @author suresh
 * @see com.rvrjc.portal.service.impl.StudentLocalServiceImpl
 * @see com.rvrjc.portal.service.StudentLocalServiceUtil
 * @generated
 */
public abstract class StudentLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements StudentLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.rvrjc.portal.service.StudentLocalServiceUtil} to access the student local service.
	 */

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Student addStudent(Student student) throws SystemException {
		student.setNew(true);

		return studentPersistence.update(student);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param sno the primary key for the new student
	 * @return the new student
	 */
	@Override
	public Student createStudent(long sno) {
		return studentPersistence.create(sno);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sno the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Student deleteStudent(long sno)
		throws PortalException, SystemException {
		return studentPersistence.remove(sno);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Student deleteStudent(Student student) throws SystemException {
		return studentPersistence.remove(student);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Student.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return studentPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return studentPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return studentPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return studentPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return studentPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Student fetchStudent(long sno) throws SystemException {
		return studentPersistence.fetchByPrimaryKey(sno);
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
	public Student getStudent(long sno) throws PortalException, SystemException {
		return studentPersistence.findByPrimaryKey(sno);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return studentPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<Student> getStudents(int start, int end)
		throws SystemException {
		return studentPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStudentsCount() throws SystemException {
		return studentPersistence.countAll();
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param student the student
	 * @return the student that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Student updateStudent(Student student) throws SystemException {
		return studentPersistence.update(student);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourseStudent(long cno, long sno) throws SystemException {
		coursePersistence.addStudent(cno, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourseStudent(long cno, Student student)
		throws SystemException {
		coursePersistence.addStudent(cno, student);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourseStudents(long cno, long[] snos)
		throws SystemException {
		coursePersistence.addStudents(cno, snos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourseStudents(long cno, List<Student> Students)
		throws SystemException {
		coursePersistence.addStudents(cno, Students);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearCourseStudents(long cno) throws SystemException {
		coursePersistence.clearStudents(cno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteCourseStudent(long cno, long sno)
		throws SystemException {
		coursePersistence.removeStudent(cno, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteCourseStudent(long cno, Student student)
		throws SystemException {
		coursePersistence.removeStudent(cno, student);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteCourseStudents(long cno, long[] snos)
		throws SystemException {
		coursePersistence.removeStudents(cno, snos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteCourseStudents(long cno, List<Student> Students)
		throws SystemException {
		coursePersistence.removeStudents(cno, Students);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getCourseStudents(long cno) throws SystemException {
		return coursePersistence.getStudents(cno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getCourseStudents(long cno, int start, int end)
		throws SystemException {
		return coursePersistence.getStudents(cno, start, end);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getCourseStudents(long cno, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return coursePersistence.getStudents(cno, start, end, orderByComparator);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCourseStudentsCount(long cno) throws SystemException {
		return coursePersistence.getStudentsSize(cno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasCourseStudent(long cno, long sno)
		throws SystemException {
		return coursePersistence.containsStudent(cno, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasCourseStudents(long cno) throws SystemException {
		return coursePersistence.containsStudents(cno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCourseStudents(long cno, long[] snos)
		throws SystemException {
		coursePersistence.setStudents(cno, snos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParentStudent(long parentId, long sno)
		throws SystemException {
		parentPersistence.addStudent(parentId, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParentStudent(long parentId, Student student)
		throws SystemException {
		parentPersistence.addStudent(parentId, student);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParentStudents(long parentId, long[] snos)
		throws SystemException {
		parentPersistence.addStudents(parentId, snos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParentStudents(long parentId, List<Student> Students)
		throws SystemException {
		parentPersistence.addStudents(parentId, Students);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearParentStudents(long parentId) throws SystemException {
		parentPersistence.clearStudents(parentId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteParentStudent(long parentId, long sno)
		throws SystemException {
		parentPersistence.removeStudent(parentId, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteParentStudent(long parentId, Student student)
		throws SystemException {
		parentPersistence.removeStudent(parentId, student);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteParentStudents(long parentId, long[] snos)
		throws SystemException {
		parentPersistence.removeStudents(parentId, snos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteParentStudents(long parentId, List<Student> Students)
		throws SystemException {
		parentPersistence.removeStudents(parentId, Students);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getParentStudents(long parentId)
		throws SystemException {
		return parentPersistence.getStudents(parentId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getParentStudents(long parentId, int start, int end)
		throws SystemException {
		return parentPersistence.getStudents(parentId, start, end);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> getParentStudents(long parentId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return parentPersistence.getStudents(parentId, start, end,
			orderByComparator);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getParentStudentsCount(long parentId) throws SystemException {
		return parentPersistence.getStudentsSize(parentId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasParentStudent(long parentId, long sno)
		throws SystemException {
		return parentPersistence.containsStudent(parentId, sno);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasParentStudents(long parentId) throws SystemException {
		return parentPersistence.containsStudents(parentId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setParentStudents(long parentId, long[] snos)
		throws SystemException {
		parentPersistence.setStudents(parentId, snos);
	}

	/**
	 * Returns the address local service.
	 *
	 * @return the address local service
	 */
	public com.rvrjc.portal.service.AddressLocalService getAddressLocalService() {
		return addressLocalService;
	}

	/**
	 * Sets the address local service.
	 *
	 * @param addressLocalService the address local service
	 */
	public void setAddressLocalService(
		com.rvrjc.portal.service.AddressLocalService addressLocalService) {
		this.addressLocalService = addressLocalService;
	}

	/**
	 * Returns the address persistence.
	 *
	 * @return the address persistence
	 */
	public AddressPersistence getAddressPersistence() {
		return addressPersistence;
	}

	/**
	 * Sets the address persistence.
	 *
	 * @param addressPersistence the address persistence
	 */
	public void setAddressPersistence(AddressPersistence addressPersistence) {
		this.addressPersistence = addressPersistence;
	}

	/**
	 * Returns the course local service.
	 *
	 * @return the course local service
	 */
	public com.rvrjc.portal.service.CourseLocalService getCourseLocalService() {
		return courseLocalService;
	}

	/**
	 * Sets the course local service.
	 *
	 * @param courseLocalService the course local service
	 */
	public void setCourseLocalService(
		com.rvrjc.portal.service.CourseLocalService courseLocalService) {
		this.courseLocalService = courseLocalService;
	}

	/**
	 * Returns the course persistence.
	 *
	 * @return the course persistence
	 */
	public CoursePersistence getCoursePersistence() {
		return coursePersistence;
	}

	/**
	 * Sets the course persistence.
	 *
	 * @param coursePersistence the course persistence
	 */
	public void setCoursePersistence(CoursePersistence coursePersistence) {
		this.coursePersistence = coursePersistence;
	}

	/**
	 * Returns the department local service.
	 *
	 * @return the department local service
	 */
	public com.rvrjc.portal.service.DepartmentLocalService getDepartmentLocalService() {
		return departmentLocalService;
	}

	/**
	 * Sets the department local service.
	 *
	 * @param departmentLocalService the department local service
	 */
	public void setDepartmentLocalService(
		com.rvrjc.portal.service.DepartmentLocalService departmentLocalService) {
		this.departmentLocalService = departmentLocalService;
	}

	/**
	 * Returns the department persistence.
	 *
	 * @return the department persistence
	 */
	public DepartmentPersistence getDepartmentPersistence() {
		return departmentPersistence;
	}

	/**
	 * Sets the department persistence.
	 *
	 * @param departmentPersistence the department persistence
	 */
	public void setDepartmentPersistence(
		DepartmentPersistence departmentPersistence) {
		this.departmentPersistence = departmentPersistence;
	}

	/**
	 * Returns the invoice local service.
	 *
	 * @return the invoice local service
	 */
	public com.rvrjc.portal.service.InvoiceLocalService getInvoiceLocalService() {
		return invoiceLocalService;
	}

	/**
	 * Sets the invoice local service.
	 *
	 * @param invoiceLocalService the invoice local service
	 */
	public void setInvoiceLocalService(
		com.rvrjc.portal.service.InvoiceLocalService invoiceLocalService) {
		this.invoiceLocalService = invoiceLocalService;
	}

	/**
	 * Returns the invoice persistence.
	 *
	 * @return the invoice persistence
	 */
	public InvoicePersistence getInvoicePersistence() {
		return invoicePersistence;
	}

	/**
	 * Sets the invoice persistence.
	 *
	 * @param invoicePersistence the invoice persistence
	 */
	public void setInvoicePersistence(InvoicePersistence invoicePersistence) {
		this.invoicePersistence = invoicePersistence;
	}

	/**
	 * Returns the parent local service.
	 *
	 * @return the parent local service
	 */
	public com.rvrjc.portal.service.ParentLocalService getParentLocalService() {
		return parentLocalService;
	}

	/**
	 * Sets the parent local service.
	 *
	 * @param parentLocalService the parent local service
	 */
	public void setParentLocalService(
		com.rvrjc.portal.service.ParentLocalService parentLocalService) {
		this.parentLocalService = parentLocalService;
	}

	/**
	 * Returns the parent persistence.
	 *
	 * @return the parent persistence
	 */
	public ParentPersistence getParentPersistence() {
		return parentPersistence;
	}

	/**
	 * Sets the parent persistence.
	 *
	 * @param parentPersistence the parent persistence
	 */
	public void setParentPersistence(ParentPersistence parentPersistence) {
		this.parentPersistence = parentPersistence;
	}

	/**
	 * Returns the student local service.
	 *
	 * @return the student local service
	 */
	public com.rvrjc.portal.service.StudentLocalService getStudentLocalService() {
		return studentLocalService;
	}

	/**
	 * Sets the student local service.
	 *
	 * @param studentLocalService the student local service
	 */
	public void setStudentLocalService(
		com.rvrjc.portal.service.StudentLocalService studentLocalService) {
		this.studentLocalService = studentLocalService;
	}

	/**
	 * Returns the student persistence.
	 *
	 * @return the student persistence
	 */
	public StudentPersistence getStudentPersistence() {
		return studentPersistence;
	}

	/**
	 * Sets the student persistence.
	 *
	 * @param studentPersistence the student persistence
	 */
	public void setStudentPersistence(StudentPersistence studentPersistence) {
		this.studentPersistence = studentPersistence;
	}

	/**
	 * Returns the teacher local service.
	 *
	 * @return the teacher local service
	 */
	public com.rvrjc.portal.service.TeacherLocalService getTeacherLocalService() {
		return teacherLocalService;
	}

	/**
	 * Sets the teacher local service.
	 *
	 * @param teacherLocalService the teacher local service
	 */
	public void setTeacherLocalService(
		com.rvrjc.portal.service.TeacherLocalService teacherLocalService) {
		this.teacherLocalService = teacherLocalService;
	}

	/**
	 * Returns the teacher persistence.
	 *
	 * @return the teacher persistence
	 */
	public TeacherPersistence getTeacherPersistence() {
		return teacherPersistence;
	}

	/**
	 * Sets the teacher persistence.
	 *
	 * @param teacherPersistence the teacher persistence
	 */
	public void setTeacherPersistence(TeacherPersistence teacherPersistence) {
		this.teacherPersistence = teacherPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.rvrjc.portal.model.Student",
			studentLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.rvrjc.portal.model.Student");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Student.class;
	}

	protected String getModelClassName() {
		return Student.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = studentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.rvrjc.portal.service.AddressLocalService.class)
	protected com.rvrjc.portal.service.AddressLocalService addressLocalService;
	@BeanReference(type = AddressPersistence.class)
	protected AddressPersistence addressPersistence;
	@BeanReference(type = com.rvrjc.portal.service.CourseLocalService.class)
	protected com.rvrjc.portal.service.CourseLocalService courseLocalService;
	@BeanReference(type = CoursePersistence.class)
	protected CoursePersistence coursePersistence;
	@BeanReference(type = com.rvrjc.portal.service.DepartmentLocalService.class)
	protected com.rvrjc.portal.service.DepartmentLocalService departmentLocalService;
	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	@BeanReference(type = com.rvrjc.portal.service.InvoiceLocalService.class)
	protected com.rvrjc.portal.service.InvoiceLocalService invoiceLocalService;
	@BeanReference(type = InvoicePersistence.class)
	protected InvoicePersistence invoicePersistence;
	@BeanReference(type = com.rvrjc.portal.service.ParentLocalService.class)
	protected com.rvrjc.portal.service.ParentLocalService parentLocalService;
	@BeanReference(type = ParentPersistence.class)
	protected ParentPersistence parentPersistence;
	@BeanReference(type = com.rvrjc.portal.service.StudentLocalService.class)
	protected com.rvrjc.portal.service.StudentLocalService studentLocalService;
	@BeanReference(type = StudentPersistence.class)
	protected StudentPersistence studentPersistence;
	@BeanReference(type = com.rvrjc.portal.service.TeacherLocalService.class)
	protected com.rvrjc.portal.service.TeacherLocalService teacherLocalService;
	@BeanReference(type = TeacherPersistence.class)
	protected TeacherPersistence teacherPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private StudentLocalServiceClpInvoker _clpInvoker = new StudentLocalServiceClpInvoker();
}