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

package com.company.file.model;

import com.company.file.service.ClpSerializer;
import com.company.file.service.EmployeeLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SOWJI
 */
public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
	public EmployeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _empId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empId", getEmpId());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("gender", getGender());
		attributes.put("phno", getPhno());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
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

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Long phno = (Long)attributes.get("phno");

		if (phno != null) {
			setPhno(phno);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@Override
	public long getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(long empId) {
		_empId = empId;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", long.class);

				method.invoke(_employeeRemoteModel, empId);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstName", String.class);

				method.invoke(_employeeRemoteModel, firstName);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_employeeRemoteModel, middleName);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_employeeRemoteModel, lastName);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_employeeRemoteModel, dateOfBirth);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_employeeRemoteModel, gender);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setPhno", long.class);

				method.invoke(_employeeRemoteModel, phno);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_employeeRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmployeeRemoteModel() {
		return _employeeRemoteModel;
	}

	public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
		_employeeRemoteModel = employeeRemoteModel;
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

		Class<?> remoteModelClass = _employeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeLocalServiceUtil.addEmployee(this);
		}
		else {
			EmployeeLocalServiceUtil.updateEmployee(this);
		}
	}

	@Override
	public Employee toEscapedModel() {
		return (Employee)ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
			new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeClp clone = new EmployeeClp();

		clone.setEmpId(getEmpId());
		clone.setFirstName(getFirstName());
		clone.setMiddleName(getMiddleName());
		clone.setLastName(getLastName());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setGender(getGender());
		clone.setPhno(getPhno());
		clone.setEmail(getEmail());

		return clone;
	}

	@Override
	public int compareTo(Employee employee) {
		int value = 0;

		if (getEmpId() < employee.getEmpId()) {
			value = -1;
		}
		else if (getEmpId() > employee.getEmpId()) {
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

		if (!(obj instanceof EmployeeClp)) {
			return false;
		}

		EmployeeClp employee = (EmployeeClp)obj;

		long primaryKey = employee.getPrimaryKey();

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

		sb.append("{empId=");
		sb.append(getEmpId());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", phno=");
		sb.append(getPhno());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.company.file.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
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
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phno</column-name><column-value><![CDATA[");
		sb.append(getPhno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _empId;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private Date _dateOfBirth;
	private String _gender;
	private long _phno;
	private String _email;
	private BaseModel<?> _employeeRemoteModel;
	private Class<?> _clpSerializerClass = com.company.file.service.ClpSerializer.class;
}