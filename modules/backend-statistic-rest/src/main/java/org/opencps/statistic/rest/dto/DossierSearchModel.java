//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.10.23 at 09:44:18 AM ICT 
//

package org.opencps.statistic.rest.dto;

import com.liferay.petra.string.StringPool;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"keyword", "start", "end", "sort", "order", "status", "substatus", "agency", "service", "template", "year",
		"month", "owner", "follow", "step", "top", "dossierNo", "fromReceiveDate", "toReceiveDate", "fromSubmitDate",
		"toSubmitDate", "online", "domain", "domainName", "applicantName", "applicantIdNo", "serviceName",
		"fromReleaseDate", "toReleaseDate", "originality", "fromFinishDate", "toFinishDate", "fromReceiveNotDoneDate",
		"toReceiveNotDoneDate", "fromStatisticDate", "toStatisticDate", "origin", "originDossierId", "time",
		"groupAgencyCode", "reporting", "reCalculate", "system", "groupCode", "parentAgency"})
@XmlRootElement(name = "DossierSearchModel")
public class DossierSearchModel {

	@QueryParam(value = "keyword")
	protected String keyword;
	@QueryParam(value = "start")
	protected int start;
	@QueryParam(value = "end")
	protected int end;
	@QueryParam(value = "sort")
	protected String sort;
	@QueryParam(value = "order")
	protected String order;
	@QueryParam(value = "status")
	protected String status;
	@QueryParam(value = "substatus")
	protected String substatus;
	@QueryParam(value = "agency")
	protected String agency;
	@QueryParam(value = "service")
	protected String service;
	@QueryParam(value = "template")
	protected String template;
	@QueryParam(value = "year")
	protected int year;
	@QueryParam(value = "month")
	@DefaultValue("-1")
	protected int month;
	@QueryParam(value = "owner")
	protected String owner;
	@QueryParam(value = "follow")
	protected String follow;
	@QueryParam(value = "step")
	protected String step;
	@QueryParam(value = "top")
	protected String top;
	@QueryParam(value = "dossierNo")
	protected String dossierNo;
	@QueryParam(value = "fromReceiveDate")
	protected String fromReceiveDate;
	@QueryParam(value = "toReceiveDate")
	protected String toReceiveDate;
	@QueryParam(value = "fromSubmitDate")
	protected String fromSubmitDate;
	@QueryParam(value = "toSubmitDate")
	protected String toSubmitDate;
	@QueryParam(value = "applicantIdNo")
	protected String applicantIdNo;
	@QueryParam(value = "online")
	protected String online;
	@QueryParam(value = "domain")
	protected String domain;
	@QueryParam(value = "domainName")
	protected String domainName;
	@QueryParam(value = "applicantName")
	protected String applicantName;
	@QueryParam(value = "serviceName")
	protected String serviceName;
	@QueryParam(value = "fromReleaseDate")
	protected String fromReleaseDate;
	@QueryParam(value = "toReleaseDate")
	protected String toReleaseDate;
	@QueryParam(value = "originality")
	protected String originality;
	@QueryParam(value = "fromFinishDate")
	protected String fromFinishDate;
	@QueryParam(value = "toFinishDate")
	protected String toFinishDate;
	@QueryParam(value = "fromReceiveNotDoneDate")
	protected String fromReceiveNotDoneDate;
	@QueryParam(value = "toReceiveNotDoneDate")
	protected String toReceiveNotDoneDate;
	@QueryParam(value = "paymentStatus")
	protected String paymentStatus;
	@QueryParam(value = "fromStatisticDate")
	@DefaultValue(StringPool.BLANK)
	protected String fromStatisticDate;
	@QueryParam(value = "toStatisticDate")
	@DefaultValue(StringPool.BLANK)
	protected String toStatisticDate;
	@QueryParam(value = "origin")
	protected String origin;
	@QueryParam(value = "originDossierId")
	protected Integer originDossierId;
	@QueryParam(value = "time")
	protected String time;
	@QueryParam(value = "groupAgencyCode")
	protected String groupAgencyCode;
	@QueryParam(value = "reporting")
	protected boolean reporting;
	@QueryParam(value = "reCalculate")
	protected Integer reCalculate;
	@QueryParam(value = "system")
	protected String system;
	@QueryParam(value = "groupCode")
	protected String groupCode;
	@QueryParam(value = "parentAgency")
	protected String parentAgency;
	
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getParentAgency() {
		return parentAgency;
	}
	public void setParentAgency(String parentAgency) {
		this.parentAgency = parentAgency;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubstatus() {
		return substatus;
	}
	public void setSubstatus(String substatus) {
		this.substatus = substatus;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getFollow() {
		return follow;
	}
	public void setFollow(String follow) {
		this.follow = follow;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getDossierNo() {
		return dossierNo;
	}
	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
	}
	public String getFromReceiveDate() {
		return fromReceiveDate;
	}
	public void setFromReceiveDate(String fromReceiveDate) {
		this.fromReceiveDate = fromReceiveDate;
	}
	public String getToReceiveDate() {
		return toReceiveDate;
	}
	public void setToReceiveDate(String toReceiveDate) {
		this.toReceiveDate = toReceiveDate;
	}
	public String getFromSubmitDate() {
		return fromSubmitDate;
	}
	public void setFromSubmitDate(String fromSubmitDate) {
		this.fromSubmitDate = fromSubmitDate;
	}
	public String getToSubmitDate() {
		return toSubmitDate;
	}
	public void setToSubmitDate(String toSubmitDate) {
		this.toSubmitDate = toSubmitDate;
	}
	public String getApplicantIdNo() {
		return applicantIdNo;
	}
	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getFromReleaseDate() {
		return fromReleaseDate;
	}
	public void setFromReleaseDate(String fromReleaseDate) {
		this.fromReleaseDate = fromReleaseDate;
	}
	public String getToReleaseDate() {
		return toReleaseDate;
	}
	public void setToReleaseDate(String toReleaseDate) {
		this.toReleaseDate = toReleaseDate;
	}
	public String getOriginality() {
		return originality;
	}
	public void setOriginality(String originality) {
		this.originality = originality;
	}
	public String getFromFinishDate() {
		return fromFinishDate;
	}
	public void setFromFinishDate(String fromFinishDate) {
		this.fromFinishDate = fromFinishDate;
	}
	public String getToFinishDate() {
		return toFinishDate;
	}
	public void setToFinishDate(String toFinishDate) {
		this.toFinishDate = toFinishDate;
	}
	public String getFromReceiveNotDoneDate() {
		return fromReceiveNotDoneDate;
	}
	public void setFromReceiveNotDoneDate(String fromReceiveNotDoneDate) {
		this.fromReceiveNotDoneDate = fromReceiveNotDoneDate;
	}
	public String getToReceiveNotDoneDate() {
		return toReceiveNotDoneDate;
	}
	public void setToReceiveNotDoneDate(String toReceiveNotDoneDate) {
		this.toReceiveNotDoneDate = toReceiveNotDoneDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getFromStatisticDate() {
		return fromStatisticDate;
	}
	public void setFromStatisticDate(String fromStatisticDate) {
		this.fromStatisticDate = fromStatisticDate;
	}
	public String getToStatisticDate() {
		return toStatisticDate;
	}
	public void setToStatisticDate(String toStatisticDate) {
		this.toStatisticDate = toStatisticDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Integer getOriginDossierId() {
		return originDossierId;
	}
	public void setOriginDossierId(Integer originDossierId) {
		this.originDossierId = originDossierId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGroupAgencyCode() {
		return groupAgencyCode;
	}
	public void setGroupAgencyCode(String groupAgencyCode) {
		this.groupAgencyCode = groupAgencyCode;
	}
	public boolean getReporting() {
		return reporting;
	}
	public void setReporting(boolean reporting) {
		this.reporting = reporting;
	}
	public Integer getReCalculate() {
		return reCalculate;
	}
	public void setReCalculate(Integer reCalculate) {
		this.reCalculate = reCalculate;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}

}
