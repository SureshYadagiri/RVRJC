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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rvrjc.portal.model.Parent;
import com.rvrjc.portal.model.ParentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Parent service. Represents a row in the &quot;rvrjc_Parent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rvrjc.portal.model.ParentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ParentImpl}.
 * </p>
 *
 * @author suresh
 * @see ParentImpl
 * @see com.rvrjc.portal.model.Parent
 * @see com.rvrjc.portal.model.ParentModel
 * @generated
 */
public class ParentModelImpl extends BaseModelImpl<Parent>
	implements ParentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a parent model instance should use the {@link com.rvrjc.portal.model.Parent} interface instead.
	 */
	public static final String TABLE_NAME = "rvrjc_Parent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "parentId", Types.BIGINT },
			{ "nickName", Types.VARCHAR },
			{ "firstName", Types.VARCHAR },
			{ "middleName", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "phNo", Types.BIGINT },
			{ "email", Types.VARCHAR },
			{ "relationShip", Types.VARCHAR },
			{ "createdOn", Types.TIMESTAMP },
			{ "createdBy", Types.VARCHAR },
			{ "modifiedOn", Types.TIMESTAMP },
			{ "modifiedBy", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table rvrjc_Parent (parentId LONG not null primary key,nickName VARCHAR(75) null,firstName VARCHAR(75) null,middleName VARCHAR(75) null,lastName VARCHAR(75) null,phNo LONG,email VARCHAR(75) null,relationShip VARCHAR(75) null,createdOn DATE null,createdBy VARCHAR(75) null,modifiedOn DATE null,modifiedBy VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table rvrjc_Parent";
	public static final String ORDER_BY_JPQL = " ORDER BY parent.parentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rvrjc_Parent.parentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rvrjc.portal.model.Parent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rvrjc.portal.model.Parent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final String MAPPING_TABLE_RVRJC_STUDENT_PARENT_NAME = "rvrjc_Student_Parent";
	public static final Object[][] MAPPING_TABLE_RVRJC_STUDENT_PARENT_COLUMNS = {
			{ "parentId", Types.BIGINT },
			{ "sno", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_RVRJC_STUDENT_PARENT_SQL_CREATE = "create table rvrjc_Student_Parent (parentId LONG not null,sno LONG not null,primary key (parentId, sno))";
	public static final boolean FINDER_CACHE_ENABLED_RVRJC_STUDENT_PARENT = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.rvrjc_Student_Parent"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rvrjc.portal.model.Parent"));

	public ParentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _parentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setParentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _parentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Parent.class;
	}

	@Override
	public String getModelClassName() {
		return Parent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parentId", getParentId());
		attributes.put("nickName", getNickName());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("phNo", getPhNo());
		attributes.put("email", getEmail());
		attributes.put("relationShip", getRelationShip());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String nickName = (String)attributes.get("nickName");

		if (nickName != null) {
			setNickName(nickName);
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

		Long phNo = (Long)attributes.get("phNo");

		if (phNo != null) {
			setPhNo(phNo);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String relationShip = (String)attributes.get("relationShip");

		if (relationShip != null) {
			setRelationShip(relationShip);
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
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	@Override
	public String getNickName() {
		if (_nickName == null) {
			return StringPool.BLANK;
		}
		else {
			return _nickName;
		}
	}

	@Override
	public void setNickName(String nickName) {
		_nickName = nickName;
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
		_firstName = firstName;
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
	public long getPhNo() {
		return _phNo;
	}

	@Override
	public void setPhNo(long phNo) {
		_phNo = phNo;
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
	public String getRelationShip() {
		if (_relationShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _relationShip;
		}
	}

	@Override
	public void setRelationShip(String relationShip) {
		_relationShip = relationShip;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Parent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Parent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Parent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ParentImpl parentImpl = new ParentImpl();

		parentImpl.setParentId(getParentId());
		parentImpl.setNickName(getNickName());
		parentImpl.setFirstName(getFirstName());
		parentImpl.setMiddleName(getMiddleName());
		parentImpl.setLastName(getLastName());
		parentImpl.setPhNo(getPhNo());
		parentImpl.setEmail(getEmail());
		parentImpl.setRelationShip(getRelationShip());
		parentImpl.setCreatedOn(getCreatedOn());
		parentImpl.setCreatedBy(getCreatedBy());
		parentImpl.setModifiedOn(getModifiedOn());
		parentImpl.setModifiedBy(getModifiedBy());

		parentImpl.resetOriginalValues();

		return parentImpl;
	}

	@Override
	public int compareTo(Parent parent) {
		int value = 0;

		if (getParentId() < parent.getParentId()) {
			value = -1;
		}
		else if (getParentId() > parent.getParentId()) {
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

		if (!(obj instanceof Parent)) {
			return false;
		}

		Parent parent = (Parent)obj;

		long primaryKey = parent.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Parent> toCacheModel() {
		ParentCacheModel parentCacheModel = new ParentCacheModel();

		parentCacheModel.parentId = getParentId();

		parentCacheModel.nickName = getNickName();

		String nickName = parentCacheModel.nickName;

		if ((nickName != null) && (nickName.length() == 0)) {
			parentCacheModel.nickName = null;
		}

		parentCacheModel.firstName = getFirstName();

		String firstName = parentCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			parentCacheModel.firstName = null;
		}

		parentCacheModel.middleName = getMiddleName();

		String middleName = parentCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			parentCacheModel.middleName = null;
		}

		parentCacheModel.lastName = getLastName();

		String lastName = parentCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			parentCacheModel.lastName = null;
		}

		parentCacheModel.phNo = getPhNo();

		parentCacheModel.email = getEmail();

		String email = parentCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			parentCacheModel.email = null;
		}

		parentCacheModel.relationShip = getRelationShip();

		String relationShip = parentCacheModel.relationShip;

		if ((relationShip != null) && (relationShip.length() == 0)) {
			parentCacheModel.relationShip = null;
		}

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			parentCacheModel.createdOn = createdOn.getTime();
		}
		else {
			parentCacheModel.createdOn = Long.MIN_VALUE;
		}

		parentCacheModel.createdBy = getCreatedBy();

		String createdBy = parentCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			parentCacheModel.createdBy = null;
		}

		Date modifiedOn = getModifiedOn();

		if (modifiedOn != null) {
			parentCacheModel.modifiedOn = modifiedOn.getTime();
		}
		else {
			parentCacheModel.modifiedOn = Long.MIN_VALUE;
		}

		parentCacheModel.modifiedBy = getModifiedBy();

		String modifiedBy = parentCacheModel.modifiedBy;

		if ((modifiedBy != null) && (modifiedBy.length() == 0)) {
			parentCacheModel.modifiedBy = null;
		}

		return parentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{parentId=");
		sb.append(getParentId());
		sb.append(", nickName=");
		sb.append(getNickName());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", phNo=");
		sb.append(getPhNo());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", relationShip=");
		sb.append(getRelationShip());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Parent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nickName</column-name><column-value><![CDATA[");
		sb.append(getNickName());
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
			"<column><column-name>phNo</column-name><column-value><![CDATA[");
		sb.append(getPhNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relationShip</column-name><column-value><![CDATA[");
		sb.append(getRelationShip());
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

	private static ClassLoader _classLoader = Parent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Parent.class };
	private long _parentId;
	private String _nickName;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private long _phNo;
	private String _email;
	private String _relationShip;
	private Date _createdOn;
	private String _createdBy;
	private Date _modifiedOn;
	private String _modifiedBy;
	private Parent _escapedModel;
}