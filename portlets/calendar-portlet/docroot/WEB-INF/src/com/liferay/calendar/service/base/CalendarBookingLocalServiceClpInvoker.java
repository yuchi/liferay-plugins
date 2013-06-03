/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.calendar.service.base;

import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Eduardo Lundgren
 * @generated
 */
public class CalendarBookingLocalServiceClpInvoker {
	public CalendarBookingLocalServiceClpInvoker() {
		_methodName0 = "addCalendarBooking";

		_methodParameterTypes0 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName1 = "createCalendarBooking";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCalendarBooking";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCalendarBooking";

		_methodParameterTypes3 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

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

		_methodName10 = "fetchCalendarBooking";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchCalendarBookingByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchCalendarBookingByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getCalendarBooking";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getPersistedModel";

		_methodParameterTypes14 = new String[] { "java.io.Serializable" };

		_methodName15 = "getCalendarBookingByUuidAndCompanyId";

		_methodParameterTypes15 = new String[] { "java.lang.String", "long" };

		_methodName16 = "getCalendarBookingByUuidAndGroupId";

		_methodParameterTypes16 = new String[] { "java.lang.String", "long" };

		_methodName17 = "getCalendarBookings";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getCalendarBookingsCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updateCalendarBooking";

		_methodParameterTypes19 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

<<<<<<< HEAD
		_methodName94 = "getBeanIdentifier";

		_methodParameterTypes94 = new String[] {  };

		_methodName95 = "setBeanIdentifier";

		_methodParameterTypes95 = new String[] { "java.lang.String" };

		_methodName100 = "addCalendarBooking";

		_methodParameterTypes100 = new String[] {
=======
		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "addCalendarBooking";

		_methodParameterTypes106 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "long[][]", "long", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName101 = "checkCalendarBookings";

		_methodParameterTypes101 = new String[] {  };

		_methodName102 = "deleteCalendarBooking";

		_methodParameterTypes102 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName103 = "deleteCalendarBooking";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "deleteCalendarBookingInstance";

		_methodParameterTypes104 = new String[] {
				"com.liferay.calendar.model.CalendarBooking", "long", "boolean"
			};

		_methodName105 = "deleteCalendarBookingInstance";

		_methodParameterTypes105 = new String[] { "long", "long", "boolean" };

		_methodName106 = "deleteCalendarBookings";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "fetchCalendarBooking";

		_methodParameterTypes107 = new String[] { "java.lang.String", "long" };

		_methodName108 = "getCalendarBooking";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "getCalendarBooking";

		_methodParameterTypes109 = new String[] { "long", "long" };

		_methodName110 = "getCalendarBookings";

		_methodParameterTypes110 = new String[] { "long" };

		_methodName111 = "getCalendarBookings";

		_methodParameterTypes111 = new String[] { "long", "long", "long" };

		_methodName112 = "getCalendarBookings";

		_methodParameterTypes112 = new String[] { "long", "long", "long", "int" };

		_methodName113 = "getCalendarBookingsCount";

		_methodParameterTypes113 = new String[] { "long", "long" };

		_methodName114 = "getChildCalendarBookings";

		_methodParameterTypes114 = new String[] { "long" };

		_methodName115 = "getChildCalendarBookings";

		_methodParameterTypes115 = new String[] { "long", "int" };

		_methodName116 = "search";

		_methodParameterTypes116 = new String[] {
=======
		_methodName107 = "checkCalendarBookings";

		_methodParameterTypes107 = new String[] {  };

		_methodName108 = "deleteCalendarBooking";

		_methodParameterTypes108 = new String[] {
				"com.liferay.calendar.model.CalendarBooking"
			};

		_methodName109 = "deleteCalendarBooking";

		_methodParameterTypes109 = new String[] { "long" };

		_methodName110 = "deleteCalendarBookingInstance";

		_methodParameterTypes110 = new String[] {
				"com.liferay.calendar.model.CalendarBooking", "long", "boolean"
			};

		_methodName111 = "deleteCalendarBookingInstance";

		_methodParameterTypes111 = new String[] { "long", "long", "boolean" };

		_methodName112 = "deleteCalendarBookings";

		_methodParameterTypes112 = new String[] { "long" };

		_methodName113 = "fetchCalendarBooking";

		_methodParameterTypes113 = new String[] { "java.lang.String", "long" };

		_methodName114 = "getCalendarBooking";

		_methodParameterTypes114 = new String[] { "long" };

		_methodName115 = "getCalendarBooking";

		_methodParameterTypes115 = new String[] { "long", "long" };

		_methodName116 = "getCalendarBookings";

		_methodParameterTypes116 = new String[] { "long" };

		_methodName117 = "getCalendarBookings";

		_methodParameterTypes117 = new String[] { "long", "long", "long" };

		_methodName118 = "getCalendarBookings";

		_methodParameterTypes118 = new String[] { "long", "long", "long", "int" };

		_methodName119 = "getCalendarBookingsCount";

		_methodParameterTypes119 = new String[] { "long", "long" };

		_methodName120 = "getChildCalendarBookings";

		_methodParameterTypes120 = new String[] { "long" };

		_methodName121 = "getChildCalendarBookings";

		_methodParameterTypes121 = new String[] { "long", "int" };

		_methodName122 = "moveCalendarBookingToTrash";

		_methodParameterTypes122 = new String[] { "long", "long" };

		_methodName123 = "moveCalendarBookingToTrash";

		_methodParameterTypes123 = new String[] {
				"long", "com.liferay.calendar.model.CalendarBooking"
			};

		_methodName124 = "restoreCalendarBookingFromTrash";

		_methodParameterTypes124 = new String[] { "long", "long" };

		_methodName125 = "search";

		_methodParameterTypes125 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "long", "long", "boolean", "int[][]", "int",
				"int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName117 = "search";

		_methodParameterTypes117 = new String[] {
=======
		_methodName126 = "search";

		_methodParameterTypes126 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "boolean", "int[][]", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName118 = "searchCount";

		_methodParameterTypes118 = new String[] {
=======
		_methodName127 = "searchCount";

		_methodParameterTypes127 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "long", "long", "int[][]"
			};

<<<<<<< HEAD
		_methodName119 = "searchCount";

		_methodParameterTypes119 = new String[] {
=======
		_methodName128 = "searchCount";

		_methodParameterTypes128 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long[][]", "long[][]", "long[][]", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "int[][]", "boolean"
			};

<<<<<<< HEAD
		_methodName120 = "updateAsset";

		_methodParameterTypes120 = new String[] {
=======
		_methodName129 = "updateAsset";

		_methodParameterTypes129 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "com.liferay.calendar.model.CalendarBooking", "long[][]",
				"java.lang.String[][]", "long[][]"
			};

<<<<<<< HEAD
		_methodName121 = "updateCalendarBooking";

		_methodParameterTypes121 = new String[] {
=======
		_methodName130 = "updateCalendarBooking";

		_methodParameterTypes130 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "long", "long[][]", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName122 = "updateCalendarBooking";

		_methodParameterTypes122 = new String[] {
=======
		_methodName131 = "updateCalendarBooking";

		_methodParameterTypes131 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "long", "java.util.Map", "java.util.Map",
				"java.lang.String", "long", "long", "boolean",
				"java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName123 = "updateCalendarBookingInstance";

		_methodParameterTypes123 = new String[] {
=======
		_methodName132 = "updateCalendarBookingInstance";

		_methodParameterTypes132 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "long", "long[][]", "java.util.Map",
				"java.util.Map", "java.lang.String", "long", "long", "boolean",
				"java.lang.String", "boolean", "long", "java.lang.String",
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName124 = "updateCalendarBookingInstance";

		_methodParameterTypes124 = new String[] {
=======
		_methodName133 = "updateCalendarBookingInstance";

		_methodParameterTypes133 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "long", "java.util.Map", "java.util.Map",
				"java.lang.String", "long", "long", "boolean",
				"java.lang.String", "boolean", "long", "java.lang.String",
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName125 = "updateStatus";

		_methodParameterTypes125 = new String[] {
=======
		_methodName134 = "updateStatus";

		_methodParameterTypes134 = new String[] {
>>>>>>> LPS-35264 Regenerate
				"long", "long", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.addCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.createCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBookingByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.fetchCalendarBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookingsCount();
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.updateCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

<<<<<<< HEAD
		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
=======
		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
=======
		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.addCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (long[])arguments[2],
				((Long)arguments[3]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

<<<<<<< HEAD
		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
=======
		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.checkCalendarBookings();

			return null;
		}

<<<<<<< HEAD
		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
=======
		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking((com.liferay.calendar.model.CalendarBooking)arguments[0]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.deleteCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance((com.liferay.calendar.model.CalendarBooking)arguments[0],
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
=======
		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.deleteCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
=======
		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.deleteCalendarBookings(((Long)arguments[0]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
=======
		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.fetchCalendarBooking((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

<<<<<<< HEAD
		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
=======
		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.getCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

<<<<<<< HEAD
		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
=======
		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

<<<<<<< HEAD
		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
=======
		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.getCalendarBookings(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue());
		}

<<<<<<< HEAD
		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
=======
		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.getCalendarBookingsCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

<<<<<<< HEAD
		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getChildCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
=======
		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return CalendarBookingLocalServiceUtil.getChildCalendarBookings(((Long)arguments[0]).longValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.getChildCalendarBookings(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

<<<<<<< HEAD
		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
=======
		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			CalendarBookingLocalServiceUtil.moveCalendarBookingToTrash(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			CalendarBookingLocalServiceUtil.moveCalendarBookingToTrash(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.model.CalendarBooking)arguments[1]);

			return null;
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			CalendarBookingLocalServiceUtil.restoreCalendarBookingFromTrash(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.search(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				((Boolean)arguments[8]).booleanValue(), (int[])arguments[9],
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[12]);
		}

<<<<<<< HEAD
		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
=======
		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.search(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				((Long)arguments[9]).longValue(),
				((Boolean)arguments[10]).booleanValue(), (int[])arguments[11],
				((Boolean)arguments[12]).booleanValue(),
				((Integer)arguments[13]).intValue(),
				((Integer)arguments[14]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[15]);
		}

<<<<<<< HEAD
		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
=======
		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.searchCount(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(), (int[])arguments[8]);
		}

<<<<<<< HEAD
		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
=======
		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.searchCount(((Long)arguments[0]).longValue(),
				(long[])arguments[1], (long[])arguments[2],
				(long[])arguments[3], ((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Long)arguments[8]).longValue(),
				((Long)arguments[9]).longValue(), (int[])arguments[10],
				((Boolean)arguments[11]).booleanValue());
		}

<<<<<<< HEAD
		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
=======
		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			CalendarBookingLocalServiceUtil.updateAsset(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.model.CalendarBooking)arguments[1],
				(long[])arguments[2], (java.lang.String[])arguments[3],
				(long[])arguments[4]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
=======
		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.updateCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (long[])arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				((Integer)arguments[15]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

<<<<<<< HEAD
		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
=======
		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.updateCalendarBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				((Boolean)arguments[8]).booleanValue(),
				(java.lang.String)arguments[9],
				((Long)arguments[10]).longValue(),
				(java.lang.String)arguments[11],
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13],
				((Integer)arguments[14]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

<<<<<<< HEAD
		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
=======
		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.updateCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (long[])arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[5],
				(java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				((Boolean)arguments[9]).booleanValue(),
				(java.lang.String)arguments[10],
				((Boolean)arguments[11]).booleanValue(),
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13],
				((Long)arguments[14]).longValue(),
				(java.lang.String)arguments[15],
				((Integer)arguments[16]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[17]);
		}

<<<<<<< HEAD
		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
=======
		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.updateCalendarBookingInstance(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[3],
				(java.util.Map<java.util.Locale, java.lang.String>)arguments[4],
				(java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				((Boolean)arguments[8]).booleanValue(),
				(java.lang.String)arguments[9],
				((Boolean)arguments[10]).booleanValue(),
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				((Long)arguments[13]).longValue(),
				(java.lang.String)arguments[14],
				((Integer)arguments[15]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

<<<<<<< HEAD
		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
=======
		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
>>>>>>> LPS-35264 Regenerate
			return CalendarBookingLocalServiceUtil.updateStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
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
<<<<<<< HEAD
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
=======
>>>>>>> LPS-35264 Regenerate
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
<<<<<<< HEAD
=======
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
>>>>>>> LPS-35264 Regenerate
}