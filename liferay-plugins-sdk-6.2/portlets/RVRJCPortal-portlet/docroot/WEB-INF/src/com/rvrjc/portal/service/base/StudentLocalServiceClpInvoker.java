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

package com.rvrjc.portal.service.base;

import com.rvrjc.portal.service.StudentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author suresh
 * @generated
 */
public class StudentLocalServiceClpInvoker {
	public StudentLocalServiceClpInvoker() {
		_methodName0 = "addStudent";

		_methodParameterTypes0 = new String[] { "com.rvrjc.portal.model.Student" };

		_methodName1 = "createStudent";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteStudent";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteStudent";

		_methodParameterTypes3 = new String[] { "com.rvrjc.portal.model.Student" };

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchStudent";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getStudent";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getStudents";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getStudentsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateStudent";

		_methodParameterTypes15 = new String[] { "com.rvrjc.portal.model.Student" };

		_methodName16 = "addCourseStudent";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addCourseStudent";

		_methodParameterTypes17 = new String[] {
				"long", "com.rvrjc.portal.model.Student"
			};

		_methodName18 = "addCourseStudents";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addCourseStudents";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearCourseStudents";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteCourseStudent";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteCourseStudent";

		_methodParameterTypes22 = new String[] {
				"long", "com.rvrjc.portal.model.Student"
			};

		_methodName23 = "deleteCourseStudents";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteCourseStudents";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getCourseStudents";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getCourseStudents";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getCourseStudents";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getCourseStudentsCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasCourseStudent";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasCourseStudents";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setCourseStudents";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName32 = "addParentStudent";

		_methodParameterTypes32 = new String[] { "long", "long" };

		_methodName33 = "addParentStudent";

		_methodParameterTypes33 = new String[] {
				"long", "com.rvrjc.portal.model.Student"
			};

		_methodName34 = "addParentStudents";

		_methodParameterTypes34 = new String[] { "long", "long[][]" };

		_methodName35 = "addParentStudents";

		_methodParameterTypes35 = new String[] { "long", "java.util.List" };

		_methodName36 = "clearParentStudents";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "deleteParentStudent";

		_methodParameterTypes37 = new String[] { "long", "long" };

		_methodName38 = "deleteParentStudent";

		_methodParameterTypes38 = new String[] {
				"long", "com.rvrjc.portal.model.Student"
			};

		_methodName39 = "deleteParentStudents";

		_methodParameterTypes39 = new String[] { "long", "long[][]" };

		_methodName40 = "deleteParentStudents";

		_methodParameterTypes40 = new String[] { "long", "java.util.List" };

		_methodName41 = "getParentStudents";

		_methodParameterTypes41 = new String[] { "long" };

		_methodName42 = "getParentStudents";

		_methodParameterTypes42 = new String[] { "long", "int", "int" };

		_methodName43 = "getParentStudents";

		_methodParameterTypes43 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getParentStudentsCount";

		_methodParameterTypes44 = new String[] { "long" };

		_methodName45 = "hasParentStudent";

		_methodParameterTypes45 = new String[] { "long", "long" };

		_methodName46 = "hasParentStudents";

		_methodParameterTypes46 = new String[] { "long" };

		_methodName47 = "setParentStudents";

		_methodParameterTypes47 = new String[] { "long", "long[][]" };

		_methodName88 = "getBeanIdentifier";

		_methodParameterTypes88 = new String[] {  };

		_methodName89 = "setBeanIdentifier";

		_methodParameterTypes89 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return StudentLocalServiceUtil.addStudent((com.rvrjc.portal.model.Student)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return StudentLocalServiceUtil.createStudent(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return StudentLocalServiceUtil.deleteStudent(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return StudentLocalServiceUtil.deleteStudent((com.rvrjc.portal.model.Student)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return StudentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return StudentLocalServiceUtil.fetchStudent(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return StudentLocalServiceUtil.getStudent(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return StudentLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return StudentLocalServiceUtil.getStudents(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return StudentLocalServiceUtil.getStudentsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return StudentLocalServiceUtil.updateStudent((com.rvrjc.portal.model.Student)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			StudentLocalServiceUtil.addCourseStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			StudentLocalServiceUtil.addCourseStudent(((Long)arguments[0]).longValue(),
				(com.rvrjc.portal.model.Student)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			StudentLocalServiceUtil.addCourseStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			StudentLocalServiceUtil.addCourseStudents(((Long)arguments[0]).longValue(),
				(java.util.List<com.rvrjc.portal.model.Student>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			StudentLocalServiceUtil.clearCourseStudents(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			StudentLocalServiceUtil.deleteCourseStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			StudentLocalServiceUtil.deleteCourseStudent(((Long)arguments[0]).longValue(),
				(com.rvrjc.portal.model.Student)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			StudentLocalServiceUtil.deleteCourseStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			StudentLocalServiceUtil.deleteCourseStudents(((Long)arguments[0]).longValue(),
				(java.util.List<com.rvrjc.portal.model.Student>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return StudentLocalServiceUtil.getCourseStudents(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return StudentLocalServiceUtil.getCourseStudents(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return StudentLocalServiceUtil.getCourseStudents(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return StudentLocalServiceUtil.getCourseStudentsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return StudentLocalServiceUtil.hasCourseStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return StudentLocalServiceUtil.hasCourseStudents(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			StudentLocalServiceUtil.setCourseStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			StudentLocalServiceUtil.addParentStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			StudentLocalServiceUtil.addParentStudent(((Long)arguments[0]).longValue(),
				(com.rvrjc.portal.model.Student)arguments[1]);

			return null;
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			StudentLocalServiceUtil.addParentStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			StudentLocalServiceUtil.addParentStudents(((Long)arguments[0]).longValue(),
				(java.util.List<com.rvrjc.portal.model.Student>)arguments[1]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			StudentLocalServiceUtil.clearParentStudents(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			StudentLocalServiceUtil.deleteParentStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			StudentLocalServiceUtil.deleteParentStudent(((Long)arguments[0]).longValue(),
				(com.rvrjc.portal.model.Student)arguments[1]);

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			StudentLocalServiceUtil.deleteParentStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			StudentLocalServiceUtil.deleteParentStudents(((Long)arguments[0]).longValue(),
				(java.util.List<com.rvrjc.portal.model.Student>)arguments[1]);

			return null;
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return StudentLocalServiceUtil.getParentStudents(((Long)arguments[0]).longValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return StudentLocalServiceUtil.getParentStudents(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return StudentLocalServiceUtil.getParentStudents(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return StudentLocalServiceUtil.getParentStudentsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return StudentLocalServiceUtil.hasParentStudent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return StudentLocalServiceUtil.hasParentStudents(((Long)arguments[0]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			StudentLocalServiceUtil.setParentStudents(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return StudentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			StudentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
}