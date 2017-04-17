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

import com.rvrjc.portal.model.Invoice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Invoice in entity cache.
 *
 * @author suresh
 * @see Invoice
 * @generated
 */
public class InvoiceCacheModel implements CacheModel<Invoice>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{invoiceId=");
		sb.append(invoiceId);
		sb.append(", amountPaid=");
		sb.append(amountPaid);
		sb.append(", paidDate=");
		sb.append(paidDate);
		sb.append(", sno=");
		sb.append(sno);
		sb.append(", createdOn=");
		sb.append(createdOn);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Invoice toEntityModel() {
		InvoiceImpl invoiceImpl = new InvoiceImpl();

		invoiceImpl.setInvoiceId(invoiceId);
		invoiceImpl.setAmountPaid(amountPaid);

		if (paidDate == Long.MIN_VALUE) {
			invoiceImpl.setPaidDate(null);
		}
		else {
			invoiceImpl.setPaidDate(new Date(paidDate));
		}

		invoiceImpl.setSno(sno);

		if (createdOn == Long.MIN_VALUE) {
			invoiceImpl.setCreatedOn(null);
		}
		else {
			invoiceImpl.setCreatedOn(new Date(createdOn));
		}

		if (createdBy == null) {
			invoiceImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			invoiceImpl.setCreatedBy(createdBy);
		}

		invoiceImpl.resetOriginalValues();

		return invoiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		invoiceId = objectInput.readLong();
		amountPaid = objectInput.readLong();
		paidDate = objectInput.readLong();
		sno = objectInput.readLong();
		createdOn = objectInput.readLong();
		createdBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(invoiceId);
		objectOutput.writeLong(amountPaid);
		objectOutput.writeLong(paidDate);
		objectOutput.writeLong(sno);
		objectOutput.writeLong(createdOn);

		if (createdBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdBy);
		}
	}

	public long invoiceId;
	public long amountPaid;
	public long paidDate;
	public long sno;
	public long createdOn;
	public String createdBy;
}