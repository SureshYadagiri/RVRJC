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

import com.rvrjc.portal.model.Teacher;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Teacher in entity cache.
 *
 * @author suresh
 * @see Teacher
 * @generated
 */
public class TeacherCacheModel implements CacheModel<Teacher>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{tid=");
		sb.append(tid);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", email=");
		sb.append(email);
		sb.append(", phno=");
		sb.append(phno);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Teacher toEntityModel() {
		TeacherImpl teacherImpl = new TeacherImpl();

		teacherImpl.setTid(tid);

		if (firstName == null) {
			teacherImpl.setFirstName(StringPool.BLANK);
		}
		else {
			teacherImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			teacherImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			teacherImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			teacherImpl.setLastName(StringPool.BLANK);
		}
		else {
			teacherImpl.setLastName(lastName);
		}

		if (gender == null) {
			teacherImpl.setGender(StringPool.BLANK);
		}
		else {
			teacherImpl.setGender(gender);
		}

		if (email == null) {
			teacherImpl.setEmail(StringPool.BLANK);
		}
		else {
			teacherImpl.setEmail(email);
		}

		teacherImpl.setPhno(phno);
		teacherImpl.setLiferayUserId(liferayUserId);

		teacherImpl.resetOriginalValues();

		return teacherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tid = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		gender = objectInput.readUTF();
		email = objectInput.readUTF();
		phno = objectInput.readLong();
		liferayUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tid);

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

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(phno);
		objectOutput.writeLong(liferayUserId);
	}

	public long tid;
	public String firstName;
	public String middleName;
	public String lastName;
	public String gender;
	public String email;
	public long phno;
	public long liferayUserId;
}