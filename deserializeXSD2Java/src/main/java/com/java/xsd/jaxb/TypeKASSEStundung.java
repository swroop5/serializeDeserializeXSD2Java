//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Die Stundung ist eine Zahlungserleichterung. Sie bringt den Anspruch der Forderung nicht zum Erl�schen. Durch die Bewilligung einer Stundung wird die F�lligkeit eines Anspruchs in voller H�he oder in Teilbetr�gen hinausgeschoben. (Prozesskostenhilfe f�llt nicht unter den Datentyp.)
 * 
 * <p>Java class for Type.KASSE.Stundung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Stundung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginndatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="enddatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hinweise.stundung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="zahlungsbestimmung" type="{http://www.xjustiz.de}Type.KASSE.Zahlungsbestimmungen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Stundung", propOrder = {
    "beginndatum",
    "enddatum",
    "hinweiseStundung",
    "zahlungsbestimmung"
})
public class TypeKASSEStundung {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginndatum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddatum;
    @XmlElement(name = "hinweise.stundung")
    protected String hinweiseStundung;
    protected List<TypeKASSEZahlungsbestimmungen> zahlungsbestimmung;

    /**
     * Gets the value of the beginndatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginndatum() {
        return beginndatum;
    }

    /**
     * Sets the value of the beginndatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginndatum(XMLGregorianCalendar value) {
        this.beginndatum = value;
    }

    /**
     * Gets the value of the enddatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddatum() {
        return enddatum;
    }

    /**
     * Sets the value of the enddatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddatum(XMLGregorianCalendar value) {
        this.enddatum = value;
    }

    /**
     * Gets the value of the hinweiseStundung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHinweiseStundung() {
        return hinweiseStundung;
    }

    /**
     * Sets the value of the hinweiseStundung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHinweiseStundung(String value) {
        this.hinweiseStundung = value;
    }

    /**
     * Gets the value of the zahlungsbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zahlungsbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZahlungsbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSEZahlungsbestimmungen }
     * 
     * 
     */
    public List<TypeKASSEZahlungsbestimmungen> getZahlungsbestimmung() {
        if (zahlungsbestimmung == null) {
            zahlungsbestimmung = new ArrayList<TypeKASSEZahlungsbestimmungen>();
        }
        return this.zahlungsbestimmung;
    }

}
