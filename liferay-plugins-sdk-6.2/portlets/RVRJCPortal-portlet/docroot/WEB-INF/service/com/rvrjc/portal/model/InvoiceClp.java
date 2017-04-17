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

import com.rvrjc.portal.service.ClpSerializer;
import com.rvrjc.portal.service.InvoiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suresh
 */
public class InvoiceClp extends BaseModelImpl<Invoice> implements Invoice {
	public InvoiceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Invoice.class;
	}

	@Override
	public String getModelClassName() {
		return Invoice.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _invoiceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvoiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _invoiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("invoiceId", getInvoiceId());
		attributes.put("amountPaid", getAmountPaid());
		attributes.put("paidDate", getPaidDate());
		attributes.put("sno", getSno());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long invoiceId = (Long)attributes.get("invoiceId");

		if (invoiceId != null) {
			setInvoiceId(invoiceId);
		}

		Long amountPaid = (Long)attributes.get("amountPaid");

		if (amountPaid != null) {
			setAmountPaid(amountPaid);
		}

		Date paidDate = (Date)attributes.get("paidDate");

		if (paidDate != null) {
			setPaidDate(paidDate);
		}

		Long sno = (Long)attributes.get("sno");

		if (sno != null) {
			setSno(sno);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}
	}

	@Override
	public long getInvoiceId() {
		return _invoiceId;
	}

	@Override
	public void setInvoiceId(long invoiceId) {
		_invoiceId = invoiceId;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceId", long.class);

				method.invoke(_invoiceRemoteModel, invoiceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmountPaid() {
		return _amountPaid;
	}

	@Override
	public void setAmountPaid(long amountPaid) {
		_amountPaid = amountPaid;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setAmountPaid", long.class);

				method.invoke(_invoiceRemoteModel, amountPaid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPaidDate() {
		return _paidDate;
	}

	@Override
	public void setPaidDate(Date paidDate) {
		_paidDate = paidDate;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setPaidDate", Date.class);

				method.invoke(_invoiceRemoteModel, paidDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSno() {
		return _sno;
	}

	@Override
	public void setSno(long sno) {
		_sno = sno;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setSno", long.class);

				method.invoke(_invoiceRemoteModel, sno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedOn() {
		return _createdOn;
	}

	@Override
	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedOn", Date.class);

				method.invoke(_invoiceRemoteModel, createdOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;

		if (_invoiceRemoteModel != null) {
			try {
				Class<?> clazz = _invoiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_invoiceRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInvoiceRemoteModel() {
		return _invoiceRemoteModel;
	}

	public void setInvoiceRemoteModel(BaseModel<?> invoiceRemoteModel) {
		_invoiceRemoteModel = invoiceRemoteModel;
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

		Class<?> remoteModelClass = _invoiceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_invoiceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InvoiceLocalServiceUtil.addInvoice(this);
		}
		else {
			InvoiceLocalServiceUtil.updateInvoice(this);
		}
	}

	@Override
	public Invoice toEscapedModel() {
		return (Invoice)ProxyUtil.newProxyInstance(Invoice.class.getClassLoader(),
			new Class[] { Invoice.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InvoiceClp clone = new InvoiceClp();

		clone.setInvoiceId(getInvoiceId());
		clone.setAmountPaid(getAmountPaid());
		clone.setPaidDate(getPaidDate());
		clone.setSno(getSno());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());

		return clone;
	}

	@Override
	public int compareTo(Invoice invoice) {
		int value = 0;

		if (getInvoiceId() < invoice.getInvoiceId()) {
			value = -1;
		}
		else if (getInvoiceId() > invoice.getInvoiceId()) {
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

		if (!(obj instanceof InvoiceClp)) {
			return false;
		}

		InvoiceClp invoice = (InvoiceClp)obj;

		long primaryKey = invoice.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{invoiceId=");
		sb.append(getInvoiceId());
		sb.append(", amountPaid=");
		sb.append(getAmountPaid());
		sb.append(", paidDate=");
		sb.append(getPaidDate());
		sb.append(", sno=");
		sb.append(getSno());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.rvrjc.portal.model.Invoice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>invoiceId</column-name><column-value><![CDATA[");
		sb.append(getInvoiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amountPaid</column-name><column-value><![CDATA[");
		sb.append(getAmountPaid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paidDate</column-name><column-value><![CDATA[");
		sb.append(getPaidDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sno</column-name><column-value><![CDATA[");
		sb.append(getSno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _invoiceId;
	private long _amountPaid;
	private Date _paidDate;
	private long _sno;
	private Date _createdOn;
	private String _createdBy;
	private BaseModel<?> _invoiceRemoteModel;
	private Class<?> _clpSerializerClass = com.rvrjc.portal.service.ClpSerializer.class;
}