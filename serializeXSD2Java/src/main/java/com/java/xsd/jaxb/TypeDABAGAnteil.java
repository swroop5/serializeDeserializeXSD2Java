//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Anteil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Anteil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auswahl_anteil">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anteilNumerisch">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="zaehler" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="nenner" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="anteilSonstiges" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Anteil", propOrder = {
    "auswahlAnteil"
})
public class TypeDABAGAnteil {

    @XmlElement(name = "auswahl_anteil", required = true)
    protected TypeDABAGAnteil.AuswahlAnteil auswahlAnteil;

    /**
     * Gets the value of the auswahlAnteil property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGAnteil.AuswahlAnteil }
     *     
     */
    public TypeDABAGAnteil.AuswahlAnteil getAuswahlAnteil() {
        return auswahlAnteil;
    }

    /**
     * Sets the value of the auswahlAnteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGAnteil.AuswahlAnteil }
     *     
     */
    public void setAuswahlAnteil(TypeDABAGAnteil.AuswahlAnteil value) {
        this.auswahlAnteil = value;
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
     *         &lt;element name="anteilNumerisch">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="zaehler" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="nenner" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="anteilSonstiges" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
        "anteilNumerisch",
        "anteilSonstiges"
    })
    public static class AuswahlAnteil {

        protected TypeDABAGAnteil.AuswahlAnteil.AnteilNumerisch anteilNumerisch;
        protected String anteilSonstiges;

        /**
         * Gets the value of the anteilNumerisch property.
         * 
         * @return
         *     possible object is
         *     {@link TypeDABAGAnteil.AuswahlAnteil.AnteilNumerisch }
         *     
         */
        public TypeDABAGAnteil.AuswahlAnteil.AnteilNumerisch getAnteilNumerisch() {
            return anteilNumerisch;
        }

        /**
         * Sets the value of the anteilNumerisch property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeDABAGAnteil.AuswahlAnteil.AnteilNumerisch }
         *     
         */
        public void setAnteilNumerisch(TypeDABAGAnteil.AuswahlAnteil.AnteilNumerisch value) {
            this.anteilNumerisch = value;
        }

        /**
         * Gets the value of the anteilSonstiges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnteilSonstiges() {
            return anteilSonstiges;
        }

        /**
         * Sets the value of the anteilSonstiges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnteilSonstiges(String value) {
            this.anteilSonstiges = value;
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
         *         &lt;element name="zaehler" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="nenner" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "zaehler",
            "nenner"
        })
        public static class AnteilNumerisch {

            @XmlElement(required = true)
            protected BigInteger zaehler;
            @XmlElement(required = true)
            protected BigInteger nenner;

            /**
             * Gets the value of the zaehler property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getZaehler() {
                return zaehler;
            }

            /**
             * Sets the value of the zaehler property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setZaehler(BigInteger value) {
                this.zaehler = value;
            }

            /**
             * Gets the value of the nenner property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNenner() {
                return nenner;
            }

            /**
             * Sets the value of the nenner property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNenner(BigInteger value) {
                this.nenner = value;
            }

        }

    }

}