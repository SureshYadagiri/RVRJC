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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author SOWJI
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
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

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the emp ID of this employee.
	*
	* @return the emp ID of this employee
	*/
	@Override
	public long getEmpId() {
		return _employee.getEmpId();
	}

	/**
	* Sets the emp ID of this employee.
	*
	* @param empId the emp ID of this employee
	*/
	@Override
	public void setEmpId(long empId) {
		_employee.setEmpId(empId);
	}

	/**
	* Returns the first name of this employee.
	*
	* @return the first name of this employee
	*/
	@Override
	public java.lang.String getFirstName() {
		return _employee.getFirstName();
	}

	/**
	* Sets the first name of this employee.
	*
	* @param firstName the first name of this employee
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_employee.setFirstName(firstName);
	}

	/**
	* Returns the middle name of this employee.
	*
	* @return the middle name of this employee
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _employee.getMiddleName();
	}

	/**
	* Sets the middle name of this employee.
	*
	* @param middleName the middle name of this employee
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_employee.setMiddleName(middleName);
	}

	/**
	* Returns the last name of this employee.
	*
	* @return the last name of this employee
	*/
	@Override
	public java.lang.String getLastName() {
		return _employee.getLastName();
	}

	/**
	* Sets the last name of this employee.
	*
	* @param lastName the last name of this employee
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_employee.setLastName(lastName);
	}

	/**
	* Returns the date of birth of this employee.
	*
	* @return the date of birth of this employee
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _employee.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this employee.
	*
	* @param dateOfBirth the date of birth of this employee
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_employee.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the gender of this employee.
	*
	* @return the gender of this employee
	*/
	@Override
	public java.lang.String getGender() {
		return _employee.getGender();
	}

	/**
	* Sets the gender of this employee.
	*
	* @param gender the gender of this employee
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_employee.setGender(gender);
	}

	/**
	* Returns the phno of this employee.
	*
	* @return the phno of this employee
	*/
	@Override
	public long getPhno() {
		return _employee.getPhno();
	}

	/**
	* Sets the phno of this employee.
	*
	* @param phno the phno of this employee
	*/
	@Override
	public void setPhno(long phno) {
		_employee.setPhno(phno);
	}

	/**
	* Returns the email of this employee.
	*
	* @return the email of this employee
	*/
	@Override
	public java.lang.String getEmail() {
		return _employee.getEmail();
	}

	/**
	* Sets the email of this employee.
	*
	* @param email the email of this employee
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_employee.setEmail(email);
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(com.company.file.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.company.file.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public com.company.file.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public com.company.file.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}