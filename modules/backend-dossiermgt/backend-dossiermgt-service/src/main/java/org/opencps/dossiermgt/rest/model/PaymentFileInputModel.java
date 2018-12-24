//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 10:11:20 PM ICT 
//


package org.opencps.dossiermgt.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="referenceUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="epaymentProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invoiceTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="confirmFileEntryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="einvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advanceAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shipAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "referenceUid",
    "govAgencyCode",
    "govAgencyName",
    "applicantName",
    "applicantIdNo",
    "paymentFee",
    "paymentAmount",
    "paymentNote",
    "epaymentProfile",
    "bankInfo",
    "feeAmount",
    "invoiceTemplateNo",
    "paymentStatus",
    "confirmFileEntryId",
    "einvoice",
    "advanceAmount",
    "shipAmount",
    "serviceAmount",
    "paymentMethod"
})
@XmlRootElement(name = "PaymentFileInputModel")
public class PaymentFileInputModel {

    protected String referenceUid;
    protected String govAgencyCode;
    protected String govAgencyName;
    protected String applicantName;
    protected String applicantIdNo;
    protected String paymentFee;
    protected Long paymentAmount;
    protected String paymentNote;
    protected String epaymentProfile;
    protected String bankInfo;
    protected Long feeAmount;
    protected String invoiceTemplateNo;
    protected Integer paymentStatus;
    protected Long confirmFileEntryId;
    protected String einvoice;
    protected Long advanceAmount;
    protected Long shipAmount;
    protected Long serviceAmount;
    protected String paymentMethod;

    /**
     * Gets the value of the referenceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceUid() {
        return referenceUid;
    }

    /**
     * Sets the value of the referenceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceUid(String value) {
        this.referenceUid = value;
    }

    /**
     * Gets the value of the govAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyCode() {
        return govAgencyCode;
    }

    /**
     * Sets the value of the govAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyCode(String value) {
        this.govAgencyCode = value;
    }

    /**
     * Gets the value of the govAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyName() {
        return govAgencyName;
    }

    /**
     * Sets the value of the govAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyName(String value) {
        this.govAgencyName = value;
    }

    /**
     * Gets the value of the applicantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantName() {
        return applicantName;
    }

    /**
     * Sets the value of the applicantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantName(String value) {
        this.applicantName = value;
    }

    /**
     * Gets the value of the applicantIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantIdNo() {
        return applicantIdNo;
    }

    /**
     * Sets the value of the applicantIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantIdNo(String value) {
        this.applicantIdNo = value;
    }

    /**
     * Gets the value of the paymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFee() {
        return paymentFee;
    }

    /**
     * Sets the value of the paymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFee(String value) {
        this.paymentFee = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentAmount(Long value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNote() {
        return paymentNote;
    }

    /**
     * Sets the value of the paymentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNote(String value) {
        this.paymentNote = value;
    }

    /**
     * Gets the value of the epaymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpaymentProfile() {
        return epaymentProfile;
    }

    /**
     * Sets the value of the epaymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpaymentProfile(String value) {
        this.epaymentProfile = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankInfo(String value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeAmount(Long value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the invoiceTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTemplateNo() {
        return invoiceTemplateNo;
    }

    /**
     * Sets the value of the invoiceTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTemplateNo(String value) {
        this.invoiceTemplateNo = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentStatus(Integer value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the confirmFileEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfirmFileEntryId() {
        return confirmFileEntryId;
    }

    /**
     * Sets the value of the confirmFileEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfirmFileEntryId(Long value) {
        this.confirmFileEntryId = value;
    }

    /**
     * Gets the value of the einvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEinvoice() {
        return einvoice;
    }

    /**
     * Sets the value of the einvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEinvoice(String value) {
        this.einvoice = value;
    }

    /**
     * Gets the value of the advanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Sets the value of the advanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvanceAmount(Long value) {
        this.advanceAmount = value;
    }

    /**
     * Gets the value of the shipAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipAmount() {
        return shipAmount;
    }

    /**
     * Sets the value of the shipAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipAmount(Long value) {
        this.shipAmount = value;
    }

    /**
     * Gets the value of the serviceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceAmount() {
        return serviceAmount;
    }

    /**
     * Sets the value of the serviceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceAmount(Long value) {
        this.serviceAmount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

}
