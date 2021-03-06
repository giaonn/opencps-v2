package org.opencps.api.controller.impl;

import java.net.HttpURLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.opencps.api.constants.ConstantUtils;
import org.opencps.api.controller.ResourceRoleManagement;
import org.opencps.api.controller.util.MessageUtil;
import org.opencps.api.controller.util.ResourceRoleUtils;
import org.opencps.api.error.model.ErrorMsg;
import org.opencps.api.resourcerole.model.DataSearchModel;
import org.opencps.api.resourcerole.model.ResourceRoleInputModel;
import org.opencps.api.resourcerole.model.ResourceRoleModel;
import org.opencps.api.resourcerole.model.ResourceRoleResults;
import org.opencps.api.resourceuser.model.ResourceUserInputModel;
import org.opencps.usermgt.action.ResourceRoleInterface;
import org.opencps.usermgt.action.impl.ResourceRoleActions;
import org.opencps.usermgt.constants.ResourceRoleTerm;
import org.opencps.usermgt.constants.ResourceUserTerm;
import org.opencps.usermgt.model.ResourceRole;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;

import backend.auth.api.exception.BusinessExceptionImpl;

public class ResourceRoleManagementImpl implements ResourceRoleManagement {

//	private static final Log _log = LogFactoryUtil.getLog(ResourceRoleManagementImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public Response getResourceRoles(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String className, String classPK, DataSearchModel query) {
		ResourceRoleInterface actions = new ResourceRoleActions();
		ResourceRoleResults result = new ResourceRoleResults();
		try {

			if (query.getEnd() == 0) {

				query.setStart(QueryUtil.ALL_POS);

				query.setEnd(QueryUtil.ALL_POS);

			}

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(ConstantUtils.API_KEYWORDS_KEY, query.getKeywords());
			params.put(ResourceRoleTerm.CLASS_NAME, String.valueOf(className));
			params.put(ResourceRoleTerm.CLASS_PK, String.valueOf(classPK));
			String querySort = String.format(MessageUtil.getMessage(ConstantUtils.QUERY_SORT), query.getSort());
			Sort[] sorts = new Sort[] { SortFactoryUtil.create(querySort, Sort.STRING_TYPE,
					Boolean.valueOf(query.getOrder())) };

			JSONObject jsonData = actions.getResourceRoles(className, classPK, user.getUserId(), company.getCompanyId(),
					groupId, params, sorts, query.getStart(), query.getEnd(), serviceContext, query.isFull());

			result.setTotal(jsonData.getLong(ConstantUtils.TOTAL));
			result.getResourceRoleModel()
					.addAll(ResourceRoleUtils.mapperResourceRoleList((List<Document>) jsonData.get(ConstantUtils.DATA)));

			return Response.status(HttpURLConnection.HTTP_OK).entity(result).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response create(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, ResourceRoleInputModel input) {
		ResourceRoleInterface actions = new ResourceRoleActions();
		ResourceRoleModel ResourceRoleModel = new ResourceRoleModel();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			ResourceRole ResourceRole = actions.create(user.getUserId(), groupId, input.getClassName(),
					input.getClassPK(), input.getRoleId(), serviceContext);

			ResourceRoleModel = ResourceRoleUtils.mapperResourceRoleModel(ResourceRole);

			return Response.status(HttpURLConnection.HTTP_OK).entity(ResourceRoleModel).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@Override
	public Response delete(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String className, String classPK, long workspaceId) {

		ResourceRoleInterface actions = new ResourceRoleActions();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			boolean flag = actions.delete(user.getUserId(), groupId, className, classPK, workspaceId, serviceContext);

			if (flag) {

				return Response.status(HttpURLConnection.HTTP_OK).build();

			} else {

				ErrorMsg error = new ErrorMsg();

				error.setMessage(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));
				error.setCode(HttpURLConnection.HTTP_NOT_FOUND);
				error.setDescription(MessageUtil.getMessage(ConstantUtils.API_MESSAGE_NOTFOUND));

				return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(error).build();

			}

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response createResourceRolePatch(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, ResourceUserInputModel input, String roles) {
		ResourceRoleInterface actions = new ResourceRoleActions();
		ResourceRoleResults result = new ResourceRoleResults();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			actions.createResourceRolePatch(input.getClassName(), input.getClassPK(), user.getUserId(),
					company.getCompanyId(), groupId, roles, serviceContext);

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(ResourceUserTerm.CLASS_NAME, input.getClassName());
			params.put(ResourceUserTerm.CLASS_PK, input.getClassPK());

			JSONObject jsonData = actions.getResourceRoles(input.getClassName(), input.getClassPK(), user.getUserId(),
					company.getCompanyId(), groupId, params, new Sort[] {}, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					serviceContext, false);

			result.setTotal(jsonData.getLong(ConstantUtils.TOTAL));
			result.getResourceRoleModel()
					.addAll(ResourceRoleUtils.mapperResourceRoleList((List<Document>) jsonData.get(ConstantUtils.DATA)));

			return Response.status(HttpURLConnection.HTTP_OK).entity(result).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Response clone(HttpServletRequest request, HttpHeaders header, Company company, Locale locale, User user,
			ServiceContext serviceContext, String className, String classPK, String sourcePK) {
		ResourceRoleInterface actions = new ResourceRoleActions();
		ResourceRoleResults result = new ResourceRoleResults();

		try {

			long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

			actions.clone(className, classPK, user.getUserId(), company.getCompanyId(), groupId, sourcePK,
					serviceContext);

			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

			params.put(Field.GROUP_ID, String.valueOf(groupId));
			params.put(ResourceUserTerm.CLASS_NAME, className);
			params.put(ResourceUserTerm.CLASS_PK, sourcePK);

			JSONObject jsonData = actions.getResourceRoles(className, sourcePK, user.getUserId(), company.getCompanyId(),
					groupId, params, new Sort[] {}, QueryUtil.ALL_POS, QueryUtil.ALL_POS, serviceContext, false);

			result.setTotal(jsonData.getLong(ConstantUtils.TOTAL));
			result.getResourceRoleModel()
					.addAll(ResourceRoleUtils.mapperResourceRoleList((List<Document>) jsonData.get(ConstantUtils.DATA)));

			return Response.status(HttpURLConnection.HTTP_OK).entity(result).build();

		} catch (Exception e) {
			return BusinessExceptionImpl.processException(e);
		}
	}

}
