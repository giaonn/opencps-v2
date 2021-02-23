//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.24 at 11:31:01 AM ICT 
//


package org.opencps.api.dossier.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
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
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "actionCode",
    "actionUser",
    "actionNote",
    "payload",
    "assignUsers",
    "security",
    "payment",
    "createDossiers",
    "dossierIds",
    "receiveDate",
    "checkRequried"
})
@XmlRootElement(name = "DoActionModel")
public class DoActionModel {
	@FormParam(value="actionCode")
    protected String actionCode;
	@FormParam(value="actionUser")
    protected String actionUser;
	@FormParam(value="actionNote")
    protected String actionNote;
	@FormParam(value="payload")
    protected String payload;
	@FormParam(value="assignUsers")
	protected String assignUsers;
	@FormParam(value = "security")
	protected String security;
	@FormParam(value = "payment")
	protected String payment;
	@FormParam(value = "createDossiers")
	protected String createDossiers;
    @FormParam(value = "dossierIds")
    protected String dossierIds;
    @FormParam(value = "receiveDate")
    protected Long receiveDate;
    @FormParam(value = "checkRequried")
    protected String checkRequried;

    public String getCheckRequried() {
        return checkRequried;
    }

    public void setCheckRequried(String checkRequried) {
        this.checkRequried = checkRequried;
    }

    public Long getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Long receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getDossierIds() {
        return dossierIds;
    }

    public void setDossierIds(String dossierIds) {
        this.dossierIds = dossierIds;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUser() {
        return actionUser;
    }

    /**
     * Sets the value of the actionUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUser(String value) {
        this.actionUser = value;
    }

    /**
     * Gets the value of the actionNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionNote() {
        return actionNote;
    }

    /**
     * Sets the value of the actionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionNote(String value) {
        this.actionNote = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
    }

    /**
     * Gets the value of the assignUsers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignUsers() {
        return assignUsers;
    }

    /**
     * Sets the value of the assignUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignUsers(String value) {
        this.assignUsers = value;
    }

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getCreateDossiers() {
		return createDossiers;
	}

	public void setCreateDossiers(String createDossiers) {
		this.createDossiers = createDossiers;
	}

}
