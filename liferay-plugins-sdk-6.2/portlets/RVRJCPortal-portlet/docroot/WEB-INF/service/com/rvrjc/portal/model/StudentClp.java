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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.rvrjc.portal.service.ClpSerializer;
import com.rvrjc.portal.service.StudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class StudentClp extends BaseModelImpl<Student> implements Student {
	public StudentClp() {
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
	public long getPrimaryKey() {
		return _sno;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSno(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sno;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getSno() {
		return _sno;
	}

	@Override
	public void setSno(long sno) {
		_sno = sno;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setSno", long.class);

				method.invoke(_studentRemoteModel, sno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstName() {
		return _firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_studentRemoteModel, firstName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMiddleName() {
		return _middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_studentRemoteModel, middleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _lastName;
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_studentRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGender() {
		return _gender;
	}

	@Override
	public void setGender(int gender) {
		_gender = gender;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", int.class);

				method.invoke(_studentRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_studentRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_studentRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmcetRank() {
		return _emcetRank;
	}

	@Override
	public void setEmcetRank(long emcetRank) {
		_emcetRank = emcetRank;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmcetRank", long.class);

				method.invoke(_studentRemoteModel, emcetRank);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDno() {
		return _dno;
	}

	@Override
	public void setDno(long dno) {
		_dno = dno;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setDno", long.class);

				method.invoke(_studentRemoteModel, dno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAddressId() {
		return _addressId;
	}

	@Override
	public void setAddressId(long addressId) {
		_addressId = addressId;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressId", long.class);

				method.invoke(_studentRemoteModel, addressId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLiferayUserId() {
		return _liferayUserId;
	}

	@Override
	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_studentRemoteModel, liferayUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLiferayUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getLiferayUserId(), "uuid",
			_liferayUserUuid);
	}

	@Override
	public void setLiferayUserUuid(String liferayUserUuid) {
		_liferayUserUuid = liferayUserUuid;
	}

	@Override
	public Date getCreatedOn() {
		return _createdOn;
	}

	@Override
	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedOn", Date.class);

				method.invoke(_studentRemoteModel, createdOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_studentRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedOn() {
		return _modifiedOn;
	}

	@Override
	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedOn", Date.class);

				method.invoke(_studentRemoteModel, modifiedOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		_modifiedBy = modifiedBy;

		if (_studentRemoteModel != null) {
			try {
				Class<?> clazz = _studentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_studentRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStudentRemoteModel() {
		return _studentRemoteModel;
	}

	public void setStudentRemoteModel(BaseModel<?> studentRemoteModel) {
		_studentRemoteModel = studentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _studentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_studentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StudentLocalServiceUtil.addStudent(this);
		}
		else {
			StudentLocalServiceUtil.updateStudent(this);
		}
	}

	@Override
	public Student toEscapedModel() {
		return (Student)ProxyUtil.newProxyInstance(Student.class.getClassLoader(),
			new Class[] { Student.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StudentClp clone = new StudentClp();

		clone.setSno(getSno());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setGender(getGender());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setEmail(getEmail());
		clone.setEmcetRank(getEmcetRank());
		clone.setDno(getDno());
		clone.setAddressId(getAddressId());
		clone.setLiferayUserId(getLiferayUserId());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setModifiedOn(getModifiedOn());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Student student) {
		int value = 0;

		if (getSno() < student.getSno()) {
			value = -1;
		}
		else if (getSno() > student.getSno()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentClp)) {
			return false;
		}

		StudentClp student = (StudentClp)obj;

		long primaryKey = student.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sno=");
		sb.append(getSno());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", emcetRank=");
		sb.append(getEmcetRank());
		sb.append(", dno=");
		sb.append(getDno());
		sb.append(", addressId=");
		sb.append(getAddressId());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", modifiedOn=");
		sb.append(getModifiedOn());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sno</column-name><column-value><![CDATA[");
		sb.append(getSno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emcetRank</column-name><column-value><![CDATA[");
		sb.append(getEmcetRank());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dno</column-name><column-value><![CDATA[");
		sb.append(getDno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedOn</column-name><column-value><![CDATA[");
		sb.append(getModifiedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sno;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private int _gender;
	private Date _dateOfBirth;
	private String _email;
	private long _emcetRank;
	private long _dno;
	private long _addressId;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private Date _createdOn;
	private String _createdBy;
	private Date _modifiedOn;
	private String _modifiedBy;
	private BaseModel<?> _studentRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}