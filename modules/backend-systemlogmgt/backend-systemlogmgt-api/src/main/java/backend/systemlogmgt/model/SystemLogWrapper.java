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

package backend.systemlogmgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link SystemLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemLog
 * @generated
 */
@ProviderType
public class SystemLogWrapper implements SystemLog, ModelWrapper<SystemLog> {
	public SystemLogWrapper(SystemLog systemLog) {
		_systemLog = systemLog;
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
		attributes.put("moduleName", getModuleName());
		attributes.put("message", getMessage());
		attributes.put("type", getType());
		attributes.put("line", getLine());

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

		String moduleName = (String)attributes.get("moduleName");

		if (moduleName != null) {
			setModuleName(moduleName);
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
	public Object clone() {
		return new SystemLogWrapper((SystemLog)_systemLog.clone());
	}

	@Override
	public int compareTo(SystemLog systemLog) {
		return _systemLog.compareTo(systemLog);
	}

	/**
	* Returns the class name of this system log.
	*
	* @return the class name of this system log
	*/
	@Override
	public String getClassName() {
		return _systemLog.getClassName();
	}

	/**
	* Returns the create date of this system log.
	*
	* @return the create date of this system log
	*/
	@Override
	public Date getCreateDate() {
		return _systemLog.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _systemLog.getExpandoBridge();
	}

	/**
	* Returns the group ID of this system log.
	*
	* @return the group ID of this system log
	*/
	@Override
	public long getGroupId() {
		return _systemLog.getGroupId();
	}

	/**
	* Returns the line of this system log.
	*
	* @return the line of this system log
	*/
	@Override
	public int getLine() {
		return _systemLog.getLine();
	}

	/**
	* Returns the log ID of this system log.
	*
	* @return the log ID of this system log
	*/
	@Override
	public long getLogId() {
		return _systemLog.getLogId();
	}

	/**
	* Returns the message of this system log.
	*
	* @return the message of this system log
	*/
	@Override
	public String getMessage() {
		return _systemLog.getMessage();
	}

	/**
	* Returns the module name of this system log.
	*
	* @return the module name of this system log
	*/
	@Override
	public String getModuleName() {
		return _systemLog.getModuleName();
	}

	/**
	* Returns the primary key of this system log.
	*
	* @return the primary key of this system log
	*/
	@Override
	public long getPrimaryKey() {
		return _systemLog.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _systemLog.getPrimaryKeyObj();
	}

	/**
	* Returns the type of this system log.
	*
	* @return the type of this system log
	*/
	@Override
	public String getType() {
		return _systemLog.getType();
	}

	/**
	* Returns the uuid of this system log.
	*
	* @return the uuid of this system log
	*/
	@Override
	public String getUuid() {
		return _systemLog.getUuid();
	}

	@Override
	public int hashCode() {
		return _systemLog.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _systemLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _systemLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _systemLog.isNew();
	}

	@Override
	public void persist() {
		_systemLog.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_systemLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this system log.
	*
	* @param className the class name of this system log
	*/
	@Override
	public void setClassName(String className) {
		_systemLog.setClassName(className);
	}

	/**
	* Sets the create date of this system log.
	*
	* @param createDate the create date of this system log
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_systemLog.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_systemLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_systemLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_systemLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this system log.
	*
	* @param groupId the group ID of this system log
	*/
	@Override
	public void setGroupId(long groupId) {
		_systemLog.setGroupId(groupId);
	}

	/**
	* Sets the line of this system log.
	*
	* @param line the line of this system log
	*/
	@Override
	public void setLine(int line) {
		_systemLog.setLine(line);
	}

	/**
	* Sets the log ID of this system log.
	*
	* @param logId the log ID of this system log
	*/
	@Override
	public void setLogId(long logId) {
		_systemLog.setLogId(logId);
	}

	/**
	* Sets the message of this system log.
	*
	* @param message the message of this system log
	*/
	@Override
	public void setMessage(String message) {
		_systemLog.setMessage(message);
	}

	/**
	* Sets the module name of this system log.
	*
	* @param moduleName the module name of this system log
	*/
	@Override
	public void setModuleName(String moduleName) {
		_systemLog.setModuleName(moduleName);
	}

	@Override
	public void setNew(boolean n) {
		_systemLog.setNew(n);
	}

	/**
	* Sets the primary key of this system log.
	*
	* @param primaryKey the primary key of this system log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_systemLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_systemLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type of this system log.
	*
	* @param type the type of this system log
	*/
	@Override
	public void setType(String type) {
		_systemLog.setType(type);
	}

	/**
	* Sets the uuid of this system log.
	*
	* @param uuid the uuid of this system log
	*/
	@Override
	public void setUuid(String uuid) {
		_systemLog.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<SystemLog> toCacheModel() {
		return _systemLog.toCacheModel();
	}

	@Override
	public SystemLog toEscapedModel() {
		return new SystemLogWrapper(_systemLog.toEscapedModel());
	}

	@Override
	public String toString() {
		return _systemLog.toString();
	}

	@Override
	public SystemLog toUnescapedModel() {
		return new SystemLogWrapper(_systemLog.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _systemLog.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SystemLogWrapper)) {
			return false;
		}

		SystemLogWrapper systemLogWrapper = (SystemLogWrapper)obj;

		if (Objects.equals(_systemLog, systemLogWrapper._systemLog)) {
			return true;
		}

		return false;
	}

	@Override
	public SystemLog getWrappedModel() {
		return _systemLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _systemLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _systemLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_systemLog.resetOriginalValues();
	}

	private final SystemLog _systemLog;
}