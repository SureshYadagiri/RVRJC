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
import com.rvrjc.portal.service.CourseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class CourseClp extends BaseModelImpl<Course> implements Course {
	public CourseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Course.class;
	}

	@Override
	public String getModelClassName() {
		return Course.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cno;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCno(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cno;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cno", getCno());
		attributes.put("ccode", getCcode());
		attributes.put("cname", getCname());
		attributes.put("cfee", getCfee());
		attributes.put("cdescription", getCdescription());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cno = (Long)attributes.get("cno");

		if (cno != null) {
			setCno(cno);
		}

		String ccode = (String)attributes.get("ccode");

		if (ccode != null) {
			setCcode(ccode);
		}

		String cname = (String)attributes.get("cname");

		if (cname != null) {
			setCname(cname);
		}

		Integer cfee = (Integer)attributes.get("cfee");

		if (cfee != null) {
			setCfee(cfee);
		}

		String cdescription = (String)attributes.get("cdescription");

		if (cdescription != null) {
			setCdescription(cdescription);
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
	public long getCno() {
		return _cno;
	}

	@Override
	public void setCno(long cno) {
		_cno = cno;

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCno", long.class);

				method.invoke(_courseRemoteModel, cno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCcode() {
		return _ccode;
	}

	@Override
	public void setCcode(String ccode) {
		_ccode = ccode;

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCcode", String.class);

				method.invoke(_courseRemoteModel, ccode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCname() {
		return _cname;
	}

	@Override
	public void setCname(String cname) {
		_cname = cname;

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCname", String.class);

				method.invoke(_courseRemoteModel, cname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCfee() {
		return _cfee;
	}

	@Override
	public void setCfee(int cfee) {
		_cfee = cfee;

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCfee", int.class);

				method.invoke(_courseRemoteModel, cfee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCdescription() {
		return _cdescription;
	}

	@Override
	public void setCdescription(String cdescription) {
		_cdescription = cdescription;

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCdescription", String.class);

				method.invoke(_courseRemoteModel, cdescription);
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

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedOn", Date.class);

				method.invoke(_courseRemoteModel, createdOn);
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

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_courseRemoteModel, createdBy);
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

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedOn", Date.class);

				method.invoke(_courseRemoteModel, modifiedOn);
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

		if (_courseRemoteModel != null) {
			try {
				Class<?> clazz = _courseRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", String.class);

				method.invoke(_courseRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCourseRemoteModel() {
		return _courseRemoteModel;
	}

	public void setCourseRemoteModel(BaseModel<?> courseRemoteModel) {
		_courseRemoteModel = courseRemoteModel;
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

		Class<?> remoteModelClass = _courseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_courseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CourseLocalServiceUtil.addCourse(this);
		}
		else {
			CourseLocalServiceUtil.updateCourse(this);
		}
	}

	@Override
	public Course toEscapedModel() {
		return (Course)ProxyUtil.newProxyInstance(Course.class.getClassLoader(),
			new Class[] { Course.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CourseClp clone = new CourseClp();

		clone.setCno(getCno());
		clone.setCcode(getCcode());
		clone.setCname(getCname());
		clone.setCfee(getCfee());
		clone.setCdescription(getCdescription());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setModifiedOn(getModifiedOn());
		clone.setModifiedBy(getModifiedBy());

		return clone;
	}

	@Override
	public int compareTo(Course course) {
		int value = 0;

		if (getCno() < course.getCno()) {
			value = -1;
		}
		else if (getCno() > course.getCno()) {
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

		if (!(obj instanceof CourseClp)) {
			return false;
		}

		CourseClp course = (CourseClp)obj;

		long primaryKey = course.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{cno=");
		sb.append(getCno());
		sb.append(", ccode=");
		sb.append(getCcode());
		sb.append(", cname=");
		sb.append(getCname());
		sb.append(", cfee=");
		sb.append(getCfee());
		sb.append(", cdescription=");
		sb.append(getCdescription());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Course");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cno</column-name><column-value><![CDATA[");
		sb.append(getCno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ccode</column-name><column-value><![CDATA[");
		sb.append(getCcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cname</column-name><column-value><![CDATA[");
		sb.append(getCname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cfee</column-name><column-value><![CDATA[");
		sb.append(getCfee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cdescription</column-name><column-value><![CDATA[");
		sb.append(getCdescription());
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

	private long _cno;
	private String _ccode;
	private String _cname;
	private int _cfee;
	private String _cdescription;
	private Date _createdOn;
	private String _createdBy;
	private Date _modifiedOn;
	private String _modifiedBy;
	private BaseModel<?> _courseRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}