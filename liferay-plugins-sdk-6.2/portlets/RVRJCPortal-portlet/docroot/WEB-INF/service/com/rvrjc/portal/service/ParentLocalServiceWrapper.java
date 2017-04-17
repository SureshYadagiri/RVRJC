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
 * Provides a wrapper for {@link ParentLocalService}.
 *
 * @author suresh
 * @see ParentLocalService
 * @generated
 */
public class ParentLocalServiceWrapper implements ParentLocalService,
	ServiceWrapper<ParentLocalService> {
	public ParentLocalServiceWrapper(ParentLocalService parentLocalService) {
		_parentLocalService = parentLocalService;
	}

	/**
	* Adds the parent to the database. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Parent addParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.addParent(parent);
	}

	/**
	* Creates a new parent with the primary key. Does not add the parent to the database.
	*
	* @param parentId the primary key for the new parent
	* @return the new parent
	*/
	@Override
	public com.rvrjc.portal.model.Parent createParent(long parentId) {
		return _parentLocalService.createParent(parentId);
	}

	/**
	* Deletes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parentId the primary key of the parent
	* @return the parent that was removed
	* @throws PortalException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Parent deleteParent(long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.deleteParent(parentId);
	}

	/**
	* Deletes the parent from the database. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Parent deleteParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.deleteParent(parent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _parentLocalService.dynamicQuery();
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
		return _parentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _parentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _parentLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _parentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _parentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rvrjc.portal.model.Parent fetchParent(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.fetchParent(parentId);
	}

	/**
	* Returns the parent with the primary key.
	*
	* @param parentId the primary key of the parent
	* @return the parent
	* @throws PortalException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Parent getParent(long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getParent(parentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.rvrjc.portal.model.Parent> getParents(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getParents(start, end);
	}

	/**
	* Returns the number of parents.
	*
	* @return the number of parents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getParentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getParentsCount();
	}

	/**
	* Updates the parent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rvrjc.portal.model.Parent updateParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.updateParent(parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.addStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentParent(long sno, com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.addStudentParent(sno, parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.addStudentParents(sno, parentIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStudentParents(long sno,
		java.util.List<com.rvrjc.portal.model.Parent> Parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.addStudentParents(sno, Parents);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearStudentParents(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.clearStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.deleteStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentParent(long sno,
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.deleteStudentParent(sno, parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.deleteStudentParents(sno, parentIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStudentParents(long sno,
		java.util.List<com.rvrjc.portal.model.Parent> Parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.deleteStudentParents(sno, Parents);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno) throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getStudentParents(sno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getStudentParents(sno, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStudentParentsCount(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.getStudentParentsCount(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.hasStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStudentParents(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _parentLocalService.hasStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_parentLocalService.setStudentParents(sno, parentIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _parentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_parentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _parentLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ParentLocalService getWrappedParentLocalService() {
		return _parentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedParentLocalService(
		ParentLocalService parentLocalService) {
		_parentLocalService = parentLocalService;
	}

	@Override
	public ParentLocalService getWrappedService() {
		return _parentLocalService;
	}

	@Override
	public void setWrappedService(ParentLocalService parentLocalService) {
		_parentLocalService = parentLocalService;
	}

	private ParentLocalService _parentLocalService;
}