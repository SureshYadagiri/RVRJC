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
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author suresh
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sno", getSno());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("email", getEmail());
		attributes.put("emcetRank", getEmcetRank());
		attributes.put("dno", getDno());
		attributes.put("addressId", getAddressId());
		attributes.put("liferayUserId", getLiferayUserId());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sno = (Long)attributes.get("sno");

		if (sno != null) {
			setSno(sno);
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

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long emcetRank = (Long)attributes.get("emcetRank");

		if (emcetRank != null) {
			setEmcetRank(emcetRank);
		}

		Long dno = (Long)attributes.get("dno");

		if (dno != null) {
			setDno(dno);
		}

		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
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
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sno of this student.
	*
	* @return the sno of this student
	*/
	@Override
	public long getSno() {
		return _student.getSno();
	}

	/**
	* Sets the sno of this student.
	*
	* @param sno the sno of this student
	*/
	@Override
	public void setSno(long sno) {
		_student.setSno(sno);
	}

	/**
	* Returns the first name of this student.
	*
	* @return the first name of this student
	*/
	@Override
	public java.lang.String getFirstName() {
		return _student.getFirstName();
	}

	/**
	* Sets the first name of this student.
	*
	* @param firstName the first name of this student
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_student.setFirstName(firstName);
	}

	/**
	* Returns the middle name of this student.
	*
	* @return the middle name of this student
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _student.getMiddleName();
	}

	/**
	* Sets the middle name of this student.
	*
	* @param middleName the middle name of this student
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_student.setMiddleName(middleName);
	}

	/**
	* Returns the last name of this student.
	*
	* @return the last name of this student
	*/
	@Override
	public java.lang.String getLastName() {
		return _student.getLastName();
	}

	/**
	* Sets the last name of this student.
	*
	* @param lastName the last name of this student
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_student.setLastName(lastName);
	}

	/**
	* Returns the gender of this student.
	*
	* @return the gender of this student
	*/
	@Override
	public int getGender() {
		return _student.getGender();
	}

	/**
	* Sets the gender of this student.
	*
	* @param gender the gender of this student
	*/
	@Override
	public void setGender(int gender) {
		_student.setGender(gender);
	}

	/**
	* Returns the date of birth of this student.
	*
	* @return the date of birth of this student
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _student.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this student.
	*
	* @param dateOfBirth the date of birth of this student
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_student.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the email of this student.
	*
	* @return the email of this student
	*/
	@Override
	public java.lang.String getEmail() {
		return _student.getEmail();
	}

	/**
	* Sets the email of this student.
	*
	* @param email the email of this student
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_student.setEmail(email);
	}

	/**
	* Returns the emcet rank of this student.
	*
	* @return the emcet rank of this student
	*/
	@Override
	public long getEmcetRank() {
		return _student.getEmcetRank();
	}

	/**
	* Sets the emcet rank of this student.
	*
	* @param emcetRank the emcet rank of this student
	*/
	@Override
	public void setEmcetRank(long emcetRank) {
		_student.setEmcetRank(emcetRank);
	}

	/**
	* Returns the dno of this student.
	*
	* @return the dno of this student
	*/
	@Override
	public long getDno() {
		return _student.getDno();
	}

	/**
	* Sets the dno of this student.
	*
	* @param dno the dno of this student
	*/
	@Override
	public void setDno(long dno) {
		_student.setDno(dno);
	}

	/**
	* Returns the address ID of this student.
	*
	* @return the address ID of this student
	*/
	@Override
	public long getAddressId() {
		return _student.getAddressId();
	}

	/**
	* Sets the address ID of this student.
	*
	* @param addressId the address ID of this student
	*/
	@Override
	public void setAddressId(long addressId) {
		_student.setAddressId(addressId);
	}

	/**
	* Returns the liferay user ID of this student.
	*
	* @return the liferay user ID of this student
	*/
	@Override
	public long getLiferayUserId() {
		return _student.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this student.
	*
	* @param liferayUserId the liferay user ID of this student
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_student.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this student.
	*
	* @return the liferay user uuid of this student
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _student.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this student.
	*
	* @param liferayUserUuid the liferay user uuid of this student
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_student.setLiferayUserUuid(liferayUserUuid);
	}

	/**
	* Returns the created on of this student.
	*
	* @return the created on of this student
	*/
	@Override
	public java.util.Date getCreatedOn() {
		return _student.getCreatedOn();
	}

	/**
	* Sets the created on of this student.
	*
	* @param createdOn the created on of this student
	*/
	@Override
	public void setCreatedOn(java.util.Date createdOn) {
		_student.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this student.
	*
	* @return the created by of this student
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _student.getCreatedBy();
	}

	/**
	* Sets the created by of this student.
	*
	* @param createdBy the created by of this student
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_student.setCreatedBy(createdBy);
	}

	/**
	* Returns the modified on of this student.
	*
	* @return the modified on of this student
	*/
	@Override
	public java.util.Date getModifiedOn() {
		return _student.getModifiedOn();
	}

	/**
	* Sets the modified on of this student.
	*
	* @param modifiedOn the modified on of this student
	*/
	@Override
	public void setModifiedOn(java.util.Date modifiedOn) {
		_student.setModifiedOn(modifiedOn);
	}

	/**
	* Returns the modified by of this student.
	*
	* @return the modified by of this student
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _student.getModifiedBy();
	}

	/**
	* Sets the modified by of this student.
	*
	* @param modifiedBy the modified by of this student
	*/
	@Override
	public void setModifiedBy(java.lang.String modifiedBy) {
		_student.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Validator.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Student getWrappedStudent() {
		return _student;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private Student _student;
}