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

package com.company.file.model.impl;

import com.company.file.model.Employee;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author SOWJI
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{empId=");
		sb.append(empId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", phno=");
		sb.append(phno);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmpId(empId);

		if (firstName == null) {
			employeeImpl.setFirstName(StringPool.BLANK);
		}
		else {
			employeeImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			employeeImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			employeeImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			employeeImpl.setLastName(StringPool.BLANK);
		}
		else {
			employeeImpl.setLastName(lastName);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			employeeImpl.setDateOfBirth(null);
		}
		else {
			employeeImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (gender == null) {
			employeeImpl.setGender(StringPool.BLANK);
		}
		else {
			employeeImpl.setGender(gender);
		}

		employeeImpl.setPhno(phno);

		if (email == null) {
			employeeImpl.setEmail(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmail(email);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		empId = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		gender = objectInput.readUTF();
		phno = objectInput.readLong();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(empId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(dateOfBirth);

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(phno);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long empId;
	public String firstName;
	public String middleName;
	public String lastName;
	public long dateOfBirth;
	public String gender;
	public long phno;
	public String email;
}