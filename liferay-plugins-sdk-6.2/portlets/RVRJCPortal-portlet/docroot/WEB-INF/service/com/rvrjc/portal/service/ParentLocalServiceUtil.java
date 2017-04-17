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
 * Provides the local service utility for Parent. This utility wraps
 * {@link com.rvrjc.portal.service.impl.ParentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author suresh
 * @see ParentLocalService
 * @see com.rvrjc.portal.service.base.ParentLocalServiceBaseImpl
 * @see com.rvrjc.portal.service.impl.ParentLocalServiceImpl
 * @generated
 */
public class ParentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rvrjc.portal.service.impl.ParentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the parent to the database. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent addParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addParent(parent);
	}

	/**
	* Creates a new parent with the primary key. Does not add the parent to the database.
	*
	* @param parentId the primary key for the new parent
	* @return the new parent
	*/
	public static com.rvrjc.portal.model.Parent createParent(long parentId) {
		return getService().createParent(parentId);
	}

	/**
	* Deletes the parent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param parentId the primary key of the parent
	* @return the parent that was removed
	* @throws PortalException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent deleteParent(long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteParent(parentId);
	}

	/**
	* Deletes the parent from the database. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent deleteParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteParent(parent);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.ParentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.rvrjc.portal.model.Parent fetchParent(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchParent(parentId);
	}

	/**
	* Returns the parent with the primary key.
	*
	* @param parentId the primary key of the parent
	* @return the parent
	* @throws PortalException if a parent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent getParent(long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getParent(parentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.rvrjc.portal.model.Parent> getParents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getParents(start, end);
	}

	/**
	* Returns the number of parents.
	*
	* @return the number of parents
	* @throws SystemException if a system exception occurred
	*/
	public static int getParentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentsCount();
	}

	/**
	* Updates the parent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param parent the parent
	* @return the parent that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rvrjc.portal.model.Parent updateParent(
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateParent(parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentParent(long sno,
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentParent(sno, parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentParents(sno, parentIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStudentParents(long sno,
		java.util.List<com.rvrjc.portal.model.Parent> Parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addStudentParents(sno, Parents);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStudentParents(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentParent(long sno,
		com.rvrjc.portal.model.Parent parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentParent(sno, parent);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentParents(sno, parentIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStudentParents(long sno,
		java.util.List<com.rvrjc.portal.model.Parent> Parents)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStudentParents(sno, Parents);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentParents(sno, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rvrjc.portal.model.Parent> getStudentParents(
		long sno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentParents(sno, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentParentsCount(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentParentsCount(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStudentParent(long sno, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStudentParent(sno, parentId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStudentParents(long sno)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStudentParents(sno);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setStudentParents(long sno, long[] parentIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setStudentParents(sno, parentIds);
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

	public static ParentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ParentLocalService.class.getName());

			if (invokableLocalService instanceof ParentLocalService) {
				_service = (ParentLocalService)invokableLocalService;
			}
			else {
				_service = new ParentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ParentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ParentLocalService service) {
	}

	private static ParentLocalService _service;
}