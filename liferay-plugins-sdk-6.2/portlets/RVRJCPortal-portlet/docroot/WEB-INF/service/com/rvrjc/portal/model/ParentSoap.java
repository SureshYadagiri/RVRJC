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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author suresh
 * @generated
 */
public class ParentSoap implements Serializable {
	public static ParentSoap toSoapModel(Parent model) {
		ParentSoap soapModel = new ParentSoap();

		soapModel.setParentId(model.getParentId());
		soapModel.setNickName(model.getNickName());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setPhNo(model.getPhNo());
		soapModel.setEmail(model.getEmail());
		soapModel.setRelationShip(model.getRelationShip());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedOn(model.getModifiedOn());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static ParentSoap[] toSoapModels(Parent[] models) {
		ParentSoap[] soapModels = new ParentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ParentSoap[][] toSoapModels(Parent[][] models) {
		ParentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ParentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ParentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ParentSoap[] toSoapModels(List<Parent> models) {
		List<ParentSoap> soapModels = new ArrayList<ParentSoap>(models.size());

		for (Parent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ParentSoap[soapModels.size()]);
	}

	public ParentSoap() {
	}

	public long getPrimaryKey() {
		return _parentId;
	}

	public void setPrimaryKey(long pk) {
		setParentId(pk);
	}

	public long getParentId() {
		return _parentId;
	}

	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	public String getNickName() {
		return _nickName;
	}

	public void setNickName(String nickName) {
		_nickName = nickName;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public long getPhNo() {
		return _phNo;
	}

	public void setPhNo(long phNo) {
		_phNo = phNo;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getRelationShip() {
		return _relationShip;
	}

	public void setRelationShip(String relationShip) {
		_relationShip = relationShip;
	}

	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return _modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _parentId;
	private String _nickName;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private long _phNo;
	private String _email;
	private String _relationShip;
	private Date _createdOn;
	private String _createdBy;
	private Date _modifiedOn;
	private String _modifiedBy;
}