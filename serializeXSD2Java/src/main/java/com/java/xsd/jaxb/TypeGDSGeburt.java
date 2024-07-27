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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Geburt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Geburt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geburtsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *         &lt;element name="geburtsort" type="{http://www.xjustiz.de}Type.GDS.Ortsangabe" minOccurs="0"/>
 *         &lt;element name="geburtsname.mutter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" minOccurs="0"/>
 *         &lt;element name="name.eltern" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nachname.vater" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="vorname.vater" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="nachname.mutter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="vorname.mutter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="geburtsdatum.unbekannt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Geburt", propOrder = {
    "geburtsdatum",
    "geburtsort",
    "geburtsnameMutter",
    "nameEltern",
    "geburtsdatumUnbekannt"
})
@XmlSeeAlso({
    com.java.xsd.jaxb.NachrichtInsoVeroeffentlichung0300010 .Fachdaten.Schuldner.NatuerlichePerson.Geburt.class
})
public class TypeGDSGeburt {

    protected String geburtsdatum;
    protected TypeGDSOrtsangabe geburtsort;
    @XmlElement(name = "geburtsname.mutter")
    protected String geburtsnameMutter;
    @XmlElement(name = "name.eltern")
    protected TypeGDSGeburt.NameEltern nameEltern;
    @XmlElement(name = "geburtsdatum.unbekannt", defaultValue = "false")
    protected Boolean geburtsdatumUnbekannt;

    /**
     * Gets the value of the geburtsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * Sets the value of the geburtsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeburtsdatum(String value) {
        this.geburtsdatum = value;
    }

    /**
     * Gets the value of the geburtsort property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSOrtsangabe }
     *     
     */
    public TypeGDSOrtsangabe getGeburtsort() {
        return geburtsort;
    }

    /**
     * Sets the value of the geburtsort property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSOrtsangabe }
     *     
     */
    public void setGeburtsort(TypeGDSOrtsangabe value) {
        this.geburtsort = value;
    }

    /**
     * Gets the value of the geburtsnameMutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeburtsnameMutter() {
        return geburtsnameMutter;
    }

    /**
     * Sets the value of the geburtsnameMutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeburtsnameMutter(String value) {
        this.geburtsnameMutter = value;
    }

    /**
     * Gets the value of the nameEltern property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeburt.NameEltern }
     *     
     */
    public TypeGDSGeburt.NameEltern getNameEltern() {
        return nameEltern;
    }

    /**
     * Sets the value of the nameEltern property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeburt.NameEltern }
     *     
     */
    public void setNameEltern(TypeGDSGeburt.NameEltern value) {
        this.nameEltern = value;
    }

    /**
     * Gets the value of the geburtsdatumUnbekannt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeburtsdatumUnbekannt() {
        return geburtsdatumUnbekannt;
    }

    /**
     * Sets the value of the geburtsdatumUnbekannt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeburtsdatumUnbekannt(Boolean value) {
        this.geburtsdatumUnbekannt = value;
    }


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
     *         &lt;element name="nachname.vater" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="vorname.vater" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="nachname.mutter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="vorname.mutter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeA" maxOccurs="unbounded" minOccurs="0"/>
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
        "nachnameVater",
        "vornameVater",
        "nachnameMutter",
        "vornameMutter"
    })
    public static class NameEltern {

        @XmlElement(name = "nachname.vater")
        protected List<String> nachnameVater;
        @XmlElement(name = "vorname.vater")
        protected List<String> vornameVater;
        @XmlElement(name = "nachname.mutter")
        protected List<String> nachnameMutter;
        @XmlElement(name = "vorname.mutter")
        protected List<String> vornameMutter;

        /**
         * Gets the value of the nachnameVater property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nachnameVater property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNachnameVater().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNachnameVater() {
            if (nachnameVater == null) {
                nachnameVater = new ArrayList<String>();
            }
            return this.nachnameVater;
        }

        /**
         * Gets the value of the vornameVater property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vornameVater property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVornameVater().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVornameVater() {
            if (vornameVater == null) {
                vornameVater = new ArrayList<String>();
            }
            return this.vornameVater;
        }

        /**
         * Gets the value of the nachnameMutter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nachnameMutter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNachnameMutter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNachnameMutter() {
            if (nachnameMutter == null) {
                nachnameMutter = new ArrayList<String>();
            }
            return this.nachnameMutter;
        }

        /**
         * Gets the value of the vornameMutter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vornameMutter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVornameMutter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVornameMutter() {
            if (vornameMutter == null) {
                vornameMutter = new ArrayList<String>();
            }
            return this.vornameMutter;
        }

    }

}