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

import com.rvrjc.portal.model.Course;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Course in entity cache.
 *
 * @author suresh
 * @see Course
 * @generated
 */
public class CourseCacheModel implements CacheModel<Course>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{cno=");
		sb.append(cno);
		sb.append(", ccode=");
		sb.append(ccode);
		sb.append(", cname=");
		sb.append(cname);
		sb.append(", cfee=");
		sb.append(cfee);
		sb.append(", cdescription=");
		sb.append(cdescription);
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
	public Course toEntityModel() {
		CourseImpl courseImpl = new CourseImpl();

		courseImpl.setCno(cno);

		if (ccode == null) {
			courseImpl.setCcode(StringPool.BLANK);
		}
		else {
			courseImpl.setCcode(ccode);
		}

		if (cname == null) {
			courseImpl.setCname(StringPool.BLANK);
		}
		else {
			courseImpl.setCname(cname);
		}

		courseImpl.setCfee(cfee);

		if (cdescription == null) {
			courseImpl.setCdescription(StringPool.BLANK);
		}
		else {
			courseImpl.setCdescription(cdescription);
		}

		if (createdOn == Long.MIN_VALUE) {
			courseImpl.setCreatedOn(null);
		}
		else {
			courseImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			courseImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			courseImpl.setCreatedBy(createdBy);
		}

		if (modifiedOn == Long.MIN_VALUE) {
			courseImpl.setModifiedOn(null);
		}
		else {
			courseImpl.setModifiedOn(new Date(modifiedOn));
		}

		if (modifiedBy == null) {
			courseImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			courseImpl.setModifiedBy(modifiedBy);
		}

		courseImpl.resetOriginalValues();

		return courseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cno = objectInput.readLong();
		ccode = objectInput.readUTF();
		cname = objectInput.readUTF();
		cfee = objectInput.readInt();
		cdescription = objectInput.readUTF();
		createdOn = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifiedOn = objectInput.readLong();
		modifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cno);

		if (ccode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccode);
		}

		if (cname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cname);
		}

		objectOutput.writeInt(cfee);

		if (cdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cdescription);
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

	public long cno;
	public String ccode;
	public String cname;
	public int cfee;
	public String cdescription;
	public long createdOn;
	public String createdBy;
	public long modifiedOn;
	public String modifiedBy;
}