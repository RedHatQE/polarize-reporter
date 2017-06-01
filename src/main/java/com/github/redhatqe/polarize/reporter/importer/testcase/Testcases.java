//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.10 at 12:24:17 PM EST 
//


package com.github.redhatqe.polarize.reporter.importer.testcase;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}response-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{}properties" minOccurs="0"/&gt;
 *         &lt;element ref="{}testcase" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="project-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="document-relative-path" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseProperties",
    "properties",
    "testcase"
})
@XmlRootElement(name = "testcases")
public class Testcases {

    @XmlElement(name = "response-properties")
    protected ResponseProperties responseProperties;
    protected Properties properties;
    @XmlElement(required = true)
    protected List<Testcase> testcase;
    @XmlAttribute(name = "project-id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String projectId;
    @XmlAttribute(name = "document-relative-path")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentRelativePath;

    /**
     * Gets the value of the responseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseProperties }
     *     
     */
    public ResponseProperties getResponseProperties() {
        return responseProperties;
    }

    /**
     * Sets the value of the responseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProperties }
     *     
     */
    public void setResponseProperties(ResponseProperties value) {
        this.responseProperties = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the testcase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testcase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestcase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testcase }
     * 
     * 
     */
    public List<Testcase> getTestcase() {
        if (testcase == null) {
            testcase = new ArrayList<Testcase>();
        }
        return this.testcase;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the documentRelativePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentRelativePath() {
        return documentRelativePath;
    }

    /**
     * Sets the value of the documentRelativePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentRelativePath(String value) {
        this.documentRelativePath = value;
    }

}
