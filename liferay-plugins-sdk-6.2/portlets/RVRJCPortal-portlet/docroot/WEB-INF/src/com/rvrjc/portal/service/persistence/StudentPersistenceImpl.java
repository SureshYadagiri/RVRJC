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

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.rvrjc.portal.NoSuchStudentException;
import com.rvrjc.portal.model.Student;
import com.rvrjc.portal.model.impl.StudentImpl;
import com.rvrjc.portal.model.impl.StudentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author suresh
 * @see StudentPersistence
 * @see StudentUtil
 * @generated
 */
public class StudentPersistenceImpl extends BasePersistenceImpl<Student>
	implements StudentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTFIRSTNAME =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystudentFirstName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTFIRSTNAME =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBystudentFirstName", new String[] { String.class.getName() },
			StudentModelImpl.FIRSTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTFIRSTNAME = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBystudentFirstName", new String[] { String.class.getName() });

	/**
	 * Returns all the students where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentFirstName(String firstName)
		throws SystemException {
		return findBystudentFirstName(firstName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the students where firstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentFirstName(String firstName, int start,
		int end) throws SystemException {
		return findBystudentFirstName(firstName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the students where firstName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentFirstName(String firstName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTFIRSTNAME;
			finderArgs = new Object[] { firstName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTFIRSTNAME;
			finderArgs = new Object[] { firstName, start, end, orderByComparator };
		}

		List<Student> list = (List<Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Student student : list) {
				if (!Validator.equals(firstName, student.getFirstName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_STUDENT_WHERE);

			boolean bindFirstName = false;

			if (firstName == null) {
				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_1);
			}
			else if (firstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstName) {
					qPos.add(firstName);
				}

				if (!pagination) {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Student>(list);
				}
				else {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first student in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBystudentFirstName_First(String firstName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBystudentFirstName_First(firstName,
				orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstName=");
		msg.append(firstName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the first student in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBystudentFirstName_First(String firstName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Student> list = findBystudentFirstName(firstName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBystudentFirstName_Last(String firstName,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBystudentFirstName_Last(firstName,
				orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstName=");
		msg.append(firstName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the last student in the ordered set where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBystudentFirstName_Last(String firstName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystudentFirstName(firstName);

		if (count == 0) {
			return null;
		}

		List<Student> list = findBystudentFirstName(firstName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the students before and after the current student in the ordered set where firstName = &#63;.
	 *
	 * @param sno the primary key of the current student
	 * @param firstName the first name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student[] findBystudentFirstName_PrevAndNext(long sno,
		String firstName, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = findByPrimaryKey(sno);

		Session session = null;

		try {
			session = openSession();

			Student[] array = new StudentImpl[3];

			array[0] = getBystudentFirstName_PrevAndNext(session, student,
					firstName, orderByComparator, true);

			array[1] = student;

			array[2] = getBystudentFirstName_PrevAndNext(session, student,
					firstName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Student getBystudentFirstName_PrevAndNext(Session session,
		Student student, String firstName, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STUDENT_WHERE);

		boolean bindFirstName = false;

		if (firstName == null) {
			query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_1);
		}
		else if (firstName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_3);
		}
		else {
			bindFirstName = true;

			query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFirstName) {
			qPos.add(firstName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(student);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Student> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the students where firstName = &#63; from the database.
	 *
	 * @param firstName the first name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBystudentFirstName(String firstName)
		throws SystemException {
		for (Student student : findBystudentFirstName(firstName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(student);
		}
	}

	/**
	 * Returns the number of students where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the number of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBystudentFirstName(String firstName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDENTFIRSTNAME;

		Object[] finderArgs = new Object[] { firstName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STUDENT_WHERE);

			boolean bindFirstName = false;

			if (firstName == null) {
				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_1);
			}
			else if (firstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				query.append(_FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstName) {
					qPos.add(firstName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_1 = "student.firstName IS NULL";
	private static final String _FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_2 = "student.firstName = ?";
	private static final String _FINDER_COLUMN_STUDENTFIRSTNAME_FIRSTNAME_3 = "(student.firstName IS NULL OR student.firstName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystudentNameDeptNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBystudentNameDeptNo",
			new String[] { String.class.getName(), Long.class.getName() },
			StudentModelImpl.FIRSTNAME_COLUMN_BITMASK |
			StudentModelImpl.DNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STUDENTNAMEDEPTNO = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBystudentNameDeptNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the students where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @return the matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentNameDeptNo(String firstName, long dno)
		throws SystemException {
		return findBystudentNameDeptNo(firstName, dno, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the students where firstName = &#63; and dno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentNameDeptNo(String firstName, long dno,
		int start, int end) throws SystemException {
		return findBystudentNameDeptNo(firstName, dno, start, end, null);
	}

	/**
	 * Returns an ordered range of all the students where firstName = &#63; and dno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBystudentNameDeptNo(String firstName, long dno,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO;
			finderArgs = new Object[] { firstName, dno };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO;
			finderArgs = new Object[] {
					firstName, dno,
					
					start, end, orderByComparator
				};
		}

		List<Student> list = (List<Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Student student : list) {
				if (!Validator.equals(firstName, student.getFirstName()) ||
						(dno != student.getDno())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_STUDENT_WHERE);

			boolean bindFirstName = false;

			if (firstName == null) {
				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_1);
			}
			else if (firstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_2);
			}

			query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_DNO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstName) {
					qPos.add(firstName);
				}

				qPos.add(dno);

				if (!pagination) {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Student>(list);
				}
				else {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first student in the ordered set where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBystudentNameDeptNo_First(String firstName, long dno,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBystudentNameDeptNo_First(firstName, dno,
				orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstName=");
		msg.append(firstName);

		msg.append(", dno=");
		msg.append(dno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the first student in the ordered set where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBystudentNameDeptNo_First(String firstName, long dno,
		OrderByComparator orderByComparator) throws SystemException {
		List<Student> list = findBystudentNameDeptNo(firstName, dno, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student in the ordered set where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBystudentNameDeptNo_Last(String firstName, long dno,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBystudentNameDeptNo_Last(firstName, dno,
				orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstName=");
		msg.append(firstName);

		msg.append(", dno=");
		msg.append(dno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the last student in the ordered set where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBystudentNameDeptNo_Last(String firstName, long dno,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystudentNameDeptNo(firstName, dno);

		if (count == 0) {
			return null;
		}

		List<Student> list = findBystudentNameDeptNo(firstName, dno, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the students before and after the current student in the ordered set where firstName = &#63; and dno = &#63;.
	 *
	 * @param sno the primary key of the current student
	 * @param firstName the first name
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student[] findBystudentNameDeptNo_PrevAndNext(long sno,
		String firstName, long dno, OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = findByPrimaryKey(sno);

		Session session = null;

		try {
			session = openSession();

			Student[] array = new StudentImpl[3];

			array[0] = getBystudentNameDeptNo_PrevAndNext(session, student,
					firstName, dno, orderByComparator, true);

			array[1] = student;

			array[2] = getBystudentNameDeptNo_PrevAndNext(session, student,
					firstName, dno, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Student getBystudentNameDeptNo_PrevAndNext(Session session,
		Student student, String firstName, long dno,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STUDENT_WHERE);

		boolean bindFirstName = false;

		if (firstName == null) {
			query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_1);
		}
		else if (firstName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_3);
		}
		else {
			bindFirstName = true;

			query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_2);
		}

		query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_DNO_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFirstName) {
			qPos.add(firstName);
		}

		qPos.add(dno);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(student);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Student> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the students where firstName = &#63; and dno = &#63; from the database.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBystudentNameDeptNo(String firstName, long dno)
		throws SystemException {
		for (Student student : findBystudentNameDeptNo(firstName, dno,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(student);
		}
	}

	/**
	 * Returns the number of students where firstName = &#63; and dno = &#63;.
	 *
	 * @param firstName the first name
	 * @param dno the dno
	 * @return the number of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBystudentNameDeptNo(String firstName, long dno)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDENTNAMEDEPTNO;

		Object[] finderArgs = new Object[] { firstName, dno };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STUDENT_WHERE);

			boolean bindFirstName = false;

			if (firstName == null) {
				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_1);
			}
			else if (firstName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_3);
			}
			else {
				bindFirstName = true;

				query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_2);
			}

			query.append(_FINDER_COLUMN_STUDENTNAMEDEPTNO_DNO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstName) {
					qPos.add(firstName);
				}

				qPos.add(dno);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_1 = "student.firstName IS NULL AND ";
	private static final String _FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_2 = "student.firstName = ? AND ";
	private static final String _FINDER_COLUMN_STUDENTNAMEDEPTNO_FIRSTNAME_3 = "(student.firstName IS NULL OR student.firstName = '') AND ";
	private static final String _FINDER_COLUMN_STUDENTNAMEDEPTNO_DNO_2 = "student.dno = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTMENTNO =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydepartmentNo",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENTNO =
		new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydepartmentNo",
			new String[] { Long.class.getName() },
			StudentModelImpl.DNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENTNO = new FinderPath(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydepartmentNo",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the students where dno = &#63;.
	 *
	 * @param dno the dno
	 * @return the matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBydepartmentNo(long dno) throws SystemException {
		return findBydepartmentNo(dno, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the students where dno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dno the dno
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBydepartmentNo(long dno, int start, int end)
		throws SystemException {
		return findBydepartmentNo(dno, start, end, null);
	}

	/**
	 * Returns an ordered range of all the students where dno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dno the dno
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findBydepartmentNo(long dno, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENTNO;
			finderArgs = new Object[] { dno };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTMENTNO;
			finderArgs = new Object[] { dno, start, end, orderByComparator };
		}

		List<Student> list = (List<Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Student student : list) {
				if ((dno != student.getDno())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_STUDENT_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTNO_DNO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StudentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dno);

				if (!pagination) {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Student>(list);
				}
				else {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first student in the ordered set where dno = &#63;.
	 *
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBydepartmentNo_First(long dno,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBydepartmentNo_First(dno, orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dno=");
		msg.append(dno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the first student in the ordered set where dno = &#63;.
	 *
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBydepartmentNo_First(long dno,
		OrderByComparator orderByComparator) throws SystemException {
		List<Student> list = findBydepartmentNo(dno, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student in the ordered set where dno = &#63;.
	 *
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findBydepartmentNo_Last(long dno,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = fetchBydepartmentNo_Last(dno, orderByComparator);

		if (student != null) {
			return student;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dno=");
		msg.append(dno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentException(msg.toString());
	}

	/**
	 * Returns the last student in the ordered set where dno = &#63;.
	 *
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchBydepartmentNo_Last(long dno,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydepartmentNo(dno);

		if (count == 0) {
			return null;
		}

		List<Student> list = findBydepartmentNo(dno, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the students before and after the current student in the ordered set where dno = &#63;.
	 *
	 * @param sno the primary key of the current student
	 * @param dno the dno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student[] findBydepartmentNo_PrevAndNext(long sno, long dno,
		OrderByComparator orderByComparator)
		throws NoSuchStudentException, SystemException {
		Student student = findByPrimaryKey(sno);

		Session session = null;

		try {
			session = openSession();

			Student[] array = new StudentImpl[3];

			array[0] = getBydepartmentNo_PrevAndNext(session, student, dno,
					orderByComparator, true);

			array[1] = student;

			array[2] = getBydepartmentNo_PrevAndNext(session, student, dno,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Student getBydepartmentNo_PrevAndNext(Session session,
		Student student, long dno, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STUDENT_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENTNO_DNO_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StudentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dno);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(student);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Student> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the students where dno = &#63; from the database.
	 *
	 * @param dno the dno
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydepartmentNo(long dno) throws SystemException {
		for (Student student : findBydepartmentNo(dno, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(student);
		}
	}

	/**
	 * Returns the number of students where dno = &#63;.
	 *
	 * @param dno the dno
	 * @return the number of matching students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydepartmentNo(long dno) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEPARTMENTNO;

		Object[] finderArgs = new Object[] { dno };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STUDENT_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTNO_DNO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dno);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DEPARTMENTNO_DNO_2 = "student.dno = ?";

	public StudentPersistenceImpl() {
		setModelClass(Student.class);
	}

	/**
	 * Caches the student in the entity cache if it is enabled.
	 *
	 * @param student the student
	 */
	@Override
	public void cacheResult(Student student) {
		EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentImpl.class, student.getPrimaryKey(), student);

		student.resetOriginalValues();
	}

	/**
	 * Caches the students in the entity cache if it is enabled.
	 *
	 * @param students the students
	 */
	@Override
	public void cacheResult(List<Student> students) {
		for (Student student : students) {
			if (EntityCacheUtil.getResult(
						StudentModelImpl.ENTITY_CACHE_ENABLED,
						StudentImpl.class, student.getPrimaryKey()) == null) {
				cacheResult(student);
			}
			else {
				student.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StudentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StudentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Student student) {
		EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentImpl.class, student.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Student> students) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Student student : students) {
			EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
				StudentImpl.class, student.getPrimaryKey());
		}
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param sno the primary key for the new student
	 * @return the new student
	 */
	@Override
	public Student create(long sno) {
		Student student = new StudentImpl();

		student.setNew(true);
		student.setPrimaryKey(sno);

		return student;
	}

	/**
	 * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sno the primary key of the student
	 * @return the student that was removed
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student remove(long sno)
		throws NoSuchStudentException, SystemException {
		return remove((Serializable)sno);
	}

	/**
	 * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student
	 * @return the student that was removed
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student remove(Serializable primaryKey)
		throws NoSuchStudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Student student = (Student)session.get(StudentImpl.class, primaryKey);

			if (student == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(student);
		}
		catch (NoSuchStudentException nsee) {
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
	protected Student removeImpl(Student student) throws SystemException {
		student = toUnwrappedModel(student);

		studentToCourseTableMapper.deleteLeftPrimaryKeyTableMappings(student.getPrimaryKey());

		studentToParentTableMapper.deleteLeftPrimaryKeyTableMappings(student.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(student)) {
				student = (Student)session.get(StudentImpl.class,
						student.getPrimaryKeyObj());
			}

			if (student != null) {
				session.delete(student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (student != null) {
			clearCache(student);
		}

		return student;
	}

	@Override
	public Student updateImpl(com.rvrjc.portal.model.Student student)
		throws SystemException {
		student = toUnwrappedModel(student);

		boolean isNew = student.isNew();

		StudentModelImpl studentModelImpl = (StudentModelImpl)student;

		Session session = null;

		try {
			session = openSession();

			if (student.isNew()) {
				session.save(student);

				student.setNew(false);
			}
			else {
				session.merge(student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StudentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((studentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTFIRSTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						studentModelImpl.getOriginalFirstName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTFIRSTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTFIRSTNAME,
					args);

				args = new Object[] { studentModelImpl.getFirstName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTFIRSTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTFIRSTNAME,
					args);
			}

			if ((studentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						studentModelImpl.getOriginalFirstName(),
						studentModelImpl.getOriginalDno()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTNAMEDEPTNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO,
					args);

				args = new Object[] {
						studentModelImpl.getFirstName(),
						studentModelImpl.getDno()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDENTNAMEDEPTNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDENTNAMEDEPTNO,
					args);
			}

			if ((studentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { studentModelImpl.getOriginalDno() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPARTMENTNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENTNO,
					args);

				args = new Object[] { studentModelImpl.getDno() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPARTMENTNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTMENTNO,
					args);
			}
		}

		EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
			StudentImpl.class, student.getPrimaryKey(), student);

		return student;
	}

	protected Student toUnwrappedModel(Student student) {
		if (student instanceof StudentImpl) {
			return student;
		}

		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setNew(student.isNew());
		studentImpl.setPrimaryKey(student.getPrimaryKey());

		studentImpl.setSno(student.getSno());
		studentImpl.setFirstName(student.getFirstName());
		studentImpl.setMiddleName(student.getMiddleName());
		studentImpl.setLastName(student.getLastName());
		studentImpl.setGender(student.getGender());
		studentImpl.setDateOfBirth(student.getDateOfBirth());
		studentImpl.setEmail(student.getEmail());
		studentImpl.setEmcetRank(student.getEmcetRank());
		studentImpl.setDno(student.getDno());
		studentImpl.setAddressId(student.getAddressId());
		studentImpl.setLiferayUserId(student.getLiferayUserId());
		studentImpl.setCreatedOn(student.getCreatedOn());
		studentImpl.setCreatedBy(student.getCreatedBy());
		studentImpl.setModifiedOn(student.getModifiedOn());
		studentImpl.setModifiedBy(student.getModifiedBy());

		return studentImpl;
	}

	/**
	 * Returns the student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the student
	 * @return the student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudentException, SystemException {
		Student student = fetchByPrimaryKey(primaryKey);

		if (student == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return student;
	}

	/**
	 * Returns the student with the primary key or throws a {@link com.rvrjc.portal.NoSuchStudentException} if it could not be found.
	 *
	 * @param sno the primary key of the student
	 * @return the student
	 * @throws com.rvrjc.portal.NoSuchStudentException if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student findByPrimaryKey(long sno)
		throws NoSuchStudentException, SystemException {
		return findByPrimaryKey((Serializable)sno);
	}

	/**
	 * Returns the student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student
	 * @return the student, or <code>null</code> if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Student student = (Student)EntityCacheUtil.getResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
				StudentImpl.class, primaryKey);

		if (student == _nullStudent) {
			return null;
		}

		if (student == null) {
			Session session = null;

			try {
				session = openSession();

				student = (Student)session.get(StudentImpl.class, primaryKey);

				if (student != null) {
					cacheResult(student);
				}
				else {
					EntityCacheUtil.putResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
						StudentImpl.class, primaryKey, _nullStudent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StudentModelImpl.ENTITY_CACHE_ENABLED,
					StudentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return student;
	}

	/**
	 * Returns the student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sno the primary key of the student
	 * @return the student, or <code>null</code> if a student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Student fetchByPrimaryKey(long sno) throws SystemException {
		return fetchByPrimaryKey((Serializable)sno);
	}

	/**
	 * Returns all the students.
	 *
	 * @return the students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Student> findAll(int start, int end,
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

		List<Student> list = (List<Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENT;

				if (pagination) {
					sql = sql.concat(StudentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Student>(list);
				}
				else {
					list = (List<Student>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Student student : findAll()) {
			remove(student);
		}
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
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

				Query q = session.createQuery(_SQL_COUNT_STUDENT);

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
	 * Returns all the courses associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @return the courses associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Course> getCourses(long pk)
		throws SystemException {
		return getCourses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the courses associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of courses associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Course> getCourses(long pk, int start,
		int end) throws SystemException {
		return getCourses(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the courses associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of courses associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Course> getCourses(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return studentToCourseTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of courses associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @return the number of courses associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCoursesSize(long pk) throws SystemException {
		long[] pks = studentToCourseTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the course is associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @param coursePK the primary key of the course
	 * @return <code>true</code> if the course is associated with the student; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCourse(long pk, long coursePK)
		throws SystemException {
		return studentToCourseTableMapper.containsTableMapping(pk, coursePK);
	}

	/**
	 * Returns <code>true</code> if the student has any courses associated with it.
	 *
	 * @param pk the primary key of the student to check for associations with courses
	 * @return <code>true</code> if the student has any courses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCourses(long pk) throws SystemException {
		if (getCoursesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param coursePK the primary key of the course
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourse(long pk, long coursePK) throws SystemException {
		studentToCourseTableMapper.addTableMapping(pk, coursePK);
	}

	/**
	 * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param course the course
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourse(long pk, com.rvrjc.portal.model.Course course)
		throws SystemException {
		studentToCourseTableMapper.addTableMapping(pk, course.getPrimaryKey());
	}

	/**
	 * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param coursePKs the primary keys of the courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourses(long pk, long[] coursePKs) throws SystemException {
		for (long coursePK : coursePKs) {
			studentToCourseTableMapper.addTableMapping(pk, coursePK);
		}
	}

	/**
	 * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param courses the courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCourses(long pk, List<com.rvrjc.portal.model.Course> courses)
		throws SystemException {
		for (com.rvrjc.portal.model.Course course : courses) {
			studentToCourseTableMapper.addTableMapping(pk,
				course.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the student and its courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student to clear the associated courses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearCourses(long pk) throws SystemException {
		studentToCourseTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param coursePK the primary key of the course
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCourse(long pk, long coursePK) throws SystemException {
		studentToCourseTableMapper.deleteTableMapping(pk, coursePK);
	}

	/**
	 * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param course the course
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCourse(long pk, com.rvrjc.portal.model.Course course)
		throws SystemException {
		studentToCourseTableMapper.deleteTableMapping(pk, course.getPrimaryKey());
	}

	/**
	 * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param coursePKs the primary keys of the courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCourses(long pk, long[] coursePKs)
		throws SystemException {
		for (long coursePK : coursePKs) {
			studentToCourseTableMapper.deleteTableMapping(pk, coursePK);
		}
	}

	/**
	 * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param courses the courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCourses(long pk,
		List<com.rvrjc.portal.model.Course> courses) throws SystemException {
		for (com.rvrjc.portal.model.Course course : courses) {
			studentToCourseTableMapper.deleteTableMapping(pk,
				course.getPrimaryKey());
		}
	}

	/**
	 * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param coursePKs the primary keys of the courses to be associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCourses(long pk, long[] coursePKs) throws SystemException {
		Set<Long> newCoursePKsSet = SetUtil.fromArray(coursePKs);
		Set<Long> oldCoursePKsSet = SetUtil.fromArray(studentToCourseTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCoursePKsSet = new HashSet<Long>(oldCoursePKsSet);

		removeCoursePKsSet.removeAll(newCoursePKsSet);

		for (long removeCoursePK : removeCoursePKsSet) {
			studentToCourseTableMapper.deleteTableMapping(pk, removeCoursePK);
		}

		newCoursePKsSet.removeAll(oldCoursePKsSet);

		for (long newCoursePK : newCoursePKsSet) {
			studentToCourseTableMapper.addTableMapping(pk, newCoursePK);
		}
	}

	/**
	 * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param courses the courses to be associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCourses(long pk, List<com.rvrjc.portal.model.Course> courses)
		throws SystemException {
		try {
			long[] coursePKs = new long[courses.size()];

			for (int i = 0; i < courses.size(); i++) {
				com.rvrjc.portal.model.Course course = courses.get(i);

				coursePKs[i] = course.getPrimaryKey();
			}

			setCourses(pk, coursePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(StudentModelImpl.MAPPING_TABLE_RVRJC_STUDENT_COURSE_NAME);
		}
	}

	/**
	 * Returns all the parents associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @return the parents associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Parent> getParents(long pk)
		throws SystemException {
		return getParents(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the parents associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of parents associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Parent> getParents(long pk, int start,
		int end) throws SystemException {
		return getParents(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the parents associated with the student.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rvrjc.portal.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the student
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parents associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.rvrjc.portal.model.Parent> getParents(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return studentToParentTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of parents associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @return the number of parents associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getParentsSize(long pk) throws SystemException {
		long[] pks = studentToParentTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the parent is associated with the student.
	 *
	 * @param pk the primary key of the student
	 * @param parentPK the primary key of the parent
	 * @return <code>true</code> if the parent is associated with the student; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsParent(long pk, long parentPK)
		throws SystemException {
		return studentToParentTableMapper.containsTableMapping(pk, parentPK);
	}

	/**
	 * Returns <code>true</code> if the student has any parents associated with it.
	 *
	 * @param pk the primary key of the student to check for associations with parents
	 * @return <code>true</code> if the student has any parents associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsParents(long pk) throws SystemException {
		if (getParentsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parentPK the primary key of the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParent(long pk, long parentPK) throws SystemException {
		studentToParentTableMapper.addTableMapping(pk, parentPK);
	}

	/**
	 * Adds an association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parent the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParent(long pk, com.rvrjc.portal.model.Parent parent)
		throws SystemException {
		studentToParentTableMapper.addTableMapping(pk, parent.getPrimaryKey());
	}

	/**
	 * Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parentPKs the primary keys of the parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParents(long pk, long[] parentPKs) throws SystemException {
		for (long parentPK : parentPKs) {
			studentToParentTableMapper.addTableMapping(pk, parentPK);
		}
	}

	/**
	 * Adds an association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parents the parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addParents(long pk, List<com.rvrjc.portal.model.Parent> parents)
		throws SystemException {
		for (com.rvrjc.portal.model.Parent parent : parents) {
			studentToParentTableMapper.addTableMapping(pk,
				parent.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the student and its parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student to clear the associated parents from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearParents(long pk) throws SystemException {
		studentToParentTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parentPK the primary key of the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeParent(long pk, long parentPK) throws SystemException {
		studentToParentTableMapper.deleteTableMapping(pk, parentPK);
	}

	/**
	 * Removes the association between the student and the parent. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parent the parent
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeParent(long pk, com.rvrjc.portal.model.Parent parent)
		throws SystemException {
		studentToParentTableMapper.deleteTableMapping(pk, parent.getPrimaryKey());
	}

	/**
	 * Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parentPKs the primary keys of the parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeParents(long pk, long[] parentPKs)
		throws SystemException {
		for (long parentPK : parentPKs) {
			studentToParentTableMapper.deleteTableMapping(pk, parentPK);
		}
	}

	/**
	 * Removes the association between the student and the parents. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parents the parents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeParents(long pk,
		List<com.rvrjc.portal.model.Parent> parents) throws SystemException {
		for (com.rvrjc.portal.model.Parent parent : parents) {
			studentToParentTableMapper.deleteTableMapping(pk,
				parent.getPrimaryKey());
		}
	}

	/**
	 * Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parentPKs the primary keys of the parents to be associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setParents(long pk, long[] parentPKs) throws SystemException {
		Set<Long> newParentPKsSet = SetUtil.fromArray(parentPKs);
		Set<Long> oldParentPKsSet = SetUtil.fromArray(studentToParentTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeParentPKsSet = new HashSet<Long>(oldParentPKsSet);

		removeParentPKsSet.removeAll(newParentPKsSet);

		for (long removeParentPK : removeParentPKsSet) {
			studentToParentTableMapper.deleteTableMapping(pk, removeParentPK);
		}

		newParentPKsSet.removeAll(oldParentPKsSet);

		for (long newParentPK : newParentPKsSet) {
			studentToParentTableMapper.addTableMapping(pk, newParentPK);
		}
	}

	/**
	 * Sets the parents associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the student
	 * @param parents the parents to be associated with the student
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setParents(long pk, List<com.rvrjc.portal.model.Parent> parents)
		throws SystemException {
		try {
			long[] parentPKs = new long[parents.size()];

			for (int i = 0; i < parents.size(); i++) {
				com.rvrjc.portal.model.Parent parent = parents.get(i);

				parentPKs[i] = parent.getPrimaryKey();
			}

			setParents(pk, parentPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(StudentModelImpl.MAPPING_TABLE_RVRJC_STUDENT_PARENT_NAME);
		}
	}

	/**
	 * Initializes the student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rvrjc.portal.model.Student")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Student>> listenersList = new ArrayList<ModelListener<Student>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Student>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		studentToCourseTableMapper = TableMapperFactory.getTableMapper("rvrjc_Student_course",
				"sno", "cno", this, coursePersistence);

		studentToParentTableMapper = TableMapperFactory.getTableMapper("rvrjc_Student_Parent",
				"sno", "parentId", this, parentPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(StudentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("rvrjc_Student_course");
		TableMapperFactory.removeTableMapper("rvrjc_Student_Parent");
	}

	@BeanReference(type = CoursePersistence.class)
	protected CoursePersistence coursePersistence;
	protected TableMapper<Student, com.rvrjc.portal.model.Course> studentToCourseTableMapper;
	@BeanReference(type = ParentPersistence.class)
	protected ParentPersistence parentPersistence;
	protected TableMapper<Student, com.rvrjc.portal.model.Parent> studentToParentTableMapper;
	private static final String _SQL_SELECT_STUDENT = "SELECT student FROM Student student";
	private static final String _SQL_SELECT_STUDENT_WHERE = "SELECT student FROM Student student WHERE ";
	private static final String _SQL_COUNT_STUDENT = "SELECT COUNT(student) FROM Student student";
	private static final String _SQL_COUNT_STUDENT_WHERE = "SELECT COUNT(student) FROM Student student WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "student.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Student exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Student exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StudentPersistenceImpl.class);
	private static Student _nullStudent = new StudentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Student> toCacheModel() {
				return _nullStudentCacheModel;
			}
		};

	private static CacheModel<Student> _nullStudentCacheModel = new CacheModel<Student>() {
			@Override
			public Student toEntityModel() {
				return _nullStudent;
			}
		};
}