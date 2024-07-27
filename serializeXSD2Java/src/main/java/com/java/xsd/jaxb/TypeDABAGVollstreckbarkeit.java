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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Vollstreckbarkeit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Vollstreckbarkeit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.DABAG.Vollstreckbarkeitsart"/>
 *         &lt;element name="teilbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *         &lt;element name="vollstreckbareBuchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Ref.Buchungsstelle" minOccurs="0"/>
 *         &lt;element name="vollstreckbarerEigentuemer" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eigentuemer" minOccurs="0"/>
 *         &lt;element name="grundbuchblatt" type="{http://www.xjustiz.de}Type.DABAG.Identifikation.Grundbuchblatt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Vollstreckbarkeit", propOrder = {
    "art",
    "teilbetrag",
    "vollstreckbareBuchungsstelle",
    "vollstreckbarerEigentuemer",
    "grundbuchblatt"
})
public class TypeDABAGVollstreckbarkeit {

    @XmlElement(required = true)
    protected CodeDABAGVollstreckbarkeitsart art;
    protected TypeGDSGeldbetrag teilbetrag;
    protected TypeDABAGRefBuchungsstelle vollstreckbareBuchungsstelle;
    protected TypeDABAGRefEigentuemer vollstreckbarerEigentuemer;
    protected List<TypeDABAGIdentifikationGrundbuchblatt> grundbuchblatt;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDABAGVollstreckbarkeitsart }
     *     
     */
    public CodeDABAGVollstreckbarkeitsart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDABAGVollstreckbarkeitsart }
     *     
     */
    public void setArt(CodeDABAGVollstreckbarkeitsart value) {
        this.art = value;
    }

    /**
     * Gets the value of the teilbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getTeilbetrag() {
        return teilbetrag;
    }

    /**
     * Sets the value of the teilbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setTeilbetrag(TypeGDSGeldbetrag value) {
        this.teilbetrag = value;
    }

    /**
     * Gets the value of the vollstreckbareBuchungsstelle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefBuchungsstelle }
     *     
     */
    public TypeDABAGRefBuchungsstelle getVollstreckbareBuchungsstelle() {
        return vollstreckbareBuchungsstelle;
    }

    /**
     * Sets the value of the vollstreckbareBuchungsstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefBuchungsstelle }
     *     
     */
    public void setVollstreckbareBuchungsstelle(TypeDABAGRefBuchungsstelle value) {
        this.vollstreckbareBuchungsstelle = value;
    }

    /**
     * Gets the value of the vollstreckbarerEigentuemer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefEigentuemer }
     *     
     */
    public TypeDABAGRefEigentuemer getVollstreckbarerEigentuemer() {
        return vollstreckbarerEigentuemer;
    }

    /**
     * Sets the value of the vollstreckbarerEigentuemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefEigentuemer }
     *     
     */
    public void setVollstreckbarerEigentuemer(TypeDABAGRefEigentuemer value) {
        this.vollstreckbarerEigentuemer = value;
    }

    /**
     * Gets the value of the grundbuchblatt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundbuchblatt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundbuchblatt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGIdentifikationGrundbuchblatt }
     * 
     * 
     */
    public List<TypeDABAGIdentifikationGrundbuchblatt> getGrundbuchblatt() {
        if (grundbuchblatt == null) {
            grundbuchblatt = new ArrayList<TypeDABAGIdentifikationGrundbuchblatt>();
        }
        return this.grundbuchblatt;
    }

}
