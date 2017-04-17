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

import com.rvrjc.portal.service.ClpSerializer;
import com.rvrjc.portal.service.ParentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class ParentClp extends BaseModelImpl<Parent> implements Parent {
	public ParentClp() {
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
	public long getPrimaryKey() {
		return _parentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setParentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _parentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_parentId = parentId;

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setParentId", long.class);

				method.invoke(_parentRemoteModel, parentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNickName() {
		return _nickName;
	}

	@Override
	public void setNickName(String nickName) {
		_nickName = nickName;

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setNickName", String.class);

				method.invoke(_parentRemoteModel, nickName);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_parentRemoteModel, firstName);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_parentRemoteModel, middleName);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_parentRemoteModel, lastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhNo() {
		return _phNo;
	}

	@Override
	public void setPhNo(long phNo) {
		_phNo = phNo;

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setPhNo", long.class);

				method.invoke(_parentRemoteModel, phNo);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_parentRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRelationShip() {
		return _relationShip;
	}

	@Override
	public void setRelationShip(String relationShip) {
		_relationShip = relationShip;

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setRelationShip", String.class);

				method.invoke(_parentRemoteModel, relationShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedOn() {
		return _createdOn;
	}

	@Override
	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedOn", Date.class);

				method.invoke(_parentRemoteModel, createdOn);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_parentRemoteModel, createdBy);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedOn", Date.class);

				method.invoke(_parentRemoteModel, modifiedOn);
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

		if (_parentRemoteModel != null) {
			try {
				Class<?> clazz = _parentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_parentRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getParentRemoteModel() {
		return _parentRemoteModel;
	}

	public void setParentRemoteModel(BaseModel<?> parentRemoteModel) {
		_parentRemoteModel = parentRemoteModel;
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

		Class<?> remoteModelClass = _parentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_parentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ParentLocalServiceUtil.addParent(this);
		}
		else {
			ParentLocalServiceUtil.updateParent(this);
		}
	}

	@Override
	public Parent toEscapedModel() {
		return (Parent)ProxyUtil.newProxyInstance(Parent.class.getClassLoader(),
			new Class[] { Parent.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ParentClp clone = new ParentClp();

		clone.setParentId(getParentId());
		clone.setNickName(getNickName());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setPhNo(getPhNo());
		clone.setEmail(getEmail());
		clone.setRelationShip(getRelationShip());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setModifiedOn(getModifiedOn());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Parent parent) {
		int value = 0;

		if (getParentId() < parent.getParentId()) {
			value = -1;
		}
		else if (getParentId() > parent.getParentId()) {
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

		if (!(obj instanceof ParentClp)) {
			return false;
		}

		ParentClp parent = (ParentClp)obj;

		long primaryKey = parent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{parentId=");
		sb.append(getParentId());
		sb.append(", nickName=");
		sb.append(getNickName());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", phNo=");
		sb.append(getPhNo());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", relationShip=");
		sb.append(getRelationShip());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Parent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nickName</column-name><column-value><![CDATA[");
		sb.append(getNickName());
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
			"<column><column-name>phNo</column-name><column-value><![CDATA[");
		sb.append(getPhNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relationShip</column-name><column-value><![CDATA[");
		sb.append(getRelationShip());
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
	private BaseModel<?> _parentRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}