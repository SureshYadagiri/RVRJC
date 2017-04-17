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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Invoice}.
 * </p>
 *
 * @author suresh
 * @see Invoice
 * @generated
 */
public class InvoiceWrapper implements Invoice, ModelWrapper<Invoice> {
	public InvoiceWrapper(Invoice invoice) {
		_invoice = invoice;
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

	/**
	* Returns the primary key of this invoice.
	*
	* @return the primary key of this invoice
	*/
	@Override
	public long getPrimaryKey() {
		return _invoice.getPrimaryKey();
	}

	/**
	* Sets the primary key of this invoice.
	*
	* @param primaryKey the primary key of this invoice
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_invoice.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the invoice ID of this invoice.
	*
	* @return the invoice ID of this invoice
	*/
	@Override
	public long getInvoiceId() {
		return _invoice.getInvoiceId();
	}

	/**
	* Sets the invoice ID of this invoice.
	*
	* @param invoiceId the invoice ID of this invoice
	*/
	@Override
	public void setInvoiceId(long invoiceId) {
		_invoice.setInvoiceId(invoiceId);
	}

	/**
	* Returns the amount paid of this invoice.
	*
	* @return the amount paid of this invoice
	*/
	@Override
	public long getAmountPaid() {
		return _invoice.getAmountPaid();
	}

	/**
	* Sets the amount paid of this invoice.
	*
	* @param amountPaid the amount paid of this invoice
	*/
	@Override
	public void setAmountPaid(long amountPaid) {
		_invoice.setAmountPaid(amountPaid);
	}

	/**
	* Returns the paid date of this invoice.
	*
	* @return the paid date of this invoice
	*/
	@Override
	public java.util.Date getPaidDate() {
		return _invoice.getPaidDate();
	}

	/**
	* Sets the paid date of this invoice.
	*
	* @param paidDate the paid date of this invoice
	*/
	@Override
	public void setPaidDate(java.util.Date paidDate) {
		_invoice.setPaidDate(paidDate);
	}

	/**
	* Returns the sno of this invoice.
	*
	* @return the sno of this invoice
	*/
	@Override
	public long getSno() {
		return _invoice.getSno();
	}

	/**
	* Sets the sno of this invoice.
	*
	* @param sno the sno of this invoice
	*/
	@Override
	public void setSno(long sno) {
		_invoice.setSno(sno);
	}

	/**
	* Returns the created on of this invoice.
	*
	* @return the created on of this invoice
	*/
	@Override
	public java.util.Date getCreatedOn() {
		return _invoice.getCreatedOn();
	}

	/**
	* Sets the created on of this invoice.
	*
	* @param createdOn the created on of this invoice
	*/
	@Override
	public void setCreatedOn(java.util.Date createdOn) {
		_invoice.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this invoice.
	*
	* @return the created by of this invoice
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _invoice.getCreatedBy();
	}

	/**
	* Sets the created by of this invoice.
	*
	* @param createdBy the created by of this invoice
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_invoice.setCreatedBy(createdBy);
	}

	@Override
	public boolean isNew() {
		return _invoice.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_invoice.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _invoice.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_invoice.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _invoice.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _invoice.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_invoice.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _invoice.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_invoice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_invoice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_invoice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InvoiceWrapper((Invoice)_invoice.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Invoice invoice) {
		return _invoice.compareTo(invoice);
	}

	@Override
	public int hashCode() {
		return _invoice.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Invoice> toCacheModel() {
		return _invoice.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Invoice toEscapedModel() {
		return new InvoiceWrapper(_invoice.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Invoice toUnescapedModel() {
		return new InvoiceWrapper(_invoice.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _invoice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _invoice.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_invoice.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvoiceWrapper)) {
			return false;
		}

		InvoiceWrapper invoiceWrapper = (InvoiceWrapper)obj;

		if (Validator.equals(_invoice, invoiceWrapper._invoice)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Invoice getWrappedInvoice() {
		return _invoice;
	}

	@Override
	public Invoice getWrappedModel() {
		return _invoice;
	}

	@Override
	public void resetOriginalValues() {
		_invoice.resetOriginalValues();
	}

	private Invoice _invoice;
}