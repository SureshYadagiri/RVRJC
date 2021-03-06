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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Parent service. Represents a row in the &quot;rvrjc_Parent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rvrjc.portal.model.impl.ParentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rvrjc.portal.model.impl.ParentImpl}.
 * </p>
 *
 * @author suresh
 * @see Parent
 * @see com.rvrjc.portal.model.impl.ParentImpl
 * @see com.rvrjc.portal.model.impl.ParentModelImpl
 * @generated
 */
public interface ParentModel extends BaseModel<Parent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a parent model instance should use the {@link Parent} interface instead.
	 */

	/**
	 * Returns the primary key of this parent.
	 *
	 * @return the primary key of this parent
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this parent.
	 *
	 * @param primaryKey the primary key of this parent
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the parent ID of this parent.
	 *
	 * @return the parent ID of this parent
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this parent.
	 *
	 * @param parentId the parent ID of this parent
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the nick name of this parent.
	 *
	 * @return the nick name of this parent
	 */
	@AutoEscape
	public String getNickName();

	/**
	 * Sets the nick name of this parent.
	 *
	 * @param nickName the nick name of this parent
	 */
	public void setNickName(String nickName);

	/**
	 * Returns the first name of this parent.
	 *
	 * @return the first name of this parent
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this parent.
	 *
	 * @param firstName the first name of this parent
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the middle name of this parent.
	 *
	 * @return the middle name of this parent
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this parent.
	 *
	 * @param middleName the middle name of this parent
	 */
	public void setMiddleName(String middleName);

	/**
	 * Returns the last name of this parent.
	 *
	 * @return the last name of this parent
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this parent.
	 *
	 * @param lastName the last name of this parent
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the ph no of this parent.
	 *
	 * @return the ph no of this parent
	 */
	public long getPhNo();

	/**
	 * Sets the ph no of this parent.
	 *
	 * @param phNo the ph no of this parent
	 */
	public void setPhNo(long phNo);

	/**
	 * Returns the email of this parent.
	 *
	 * @return the email of this parent
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this parent.
	 *
	 * @param email the email of this parent
	 */
	public void setEmail(String email);

	/**
	 * Returns the relation ship of this parent.
	 *
	 * @return the relation ship of this parent
	 */
	@AutoEscape
	public String getRelationShip();

	/**
	 * Sets the relation ship of this parent.
	 *
	 * @param relationShip the relation ship of this parent
	 */
	public void setRelationShip(String relationShip);

	/**
	 * Returns the created on of this parent.
	 *
	 * @return the created on of this parent
	 */
	public Date getCreatedOn();

	/**
	 * Sets the created on of this parent.
	 *
	 * @param createdOn the created on of this parent
	 */
	public void setCreatedOn(Date createdOn);

	/**
	 * Returns the created by of this parent.
	 *
	 * @return the created by of this parent
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this parent.
	 *
	 * @param createdBy the created by of this parent
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the modified on of this parent.
	 *
	 * @return the modified on of this parent
	 */
	public Date getModifiedOn();

	/**
	 * Sets the modified on of this parent.
	 *
	 * @param modifiedOn the modified on of this parent
	 */
	public void setModifiedOn(Date modifiedOn);

	/**
	 * Returns the modified by of this parent.
	 *
	 * @return the modified by of this parent
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this parent.
	 *
	 * @param modifiedBy the modified by of this parent
	 */
	public void setModifiedBy(String modifiedBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.rvrjc.portal.model.Parent parent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rvrjc.portal.model.Parent> toCacheModel();

	@Override
	public com.rvrjc.portal.model.Parent toEscapedModel();

	@Override
	public com.rvrjc.portal.model.Parent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}