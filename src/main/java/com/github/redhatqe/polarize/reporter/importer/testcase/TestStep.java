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
 *         &lt;element ref="{}test-step-column" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testStepColumn"
})
@XmlRootElement(name = "test-step")
public class TestStep {

    @XmlElement(name = "test-step-column", required = true)
    protected List<TestStepColumn> testStepColumn;

    /**
     * Gets the value of the testStepColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testStepColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestStepColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestStepColumn }
     * 
     * 
     */
    public List<TestStepColumn> getTestStepColumn() {
        if (testStepColumn == null) {
            testStepColumn = new ArrayList<TestStepColumn>();
        }
        return this.testStepColumn;
    }

}
