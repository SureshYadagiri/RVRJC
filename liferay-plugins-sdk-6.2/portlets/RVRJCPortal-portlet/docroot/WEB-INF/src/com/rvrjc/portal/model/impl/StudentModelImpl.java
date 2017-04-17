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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rvrjc.portal.model.Student;
import com.rvrjc.portal.model.StudentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Student service. Represents a row in the &quot;rvrjc_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rvrjc.portal.model.StudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentImpl}.
 * </p>
 *
 * @author suresh
 * @see StudentImpl
 * @see com.rvrjc.portal.model.Student
 * @see com.rvrjc.portal.model.StudentModel
 * @generated
 */
public class StudentModelImpl extends BaseModelImpl<Student>
	implements StudentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link com.rvrjc.portal.model.Student} interface instead.
	 */
	public static final String TABLE_NAME = "rvrjc_Student";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sno", Types.BIGINT },
			{ "firstName", Types.VARCHAR },
			{ "middleName", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "gender", Types.INTEGER },
			{ "dateOfBirth", Types.TIMESTAMP },
			{ "email", Types.VARCHAR },
			{ "emcetRank", Types.BIGINT },
			{ "dno", Types.BIGINT },
			{ "addressId", Types.BIGINT },
			{ "liferayUserId", Types.BIGINT },
			{ "createdOn", Types.TIMESTAMP },
			{ "createdBy", Types.VARCHAR },
			{ "modifiedOn", Types.TIMESTAMP },
			{ "modifiedBy", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table rvrjc_Student (sno LONG not null primary key,firstName VARCHAR(75) null,middleName VARCHAR(75) null,lastName VARCHAR(75) null,gender INTEGER,dateOfBirth DATE null,email VARCHAR(75) null,emcetRank LONG,dno LONG,addressId LONG,liferayUserId LONG,createdOn DATE null,createdBy VARCHAR(75) null,modifiedOn DATE null,modifiedBy VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table rvrjc_Student";
	public static final String ORDER_BY_JPQL = " ORDER BY student.sno ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rvrjc_Student.sno ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rvrjc.portal.model.Student"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rvrjc.portal.model.Student"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rvrjc.portal.model.Student"),
			true);
	public static long DNO_COLUMN_BITMASK = 1L;
	public static long FIRSTNAME_COLUMN_BITMASK = 2L;
	public static long SNO_COLUMN_BITMASK = 4L;
	public static final String MAPPING_TABLE_RVRJC_STUDENT_COURSE_NAME = "rvrjc_Student_course";
	public static final Object[][] MAPPING_TABLE_RVRJC_STUDENT_COURSE_COLUMNS = {
			{ "cno", Types.BIGINT },
			{ "sno", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_RVRJC_STUDENT_COURSE_SQL_CREATE = "create table rvrjc_Student_course (cno LONG not null,sno LONG not null,primary key (cno, sno))";
	public static final boolean FINDER_CACHE_ENABLED_RVRJC_STUDENT_COURSE = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.rvrjc_Student_course"), true);
	public static final String MAPPING_TABLE_RVRJC_STUDENT_PARENT_NAME = "rvrjc_Student_Parent";
	public static final Object[][] MAPPING_TABLE_RVRJC_STUDENT_PARENT_COLUMNS = {
			{ "parentId", Types.BIGINT },
			{ "sno", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_RVRJC_STUDENT_PARENT_SQL_CREATE = "create table rvrjc_Student_Parent (parentId LONG not null,sno LONG not null,primary key (parentId, sno))";
	public static final boolean FINDER_CACHE_ENABLED_RVRJC_STUDENT_PARENT = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.rvrjc_Student_Parent"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rvrjc.portal.model.Student"));

	public StudentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sno;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSno(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sno;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sno", getSno());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("gender", getGender());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("email", getEmail());
		attributes.put("emcetRank", getEmcetRank());
		attributes.put("dno", getDno());
		attributes.put("addressId", getAddressId());
		attributes.put("liferayUserId", getLiferayUserId());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sno = (Long)attributes.get("sno");

		if (sno != null) {
			setSno(sno);
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

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long emcetRank = (Long)attributes.get("emcetRank");

		if (emcetRank != null) {
			setEmcetRank(emcetRank);
		}

		Long dno = (Long)attributes.get("dno");

		if (dno != null) {
			setDno(dno);
		}

		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
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
	public long getSno() {
		return _sno;
	}

	@Override
	public void setSno(long sno) {
		_columnBitmask = -1L;

		_sno = sno;
	}

	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_columnBitmask |= FIRSTNAME_COLUMN_BITMASK;

		if (_originalFirstName == null) {
			_originalFirstName = _firstName;
		}

		_firstName = firstName;
	}

	public String getOriginalFirstName() {
		return GetterUtil.getString(_originalFirstName);
	}

	@Override
	public String getMiddleName() {
		if (_middleName == null) {
			return StringPool.BLANK;
		}
		else {
			return _middleName;
		}
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	@Override
	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@Override
	public int getGender() {
		return _gender;
	}

	@Override
	public void setGender(int gender) {
		_gender = gender;
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@Override
	public long getEmcetRank() {
		return _emcetRank;
	}

	@Override
	public void setEmcetRank(long emcetRank) {
		_emcetRank = emcetRank;
	}

	@Override
	public long getDno() {
		return _dno;
	}

	@Override
	public void setDno(long dno) {
		_columnBitmask |= DNO_COLUMN_BITMASK;

		if (!_setOriginalDno) {
			_setOriginalDno = true;

			_originalDno = _dno;
		}

		_dno = dno;
	}

	public long getOriginalDno() {
		return _originalDno;
	}

	@Override
	public long getAddressId() {
		return _addressId;
	}

	@Override
	public void setAddressId(long addressId) {
		_addressId = addressId;
	}

	@Override
	public long getLiferayUserId() {
		return _liferayUserId;
	}

	@Override
	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	@Override
	public String getLiferayUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getLiferayUserId(), "uuid",
			_liferayUserUuid);
	}

	@Override
	public void setLiferayUserUuid(String liferayUserUuid) {
		_liferayUserUuid = liferayUserUuid;
	}

	@Override
	public Date getCreatedOn() {
		return _createdOn;
	}

	@Override
	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	@Override
	public String getCreatedBy() {
		if (_createdBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdBy;
		}
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	@Override
	public Date getModifiedOn() {
		return _modifiedOn;
	}

	@Override
	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;
	}

	@Override
	public String getModifiedBy() {
		if (_modifiedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedBy;
		}
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Student.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Student toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Student)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setSno(getSno());
		studentImpl.setFirstName(getFirstName());
		studentImpl.setMiddleName(getMiddleName());
		studentImpl.setLastName(getLastName());
		studentImpl.setGender(getGender());
		studentImpl.setDateOfBirth(getDateOfBirth());
		studentImpl.setEmail(getEmail());
		studentImpl.setEmcetRank(getEmcetRank());
		studentImpl.setDno(getDno());
		studentImpl.setAddressId(getAddressId());
		studentImpl.setLiferayUserId(getLiferayUserId());
		studentImpl.setCreatedOn(getCreatedOn());
		studentImpl.setCreatedBy(getCreatedBy());
		studentImpl.setModifiedOn(getModifiedOn());
		studentImpl.setModifiedBy(getModifiedBy());

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public int compareTo(Student student) {
		int value = 0;

		if (getSno() < student.getSno()) {
			value = -1;
		}
		else if (getSno() > student.getSno()) {
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

		if (!(obj instanceof Student)) {
			return false;
		}

		Student student = (Student)obj;

		long primaryKey = student.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		StudentModelImpl studentModelImpl = this;

		studentModelImpl._originalFirstName = studentModelImpl._firstName;

		studentModelImpl._originalDno = studentModelImpl._dno;

		studentModelImpl._setOriginalDno = false;

		studentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Student> toCacheModel() {
		StudentCacheModel studentCacheModel = new StudentCacheModel();

		studentCacheModel.sno = getSno();

		studentCacheModel.firstName = getFirstName();

		String firstName = studentCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			studentCacheModel.firstName = null;
		}

		studentCacheModel.middleName = getMiddleName();

		String middleName = studentCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			studentCacheModel.middleName = null;
		}

		studentCacheModel.lastName = getLastName();

		String lastName = studentCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			studentCacheModel.lastName = null;
		}

		studentCacheModel.gender = getGender();

		Date dateOfBirth = getDateOfBirth();

		if (dateOfBirth != null) {
			studentCacheModel.dateOfBirth = dateOfBirth.getTime();
		}
		else {
			studentCacheModel.dateOfBirth = Long.MIN_VALUE;
		}

		studentCacheModel.email = getEmail();

		String email = studentCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			studentCacheModel.email = null;
		}

		studentCacheModel.emcetRank = getEmcetRank();

		studentCacheModel.dno = getDno();

		studentCacheModel.addressId = getAddressId();

		studentCacheModel.liferayUserId = getLiferayUserId();

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			studentCacheModel.createdOn = createdOn.getTime();
		}
		else {
			studentCacheModel.createdOn = Long.MIN_VALUE;
		}

		studentCacheModel.createdBy = getCreatedBy();

		String createdBy = studentCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			studentCacheModel.createdBy = null;
		}

		Date modifiedOn = getModifiedOn();

		if (modifiedOn != null) {
			studentCacheModel.modifiedOn = modifiedOn.getTime();
		}
		else {
			studentCacheModel.modifiedOn = Long.MIN_VALUE;
		}

		studentCacheModel.modifiedBy = getModifiedBy();

		String modifiedBy = studentCacheModel.modifiedBy;

		if ((modifiedBy != null) && (modifiedBy.length() == 0)) {
			studentCacheModel.modifiedBy = null;
		}

		return studentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sno=");
		sb.append(getSno());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", emcetRank=");
		sb.append(getEmcetRank());
		sb.append(", dno=");
		sb.append(getDno());
		sb.append(", addressId=");
		sb.append(getAddressId());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
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
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sno</column-name><column-value><![CDATA[");
		sb.append(getSno());
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
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emcetRank</column-name><column-value><![CDATA[");
		sb.append(getEmcetRank());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dno</column-name><column-value><![CDATA[");
		sb.append(getDno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
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

	private static ClassLoader _classLoader = Student.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Student.class
		};
	private long _sno;
	private String _firstName;
	private String _originalFirstName;
	private String _middleName;
	private String _lastName;
	private int _gender;
	private Date _dateOfBirth;
	private String _email;
	private long _emcetRank;
	private long _dno;
	private long _originalDno;
	private boolean _setOriginalDno;
	private long _addressId;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private Date _createdOn;
	private String _createdBy;
	private Date _modifiedOn;
	private String _modifiedBy;
	private long _columnBitmask;
	private Student _escapedModel;
}