package org.opencps.auth.filter;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.Date;

import org.opencps.auth.api.keys.ModelNameKeys;

public class OpenCPSErrorDetails {

	private Date timestamp;
	private String message;
	private String rest_api;

	public OpenCPSErrorDetails(Date timestamp, String message, String rest_api) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.rest_api = rest_api;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getrest_api() {
		return rest_api;
	}

	public void setrest_api(String rest_api) {
		this.rest_api = rest_api;
	}

	@Override
	public String toString() {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put(ModelNameKeys.OPENCPS_ERROR_DETAIL_TIMESTAMP, new Date().getTime());
		result.put(ModelNameKeys.OPENCPS_ERROR_DETAIL_MESSAGE, this.message);
		result.put(ModelNameKeys.OPENCPS_ERROR_DETAIL_REST_API, this.rest_api);
		return result.toJSONString();
	}
}
