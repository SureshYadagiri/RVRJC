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

package com.rvrjc.portal.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.rvrjc.portal.model.Invoice;

/**
 * The persistence interface for the invoice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see InvoicePersistenceImpl
 * @see InvoiceUtil
 * @generated
 */
public interface InvoicePersistence extends BasePersistence<Invoice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InvoiceUtil} to access the invoice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the invoice in the entity cache if it is enabled.
	*
	* @param invoice the invoice
	*/
	public void cacheResult(com.rvrjc.portal.model.Invoice invoice);

	/**
	* Caches the invoices in the entity cache if it is enabled.
	*
	* @param invoices the invoices
	*/
	public void cacheResult(
		java.util.List<com.rvrjc.portal.model.Invoice> invoices);

	/**
	* Creates a new invoice with the primary key. Does not add the invoice to the database.
	*
	* @param invoiceId the primary key for the new invoice
	* @return the new invoice
	*/
	public com.rvrjc.portal.model.Invoice create(long invoiceId);

	/**
	* Removes the invoice with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param invoiceId the primary key of the invoice
	* @return the invoice that was removed
	* @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Invoice remove(long invoiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchInvoiceException;

	public com.rvrjc.portal.model.Invoice updateImpl(
		com.rvrjc.portal.model.Invoice invoice)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invoice with the primary key or throws a {@link com.rvrjc.portal.NoSuchInvoiceException} if it could not be found.
	*
	* @param invoiceId the primary key of the invoice
	* @return the invoice
	* @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Invoice findByPrimaryKey(long invoiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rvrjc.portal.NoSuchInvoiceException;

	/**
	* Returns the invoice with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param invoiceId the primary key of the invoice
	* @return the invoice, or <code>null</code> if a invoice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rvrjc.portal.model.Invoice fetchByPrimaryKey(long invoiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the invoices.
	*
	* @return the invoices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Invoice> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invoices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.InvoiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invoices
	* @param end the upper bound of the range of invoices (not inclusive)
	* @return the range of invoices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Invoice> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invoices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.InvoiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invoices
	* @param end the upper bound of the range of invoices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invoices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rvrjc.portal.model.Invoice> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the invoices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invoices.
	*
	* @return the number of invoices
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}