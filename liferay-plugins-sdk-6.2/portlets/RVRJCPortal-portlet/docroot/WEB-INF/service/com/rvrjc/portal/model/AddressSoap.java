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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author suresh
 * @generated
 */
public class AddressSoap implements Serializable {
	public static AddressSoap toSoapModel(Address model) {
		AddressSoap soapModel = new AddressSoap();

		soapModel.setAddressId(model.getAddressId());
		soapModel.setDoorNo(model.getDoorNo());
		soapModel.setCity(model.getCity());
		soapModel.setMandal(model.getMandal());
		soapModel.setDistrict(model.getDistrict());
		soapModel.setState(model.getState());
		soapModel.setAddCountry(model.getAddCountry());

		return soapModel;
	}

	public static AddressSoap[] toSoapModels(Address[] models) {
		AddressSoap[] soapModels = new AddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AddressSoap[][] toSoapModels(Address[][] models) {
		AddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AddressSoap[] toSoapModels(List<Address> models) {
		List<AddressSoap> soapModels = new ArrayList<AddressSoap>(models.size());

		for (Address model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AddressSoap[soapModels.size()]);
	}

	public AddressSoap() {
	}

	public long getPrimaryKey() {
		return _addressId;
	}

	public void setPrimaryKey(long pk) {
		setAddressId(pk);
	}

	public long getAddressId() {
		return _addressId;
	}

	public void setAddressId(long addressId) {
		_addressId = addressId;
	}

	public String getDoorNo() {
		return _doorNo;
	}

	public void setDoorNo(String doorNo) {
		_doorNo = doorNo;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getMandal() {
		return _mandal;
	}

	public void setMandal(String mandal) {
		_mandal = mandal;
	}

	public String getDistrict() {
		return _district;
	}

	public void setDistrict(String district) {
		_district = district;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getAddCountry() {
		return _addCountry;
	}

	public void setAddCountry(String addCountry) {
		_addCountry = addCountry;
	}

	private long _addressId;
	private String _doorNo;
	private String _city;
	private String _mandal;
	private String _district;
	private String _state;
	private String _addCountry;
}