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
 * This class is a wrapper for {@link Parent}.
 * </p>
 *
 * @author suresh
 * @see Parent
 * @generated
 */
public class ParentWrapper implements Parent, ModelWrapper<Parent> {
	public ParentWrapper(Parent parent) {
		_parent = parent;
	}

	@Override
	public Class<?> getModelClass() {
		return Parent.class;
	}

	@Override
	public String getModelClassName() {
		return Parent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parentId", getParentId());
		attributes.put("nickName", getNickName());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("phNo", getPhNo());
		attributes.put("email", getEmail());
		attributes.put("relationShip", getRelationShip());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String nickName = (String)attributes.get("nickName");

		if (nickName != null) {
			setNickName(nickName);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Long phNo = (Long)attributes.get("phNo");

		if (phNo != null) {
			setPhNo(phNo);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String relationShip = (String)attributes.get("relationShip");

		if (relationShip != null) {
			setRelationShip(relationShip);
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
	* Returns the primary key of this parent.
	*
	* @return the primary key of this parent
	*/
	@Override
	public long getPrimaryKey() {
		return _parent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this parent.
	*
	* @param primaryKey the primary key of this parent
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_parent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the parent ID of this parent.
	*
	* @return the parent ID of this parent
	*/
	@Override
	public long getParentId() {
		return _parent.getParentId();
	}

	/**
	* Sets the parent ID of this parent.
	*
	* @param parentId the parent ID of this parent
	*/
	@Override
	public void setParentId(long parentId) {
		_parent.setParentId(parentId);
	}

	/**
	* Returns the nick name of this parent.
	*
	* @return the nick name of this parent
	*/
	@Override
	public java.lang.String getNickName() {
		return _parent.getNickName();
	}

	/**
	* Sets the nick name of this parent.
	*
	* @param nickName the nick name of this parent
	*/
	@Override
	public void setNickName(java.lang.String nickName) {
		_parent.setNickName(nickName);
	}

	/**
	* Returns the first name of this parent.
	*
	* @return the first name of this parent
	*/
	@Override
	public java.lang.String getFirstName() {
		return _parent.getFirstName();
	}

	/**
	* Sets the first name of this parent.
	*
	* @param firstName the first name of this parent
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_parent.setFirstName(firstName);
	}

	/**
	* Returns the middle name of this parent.
	*
	* @return the middle name of this parent
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _parent.getMiddleName();
	}

	/**
	* Sets the middle name of this parent.
	*
	* @param middleName the middle name of this parent
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_parent.setMiddleName(middleName);
	}

	/**
	* Returns the last name of this parent.
	*
	* @return the last name of this parent
	*/
	@Override
	public java.lang.String getLastName() {
		return _parent.getLastName();
	}

	/**
	* Sets the last name of this parent.
	*
	* @param lastName the last name of this parent
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_parent.setLastName(lastName);
	}

	/**
	* Returns the ph no of this parent.
	*
	* @return the ph no of this parent
	*/
	@Override
	public long getPhNo() {
		return _parent.getPhNo();
	}

	/**
	* Sets the ph no of this parent.
	*
	* @param phNo the ph no of this parent
	*/
	@Override
	public void setPhNo(long phNo) {
		_parent.setPhNo(phNo);
	}

	/**
	* Returns the email of this parent.
	*
	* @return the email of this parent
	*/
	@Override
	public java.lang.String getEmail() {
		return _parent.getEmail();
	}

	/**
	* Sets the email of this parent.
	*
	* @param email the email of this parent
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_parent.setEmail(email);
	}

	/**
	* Returns the relation ship of this parent.
	*
	* @return the relation ship of this parent
	*/
	@Override
	public java.lang.String getRelationShip() {
		return _parent.getRelationShip();
	}

	/**
	* Sets the relation ship of this parent.
	*
	* @param relationShip the relation ship of this parent
	*/
	@Override
	public void setRelationShip(java.lang.String relationShip) {
		_parent.setRelationShip(relationShip);
	}

	/**
	* Returns the created on of this parent.
	*
	* @return the created on of this parent
	*/
	@Override
	public java.util.Date getCreatedOn() {
		return _parent.getCreatedOn();
	}

	/**
	* Sets the created on of this parent.
	*
	* @param createdOn the created on of this parent
	*/
	@Override
	public void setCreatedOn(java.util.Date createdOn) {
		_parent.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this parent.
	*
	* @return the created by of this parent
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _parent.getCreatedBy();
	}

	/**
	* Sets the created by of this parent.
	*
	* @param createdBy the created by of this parent
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_parent.setCreatedBy(createdBy);
	}

	/**
	* Returns the modified on of this parent.
	*
	* @return the modified on of this parent
	*/
	@Override
	public java.util.Date getModifiedOn() {
		return _parent.getModifiedOn();
	}

	/**
	* Sets the modified on of this parent.
	*
	* @param modifiedOn the modified on of this parent
	*/
	@Override
	public void setModifiedOn(java.util.Date modifiedOn) {
		_parent.setModifiedOn(modifiedOn);
	}

	/**
	* Returns the modified by of this parent.
	*
	* @return the modified by of this parent
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _parent.getModifiedBy();
	}

	/**
	* Sets the modified by of this parent.
	*
	* @param modifiedBy the modified by of this parent
	*/
	@Override
	public void setModifiedBy(java.lang.String modifiedBy) {
		_parent.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _parent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_parent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _parent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_parent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _parent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _parent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_parent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _parent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_parent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_parent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_parent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ParentWrapper((Parent)_parent.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Parent parent) {
		return _parent.compareTo(parent);
	}

	@Override
	public int hashCode() {
		return _parent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Parent> toCacheModel() {
		return _parent.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Parent toEscapedModel() {
		return new ParentWrapper(_parent.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Parent toUnescapedModel() {
		return new ParentWrapper(_parent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _parent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _parent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_parent.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ParentWrapper)) {
			return false;
		}

		ParentWrapper parentWrapper = (ParentWrapper)obj;

		if (Validator.equals(_parent, parentWrapper._parent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Parent getWrappedParent() {
		return _parent;
	}

	@Override
	public Parent getWrappedModel() {
		return _parent;
	}

	@Override
	public void resetOriginalValues() {
		_parent.resetOriginalValues();
	}

	private Parent _parent;
}