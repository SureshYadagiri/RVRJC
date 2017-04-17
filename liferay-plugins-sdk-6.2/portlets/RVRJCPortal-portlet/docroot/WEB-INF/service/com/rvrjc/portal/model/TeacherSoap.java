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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author suresh
 * @generated
 */
public class TeacherSoap implements Serializable {
	public static TeacherSoap toSoapModel(Teacher model) {
		TeacherSoap soapModel = new TeacherSoap();

		soapModel.setTid(model.getTid());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setGender(model.getGender());
		soapModel.setEmail(model.getEmail());
		soapModel.setPhno(model.getPhno());
		soapModel.setLiferayUserId(model.getLiferayUserId());

		return soapModel;
	}

	public static TeacherSoap[] toSoapModels(Teacher[] models) {
		TeacherSoap[] soapModels = new TeacherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeacherSoap[][] toSoapModels(Teacher[][] models) {
		TeacherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeacherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeacherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeacherSoap[] toSoapModels(List<Teacher> models) {
		List<TeacherSoap> soapModels = new ArrayList<TeacherSoap>(models.size());

		for (Teacher model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeacherSoap[soapModels.size()]);
	}

	public TeacherSoap() {
	}

	public long getPrimaryKey() {
		return _tid;
	}

	public void setPrimaryKey(long pk) {
		setTid(pk);
	}

	public long getTid() {
		return _tid;
	}

	public void setTid(long tid) {
		_tid = tid;
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

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getPhno() {
		return _phno;
	}

	public void setPhno(long phno) {
		_phno = phno;
	}

	public long getLiferayUserId() {
		return _liferayUserId;
	}

	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	private long _tid;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _gender;
	private String _email;
	private long _phno;
	private long _liferayUserId;
}