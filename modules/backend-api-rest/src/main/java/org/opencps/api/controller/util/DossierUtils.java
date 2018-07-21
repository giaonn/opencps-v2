package org.opencps.api.controller.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opencps.api.dossier.model.DossierDataModel;
import org.opencps.api.dossier.model.DossierDetailModel;
import org.opencps.api.dossier.model.DossierSearchDetailModel;
import org.opencps.auth.api.exception.NotFoundException;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.action.util.DossierOverDueUtils;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierActionUser;
import org.opencps.dossiermgt.model.DossierUser;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.ServiceProcess;
import org.opencps.dossiermgt.model.ServiceProcessRole;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierActionUserLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierUserLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceProcessLocalServiceUtil;
import org.opencps.dossiermgt.service.persistence.DossierUserPK;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.EmployeeJobPos;
import org.opencps.usermgt.model.JobPos;
import org.opencps.usermgt.service.EmployeeJobPosLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.opencps.usermgt.service.JobPosLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DossierUtils {

	public static List<DossierDataModel> mappingForGetList(List<Document> docs) {
		List<DossierDataModel> ouputs = new ArrayList<DossierDataModel>();

		for (Document doc : docs) {
			DossierDataModel model = new DossierDataModel();
			model.setDossierIdCTN(doc.get(DossierTerm.DOSSIER_ID_CTN));
			model.setDossierId(GetterUtil.getInteger(doc.get(Field.ENTRY_CLASS_PK)));
			model.setGroupId(GetterUtil.getInteger(doc.get(Field.GROUP_ID)));
			model.setCreateDate(doc.get(Field.CREATE_DATE));
			model.setModifiedDate(doc.get(Field.MODIFIED_DATE));
			model.setReferenceUid(doc.get(DossierTerm.REFERENCE_UID));
			model.setCounter(GetterUtil.getInteger(doc.get(DossierTerm.COUNTER)));
			model.setServiceCode(doc.get(DossierTerm.SERVICE_CODE));
			model.setServiceName(doc.get(DossierTerm.SERVICE_NAME));
			model.setGovAgencyCode(doc.get(DossierTerm.GOV_AGENCY_CODE));
			model.setGovAgencyName(doc.get(DossierTerm.GOV_AGENCY_NAME));
			model.setApplicantName(doc.get(DossierTerm.APPLICANT_NAME));
			model.setApplicantNote(doc.get(DossierTerm.APPLICANT_NOTE));
			model.setApplicantIdType(doc.get(DossierTerm.APPLICANT_ID_TYPE));
			model.setApplicantIdNo(doc.get(DossierTerm.APPLICANT_ID_NO));
			model.setApplicantIdDate(doc.get(DossierTerm.APPLICANT_ID_DATE));
			model.setAddress(doc.get(DossierTerm.ADDRESS));
			model.setCityCode(doc.get(DossierTerm.CITY_CODE));
			model.setCityName(doc.get(DossierTerm.CITY_NAME));
			model.setDistrictCode(doc.get(DossierTerm.DISTRICT_CODE));
			model.setDistrictName(doc.get(DossierTerm.DISTRICT_NAME));
			model.setWardCode(doc.get(DossierTerm.WARD_CODE));
			model.setWardName(doc.get(DossierTerm.WARD_NAME));
			model.setContactName(doc.get(DossierTerm.CONTACT_NAME));
			model.setContactTelNo(doc.get(DossierTerm.CONTACT_TEL_NO));
			model.setContactEmail(doc.get(DossierTerm.CONTACT_EMAIL));
			model.setDossierNote(doc.get(DossierTerm.DOSSIER_NOTE));
			model.setSubmissionNote(doc.get(DossierTerm.SUBMISSION_NOTE));
			model.setBriefNote(doc.get(DossierTerm.BRIEF_NOTE));
			model.setDossierNo(doc.get(DossierTerm.DOSSIER_NO));
			model.setBriefNote(doc.get(DossierTerm.BRIEF_NOTE));
//			model.setSubmitDate(doc.get(DossierTerm.SUBMIT_DATE));
//			_log.info("SUBMIT_DATE: "+doc.get(DossierTerm.SUBMIT_DATE));
			if (Validator.isNotNull(doc.get(DossierTerm.SUBMIT_DATE))) {
//				_log.info("SUBMIT_DATE_DATEEEEEE: "+doc.get(DossierTerm.SUBMIT_DATE));
				Date submitDate = APIDateTimeUtils.convertStringToDate(doc.get(DossierTerm.SUBMIT_DATE), APIDateTimeUtils._LUCENE_PATTERN);
//				_log.info("SUBMIT_DATE_DATEEEEEE: "+submitDate);
				model.setSubmitDate(APIDateTimeUtils.convertDateToString(submitDate, APIDateTimeUtils._NORMAL_PARTTERN));
//				_log.info("SUBMIT_DATE_CONVERT: "+APIDateTimeUtils.convertDateToString(submitDate, APIDateTimeUtils._NORMAL_PARTTERN));
			} else {
			model.setSubmitDate(doc.get(DossierTerm.SUBMIT_DATE));
			}
//			_log.info("RECEIVE_DATE: "+doc.get(DossierTerm.RECEIVE_DATE));
			if (Validator.isNotNull(doc.get(DossierTerm.RECEIVE_DATE))) {
				Date receiveDate = APIDateTimeUtils.convertStringToDate(doc.get(DossierTerm.RECEIVE_DATE), APIDateTimeUtils._LUCENE_PATTERN);
				model.setReceiveDate(APIDateTimeUtils.convertDateToString(receiveDate, APIDateTimeUtils._NORMAL_PARTTERN));
			} else {
			model.setReceiveDate(doc.get(DossierTerm.RECEIVE_DATE));
			}
			model.setDueDate(doc.get(DossierTerm.DUE_DATE));
			model.setFinishDate(doc.get(DossierTerm.FINISH_DATE));
			model.setCancellingDate(doc.get(DossierTerm.CANCELLING_DATE));
			model.setCorrectingDate(doc.get(DossierTerm.CORRECTING_DATE));
			model.setDossierStatus(doc.get(DossierTerm.DOSSIER_STATUS));
			model.setDossierStatusText(doc.get(DossierTerm.DOSSIER_STATUS_TEXT));
			model.setDossierSubStatus(doc.get(DossierTerm.DOSSIER_SUB_STATUS));
			model.setDossierSubStatusText(doc.get(DossierTerm.DOSSIER_SUB_STATUS_TEXT));
			model.setDossierOverdue(doc.get(DossierTerm.DOSSIER_OVER_DUE));
			model.setSubmitting(doc.get(DossierTerm.SUBMITTING));
			model.setPermission(getPermission(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setLastActionDate(doc.get(DossierTerm.LAST_ACTION_DATE));
			model.setLastActionCode(doc.get(DossierTerm.LAST_ACTION_CODE));
			model.setLastActionName(doc.get(DossierTerm.LAST_ACTION_NAME));
			model.setLastActionUser(doc.get(DossierTerm.LAST_ACTION_USER));
			model.setLastActionNote(doc.get(DossierTerm.LAST_ACTION_NOTE));
			model.setStepCode(doc.get(DossierTerm.STEP_CODE));
			model.setStepName(doc.get(DossierTerm.STEP_NAME));
			model.setStepDuedate(doc.get(DossierTerm.STEP_DUE_DATE));
			model.setStepOverdue(doc.get(DossierTerm.STEP_OVER_DUE));
			model.setVisited(getVisisted(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setPending(getPendding(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setOnline(doc.get(DossierTerm.ONLINE));
			model.setHasPassword(doc.get(DossierTerm.PASSWORD));
			model.setDossierTemplateNo(doc.get(DossierTerm.DOSSIER_TEMPLATE_NO));
			model.setServerNo(doc.get(DossierTerm.SERVER_NO));
			
			model.setViaPostal(doc.get(DossierTerm.VIA_POSTAL));
			model.setPostalAddress(doc.get(DossierTerm.POSTAL_ADDRESS));
			model.setPostalCityCode(doc.get(DossierTerm.POSTAL_CITY_CODE));
			model.setPostalCityName(doc.get(DossierTerm.POSTAL_CITY_NAME));
			model.setPostalTelNo(doc.get(DossierTerm.POSTAL_TEL_NO));
			model.setCertNo(doc.get("so_chung_chi"));
			if (Validator.isNotNull(doc.get("ngay_ky_cc"))) {
				Date certDate = APIDateTimeUtils.convertStringToDate(doc.get("ngay_ky_cc"), APIDateTimeUtils._LUCENE_PATTERN);
				model.setCertDate(APIDateTimeUtils.convertDateToString(certDate, APIDateTimeUtils._NORMAL_DATE));
			} else {
				model.setCertDate(doc.get("ngay_ky_cc"));
			}

			model.setEndorsementDate(doc.get(DossierTerm.ENDORSEMENT_DATE));
			model.setLockState(doc.get(DossierTerm.LOCK_STATE));
			model.setStatusReg(doc.get(DossierTerm.STATUS_REG));

//			int processBlock = 0;
//			int processUnit = 0;
//			try {
//				ServiceConfig serviceConfig = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(GetterUtil.getLong(doc.get(DossierTerm.GROUP_ID)), doc.get(DossierTerm.SERVICE_CODE) ,doc.get(DossierTerm.GOV_AGENCY_CODE));
//				
//				ProcessOption processOption = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(GetterUtil.getLong(doc.get(DossierTerm.GROUP_ID)), doc.get(DossierTerm.DOSSIER_TEMPLATE_NO), serviceConfig.getServiceConfigId());
//				
//				ServiceProcess serviceProcess = ServiceProcessLocalServiceUtil.fetchServiceProcess(processOption.getServiceProcessId());
//				
//				processBlock = serviceProcess.getDurationCount();
//				
//				processUnit = serviceProcess.getDurationUnit();
//				
//			} catch (Exception e) {
//			}
//			model.setProcessBlock(processBlock);
//			model.setProcessUnit(processUnit);

			model.setDurationCount(Double.valueOf(doc.get(DossierTerm.DURATION_COUNT)));
			model.setDurationUnit(Double.valueOf(doc.get(DossierTerm.DURATION_UNIT)));
			model.setSampleCount(Long.valueOf(doc.get(DossierTerm.SAMPLE_COUNT)));

			ouputs.add(model);
		}

		return ouputs;
	}

	//TODO: Process get list Paging
	public static List<DossierDataModel> mappingForGetListPaging(List<Document> docs, int start, int end) {
		List<DossierDataModel> ouputs = new ArrayList<DossierDataModel>();
		int lengthDossier = docs.size();
		int endPage = 0;
		if (lengthDossier < end) {
			endPage = lengthDossier;
		} else {
			endPage = end;
		}
		for (int i = start; i < endPage; i++) {
			Document doc = docs.get(i);
//			_log.info("i: "+i);
			DossierDataModel model = new DossierDataModel();
			
			model.setDossierIdCTN(doc.get(DossierTerm.DOSSIER_ID_CTN));
			model.setDossierId(GetterUtil.getInteger(doc.get(Field.ENTRY_CLASS_PK)));
			model.setGroupId(GetterUtil.getInteger(doc.get(Field.GROUP_ID)));
			model.setCreateDate(doc.get(Field.CREATE_DATE));
			model.setModifiedDate(doc.get(Field.MODIFIED_DATE));
			model.setReferenceUid(doc.get(DossierTerm.REFERENCE_UID));
			model.setCounter(GetterUtil.getInteger(doc.get(DossierTerm.COUNTER)));
			model.setServiceCode(doc.get(DossierTerm.SERVICE_CODE));
			model.setServiceName(doc.get(DossierTerm.SERVICE_NAME));
			model.setGovAgencyCode(doc.get(DossierTerm.GOV_AGENCY_CODE));
			model.setGovAgencyName(doc.get(DossierTerm.GOV_AGENCY_NAME));
			model.setApplicantName(doc.get(DossierTerm.APPLICANT_NAME));
			model.setApplicantNote(doc.get(DossierTerm.APPLICANT_NOTE));
			model.setApplicantIdType(doc.get(DossierTerm.APPLICANT_ID_TYPE));
			model.setApplicantIdNo(doc.get(DossierTerm.APPLICANT_ID_NO));
			model.setApplicantIdDate(doc.get(DossierTerm.APPLICANT_ID_DATE));
			model.setAddress(doc.get(DossierTerm.ADDRESS));
			model.setCityCode(doc.get(DossierTerm.CITY_CODE));
			model.setCityName(doc.get(DossierTerm.CITY_NAME));
			model.setDistrictCode(doc.get(DossierTerm.DISTRICT_CODE));
			model.setDistrictName(doc.get(DossierTerm.DISTRICT_NAME));
			model.setWardCode(doc.get(DossierTerm.WARD_CODE));
			model.setWardName(doc.get(DossierTerm.WARD_NAME));
			model.setContactName(doc.get(DossierTerm.CONTACT_NAME));
			model.setContactTelNo(doc.get(DossierTerm.CONTACT_TEL_NO));
			model.setContactEmail(doc.get(DossierTerm.CONTACT_EMAIL));
			model.setDossierNote(doc.get(DossierTerm.DOSSIER_NOTE));
			model.setSubmissionNote(doc.get(DossierTerm.SUBMISSION_NOTE));
			model.setBriefNote(doc.get(DossierTerm.BRIEF_NOTE));
			model.setDossierNo(doc.get(DossierTerm.DOSSIER_NO));
			model.setBriefNote(doc.get(DossierTerm.BRIEF_NOTE));
//			model.setSubmitDate(doc.get(DossierTerm.SUBMIT_DATE));
//			_log.info("SUBMIT_DATE: "+doc.get(DossierTerm.SUBMIT_DATE));
			if (Validator.isNotNull(doc.get(DossierTerm.SUBMIT_DATE))) {
//				_log.info("SUBMIT_DATE_DATEEEEEE: "+doc.get(DossierTerm.SUBMIT_DATE));
				Date submitDate = APIDateTimeUtils.convertStringToDate(doc.get(DossierTerm.SUBMIT_DATE), APIDateTimeUtils._LUCENE_PATTERN);
//				_log.info("SUBMIT_DATE_DATEEEEEE: "+submitDate);
				model.setSubmitDate(APIDateTimeUtils.convertDateToString(submitDate, APIDateTimeUtils._NORMAL_PARTTERN));
//				_log.info("SUBMIT_DATE_CONVERT: "+APIDateTimeUtils.convertDateToString(submitDate, APIDateTimeUtils._NORMAL_PARTTERN));
			} else {
			model.setSubmitDate(doc.get(DossierTerm.SUBMIT_DATE));
			}
//			_log.info("RECEIVE_DATE: "+doc.get(DossierTerm.RECEIVE_DATE));
			if (Validator.isNotNull(doc.get(DossierTerm.RECEIVE_DATE))) {
				Date receiveDate = APIDateTimeUtils.convertStringToDate(doc.get(DossierTerm.RECEIVE_DATE), APIDateTimeUtils._LUCENE_PATTERN);
				model.setReceiveDate(APIDateTimeUtils.convertDateToString(receiveDate, APIDateTimeUtils._NORMAL_PARTTERN));				
			} else {
			model.setReceiveDate(doc.get(DossierTerm.RECEIVE_DATE));
			}
			model.setDueDate(doc.get(DossierTerm.DUE_DATE));
			model.setFinishDate(doc.get(DossierTerm.FINISH_DATE));
			model.setCancellingDate(doc.get(DossierTerm.CANCELLING_DATE));
			model.setCorrectingDate(doc.get(DossierTerm.CORRECTING_DATE));
			model.setDossierStatus(doc.get(DossierTerm.DOSSIER_STATUS));
			model.setDossierStatusText(doc.get(DossierTerm.DOSSIER_STATUS_TEXT));
			model.setDossierSubStatus(doc.get(DossierTerm.DOSSIER_SUB_STATUS));
			model.setDossierSubStatusText(doc.get(DossierTerm.DOSSIER_SUB_STATUS_TEXT));
			model.setDossierOverdue(doc.get(DossierTerm.DOSSIER_OVER_DUE));
			model.setSubmitting(doc.get(DossierTerm.SUBMITTING));
			model.setPermission(getPermission(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setLastActionDate(doc.get(DossierTerm.LAST_ACTION_DATE));
			model.setLastActionCode(doc.get(DossierTerm.LAST_ACTION_CODE));
			model.setLastActionName(doc.get(DossierTerm.LAST_ACTION_NAME));
			model.setLastActionUser(doc.get(DossierTerm.LAST_ACTION_USER));
			model.setLastActionNote(doc.get(DossierTerm.LAST_ACTION_NOTE));
			model.setStepCode(doc.get(DossierTerm.STEP_CODE));
			model.setStepName(doc.get(DossierTerm.STEP_NAME));
			model.setStepDuedate(doc.get(DossierTerm.STEP_DUE_DATE));
			model.setStepOverdue(doc.get(DossierTerm.STEP_OVER_DUE));
			model.setVisited(getVisisted(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setPending(getPendding(GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK))));
			model.setOnline(doc.get(DossierTerm.ONLINE));
			model.setHasPassword(doc.get(DossierTerm.PASSWORD));
			model.setDossierTemplateNo(doc.get(DossierTerm.DOSSIER_TEMPLATE_NO));
			model.setServerNo(doc.get(DossierTerm.SERVER_NO));
			
			model.setViaPostal(doc.get(DossierTerm.VIA_POSTAL));
			model.setPostalAddress(doc.get(DossierTerm.POSTAL_ADDRESS));
			model.setPostalCityCode(doc.get(DossierTerm.POSTAL_CITY_CODE));
			model.setPostalCityName(doc.get(DossierTerm.POSTAL_CITY_NAME));
			model.setPostalTelNo(doc.get(DossierTerm.POSTAL_TEL_NO));
			
			String certNo = doc.get("so_chung_chi");
			String certDate = doc.get("ngay_ky_cc");
			if (Validator.isNotNull(certNo) && Validator.isNotNull(certDate)) {
				Date tempDate = APIDateTimeUtils.convertStringToDate(certDate, APIDateTimeUtils._LUCENE_PATTERN);
				model.setCertDate(APIDateTimeUtils.convertDateToString(tempDate, APIDateTimeUtils._NORMAL_DATE));
				model.setCertNo(doc.get("so_chung_chi"));
			}

			model.setEndorsementDate(doc.get(DossierTerm.ENDORSEMENT_DATE));
			model.setLockState(doc.get(DossierTerm.LOCK_STATE));
			model.setStatusReg(doc.get(DossierTerm.STATUS_REG));
//			model.setDelegateAddress(DossierTerm.getDelegateAddress());
//			model.setDelegateCityCode(DossierTerm.getDelegateCityCode());
//			model.setDelegateCityName(DossierTerm.getDelegateCityName());
//			model.setDelegateDistrictCode(DossierTerm.getDelegateDistrictCode());
//			model.setDelegateDistrictName(DossierTerm.getDelegateDistrictName());
//			model.setDelegateEmail(DossierTerm.getDelegateEmail());
//			model.setDelegateIdNo(DossierTerm.getDelegateIdNo());
//			model.setDelegateName(DossierTerm.getDelegateName());
//			model.setDelegateTelNo(DossierTerm.getDelegateTelNo());
//			model.setDelegateWardCode(DossierTerm.getDelegateWardCode());
//			model.setDelegateWardName(DossierTerm.getDelegateWardName());
			model.setDurationCount(Double.valueOf(doc.get(DossierTerm.DURATION_COUNT)));
			model.setDurationUnit(Double.valueOf(doc.get(DossierTerm.DURATION_UNIT)));
			model.setSampleCount(Long.valueOf(doc.get(DossierTerm.SAMPLE_COUNT)));

			ouputs.add(model);
		}
//		_log.info("ouputs: "+ouputs.size());
		return ouputs;
	}

	static Log _log = LogFactoryUtil.getLog(DossierUtils.class);

	public static DossierDetailModel mappingForGetDetail(Dossier input, long userId) {

		DossierDetailModel model = new DossierDetailModel();
		
		try {
			Document dossierDoc = DossierLocalServiceUtil.getDossierById(input.getDossierId(), input.getCompanyId());
			model.setDossierIdCTN(dossierDoc.get(DossierTerm.DOSSIER_ID_CTN));
		} catch (Exception e) {
			model.setDossierIdCTN(StringPool.BLANK);
		}
		

		model.setDossierId(GetterUtil.getInteger(input.getDossierId()));
		model.setUserId(GetterUtil.getInteger(input.getUserId()));
		model.setCreateDate(
				APIDateTimeUtils.convertDateToString(input.getCreateDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setModifiedDate(
				APIDateTimeUtils.convertDateToString(input.getModifiedDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setReferenceUid(input.getReferenceUid());
		model.setCounter(input.getCounter());
		model.setServiceCode(input.getServiceCode());
		model.setServiceName(input.getServiceName());
		model.setGovAgencyCode(input.getGovAgencyCode());
		model.setGovAgencyName(input.getGovAgencyName());
		model.setDossierTemplateNo(input.getDossierTemplateNo());
		model.setApplicantName(input.getApplicantName());
		model.setApplicantIdType(input.getApplicantIdType());
		model.setApplicantIdNo(input.getApplicantIdNo());
		model.setApplicantIdDate(
				APIDateTimeUtils.convertDateToString(input.getApplicantIdDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setAddress(input.getAddress());
		model.setCityCode(input.getCityCode());
		model.setCityName(input.getCityName());
		model.setDistrictCode(input.getDistrictCode());
		model.setDistrictName(input.getDistrictName());
		model.setWardCode(input.getWardCode());
		model.setWardName(input.getWardName());
		model.setContactName(input.getContactName());
		model.setContactTelNo(input.getContactTelNo());
		model.setContactEmail(input.getContactEmail());
		model.setDossierNote(input.getDossierNote());
		model.setSubmissionNote(input.getSubmissionNote());
		model.setBriefNote(input.getBriefNote());
		model.setDossierNo(input.getDossierNo());
		model.setSubmitting(Boolean.toString(input.getSubmitting()));
		model.setSubmitDate(
				APIDateTimeUtils.convertDateToString(input.getSubmitDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setReceiveDate(
				APIDateTimeUtils.convertDateToString(input.getReceiveDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setDueDate(APIDateTimeUtils.convertDateToString(input.getDueDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setReleaseDate(
				APIDateTimeUtils.convertDateToString(input.getReleaseDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setFinishDate(
				APIDateTimeUtils.convertDateToString(input.getFinishDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setCancellingDate(
				APIDateTimeUtils.convertDateToString(input.getCancellingDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setCorrectingDate(
				APIDateTimeUtils.convertDateToString(input.getCorrecttingDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setDossierStatus(input.getDossierStatus());
		model.setDossierStatusText(input.getDossierStatusText());
		model.setDossierSubStatus(input.getDossierSubStatus());
		model.setDossierSubStatusText(input.getDossierSubStatusText());
		model.setViaPostal(Integer.toString(input.getViaPostal()));
		model.setPostalAddress(input.getPostalAddress());
		model.setPostalCityCode(input.getPostalCityCode());
		model.setPostalCityName(input.getPostalCityName());
		model.setPostalTelNo(input.getPostalTelNo());
		model.setPermission(getPermission(input.getPrimaryKey()));

		if (input.getDossierActionId() != 0) {
			DossierAction dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(input.getDossierActionId());

			model.setLastActionDate(APIDateTimeUtils.convertDateToString(dossierAction.getCreateDate(),
					APIDateTimeUtils._NORMAL_PARTTERN));
			model.setLastActionName(dossierAction.getActionName());
			model.setLastActionUser(dossierAction.getActionUser());
			model.setLastActionNote(dossierAction.getActionNote());
			model.setLastActionCode(dossierAction.getActionCode());

			model.setStepCode(dossierAction.getStepCode());
			model.setStepName(dossierAction.getStepName());

			Date stepDuedate = DossierOverDueUtils.getStepOverDue(dossierAction.getActionOverdue(), new Date());

			if (dossierAction.getActionOverdue() != 0) {
				model.setStepOverdue(StringPool.TRUE);
			} else {
				model.setStepOverdue(StringPool.TRUE);
			}

			model.setStepDuedate(APIDateTimeUtils.convertDateToString(stepDuedate, APIDateTimeUtils._NORMAL_PARTTERN));

			ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(dossierAction.getStepCode(),
					dossierAction.getGroupId(), dossierAction.getServiceProcessId());

			model.setStepInstruction(step.getStepInstruction());

			// Check permission process dossier
			DictCollection dictCollection = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode("DOSSIER_STATUS",
					input.getGroupId());
			String statusCode = input.getDossierStatus();
			String subStatusCode = input.getDossierSubStatus();
			if (Validator.isNotNull(statusCode) || Validator.isNotNull(subStatusCode)) {
				DictItem dictItem = null;
				if (Validator.isNotNull(subStatusCode)) {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(subStatusCode,
							dictCollection.getDictCollectionId(), input.getGroupId());
				} else {
					dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(statusCode,
							dictCollection.getDictCollectionId(), input.getGroupId());
				}
				if (dictItem != null) {
					_log.info("53");
					String metaData = dictItem.getMetaData();
					String specialStatus = StringPool.BLANK;
					if (Validator.isNotNull(metaData)) {
						_log.info("metaData: " +metaData);
						try {
							JSONObject metaJson = JSONFactoryUtil.createJSONObject(metaData);
							specialStatus = metaJson.getString("specialStatus");
							_log.info("specialStatus: " +specialStatus);
							
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					if (Validator.isNotNull(specialStatus) && Boolean.parseBoolean(specialStatus)) {
			DossierActionUser dau = DossierActionUserLocalServiceUtil.getByDossierAndUser(input.getDossierActionId(), userId);
			if (dau != null) {
				model.setSpecialNo(dau.getModerator());
			} else {
				model.setSpecialNo(0);
			}
					} else {
						model.setSpecialNo(1);
					}
				}
			}
		}

		model.setVisited(getVisisted(input.getPrimaryKey()));
		model.setPending(getPendding(input.getPrimaryKey()));
		model.setApplicantNote(input.getApplicantNote());
		model.setNotification(Boolean.toString(input.getNotification()));
		model.setOnline(Boolean.toString(input.getOnline()));
		model.setLockState(input.getLockState());
		model.setDelegateAddress(input.getDelegateAddress());
		model.setDelegateCityCode(input.getDelegateCityCode());
		model.setDelegateCityName(input.getDelegateCityName());
		model.setDelegateDistrictCode(input.getDelegateDistrictCode());
		model.setDelegateDistrictName(input.getDelegateDistrictName());
		model.setDelegateEmail(input.getDelegateEmail());
		model.setDelegateIdNo(input.getDelegateIdNo());
		model.setDelegateName(input.getDelegateName());
		model.setDelegateTelNo(input.getDelegateTelNo());
		model.setDelegateWardCode(input.getDelegateWardCode());
		model.setDelegateWardName(input.getDelegateWardName());
		model.setDurationCount(input.getDurationCount());
		model.setDurationUnit(input.getDurationUnit());
		model.setSampleCount(input.getSampleCount());

//		try {
//			long groupId = input.getGroupId();
//			ServiceConfig serviceConfig = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, input.getServiceCode(), input.getGovAgencyCode());
//			ProcessOption processOption = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId,input.getDossierTemplateNo(), serviceConfig.getServiceConfigId());
//			ServiceProcess serviceProcess = ServiceProcessLocalServiceUtil.fetchServiceProcess(processOption.getServiceProcessId());
//
//			double durationCount = serviceProcess.getDurationCount();
//			double durationUnit = serviceProcess.getDurationUnit();
//			model.setDurationCount(durationCount);
//			model.setDurationUnit(durationUnit);
//		} catch (Exception e) {
//			model.setDurationCount(0d);
//			model.setDurationUnit(0d);
//		}

		return model;
	}

	public static DossierDetailModel mappingForGetDetailSearch(Dossier input) {

		DossierDetailModel model = new DossierDetailModel();
		
		try {
			Document dossierDoc = DossierLocalServiceUtil.getDossierById(input.getDossierId(), input.getCompanyId());
			model.setDossierIdCTN(dossierDoc.get(DossierTerm.DOSSIER_ID+"CTN"));
		} catch (Exception e) {
			model.setDossierIdCTN("");
		}
		

		model.setUserName(input.getUserName());
		model.setGovAgencyName(input.getGovAgencyName());
		model.setDossierNo(input.getDossierNo());
		model.setSubmitDate(
				APIDateTimeUtils.convertDateToString(input.getSubmitDate(), APIDateTimeUtils._NORMAL_PARTTERN));
		model.setDueDate(APIDateTimeUtils.convertDateToString(input.getDueDate(), APIDateTimeUtils._NORMAL_PARTTERN));

		return model;
	}

	private static String getPermission(long dossierId) {
		// TODO add logic here
		// return list of permission, separate by the comma
		return StringPool.BLANK;
	}

	private static String getVisisted(long dossierId) {
		// TODO add logic here
		// return true or false in String type
		return StringPool.FALSE;
	}

	private static String getPendding(long dossierId) {
		// TODO add logic here
		// return true or false in String type
		return StringPool.FALSE;
	}

	private static String getApplicationNote(long dossierId) {
		// TODO add logic here
		// return true or false in String type
		return StringPool.BLANK;
	}

	//LamTV: Process get dossier follow dossierId and groupId
	public static Dossier getDossier(String id, long groupId) {
		long dossierId = GetterUtil.getLong(id);
		if (dossierId > 0) {
			return DossierLocalServiceUtil.fetchDossier(dossierId);
		} else {
			return DossierLocalServiceUtil.getByRef(groupId, id);
		}
	}

	//LamTV: Process get process option
	public static ProcessOption getProcessOption(String serviceInfoCode, String govAgencyCode, String dossierTemplateNo,
			long groupId) throws PortalException {

		ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, serviceInfoCode, govAgencyCode);
		if (config != null) {
			return ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId, dossierTemplateNo,
					config.getServiceConfigId());
		} else {
			return null;
		}
	}

	//LamTV: Process get process action
	public static ProcessAction getProcessAction(long groupId, Dossier dossier, String actionCode,
			long serviceProcessId) throws PortalException {

		_log.info("GET PROCESS ACTION____");
		ProcessAction action = null;

		try {
			List<ProcessAction> actions = ProcessActionLocalServiceUtil.getByActionCode(groupId, actionCode,
					serviceProcessId);

			String dossierStatus = dossier.getDossierStatus();
			String dossierSubStatus = dossier.getDossierSubStatus();
			String preStepCode = StringPool.BLANK;
			for (ProcessAction act : actions) {

				preStepCode = act.getPreStepCode();
				_log.info("LamTV_preStepCode: "+preStepCode);

				ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(preStepCode, groupId, serviceProcessId);
				_log.info("LamTV_ProcessStep: "+step);

				if (Validator.isNull(step)) {
					action = act;
					break;
				} else {
					String stepStatus = step.getDossierStatus();
					String stepSubStatus = step.getDossierSubStatus();
					if (stepStatus.contentEquals(dossierStatus)
							&& StringUtil.containsIgnoreCase(stepSubStatus, dossierSubStatus)) {
						action = act;
						break;
					}
				}
			}
		} catch (Exception e) {
			_log.info("NOT PROCESS ACTION");
			_log.info(e);
		}

		return action;
	}
	
	public static void createDossierUsers(long groupId, Dossier dossier, ServiceProcess process, List<ServiceProcessRole> lstProcessRoles) {
		for (ServiceProcessRole spr : lstProcessRoles) {
			long roleId = spr.getRoleId();
			int moderator = spr.getModerator() ? 1 : 0;
			JobPos jp = JobPosLocalServiceUtil.fetchByF_mappingRoleId(groupId, roleId);
			
			if (jp != null) {
				List<EmployeeJobPos> lstEJPs = EmployeeJobPosLocalServiceUtil.getByJobPostId(groupId, jp.getJobPosId());
				List<Employee> lstEmployees = new ArrayList<>();
				for (EmployeeJobPos ejp : lstEJPs) {
					Employee employee = EmployeeLocalServiceUtil.fetchEmployee(ejp.getEmployeeId());
					lstEmployees.add(employee);					
				}
				
				for (Employee e : lstEmployees) {
					DossierUserPK pk = new DossierUserPK();
					pk.setDossierId(dossier.getDossierId());
					pk.setUserId(e.getMappingUserId());
					DossierUser ds = DossierUserLocalServiceUtil.fetchDossierUser(pk);
					if (ds == null) {
						DossierUserLocalServiceUtil.addDossierUser(groupId, dossier.getDossierId(), e.getMappingUserId(), moderator, Boolean.FALSE);						
					}
					else {
						if (moderator == 1 && ds.getModerator() == 0) {
							ds.setModerator(1);
							DossierUserLocalServiceUtil.updateDossierUser(ds);
						}
					}
				}
			}
		}
	}
}
