//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Die Werte einer Codeliste vom Code-Typ 3 k�nnen im XRepository eingesehen werden. N�here Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
 * 
 * <p>Java class for Code.STRAF.Massnahmegegenstand.Typ3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code.STRAF.Massnahmegegenstand.Typ3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:xoev-de:xjustiz:codeliste:straf.massnahmegegenstand" />
 *       &lt;attribute name="listVersionID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.STRAF.Massnahmegegenstand.Typ3")
public class CodeSTRAFMassnahmegegenstandTyp3
    extends Code
{


}
