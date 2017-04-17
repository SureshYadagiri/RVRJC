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

package com.rvrjc.portal.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rvrjc.portal.service.AddressLocalServiceUtil;
import com.rvrjc.portal.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class AddressClp extends BaseModelImpl<Address> implements Address {
	public AddressClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Address.class;
	}

	@Override
	public String getModelClassName() {
		return Address.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _addressId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addressId", getAddressId());
		attributes.put("doorNo", getDoorNo());
		attributes.put("city", getCity());
		attributes.put("mandal", getMandal());
		attributes.put("district", getDistrict());
		attributes.put("state", getState());
		attributes.put("addCountry", getAddCountry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		String doorNo = (String)attributes.get("doorNo");

		if (doorNo != null) {
			setDoorNo(doorNo);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String mandal = (String)attributes.get("mandal");

		if (mandal != null) {
			setMandal(mandal);
		}

		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String addCountry = (String)attributes.get("addCountry");

		if (addCountry != null) {
			setAddCountry(addCountry);
		}
	}

	@Override
	public long getAddressId() {
		return _addressId;
	}

	@Override
	public void setAddressId(long addressId) {
		_addressId = addressId;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressId", long.class);

				method.invoke(_addressRemoteModel, addressId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoorNo() {
		return _doorNo;
	}

	@Override
	public void setDoorNo(String doorNo) {
		_doorNo = doorNo;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setDoorNo", String.class);

				method.invoke(_addressRemoteModel, doorNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity() {
		return _city;
	}

	@Override
	public void setCity(String city) {
		_city = city;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_addressRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMandal() {
		return _mandal;
	}

	@Override
	public void setMandal(String mandal) {
		_mandal = mandal;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setMandal", String.class);

				method.invoke(_addressRemoteModel, mandal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDistrict() {
		return _district;
	}

	@Override
	public void setDistrict(String district) {
		_district = district;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setDistrict", String.class);

				method.invoke(_addressRemoteModel, district);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState() {
		return _state;
	}

	@Override
	public void setState(String state) {
		_state = state;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setState", String.class);

				method.invoke(_addressRemoteModel, state);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddCountry() {
		return _addCountry;
	}

	@Override
	public void setAddCountry(String addCountry) {
		_addCountry = addCountry;

		if (_addressRemoteModel != null) {
			try {
				Class<?> clazz = _addressRemoteModel.getClass();

				Method method = clazz.getMethod("setAddCountry", String.class);

				method.invoke(_addressRemoteModel, addCountry);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAddressRemoteModel() {
		return _addressRemoteModel;
	}

	public void setAddressRemoteModel(BaseModel<?> addressRemoteModel) {
		_addressRemoteModel = addressRemoteModel;
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

		Class<?> remoteModelClass = _addressRemoteModel.getClass();

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

		Object returnValue = method.invoke(_addressRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AddressLocalServiceUtil.addAddress(this);
		}
		else {
			AddressLocalServiceUtil.updateAddress(this);
		}
	}

	@Override
	public Address toEscapedModel() {
		return (Address)ProxyUtil.newProxyInstance(Address.class.getClassLoader(),
			new Class[] { Address.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AddressClp clone = new AddressClp();

		clone.setAddressId(getAddressId());
		clone.setDoorNo(getDoorNo());
		clone.setCity(getCity());
		clone.setMandal(getMandal());
		clone.setDistrict(getDistrict());
		clone.setState(getState());
		clone.setAddCountry(getAddCountry());

		return clone;
	}

	@Override
	public int compareTo(Address address) {
		int value = 0;

		if (getAddressId() < address.getAddressId()) {
			value = -1;
		}
		else if (getAddressId() > address.getAddressId()) {
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

		if (!(obj instanceof AddressClp)) {
			return false;
		}

		AddressClp address = (AddressClp)obj;

		long primaryKey = address.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{addressId=");
		sb.append(getAddressId());
		sb.append(", doorNo=");
		sb.append(getDoorNo());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", mandal=");
		sb.append(getMandal());
		sb.append(", district=");
		sb.append(getDistrict());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", addCountry=");
		sb.append(getAddCountry());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Address");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>addressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doorNo</column-name><column-value><![CDATA[");
		sb.append(getDoorNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mandal</column-name><column-value><![CDATA[");
		sb.append(getMandal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>district</column-name><column-value><![CDATA[");
		sb.append(getDistrict());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addCountry</column-name><column-value><![CDATA[");
		sb.append(getAddCountry());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _addressId;
	private String _doorNo;
	private String _city;
	private String _mandal;
	private String _district;
	private String _state;
	private String _addCountry;
	private BaseModel<?> _addressRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}