//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.14 at 04:26:08 PM ICT 
//


package org.opencps.api.statistic.model;

import java.math.BigInteger;

import javax.ws.rs.QueryParam;
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
 *         &lt;element name="dossierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierSubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    "dossierStatus",
    "dossierSubStatus",
    "level",
    "notStatusReg",
    "step",
    "top",
    "agency"
})
@XmlRootElement(name = "StatisticDossierSearchModel")
public class StatisticDossierSearchModel {

	@QueryParam(value = "dossierStatus")
    protected String dossierStatus;
	@QueryParam(value = "dossierSubStatus")
    protected String dossierSubStatus;
	@QueryParam(value = "level")
    protected BigInteger level;
	@QueryParam(value = "notStatusReg")
    protected Long notStatusReg;
	@QueryParam(value = "step")
    protected String step;
	@QueryParam(value = "top")
    protected String top;
	@QueryParam(value = "agency")
    protected String agency;

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
     * Gets the value of the dossierStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierStatus() {
        return dossierStatus;
    }

    /**
     * Sets the value of the dossierStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierStatus(String value) {
        this.dossierStatus = value;
    }

    /**
     * Gets the value of the dossierSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierSubStatus() {
        return dossierSubStatus;
    }

    /**
     * Sets the value of the dossierSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierSubStatus(String value) {
        this.dossierSubStatus = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the statusReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public Long getNotStatusReg() {
		return notStatusReg;
	}

    /**
     * Sets the value of the statusReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setNotStatusReg(Long notStatusReg) {
		this.notStatusReg = notStatusReg;
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

}
