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
import com.rvrjc.portal.service.TeacherLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class TeacherClp extends BaseModelImpl<Teacher> implements Teacher {
	public TeacherClp() {
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
	public long getPrimaryKey() {
		return _tid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getTid() {
		return _tid;
	}

	@Override
	public void setTid(long tid) {
		_tid = tid;

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setTid", long.class);

				method.invoke(_teacherRemoteModel, tid);
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

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_teacherRemoteModel, firstName);
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

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_teacherRemoteModel, middleName);
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

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_teacherRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_teacherRemoteModel, gender);
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

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_teacherRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhno() {
		return _phno;
	}

	@Override
	public void setPhno(long phno) {
		_phno = phno;

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setPhno", long.class);

				method.invoke(_teacherRemoteModel, phno);
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

		if (_teacherRemoteModel != null) {
			try {
				Class<?> clazz = _teacherRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_teacherRemoteModel, liferayUserId);
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

	public BaseModel<?> getTeacherRemoteModel() {
		return _teacherRemoteModel;
	}

	public void setTeacherRemoteModel(BaseModel<?> teacherRemoteModel) {
		_teacherRemoteModel = teacherRemoteModel;
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

		Class<?> remoteModelClass = _teacherRemoteModel.getClass();

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

		Object returnValue = method.invoke(_teacherRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TeacherLocalServiceUtil.addTeacher(this);
		}
		else {
			TeacherLocalServiceUtil.updateTeacher(this);
		}
	}

	@Override
	public Teacher toEscapedModel() {
		return (Teacher)ProxyUtil.newProxyInstance(Teacher.class.getClassLoader(),
			new Class[] { Teacher.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeacherClp clone = new TeacherClp();

		clone.setTid(getTid());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setGender(getGender());
		clone.setEmail(getEmail());
		clone.setPhno(getPhno());
		clone.setLiferayUserId(getLiferayUserId());

		return clone;
	}

	@Override
	public int compareTo(Teacher teacher) {
		int value = 0;

		if (getTid() < teacher.getTid()) {
			value = -1;
		}
		else if (getTid() > teacher.getTid()) {
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

		if (!(obj instanceof TeacherClp)) {
			return false;
		}

		TeacherClp teacher = (TeacherClp)obj;

		long primaryKey = teacher.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{tid=");
		sb.append(getTid());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", phno=");
		sb.append(getPhno());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Teacher");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tid</column-name><column-value><![CDATA[");
		sb.append(getTid());
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
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phno</column-name><column-value><![CDATA[");
		sb.append(getPhno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _tid;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _gender;
	private String _email;
	private long _phno;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private BaseModel<?> _teacherRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}