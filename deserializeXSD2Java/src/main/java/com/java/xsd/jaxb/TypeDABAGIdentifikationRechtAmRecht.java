//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Identifikation.RechtAmRecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Identifikation.RechtAmRecht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="betroffeneBelastung" type="{http://www.xjustiz.de}Type.DABAG.Ref.Belastung"/>
 *         &lt;element name="betroffenerBerechtigter" type="{http://www.xjustiz.de}Type.DABAG.Ref.Berechtigter" minOccurs="0"/>
 *         &lt;element name="auswahl_urkunde">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="urkundennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Identifikation.RechtAmRecht", propOrder = {
    "betroffeneBelastung",
    "betroffenerBerechtigter",
    "auswahlUrkunde"
})
public class TypeDABAGIdentifikationRechtAmRecht {

    @XmlElement(required = true)
    protected TypeDABAGRefBelastung betroffeneBelastung;
    protected TypeDABAGRefBerechtigter betroffenerBerechtigter;
    @XmlElement(name = "auswahl_urkunde", required = true)
    protected TypeDABAGIdentifikationRechtAmRecht.AuswahlUrkunde auswahlUrkunde;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the betroffeneBelastung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public TypeDABAGRefBelastung getBetroffeneBelastung() {
        return betroffeneBelastung;
    }

    /**
     * Sets the value of the betroffeneBelastung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public void setBetroffeneBelastung(TypeDABAGRefBelastung value) {
        this.betroffeneBelastung = value;
    }

    /**
     * Gets the value of the betroffenerBerechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefBerechtigter }
     *     
     */
    public TypeDABAGRefBerechtigter getBetroffenerBerechtigter() {
        return betroffenerBerechtigter;
    }

    /**
     * Sets the value of the betroffenerBerechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefBerechtigter }
     *     
     */
    public void setBetroffenerBerechtigter(TypeDABAGRefBerechtigter value) {
        this.betroffenerBerechtigter = value;
    }

    /**
     * Gets the value of the auswahlUrkunde property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGIdentifikationRechtAmRecht.AuswahlUrkunde }
     *     
     */
    public TypeDABAGIdentifikationRechtAmRecht.AuswahlUrkunde getAuswahlUrkunde() {
        return auswahlUrkunde;
    }

    /**
     * Sets the value of the auswahlUrkunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGIdentifikationRechtAmRecht.AuswahlUrkunde }
     *     
     */
    public void setAuswahlUrkunde(TypeDABAGIdentifikationRechtAmRecht.AuswahlUrkunde value) {
        this.auswahlUrkunde = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *       &lt;choice>
     *         &lt;element name="urkundennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "urkundennummer",
        "aktenzeichen"
    })
    public static class AuswahlUrkunde {

        protected String urkundennummer;
        protected TypeGDSAktenzeichen aktenzeichen;

        /**
         * Gets the value of the urkundennummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrkundennummer() {
            return urkundennummer;
        }

        /**
         * Sets the value of the urkundennummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrkundennummer(String value) {
            this.urkundennummer = value;
        }

        /**
         * Gets the value of the aktenzeichen property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSAktenzeichen }
         *     
         */
        public TypeGDSAktenzeichen getAktenzeichen() {
            return aktenzeichen;
        }

        /**
         * Sets the value of the aktenzeichen property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSAktenzeichen }
         *     
         */
        public void setAktenzeichen(TypeGDSAktenzeichen value) {
            this.aktenzeichen = value;
        }

    }

}
