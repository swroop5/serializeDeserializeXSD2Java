//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Type.VAG.Familie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VAG.Familie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="familienart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Ehepaar"/>
 *               &lt;enumeration value="Lebenspartner"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ehezeit" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VAG.Familie", propOrder = {
    "familienart",
    "ehezeit"
})
public class TypeVAGFamilie {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String familienart;
    @XmlElement(required = true)
    protected TypeGDSXdomeaZeitraumType ehezeit;

    /**
     * Gets the value of the familienart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilienart() {
        return familienart;
    }

    /**
     * Sets the value of the familienart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilienart(String value) {
        this.familienart = value;
    }

    /**
     * Gets the value of the ehezeit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public TypeGDSXdomeaZeitraumType getEhezeit() {
        return ehezeit;
    }

    /**
     * Sets the value of the ehezeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public void setEhezeit(TypeGDSXdomeaZeitraumType value) {
        this.ehezeit = value;
    }

}
