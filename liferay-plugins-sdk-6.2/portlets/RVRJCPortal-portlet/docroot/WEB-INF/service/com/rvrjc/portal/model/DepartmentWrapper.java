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

package com.rvrjc.portal.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author suresh
 * @see Department
 * @generated
 */
public class DepartmentWrapper implements Department, ModelWrapper<Department> {
	public DepartmentWrapper(Department department) {
		_department = department;
	}

	@Override
	public Class<?> getModelClass() {
		return Department.class;
	}

	@Override
	public String getModelClassName() {
		return Department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dno", getDno());
		attributes.put("dname", getDname());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dno = (Long)attributes.get("dno");

		if (dno != null) {
			setDno(dno);
		}

		String dname = (String)attributes.get("dname");

		if (dname != null) {
			setDname(dname);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedOn = (Date)attributes.get("modifiedOn");

		if (modifiedOn != null) {
			setModifiedOn(modifiedOn);
		}

		String modifiedBy = (String)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	* Returns the primary key of this department.
	*
	* @return the primary key of this department
	*/
	@Override
	public long getPrimaryKey() {
		return _department.getPrimaryKey();
	}

	/**
	* Sets the primary key of this department.
	*
	* @param primaryKey the primary key of this department
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_department.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dno of this department.
	*
	* @return the dno of this department
	*/
	@Override
	public long getDno() {
		return _department.getDno();
	}

	/**
	* Sets the dno of this department.
	*
	* @param dno the dno of this department
	*/
	@Override
	public void setDno(long dno) {
		_department.setDno(dno);
	}

	/**
	* Returns the dname of this department.
	*
	* @return the dname of this department
	*/
	@Override
	public java.lang.String getDname() {
		return _department.getDname();
	}

	/**
	* Sets the dname of this department.
	*
	* @param dname the dname of this department
	*/
	@Override
	public void setDname(java.lang.String dname) {
		_department.setDname(dname);
	}

	/**
	* Returns the created on of this department.
	*
	* @return the created on of this department
	*/
	@Override
	public java.util.Date getCreatedOn() {
		return _department.getCreatedOn();
	}

	/**
	* Sets the created on of this department.
	*
	* @param createdOn the created on of this department
	*/
	@Override
	public void setCreatedOn(java.util.Date createdOn) {
		_department.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this department.
	*
	* @return the created by of this department
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _department.getCreatedBy();
	}

	/**
	* Sets the created by of this department.
	*
	* @param createdBy the created by of this department
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_department.setCreatedBy(createdBy);
	}

	/**
	* Returns the modified on of this department.
	*
	* @return the modified on of this department
	*/
	@Override
	public java.util.Date getModifiedOn() {
		return _department.getModifiedOn();
	}

	/**
	* Sets the modified on of this department.
	*
	* @param modifiedOn the modified on of this department
	*/
	@Override
	public void setModifiedOn(java.util.Date modifiedOn) {
		_department.setModifiedOn(modifiedOn);
	}

	/**
	* Returns the modified by of this department.
	*
	* @return the modified by of this department
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _department.getModifiedBy();
	}

	/**
	* Sets the modified by of this department.
	*
	* @param modifiedBy the modified by of this department
	*/
	@Override
	public void setModifiedBy(java.lang.String modifiedBy) {
		_department.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _department.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_department.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _department.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_department.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _department.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _department.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_department.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _department.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_department.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_department.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_department.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DepartmentWrapper((Department)_department.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Department department) {
		return _department.compareTo(department);
	}

	@Override
	public int hashCode() {
		return _department.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Department> toCacheModel() {
		return _department.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Department toEscapedModel() {
		return new DepartmentWrapper(_department.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Department toUnescapedModel() {
		return new DepartmentWrapper(_department.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _department.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _department.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_department.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DepartmentWrapper)) {
			return false;
		}

		DepartmentWrapper departmentWrapper = (DepartmentWrapper)obj;

		if (Validator.equals(_department, departmentWrapper._department)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Department getWrappedDepartment() {
		return _department;
	}

	@Override
	public Department getWrappedModel() {
		return _department;
	}

	@Override
	public void resetOriginalValues() {
		_department.resetOriginalValues();
	}

	private Department _department;
}