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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.rvrjc.portal.NoSuchInvoiceException;
import com.rvrjc.portal.model.Invoice;
import com.rvrjc.portal.model.impl.InvoiceImpl;
import com.rvrjc.portal.model.impl.InvoiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the invoice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see InvoicePersistence
 * @see InvoiceUtil
 * @generated
 */
public class InvoicePersistenceImpl extends BasePersistenceImpl<Invoice>
	implements InvoicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InvoiceUtil} to access the invoice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InvoiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceModelImpl.FINDER_CACHE_ENABLED, InvoiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceModelImpl.FINDER_CACHE_ENABLED, InvoiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public InvoicePersistenceImpl() {
		setModelClass(Invoice.class);
	}

	/**
	 * Caches the invoice in the entity cache if it is enabled.
	 *
	 * @param invoice the invoice
	 */
	@Override
	public void cacheResult(Invoice invoice) {
		EntityCacheUtil.putResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceImpl.class, invoice.getPrimaryKey(), invoice);

		invoice.resetOriginalValues();
	}

	/**
	 * Caches the invoices in the entity cache if it is enabled.
	 *
	 * @param invoices the invoices
	 */
	@Override
	public void cacheResult(List<Invoice> invoices) {
		for (Invoice invoice : invoices) {
			if (EntityCacheUtil.getResult(
						InvoiceModelImpl.ENTITY_CACHE_ENABLED,
						InvoiceImpl.class, invoice.getPrimaryKey()) == null) {
				cacheResult(invoice);
			}
			else {
				invoice.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all invoices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InvoiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InvoiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the invoice.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Invoice invoice) {
		EntityCacheUtil.removeResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceImpl.class, invoice.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Invoice> invoices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Invoice invoice : invoices) {
			EntityCacheUtil.removeResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
				InvoiceImpl.class, invoice.getPrimaryKey());
		}
	}

	/**
	 * Creates a new invoice with the primary key. Does not add the invoice to the database.
	 *
	 * @param invoiceId the primary key for the new invoice
	 * @return the new invoice
	 */
	@Override
	public Invoice create(long invoiceId) {
		Invoice invoice = new InvoiceImpl();

		invoice.setNew(true);
		invoice.setPrimaryKey(invoiceId);

		return invoice;
	}

	/**
	 * Removes the invoice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param invoiceId the primary key of the invoice
	 * @return the invoice that was removed
	 * @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice remove(long invoiceId)
		throws NoSuchInvoiceException, SystemException {
		return remove((Serializable)invoiceId);
	}

	/**
	 * Removes the invoice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the invoice
	 * @return the invoice that was removed
	 * @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice remove(Serializable primaryKey)
		throws NoSuchInvoiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Invoice invoice = (Invoice)session.get(InvoiceImpl.class, primaryKey);

			if (invoice == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInvoiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(invoice);
		}
		catch (NoSuchInvoiceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Invoice removeImpl(Invoice invoice) throws SystemException {
		invoice = toUnwrappedModel(invoice);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(invoice)) {
				invoice = (Invoice)session.get(InvoiceImpl.class,
						invoice.getPrimaryKeyObj());
			}

			if (invoice != null) {
				session.delete(invoice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (invoice != null) {
			clearCache(invoice);
		}

		return invoice;
	}

	@Override
	public Invoice updateImpl(com.rvrjc.portal.model.Invoice invoice)
		throws SystemException {
		invoice = toUnwrappedModel(invoice);

		boolean isNew = invoice.isNew();

		Session session = null;

		try {
			session = openSession();

			if (invoice.isNew()) {
				session.save(invoice);

				invoice.setNew(false);
			}
			else {
				session.merge(invoice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
			InvoiceImpl.class, invoice.getPrimaryKey(), invoice);

		return invoice;
	}

	protected Invoice toUnwrappedModel(Invoice invoice) {
		if (invoice instanceof InvoiceImpl) {
			return invoice;
		}

		InvoiceImpl invoiceImpl = new InvoiceImpl();

		invoiceImpl.setNew(invoice.isNew());
		invoiceImpl.setPrimaryKey(invoice.getPrimaryKey());

		invoiceImpl.setInvoiceId(invoice.getInvoiceId());
		invoiceImpl.setAmountPaid(invoice.getAmountPaid());
		invoiceImpl.setPaidDate(invoice.getPaidDate());
		invoiceImpl.setSno(invoice.getSno());
		invoiceImpl.setCreatedOn(invoice.getCreatedOn());
		invoiceImpl.setCreatedBy(invoice.getCreatedBy());

		return invoiceImpl;
	}

	/**
	 * Returns the invoice with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the invoice
	 * @return the invoice
	 * @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInvoiceException, SystemException {
		Invoice invoice = fetchByPrimaryKey(primaryKey);

		if (invoice == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInvoiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return invoice;
	}

	/**
	 * Returns the invoice with the primary key or throws a {@link com.rvrjc.portal.NoSuchInvoiceException} if it could not be found.
	 *
	 * @param invoiceId the primary key of the invoice
	 * @return the invoice
	 * @throws com.rvrjc.portal.NoSuchInvoiceException if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice findByPrimaryKey(long invoiceId)
		throws NoSuchInvoiceException, SystemException {
		return findByPrimaryKey((Serializable)invoiceId);
	}

	/**
	 * Returns the invoice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the invoice
	 * @return the invoice, or <code>null</code> if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Invoice invoice = (Invoice)EntityCacheUtil.getResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
				InvoiceImpl.class, primaryKey);

		if (invoice == _nullInvoice) {
			return null;
		}

		if (invoice == null) {
			Session session = null;

			try {
				session = openSession();

				invoice = (Invoice)session.get(InvoiceImpl.class, primaryKey);

				if (invoice != null) {
					cacheResult(invoice);
				}
				else {
					EntityCacheUtil.putResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
						InvoiceImpl.class, primaryKey, _nullInvoice);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InvoiceModelImpl.ENTITY_CACHE_ENABLED,
					InvoiceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return invoice;
	}

	/**
	 * Returns the invoice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param invoiceId the primary key of the invoice
	 * @return the invoice, or <code>null</code> if a invoice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invoice fetchByPrimaryKey(long invoiceId) throws SystemException {
		return fetchByPrimaryKey((Serializable)invoiceId);
	}

	/**
	 * Returns all the invoices.
	 *
	 * @return the invoices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Invoice> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Invoice> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Invoice> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Invoice> list = (List<Invoice>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INVOICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INVOICE;

				if (pagination) {
					sql = sql.concat(InvoiceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Invoice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Invoice>(list);
				}
				else {
					list = (List<Invoice>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the invoices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Invoice invoice : findAll()) {
			remove(invoice);
		}
	}

	/**
	 * Returns the number of invoices.
	 *
	 * @return the number of invoices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INVOICE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the invoice persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rvrjc.portal.model.Invoice")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Invoice>> listenersList = new ArrayList<ModelListener<Invoice>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Invoice>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(InvoiceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INVOICE = "SELECT invoice FROM Invoice invoice";
	private static final String _SQL_COUNT_INVOICE = "SELECT COUNT(invoice) FROM Invoice invoice";
	private static final String _ORDER_BY_ENTITY_ALIAS = "invoice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Invoice exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InvoicePersistenceImpl.class);
	private static Invoice _nullInvoice = new InvoiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Invoice> toCacheModel() {
				return _nullInvoiceCacheModel;
			}
		};

	private static CacheModel<Invoice> _nullInvoiceCacheModel = new CacheModel<Invoice>() {
			@Override
			public Invoice toEntityModel() {
				return _nullInvoice;
			}
		};
}