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

import com.rvrjc.portal.model.Parent;

/**
 * The persistence interface for the parent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see ParentPersistenceImpl
 * @see ParentUtil
 * @generated
 */
public interface ParentPersistence extends BasePersistence<Parent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParentUtil} to access the parent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the parent in the entity cache if it is enabled.
	*
	* @param parent the parent
	*/
	public void cacheResult(com.rvrjc.portal.model.Parent parent);

	/**
	* Caches the parents in the entity cache if it is enabled.
	*
	* @param parents the parents
	*/
	public void cacheResult(
		java.util.List<com.rvrjc.portal.model.Parent> parents);

	/**
	* Creates a new parent with the primary key. Does not add the parent to the database.
	*
	* @param parentId the primary key for the new parent
	* @return the new parent
	*/
	public com.rvrjc.portal.model.Parent create(long parentId);

	/**
	* Removes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parentId the primary key of the parent
	* @return the parent that was removed
	* @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Parent remove(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchParentException;

	public com.rvrjc.portal.model.Parent updateImpl(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the parent with the primary key or throws a {@link com.rvrjc.portal.NoSuchParentException} if it could not be found.
	*
	* @param parentId the primary key of the parent
	* @return the parent
	* @throws com.rvrjc.portal.NoSuchParentException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Parent findByPrimaryKey(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchParentException;

	/**
	* Returns the parent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param parentId the primary key of the parent
	* @return the parent, or <code>null</code> if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Parent fetchByPrimaryKey(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the parents.
	*
	* @return the parents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Parent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Parent> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Parent> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the parents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of parents.
	*
	* @return the number of parents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students associated with the parent.
	*
	* @param pk the primary key of the parent
	* @return the students associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rvrjc.portal.model.Student> getStudents(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students associated with the parent.
	*
	* @param pk the primary key of the parent
	* @return the number of students associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public int getStudentsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the student is associated with the parent.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @return <code>true</code> if the student is associated with the parent; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the parent has any students associated with it.
	*
	* @param pk the primary key of the parent to check for associations with students
	* @return <code>true</code> if the parent has any students associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public void addStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public void addStudent(long pk, com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public void addStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public void addStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the parent and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent to clear the associated students from
	* @throws SystemException if a system exception occurred
	*/
	public void clearStudents(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPK the primary key of the student
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudent(long pk, long studentPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the parent and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param student the student
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudent(long pk, com.rvrjc.portal.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the parent and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students
	* @throws SystemException if a system exception occurred
	*/
	public void removeStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param studentPKs the primary keys of the students to be associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public void setStudents(long pk, long[] studentPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the students associated with the parent, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the parent
	* @param students the students to be associated with the parent
	* @throws SystemException if a system exception occurred
	*/
	public void setStudents(long pk,
		java.util.List<com.rvrjc.portal.model.Student> students)
		throws com.liferay.portal.kernel.exception.SystemException;
}