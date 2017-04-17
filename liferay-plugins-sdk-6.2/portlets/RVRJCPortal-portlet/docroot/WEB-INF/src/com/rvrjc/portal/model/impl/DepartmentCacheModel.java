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

import com.rvrjc.portal.model.Department;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author suresh
 * @see Department
 * @generated
 */
public class DepartmentCacheModel implements CacheModel<Department>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{dno=");
		sb.append(dno);
		sb.append(", dname=");
		sb.append(dname);
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
	public Department toEntityModel() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setDno(dno);

		if (dname == null) {
			departmentImpl.setDname(StringPool.BLANK);
		}
		else {
			departmentImpl.setDname(dname);
		}

		if (createdOn == Long.MIN_VALUE) {
			departmentImpl.setCreatedOn(null);
		}
		else {
			departmentImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			departmentImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			departmentImpl.setCreatedBy(createdBy);
		}

		if (modifiedOn == Long.MIN_VALUE) {
			departmentImpl.setModifiedOn(null);
		}
		else {
			departmentImpl.setModifiedOn(new Date(modifiedOn));
		}

		if (modifiedBy == null) {
			departmentImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			departmentImpl.setModifiedBy(modifiedBy);
		}

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dno = objectInput.readLong();
		dname = objectInput.readUTF();
		createdOn = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifiedOn = objectInput.readLong();
		modifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dno);

		if (dname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dname);
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

	public long dno;
	public String dname;
	public long createdOn;
	public String createdBy;
	public long modifiedOn;
	public String modifiedBy;
}