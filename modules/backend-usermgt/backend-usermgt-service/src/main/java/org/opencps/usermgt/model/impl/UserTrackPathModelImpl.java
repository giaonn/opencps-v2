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

package org.opencps.usermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.usermgt.model.UserTrackPath;
import org.opencps.usermgt.model.UserTrackPathModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserTrackPath service. Represents a row in the &quot;opencps_usertrackpath&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link UserTrackPathModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserTrackPathImpl}.
 * </p>
 *
 * @author khoavu
 * @see UserTrackPathImpl
 * @see UserTrackPath
 * @see UserTrackPathModel
 * @generated
 */
@ProviderType
public class UserTrackPathModelImpl extends BaseModelImpl<UserTrackPath>
	implements UserTrackPathModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user track path model instance should use the {@link UserTrackPath} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_usertrackpath";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "userTrackPathId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userLoginId", Types.BIGINT },
			{ "path_", Types.VARCHAR },
			{ "pathDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userTrackPathId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("userLoginId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("path_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pathDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_usertrackpath (uuid_ VARCHAR(75) null,userTrackPathId LONG not null primary key,companyId LONG,modifiedDate DATE null,userLoginId LONG,path_ VARCHAR(512) null,pathDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_usertrackpath";
	public static final String ORDER_BY_JPQL = " ORDER BY userTrackPath.userTrackPathId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_usertrackpath.userTrackPathId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.usermgt.model.UserTrackPath"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.usermgt.model.UserTrackPath"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.usermgt.model.UserTrackPath"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long UUID_COLUMN_BITMASK = 2L;
	public static final long USERTRACKPATHID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.usermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.usermgt.model.UserTrackPath"));

	public UserTrackPathModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userTrackPathId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserTrackPathId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userTrackPathId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserTrackPath.class;
	}

	@Override
	public String getModelClassName() {
		return UserTrackPath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userTrackPathId", getUserTrackPathId());
		attributes.put("companyId", getCompanyId());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userLoginId", getUserLoginId());
		attributes.put("path", getPath());
		attributes.put("pathDate", getPathDate());

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

		Long userTrackPathId = (Long)attributes.get("userTrackPathId");

		if (userTrackPathId != null) {
			setUserTrackPathId(userTrackPathId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userLoginId = (Long)attributes.get("userLoginId");

		if (userLoginId != null) {
			setUserLoginId(userLoginId);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		Date pathDate = (Date)attributes.get("pathDate");

		if (pathDate != null) {
			setPathDate(pathDate);
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
	public long getUserTrackPathId() {
		return _userTrackPathId;
	}

	@Override
	public void setUserTrackPathId(long userTrackPathId) {
		_userTrackPathId = userTrackPathId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserLoginId() {
		return _userLoginId;
	}

	@Override
	public void setUserLoginId(long userLoginId) {
		_userLoginId = userLoginId;
	}

	@Override
	public String getPath() {
		if (_path == null) {
			return "";
		}
		else {
			return _path;
		}
	}

	@Override
	public void setPath(String path) {
		_path = path;
	}

	@Override
	public Date getPathDate() {
		return _pathDate;
	}

	@Override
	public void setPathDate(Date pathDate) {
		_pathDate = pathDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			UserTrackPath.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserTrackPath toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserTrackPath)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserTrackPathImpl userTrackPathImpl = new UserTrackPathImpl();

		userTrackPathImpl.setUuid(getUuid());
		userTrackPathImpl.setUserTrackPathId(getUserTrackPathId());
		userTrackPathImpl.setCompanyId(getCompanyId());
		userTrackPathImpl.setModifiedDate(getModifiedDate());
		userTrackPathImpl.setUserLoginId(getUserLoginId());
		userTrackPathImpl.setPath(getPath());
		userTrackPathImpl.setPathDate(getPathDate());

		userTrackPathImpl.resetOriginalValues();

		return userTrackPathImpl;
	}

	@Override
	public int compareTo(UserTrackPath userTrackPath) {
		long primaryKey = userTrackPath.getPrimaryKey();

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

		if (!(obj instanceof UserTrackPath)) {
			return false;
		}

		UserTrackPath userTrackPath = (UserTrackPath)obj;

		long primaryKey = userTrackPath.getPrimaryKey();

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
		UserTrackPathModelImpl userTrackPathModelImpl = this;

		userTrackPathModelImpl._originalUuid = userTrackPathModelImpl._uuid;

		userTrackPathModelImpl._originalCompanyId = userTrackPathModelImpl._companyId;

		userTrackPathModelImpl._setOriginalCompanyId = false;

		userTrackPathModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserTrackPath> toCacheModel() {
		UserTrackPathCacheModel userTrackPathCacheModel = new UserTrackPathCacheModel();

		userTrackPathCacheModel.uuid = getUuid();

		String uuid = userTrackPathCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			userTrackPathCacheModel.uuid = null;
		}

		userTrackPathCacheModel.userTrackPathId = getUserTrackPathId();

		userTrackPathCacheModel.companyId = getCompanyId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			userTrackPathCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			userTrackPathCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		userTrackPathCacheModel.userLoginId = getUserLoginId();

		userTrackPathCacheModel.path = getPath();

		String path = userTrackPathCacheModel.path;

		if ((path != null) && (path.length() == 0)) {
			userTrackPathCacheModel.path = null;
		}

		Date pathDate = getPathDate();

		if (pathDate != null) {
			userTrackPathCacheModel.pathDate = pathDate.getTime();
		}
		else {
			userTrackPathCacheModel.pathDate = Long.MIN_VALUE;
		}

		return userTrackPathCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", userTrackPathId=");
		sb.append(getUserTrackPathId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userLoginId=");
		sb.append(getUserLoginId());
		sb.append(", path=");
		sb.append(getPath());
		sb.append(", pathDate=");
		sb.append(getPathDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.opencps.usermgt.model.UserTrackPath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userTrackPathId</column-name><column-value><![CDATA[");
		sb.append(getUserTrackPathId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userLoginId</column-name><column-value><![CDATA[");
		sb.append(getUserLoginId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>path</column-name><column-value><![CDATA[");
		sb.append(getPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pathDate</column-name><column-value><![CDATA[");
		sb.append(getPathDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = UserTrackPath.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			UserTrackPath.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _userTrackPathId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private Date _modifiedDate;
	private long _userLoginId;
	private String _path;
	private Date _pathDate;
	private long _columnBitmask;
	private UserTrackPath _escapedModel;
}