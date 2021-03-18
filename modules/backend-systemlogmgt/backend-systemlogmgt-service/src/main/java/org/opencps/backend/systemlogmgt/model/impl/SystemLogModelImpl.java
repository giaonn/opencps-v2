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

package org.opencps.backend.systemlogmgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.util.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import org.opencps.backend.systemlogmgt.model.SystemLog;
import org.opencps.backend.systemlogmgt.model.SystemLogModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SystemLog service. Represents a row in the &quot;opencps_systemlog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SystemLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SystemLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemLogImpl
 * @see SystemLog
 * @see SystemLogModel
 * @generated
 */
@ProviderType
public class SystemLogModelImpl extends BaseModelImpl<SystemLog>
	implements SystemLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a system log model instance should use the {@link SystemLog} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_systemlog";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "logId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "className", Types.VARCHAR },
			{ "message", Types.VARCHAR },
			{ "type_", Types.VARCHAR },
			{ "line", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("logId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("className", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("message", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("type_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("line", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_systemlog (uuid_ VARCHAR(75) null,logId LONG not null primary key,groupId LONG,createDate DATE null,className VARCHAR(75) null,message VARCHAR(75) null,type_ VARCHAR(75) null,line INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table opencps_systemlog";
	public static final String ORDER_BY_JPQL = " ORDER BY systemLog.logId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_systemlog.logId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.systemlogmgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.backend.systemlogmgt.model.SystemLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.systemlogmgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.backend.systemlogmgt.model.SystemLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.systemlogmgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.backend.systemlogmgt.model.SystemLog"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long UUID_COLUMN_BITMASK = 2L;
	public static final long LOGID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.systemlogmgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.backend.systemlogmgt.model.SystemLog"));

	public SystemLogModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _logId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _logId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SystemLog.class;
	}

	@Override
	public String getModelClassName() {
		return SystemLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("logId", getLogId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("className", getClassName());
		attributes.put("message", getMessage());
		attributes.put("type", getType());
		attributes.put("line", getLine());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long logId = (Long)attributes.get("logId");

		if (logId != null) {
			setLogId(logId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer line = (Integer)attributes.get("line");

		if (line != null) {
			setLine(line);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getLogId() {
		return _logId;
	}

	@Override
	public void setLogId(long logId) {
		_logId = logId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public String getClassName() {
		if (_className == null) {
			return "";
		}
		else {
			return _className;
		}
	}

	@Override
	public void setClassName(String className) {
		_className = className;
	}

	@Override
	public String getMessage() {
		if (_message == null) {
			return "";
		}
		else {
			return _message;
		}
	}

	@Override
	public void setMessage(String message) {
		_message = message;
	}

	@Override
	public String getType() {
		if (_type == null) {
			return "";
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_type = type;
	}

	@Override
	public int getLine() {
		return _line;
	}

	@Override
	public void setLine(int line) {
		_line = line;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SystemLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SystemLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SystemLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SystemLogImpl systemLogImpl = new SystemLogImpl();

		systemLogImpl.setUuid(getUuid());
		systemLogImpl.setLogId(getLogId());
		systemLogImpl.setGroupId(getGroupId());
		systemLogImpl.setCreateDate(getCreateDate());
		systemLogImpl.setClassName(getClassName());
		systemLogImpl.setMessage(getMessage());
		systemLogImpl.setType(getType());
		systemLogImpl.setLine(getLine());

		systemLogImpl.resetOriginalValues();

		return systemLogImpl;
	}

	@Override
	public int compareTo(SystemLog systemLog) {
		long primaryKey = systemLog.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SystemLog)) {
			return false;
		}

		SystemLog systemLog = (SystemLog)obj;

		long primaryKey = systemLog.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		SystemLogModelImpl systemLogModelImpl = this;

		systemLogModelImpl._originalUuid = systemLogModelImpl._uuid;

		systemLogModelImpl._originalGroupId = systemLogModelImpl._groupId;

		systemLogModelImpl._setOriginalGroupId = false;

		systemLogModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SystemLog> toCacheModel() {
		SystemLogCacheModel systemLogCacheModel = new SystemLogCacheModel();

		systemLogCacheModel.uuid = getUuid();

		String uuid = systemLogCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			systemLogCacheModel.uuid = null;
		}

		systemLogCacheModel.logId = getLogId();

		systemLogCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			systemLogCacheModel.createDate = createDate.getTime();
		}
		else {
			systemLogCacheModel.createDate = Long.MIN_VALUE;
		}

		systemLogCacheModel.className = getClassName();

		String className = systemLogCacheModel.className;

		if ((className != null) && (className.length() == 0)) {
			systemLogCacheModel.className = null;
		}

		systemLogCacheModel.message = getMessage();

		String message = systemLogCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			systemLogCacheModel.message = null;
		}

		systemLogCacheModel.type = getType();

		String type = systemLogCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			systemLogCacheModel.type = null;
		}

		systemLogCacheModel.line = getLine();

		return systemLogCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", logId=");
		sb.append(getLogId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", className=");
		sb.append(getClassName());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", line=");
		sb.append(getLine());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.opencps.backend.systemlogmgt.model.SystemLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logId</column-name><column-value><![CDATA[");
		sb.append(getLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>className</column-name><column-value><![CDATA[");
		sb.append(getClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>line</column-name><column-value><![CDATA[");
		sb.append(getLine());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = SystemLog.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			SystemLog.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _logId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private String _className;
	private String _message;
	private String _type;
	private int _line;
	private long _columnBitmask;
	private SystemLog _escapedModel;
}