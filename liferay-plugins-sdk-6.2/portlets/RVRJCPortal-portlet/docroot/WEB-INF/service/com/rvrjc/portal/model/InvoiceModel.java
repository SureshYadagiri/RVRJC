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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Invoice service. Represents a row in the &quot;rvrjc_Invoice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rvrjc.portal.model.impl.InvoiceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rvrjc.portal.model.impl.InvoiceImpl}.
 * </p>
 *
 * @author suresh
 * @see Invoice
 * @see com.rvrjc.portal.model.impl.InvoiceImpl
 * @see com.rvrjc.portal.model.impl.InvoiceModelImpl
 * @generated
 */
public interface InvoiceModel extends BaseModel<Invoice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a invoice model instance should use the {@link Invoice} interface instead.
	 */

	/**
	 * Returns the primary key of this invoice.
	 *
	 * @return the primary key of this invoice
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this invoice.
	 *
	 * @param primaryKey the primary key of this invoice
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the invoice ID of this invoice.
	 *
	 * @return the invoice ID of this invoice
	 */
	public long getInvoiceId();

	/**
	 * Sets the invoice ID of this invoice.
	 *
	 * @param invoiceId the invoice ID of this invoice
	 */
	public void setInvoiceId(long invoiceId);

	/**
	 * Returns the amount paid of this invoice.
	 *
	 * @return the amount paid of this invoice
	 */
	public long getAmountPaid();

	/**
	 * Sets the amount paid of this invoice.
	 *
	 * @param amountPaid the amount paid of this invoice
	 */
	public void setAmountPaid(long amountPaid);

	/**
	 * Returns the paid date of this invoice.
	 *
	 * @return the paid date of this invoice
	 */
	public Date getPaidDate();

	/**
	 * Sets the paid date of this invoice.
	 *
	 * @param paidDate the paid date of this invoice
	 */
	public void setPaidDate(Date paidDate);

	/**
	 * Returns the sno of this invoice.
	 *
	 * @return the sno of this invoice
	 */
	public long getSno();

	/**
	 * Sets the sno of this invoice.
	 *
	 * @param sno the sno of this invoice
	 */
	public void setSno(long sno);

	/**
	 * Returns the created on of this invoice.
	 *
	 * @return the created on of this invoice
	 */
	public Date getCreatedOn();

	/**
	 * Sets the created on of this invoice.
	 *
	 * @param createdOn the created on of this invoice
	 */
	public void setCreatedOn(Date createdOn);

	/**
	 * Returns the created by of this invoice.
	 *
	 * @return the created by of this invoice
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this invoice.
	 *
	 * @param createdBy the created by of this invoice
	 */
	public void setCreatedBy(String createdBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.rvrjc.portal.model.Invoice invoice);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rvrjc.portal.model.Invoice> toCacheModel();

	@Override
	public com.rvrjc.portal.model.Invoice toEscapedModel();

	@Override
	public com.rvrjc.portal.model.Invoice toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}