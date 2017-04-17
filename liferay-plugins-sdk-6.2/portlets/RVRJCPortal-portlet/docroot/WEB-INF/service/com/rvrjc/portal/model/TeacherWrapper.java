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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Teacher}.
 * </p>
 *
 * @author suresh
 * @see Teacher
 * @generated
 */
public class TeacherWrapper implements Teacher, ModelWrapper<Teacher> {
	public TeacherWrapper(Teacher teacher) {
		_teacher = teacher;
	}

	@Override
	public Class<?> getModelClass() {
		return Teacher.class;
	}

	@Override
	public String getModelClassName() {
		return Teacher.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tid", getTid());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("gender", getGender());
		attributes.put("email", getEmail());
		attributes.put("phno", getPhno());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tid = (Long)attributes.get("tid");

		if (tid != null) {
			setTid(tid);
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

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long phno = (Long)attributes.get("phno");

		if (phno != null) {
			setPhno(phno);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	/**
	* Returns the primary key of this teacher.
	*
	* @return the primary key of this teacher
	*/
	@Override
	public long getPrimaryKey() {
		return _teacher.getPrimaryKey();
	}

	/**
	* Sets the primary key of this teacher.
	*
	* @param primaryKey the primary key of this teacher
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_teacher.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tid of this teacher.
	*
	* @return the tid of this teacher
	*/
	@Override
	public long getTid() {
		return _teacher.getTid();
	}

	/**
	* Sets the tid of this teacher.
	*
	* @param tid the tid of this teacher
	*/
	@Override
	public void setTid(long tid) {
		_teacher.setTid(tid);
	}

	/**
	* Returns the first name of this teacher.
	*
	* @return the first name of this teacher
	*/
	@Override
	public java.lang.String getFirstName() {
		return _teacher.getFirstName();
	}

	/**
	* Sets the first name of this teacher.
	*
	* @param firstName the first name of this teacher
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_teacher.setFirstName(firstName);
	}

	/**
	* Returns the middle name of this teacher.
	*
	* @return the middle name of this teacher
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _teacher.getMiddleName();
	}

	/**
	* Sets the middle name of this teacher.
	*
	* @param middleName the middle name of this teacher
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_teacher.setMiddleName(middleName);
	}

	/**
	* Returns the last name of this teacher.
	*
	* @return the last name of this teacher
	*/
	@Override
	public java.lang.String getLastName() {
		return _teacher.getLastName();
	}

	/**
	* Sets the last name of this teacher.
	*
	* @param lastName the last name of this teacher
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_teacher.setLastName(lastName);
	}

	/**
	* Returns the gender of this teacher.
	*
	* @return the gender of this teacher
	*/
	@Override
	public java.lang.String getGender() {
		return _teacher.getGender();
	}

	/**
	* Sets the gender of this teacher.
	*
	* @param gender the gender of this teacher
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_teacher.setGender(gender);
	}

	/**
	* Returns the email of this teacher.
	*
	* @return the email of this teacher
	*/
	@Override
	public java.lang.String getEmail() {
		return _teacher.getEmail();
	}

	/**
	* Sets the email of this teacher.
	*
	* @param email the email of this teacher
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_teacher.setEmail(email);
	}

	/**
	* Returns the phno of this teacher.
	*
	* @return the phno of this teacher
	*/
	@Override
	public long getPhno() {
		return _teacher.getPhno();
	}

	/**
	* Sets the phno of this teacher.
	*
	* @param phno the phno of this teacher
	*/
	@Override
	public void setPhno(long phno) {
		_teacher.setPhno(phno);
	}

	/**
	* Returns the liferay user ID of this teacher.
	*
	* @return the liferay user ID of this teacher
	*/
	@Override
	public long getLiferayUserId() {
		return _teacher.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this teacher.
	*
	* @param liferayUserId the liferay user ID of this teacher
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_teacher.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this teacher.
	*
	* @return the liferay user uuid of this teacher
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _teacher.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this teacher.
	*
	* @param liferayUserUuid the liferay user uuid of this teacher
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_teacher.setLiferayUserUuid(liferayUserUuid);
	}

	@Override
	public boolean isNew() {
		return _teacher.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_teacher.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _teacher.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_teacher.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _teacher.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _teacher.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_teacher.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _teacher.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_teacher.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_teacher.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_teacher.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeacherWrapper((Teacher)_teacher.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Teacher teacher) {
		return _teacher.compareTo(teacher);
	}

	@Override
	public int hashCode() {
		return _teacher.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Teacher> toCacheModel() {
		return _teacher.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Teacher toEscapedModel() {
		return new TeacherWrapper(_teacher.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Teacher toUnescapedModel() {
		return new TeacherWrapper(_teacher.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _teacher.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _teacher.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_teacher.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TeacherWrapper)) {
			return false;
		}

		TeacherWrapper teacherWrapper = (TeacherWrapper)obj;

		if (Validator.equals(_teacher, teacherWrapper._teacher)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Teacher getWrappedTeacher() {
		return _teacher;
	}

	@Override
	public Teacher getWrappedModel() {
		return _teacher;
	}

	@Override
	public void resetOriginalValues() {
		_teacher.resetOriginalValues();
	}

	private Teacher _teacher;
}