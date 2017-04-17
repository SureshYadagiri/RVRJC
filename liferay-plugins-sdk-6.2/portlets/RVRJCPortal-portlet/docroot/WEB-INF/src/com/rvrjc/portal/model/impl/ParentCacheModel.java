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

import com.rvrjc.portal.model.Parent;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Parent in entity cache.
 *
 * @author suresh
 * @see Parent
 * @generated
 */
public class ParentCacheModel implements CacheModel<Parent>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{parentId=");
		sb.append(parentId);
		sb.append(", nickName=");
		sb.append(nickName);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", phNo=");
		sb.append(phNo);
		sb.append(", email=");
		sb.append(email);
		sb.append(", relationShip=");
		sb.append(relationShip);
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
	public Parent toEntityModel() {
		ParentImpl parentImpl = new ParentImpl();

		parentImpl.setParentId(parentId);

		if (nickName == null) {
			parentImpl.setNickName(StringPool.BLANK);
		}
		else {
			parentImpl.setNickName(nickName);
		}

		if (firstName == null) {
			parentImpl.setFirstName(StringPool.BLANK);
		}
		else {
			parentImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			parentImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			parentImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			parentImpl.setLastName(StringPool.BLANK);
		}
		else {
			parentImpl.setLastName(lastName);
		}

		parentImpl.setPhNo(phNo);

		if (email == null) {
			parentImpl.setEmail(StringPool.BLANK);
		}
		else {
			parentImpl.setEmail(email);
		}

		if (relationShip == null) {
			parentImpl.setRelationShip(StringPool.BLANK);
		}
		else {
			parentImpl.setRelationShip(relationShip);
		}

		if (createdOn == Long.MIN_VALUE) {
			parentImpl.setCreatedOn(null);
		}
		else {
			parentImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			parentImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			parentImpl.setCreatedBy(createdBy);
		}

		if (modifiedOn == Long.MIN_VALUE) {
			parentImpl.setModifiedOn(null);
		}
		else {
			parentImpl.setModifiedOn(new Date(modifiedOn));
		}

		if (modifiedBy == null) {
			parentImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			parentImpl.setModifiedBy(modifiedBy);
		}

		parentImpl.resetOriginalValues();

		return parentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		parentId = objectInput.readLong();
		nickName = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		phNo = objectInput.readLong();
		email = objectInput.readUTF();
		relationShip = objectInput.readUTF();
		createdOn = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifiedOn = objectInput.readLong();
		modifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(parentId);

		if (nickName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nickName);
		}

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

		objectOutput.writeLong(phNo);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (relationShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relationShip);
		}

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

	public long parentId;
	public String nickName;
	public String firstName;
	public String middleName;
	public String lastName;
	public long phNo;
	public String email;
	public String relationShip;
	public long createdOn;
	public String createdBy;
	public long modifiedOn;
	public String modifiedBy;
}