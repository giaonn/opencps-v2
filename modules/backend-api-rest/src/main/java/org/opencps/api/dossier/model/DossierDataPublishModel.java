//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.10.23 at 09:44:18 AM ICT 
//


package org.opencps.api.dossier.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
* <p>Java class for anonymous complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="dossierIdCTN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="referenceUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="certNumber" type="{}CertNumberModel" maxOccurs="unbounded" minOccurs="0"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	 "dossierNo",
	 "serviceCode",
	 "serviceName",
	 "applicantName",
	 "applicantIdNo",
	 "receiveDate",
	 "dueDate",
	 "releaseDate",
	 "dossierStatus",
	 "dossierStatusText",
	 "dossierSubStatus",
	 "dossierSubStatusText",
})
public class DossierDataPublishModel {

	protected String dossierNo;
	protected String serviceCode;
	protected String serviceName;
	protected String applicantName;
	protected String applicantIdNo;
	protected String receiveDate;
	protected String dueDate;
	protected String releaseDate;
	protected String dossierStatus;
	protected String dossierStatusText;
	protected String dossierSubStatus;
	protected String dossierSubStatusText;
	public String getDossierNo() {
		return dossierNo;
	}
	public void setDossierNo(String dossierNo) {
		this.dossierNo = dossierNo;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantIdNo() {
		return applicantIdNo;
	}
	public void setApplicantIdNo(String applicantIdNo) {
		this.applicantIdNo = applicantIdNo;
	}
	public String getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDossierStatus() {
		return dossierStatus;
	}
	public void setDossierStatus(String dossierStatus) {
		this.dossierStatus = dossierStatus;
	}
	public String getDossierStatusText() {
		return dossierStatusText;
	}
	public void setDossierStatusText(String dossierStatusText) {
		this.dossierStatusText = dossierStatusText;
	}
	public String getDossierSubStatus() {
		return dossierSubStatus;
	}
	public void setDossierSubStatus(String dossierSubStatus) {
		this.dossierSubStatus = dossierSubStatus;
	}
	public String getDossierSubStatusText() {
		return dossierSubStatusText;
	}
	public void setDossierSubStatusText(String dossierSubStatusText) {
		this.dossierSubStatusText = dossierSubStatusText;
	}

}
