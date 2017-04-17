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
 * This class is a wrapper for {@link Course}.
 * </p>
 *
 * @author suresh
 * @see Course
 * @generated
 */
public class CourseWrapper implements Course, ModelWrapper<Course> {
	public CourseWrapper(Course course) {
		_course = course;
	}

	@Override
	public Class<?> getModelClass() {
		return Course.class;
	}

	@Override
	public String getModelClassName() {
		return Course.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cno", getCno());
		attributes.put("ccode", getCcode());
		attributes.put("cname", getCname());
		attributes.put("cfee", getCfee());
		attributes.put("cdescription", getCdescription());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedOn", getModifiedOn());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cno = (Long)attributes.get("cno");

		if (cno != null) {
			setCno(cno);
		}

		String ccode = (String)attributes.get("ccode");

		if (ccode != null) {
			setCcode(ccode);
		}

		String cname = (String)attributes.get("cname");

		if (cname != null) {
			setCname(cname);
		}

		Integer cfee = (Integer)attributes.get("cfee");

		if (cfee != null) {
			setCfee(cfee);
		}

		String cdescription = (String)attributes.get("cdescription");

		if (cdescription != null) {
			setCdescription(cdescription);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedOn = (Date)attributes.get("modifiedOn");

		if (modifiedOn != null) {
			setModifiedOn(modifiedOn);
		}

		String modifiedBy = (String)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	* Returns the primary key of this course.
	*
	* @return the primary key of this course
	*/
	@Override
	public long getPrimaryKey() {
		return _course.getPrimaryKey();
	}

	/**
	* Sets the primary key of this course.
	*
	* @param primaryKey the primary key of this course
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_course.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cno of this course.
	*
	* @return the cno of this course
	*/
	@Override
	public long getCno() {
		return _course.getCno();
	}

	/**
	* Sets the cno of this course.
	*
	* @param cno the cno of this course
	*/
	@Override
	public void setCno(long cno) {
		_course.setCno(cno);
	}

	/**
	* Returns the ccode of this course.
	*
	* @return the ccode of this course
	*/
	@Override
	public java.lang.String getCcode() {
		return _course.getCcode();
	}

	/**
	* Sets the ccode of this course.
	*
	* @param ccode the ccode of this course
	*/
	@Override
	public void setCcode(java.lang.String ccode) {
		_course.setCcode(ccode);
	}

	/**
	* Returns the cname of this course.
	*
	* @return the cname of this course
	*/
	@Override
	public java.lang.String getCname() {
		return _course.getCname();
	}

	/**
	* Sets the cname of this course.
	*
	* @param cname the cname of this course
	*/
	@Override
	public void setCname(java.lang.String cname) {
		_course.setCname(cname);
	}

	/**
	* Returns the cfee of this course.
	*
	* @return the cfee of this course
	*/
	@Override
	public int getCfee() {
		return _course.getCfee();
	}

	/**
	* Sets the cfee of this course.
	*
	* @param cfee the cfee of this course
	*/
	@Override
	public void setCfee(int cfee) {
		_course.setCfee(cfee);
	}

	/**
	* Returns the cdescription of this course.
	*
	* @return the cdescription of this course
	*/
	@Override
	public java.lang.String getCdescription() {
		return _course.getCdescription();
	}

	/**
	* Sets the cdescription of this course.
	*
	* @param cdescription the cdescription of this course
	*/
	@Override
	public void setCdescription(java.lang.String cdescription) {
		_course.setCdescription(cdescription);
	}

	/**
	* Returns the created on of this course.
	*
	* @return the created on of this course
	*/
	@Override
	public java.util.Date getCreatedOn() {
		return _course.getCreatedOn();
	}

	/**
	* Sets the created on of this course.
	*
	* @param createdOn the created on of this course
	*/
	@Override
	public void setCreatedOn(java.util.Date createdOn) {
		_course.setCreatedOn(createdOn);
	}

	/**
	* Returns the created by of this course.
	*
	* @return the created by of this course
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _course.getCreatedBy();
	}

	/**
	* Sets the created by of this course.
	*
	* @param createdBy the created by of this course
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_course.setCreatedBy(createdBy);
	}

	/**
	* Returns the modified on of this course.
	*
	* @return the modified on of this course
	*/
	@Override
	public java.util.Date getModifiedOn() {
		return _course.getModifiedOn();
	}

	/**
	* Sets the modified on of this course.
	*
	* @param modifiedOn the modified on of this course
	*/
	@Override
	public void setModifiedOn(java.util.Date modifiedOn) {
		_course.setModifiedOn(modifiedOn);
	}

	/**
	* Returns the modified by of this course.
	*
	* @return the modified by of this course
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _course.getModifiedBy();
	}

	/**
	* Sets the modified by of this course.
	*
	* @param modifiedBy the modified by of this course
	*/
	@Override
	public void setModifiedBy(java.lang.String modifiedBy) {
		_course.setModifiedBy(modifiedBy);
	}

	@Override
	public boolean isNew() {
		return _course.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_course.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _course.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_course.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _course.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _course.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_course.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _course.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_course.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_course.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_course.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CourseWrapper((Course)_course.clone());
	}

	@Override
	public int compareTo(com.rvrjc.portal.model.Course course) {
		return _course.compareTo(course);
	}

	@Override
	public int hashCode() {
		return _course.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rvrjc.portal.model.Course> toCacheModel() {
		return _course.toCacheModel();
	}

	@Override
	public com.rvrjc.portal.model.Course toEscapedModel() {
		return new CourseWrapper(_course.toEscapedModel());
	}

	@Override
	public com.rvrjc.portal.model.Course toUnescapedModel() {
		return new CourseWrapper(_course.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _course.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _course.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_course.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseWrapper)) {
			return false;
		}

		CourseWrapper courseWrapper = (CourseWrapper)obj;

		if (Validator.equals(_course, courseWrapper._course)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Course getWrappedCourse() {
		return _course;
	}

	@Override
	public Course getWrappedModel() {
		return _course;
	}

	@Override
	public void resetOriginalValues() {
		_course.resetOriginalValues();
	}

	private Course _course;
}