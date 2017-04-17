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

import com.rvrjc.portal.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author suresh
 * @see Address
 * @generated
 */
public class AddressCacheModel implements CacheModel<Address>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{addressId=");
		sb.append(addressId);
		sb.append(", doorNo=");
		sb.append(doorNo);
		sb.append(", city=");
		sb.append(city);
		sb.append(", mandal=");
		sb.append(mandal);
		sb.append(", district=");
		sb.append(district);
		sb.append(", state=");
		sb.append(state);
		sb.append(", addCountry=");
		sb.append(addCountry);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Address toEntityModel() {
		AddressImpl addressImpl = new AddressImpl();

		addressImpl.setAddressId(addressId);

		if (doorNo == null) {
			addressImpl.setDoorNo(StringPool.BLANK);
		}
		else {
			addressImpl.setDoorNo(doorNo);
		}

		if (city == null) {
			addressImpl.setCity(StringPool.BLANK);
		}
		else {
			addressImpl.setCity(city);
		}

		if (mandal == null) {
			addressImpl.setMandal(StringPool.BLANK);
		}
		else {
			addressImpl.setMandal(mandal);
		}

		if (district == null) {
			addressImpl.setDistrict(StringPool.BLANK);
		}
		else {
			addressImpl.setDistrict(district);
		}

		if (state == null) {
			addressImpl.setState(StringPool.BLANK);
		}
		else {
			addressImpl.setState(state);
		}

		if (addCountry == null) {
			addressImpl.setAddCountry(StringPool.BLANK);
		}
		else {
			addressImpl.setAddCountry(addCountry);
		}

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addressId = objectInput.readLong();
		doorNo = objectInput.readUTF();
		city = objectInput.readUTF();
		mandal = objectInput.readUTF();
		district = objectInput.readUTF();
		state = objectInput.readUTF();
		addCountry = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(addressId);

		if (doorNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doorNo);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (mandal == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mandal);
		}

		if (district == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(district);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (addCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addCountry);
		}
	}

	public long addressId;
	public String doorNo;
	public String city;
	public String mandal;
	public String district;
	public String state;
	public String addCountry;
}