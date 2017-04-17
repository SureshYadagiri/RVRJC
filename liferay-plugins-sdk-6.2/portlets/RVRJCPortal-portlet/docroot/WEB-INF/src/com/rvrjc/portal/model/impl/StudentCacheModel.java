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

package com.rvrjc.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rvrjc.portal.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author suresh
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sno=");
		sb.append(sno);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", email=");
		sb.append(email);
		sb.append(", emcetRank=");
		sb.append(emcetRank);
		sb.append(", dno=");
		sb.append(dno);
		sb.append(", addressId=");
		sb.append(addressId);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append(", createdOn=");
		sb.append(createdOn);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedOn=");
		sb.append(modifiedOn);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setSno(sno);

		if (firstName == null) {
			studentImpl.setFirstName(StringPool.BLANK);
		}
		else {
			studentImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			studentImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			studentImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			studentImpl.setLastName(StringPool.BLANK);
		}
		else {
			studentImpl.setLastName(lastName);
		}

		studentImpl.setGender(gender);

		if (dateOfBirth == Long.MIN_VALUE) {
			studentImpl.setDateOfBirth(null);
		}
		else {
			studentImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (email == null) {
			studentImpl.setEmail(StringPool.BLANK);
		}
		else {
			studentImpl.setEmail(email);
		}

		studentImpl.setEmcetRank(emcetRank);
		studentImpl.setDno(dno);
		studentImpl.setAddressId(addressId);
		studentImpl.setLiferayUserId(liferayUserId);

		if (createdOn == Long.MIN_VALUE) {
			studentImpl.setCreatedOn(null);
		}
		else {
			studentImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			studentImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			studentImpl.setCreatedBy(createdBy);
		}

		if (modifiedOn == Long.MIN_VALUE) {
			studentImpl.setModifiedOn(null);
		}
		else {
			studentImpl.setModifiedOn(new Date(modifiedOn));
		}

		if (modifiedBy == null) {
			studentImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			studentImpl.setModifiedBy(modifiedBy);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sno = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		gender = objectInput.readInt();
		dateOfBirth = objectInput.readLong();
		email = objectInput.readUTF();
		emcetRank = objectInput.readLong();
		dno = objectInput.readLong();
		addressId = objectInput.readLong();
		liferayUserId = objectInput.readLong();
		createdOn = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifiedOn = objectInput.readLong();
		modifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(sno);

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

		objectOutput.writeInt(gender);
		objectOutput.writeLong(dateOfBirth);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(emcetRank);
		objectOutput.writeLong(dno);
		objectOutput.writeLong(addressId);
		objectOutput.writeLong(liferayUserId);
		objectOutput.writeLong(createdOn);

		if (createdBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		objectOutput.writeLong(modifiedOn);

		if (modifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedBy);
		}
	}

	public long sno;
	public String firstName;
	public String middleName;
	public String lastName;
	public int gender;
	public long dateOfBirth;
	public String email;
	public long emcetRank;
	public long dno;
	public long addressId;
	public long liferayUserId;
	public long createdOn;
	public String createdBy;
	public long modifiedOn;
	public String modifiedBy;
}