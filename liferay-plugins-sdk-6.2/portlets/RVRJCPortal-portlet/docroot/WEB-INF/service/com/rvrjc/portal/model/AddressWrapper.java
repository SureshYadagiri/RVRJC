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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author suresh
 * @see Address
 * @generated
 */
public class AddressWrapper implements Address, ModelWrapper<Address> {
	public AddressWrapper(Address address) {
		_address = address;
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

	/**
	* Returns the primary key of this address.
	*
	* @return the primary key of this address
	*/
	@Override
	public long getPrimaryKey() {
		return _address.getPrimaryKey();
	}

	/**
	* Sets the primary key of this address.
	*
	* @param primaryKey the primary key of this address
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_address.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the address ID of this address.
	*
	* @return the address ID of this address
	*/
	@Override
	public long getAddressId() {
		return _address.getAddressId();
	}

	/**
	* Sets the address ID of this address.
	*
	* @param addressId the address ID of this address
	*/
	@Override
	public void setAddressId(long addressId) {
		_address.setAddressId(addressId);
	}

	/**
	* Returns the door no of this address.
	*
	* @return the door no of this address
	*/
	@Override
	public java.lang.String getDoorNo() {
		return _address.getDoorNo();
	}

	/**
	* Sets the door no of this address.
	*
	* @param doorNo the door no of this address
	*/
	@Override
	public void setDoorNo(java.lang.String doorNo) {
		_address.setDoorNo(doorNo);
	}

	/**
	* Returns the city of this address.
	*
	* @return the city of this address
	*/
	@Override
	public java.lang.String getCity() {
		return _address.getCity();
	}

	/**
	* Sets the city of this address.
	*
	* @param city the city of this address
	*/
	@Override
	public void setCity(java.lang.String city) {
		_address.setCity(city);
	}

	/**
	* Returns the mandal of this address.
	*
	* @return the mandal of this address
	*/
	@Override
	public java.lang.String getMandal() {
		return _address.getMandal();
	}

	/**
	* Sets the mandal of this address.
	*
	* @param mandal the mandal of this address
	*/
	@Override
	public void setMandal(java.lang.String mandal) {
		_address.setMandal(mandal);
	}

	/**
	* Returns the district of this address.
	*
	* @return the district of this address
	*/
	@Override
	public java.lang.String getDistrict() {
		return _address.getDistrict();
	}

	/**
	* Sets the district of this address.
	*
	* @param district the district of this address
	*/
	@Override
	public void setDistrict(java.lang.String district) {
		_address.setDistrict(district);
	}

	/**
	* Returns the state of this address.
	*
	* @return the state of this address
	*/
	@Override
	public java.lang.String getState() {
		return _address.getState();
	}

	/**
	* Sets the state of this address.
	*
	* @param state the state of this address
	*/
	@Override
	public void setState(java.lang.String state) {
		_address.setState(state);
	}

	/**
	* Returns the add country of this address.
	*
	* @return the add country of this address
	*/
	@Override
	public java.lang.String getAddCountry() {
		return _address.getAddCountry();
	}

	/**
	* Sets the add country of this address.
	*
	* @param addCountry the add country of this address
	*/
	@Override
	public void setAddCountry(java.lang.String addCountry) {
		_address.setAddCountry(addCountry);
	}

	@Override
	public boolean isNew() {
		return _address.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_address.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _address.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_address.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _address.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _address.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_address.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _address.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_address.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_address.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_address.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AddressWrapper((Address)_address.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Address address) {
		return _address.compareTo(address);
	}

	@Override
	public int hashCode() {
		return _address.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Address> toCacheModel() {
		return _address.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Address toEscapedModel() {
		return new AddressWrapper(_address.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Address toUnescapedModel() {
		return new AddressWrapper(_address.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _address.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _address.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_address.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressWrapper)) {
			return false;
		}

		AddressWrapper addressWrapper = (AddressWrapper)obj;

		if (Validator.equals(_address, addressWrapper._address)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Address getWrappedAddress() {
		return _address;
	}

	@Override
	public Address getWrappedModel() {
		return _address;
	}

	@Override
	public void resetOriginalValues() {
		_address.resetOriginalValues();
	}

	private Address _address;
}