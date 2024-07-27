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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Der X�V-Datentyp Code erm�glicht die �bermittlung von Werten, so genannter Codes, aus vordefinierten Codelisten. Eine Codeliste ist eine Liste von Codes und der Beschreibung ihrer jeweiligen Bedeutung. Eine entscheidende Eigenschaft des Datentyps ist die M�glichkeit auf differenzierte Weise Bezug zu Codelisten zu nehmen (Code-Typ 1 bis 4). In jedem Fall erlauben die �bermittelten Daten eine eindeutige Identifizierung der zugrundeliegenden Codeliste.
 * 
 * <p>Java class for Code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", namespace = "http://xoev.de/schemata/code/1_0", propOrder = {
    "code",
    "name"
})
@XmlSeeAlso({
    CodeGDSGeschlecht.class,
    CodeSCGerichtlicheZustaendigkeit.class,
    CodeREGSachlicheErweiterungProkuraTyp3 .class,
    CodeSTRAFStrafverfolgungshindernisTyp3 .class,
    CodeSTRAFBFJGZRRechtsvorschriftenTyp3 .class,
    CodeBESTATBetreuerauswahl.class,
    CodeBESTATAufgabenkreis.class,
    CodeGDSStaatenTyp3 .class,
    CodeGDSVertraulichkeitsstufeTyp3 .class,
    CodeGDSEreignisTyp3 .class,
    CodeSTRAFGeldanordnungsartTyp3 .class,
    CodeZVGAnspruchsart.class,
    CodeDABAGVollstreckbarkeitsart.class,
    CodeGDSTelekommunikationsart.class,
    CodeGDSBundeslandTyp3 .class,
    CodeSTRAFFahndungszweckTyp3 .class,
    CodeSCHIRSchiffsgattung.class,
    CodeGDSRegisterzeichenTyp3 .class,
    CodeKASSEZahlwege.class,
    CodeSTRAFAsservatStatusmitteilungTyp3 .class,
    CodeSTRAFAnordnungsartTyp3 .class,
    CodeSTRAFErgebnisartTyp3 .class,
    CodeINSOVerfahrensartInternational.class,
    CodeSTRAFBFJNachrichtencodeBZRAuskunftTyp3 .class,
    CodeSTRAFFuehrerscheinklasseTyp3 .class,
    CodeDABAGAenderungsvermerkWEG.class,
    CodeBESTATGeschaeftsanfall.class,
    CodeSTRAFEntscheidungsartTyp3 .class,
    CodeENOVAGrundDerUebersendung.class,
    CodeSTRAFWeisungenTyp3 .class,
    CodeGDSKanzleiform.class,
    CodeSTRAFAnordnungsbefugterTyp3 .class,
    CodeFAMBetragsart.class,
    CodeVSTRKorrekturLoeschung.class,
    CodeKASSEZahlungsbestimmungArt.class,
    CodeSTRAFFahndungsregionTyp3 .class,
    CodeBESTATBeendigungBetreuung.class,
    CodeFAMGegenstandsbezeichnung.class,
    CodeVAGTeilungsart.class,
    CodeVAGAusgleich.class,
    CodeINSOZustellungsart.class,
    CodeGDSWaehrungTyp3 .class,
    CodeINSOVerfahrensartNationalUnterart.class,
    CodeSTRAFAsservatAuftragTyp3 .class,
    CodeAUSSBewertungsvorschlagTyp3 .class,
    CodeGDSTerminskategorie.class,
    CodeSTRAFHydaneHerkunftDerDatenTyp3 .class,
    CodeDABAGNutzungsrechtsart.class,
    CodeENOVAArtDesRechtsgeschaefts.class,
    CodeMFKREGRechtsbelehrungen.class,
    CodeSCHIRMessbriefaussteller.class,
    CodeEHUGInfoBFJ.class,
    CodeVSTRVerarbeitungsergebnisSchuldnerverzeichnis.class,
    CodeZVGNachrichtenart.class,
    CodeBESTATVeraenderung.class,
    CodeGDSZinstyp.class,
    CodeSTRAFEinstellungsartTyp3 .class,
    CodeDABAGSchliessungsgrund.class,
    CodeVAGTeilungsartEntscheidung.class,
    CodeENOVAErsuchenSachentscheidung.class,
    CodeFAMVermoegenstyp.class,
    CodeSTRAFBescheidartTyp3 .class,
    CodeSTRAFBFJArtDerAuskunftsdatenTyp3 .class,
    CodeSTRAFMassnahmeartTyp3 .class,
    CodeINSOErklaerungstyp.class,
    CodeSTRAFBFJNachrichtencodeGZRAuskunftTyp3 .class,
    CodeVSTRVermoegensverzeichnisArt.class,
    CodeGDSTelekommunikationszusatz.class,
    CodeDABAGHofart.class,
    CodeSTRAFKFZKennzeichenTyp3 .class,
    CodeSTRAFFahrerlaubnisartTyp3 .class,
    CodeSTRAFMassnahmegegenstandTyp3 .class,
    CodeGDSLastschrifttyp.class,
    CodeSTRAFBFJNachrichtencodeBZRAntragBehoerdenfuehrungszeugnisTyp3 .class,
    CodeGDSRVTraeger.class,
    CodeSCZahlungsart.class,
    CodeSTRAFHaftbeginnTyp3 .class,
    CodeDABAGBelastungstypAbt3 .class,
    CodeDABAGBelastungstypAbt2 .class,
    CodeSTRAFFahndungsverfahrenTyp3 .class,
    CodeSTRAFBFJNachrichtencodeBZRAnfrageUnbeschraenkteAuskunftTyp3 .class,
    CodeKASSEKlassifikation.class,
    CodeDABAGNacherbfolgeart.class,
    CodeEZOLLGlaeubiger.class,
    CodeGDSVerweistyp.class,
    CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde.class,
    CodeSTRAFBeschlussartTyp3 .class,
    CodeAUSSAussonderungsartTyp3 .class,
    CodeDABAGTypParteiKraftAmtes.class,
    CodeSTRAFBFJBehoerdenfuehrungszeugnisBZRGrundTyp3 .class,
    CodeGDSSendungsprioritaetTyp3 .class,
    CodeDABAGAusbuchungsgrund.class,
    CodeZVRAntwortart.class,
    CodeENOVAGegenleistung.class,
    CodeGVZBuchungstext.class,
    CodeSTRAFRechtsmittelTyp3 .class,
    CodeGDSFamilienstand.class,
    CodeGDSIntervall.class,
    CodeREGBesondereVertretungsregelungTyp3 .class,
    CodeSTRAFSachgebietsschluesselTyp3 .class,
    CodeDABAGAufteilungsgrundWEG.class,
    CodeSTRAFBFJGZRGewerbeschluesselTyp3 .class,
    CodeSTRAFRechtsfolgenTyp3 .class,
    CodeREGDokumentstatusTyp3 .class,
    CodeGDSAusweisartTyp3 .class,
    CodeINSOIRIFehlercode.class,
    CodeGDSForderungsteil.class,
    CodeSTRAFBFJGZRGewerbeartTyp3 .class,
    CodeGDSDokumentklasseTyp3 .class,
    CodeSTRAFASTRALTyp3 .class,
    CodeGDSRegisterart.class,
    CodeVSTRSchuldnerverzeichnisLoeschungsgruende.class,
    CodeREGEintragungstypTyp3 .class,
    CodeDABAGAbtretungsgrund.class,
    CodeSTRAFHaftzeitendeartTyp3 .class,
    CodeZVGTitelart.class,
    CodeKASSEKostentyp.class,
    CodeINSOInsolvenzraenge.class,
    CodeGDSBestandteiltyp.class,
    CodeDABAGWiderspruchsgrundlage.class,
    CodeINSOVeroeffentlichungsgegenstand.class,
    CodeMFKREGRegisterauszugsart.class,
    CodeGDSDatentypTyp3 .class,
    CodeSTRAFLoeschungsgrundTyp3 .class,
    CodeDABAGEintragungsgrundlagentyp.class,
    CodeSTRAFBFJNachrichtencodeGZRMitteilungenTyp3 .class,
    CodeSTRAFFahrzeugantriebTyp3 .class,
    CodeGDSTerminsart.class,
    CodeREGAllgemeineBefreiungTyp3 .class,
    CodeGVZZinsmethode.class,
    CodeDABAGBelastungsform.class,
    CodeBESTATEinleitungBetreuung.class,
    CodeDABAGErwerbsgrundart.class,
    CodeSTRAFBFJGZRTextkennzahlTyp3 .class,
    CodeSTRAFBFJUebermittelndeStelleTyp3 .class,
    CodeMFKREGGliederungspunkte.class,
    CodeINSOErgebnisVOEVerarbeitungsbestaetigung.class,
    CodeKASSEErloesart.class,
    CodeZVGVerfahrensart.class,
    CodeSTRAFPruefvorschriftTyp3 .class,
    CodeVAGVersorgungsart.class,
    CodeVAGSachstandsmitteilungKurzmitteilungVersorgungstraegerZuGericht.class,
    CodeGDSGerichteTyp3 .class,
    CodeSTRAFAuflagenTyp3 .class,
    CodeSTRAFBeteiligungsartTyp3 .class,
    CodeGDSRechtsformTyp3 .class,
    CodeGDSPersonalstatut.class,
    CodeGDSDokumenttypTyp3 .class,
    CodeBESTATArtGenehmigung.class,
    CodeSTRAFBFJNachrichtencodeGZRAnfrageOeffentlicheStelleTyp3 .class,
    CodeEZOLLForderung.class,
    CodeKASSEMahnstatus.class,
    CodeBESTATEntscheidungImLaufendenVerfahren.class,
    CodeINSORegisterart.class,
    CodeMAHNWiderspruchsart.class,
    CodeZPOFehlercode.class,
    CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 .class,
    CodeINSOVerfahrensartNational.class,
    CodeSTRAFFahrzeugartTyp3 .class,
    CodeMAHNKostenbefreiung.class,
    CodeVAGFehler.class,
    CodeINSOIRIFeldtyp.class,
    CodeSTRAFBFJBZRHinweisArtTyp3 .class,
    CodeGDSTeilaktentyp.class,
    CodeSTRAFVerbleibsartTyp3 .class,
    CodeSTRAFBFJBZRTextkennzahlTyp3 .class,
    CodeREGStatusRechtstraegerTyp3 .class,
    CodeGDSRollenbezeichnung.class,
    CodeINSOUebertragungsweg.class,
    CodeSCHIRHeimathafen.class,
    CodeSTRAFBesuchserlaubnisartTyp3 .class,
    CodeDABAGErbbaurechtsart.class,
    CodeZVREintragungsart.class,
    CodeGDSSprachen.class,
    CodeSTRAFTatmerkmalTyp3 .class,
    CodeVSTREntscheidungsinhaltSchuldnerwiderspruch.class,
    CodeDABAGWirtschaftsart.class,
    CodeSTRAFBFJVerwendungszweckAuskunftTyp3 .class,
    CodeGDSBRISListOfRegistersTyp3 .class,
    CodeREGRegisterzeichenwechselgrundTyp3 .class,
    CodeKASSEErledigungsart.class,
    CodeSTRAFErledigungsartenTyp3 .class,
    CodeENOVAGrundstuecksart.class,
    CodeVSTRAnredePartei.class,
    CodeBESTATEntscheidungUeberEinrichtungDerBetreuung.class,
    CodeDABAGGrundbuchart.class,
    CodeFAMFamilienart.class,
    CodeSTRAFHerkunftsartTyp3 .class,
    CodeSTRAFPersonenbezugTyp3 .class,
    CodeGDSUrkundentypTyp3 .class,
    CodeZVGObjekt.class,
    CodeGVZAuftragsart.class,
    CodeGDSJustizvollzugTyp3 .class,
    CodeSCHIRLoeschgrund.class,
    CodeSTRAFAbwesenheitsartTyp3 .class,
    CodeGVZTitelart.class,
    CodeREGBesondereBefreiungTyp3 .class,
    CodeSTRAFOWIErledigungsartTyp3 .class,
    CodeKASSEFreigabestatus.class,
    CodeVAGLeistungsform.class,
    CodeGDSAktentyp.class,
    CodeEEBStoerungsID.class,
    CodeINSOIRIFehlerart.class,
    CodeEHUGEbanzMeldungBFJ.class,
    CodeREGVertragsartTyp3 .class,
    CodeEHUGPostZU.class,
    CodeGDSAnschriftstyp.class,
    CodeENOVASachentscheidung.class,
    CodeVAGBezugsgroesse.class,
    CodeEZOLLFehler.class,
    CodeZSSRFehler.class,
    CodeGDSAktenzeichenart.class,
    CodeGDSSachgebietTyp3 .class,
    CodeSTRAFSicherungsmassnahmeTyp3 .class,
    CodeSTRAFVAErledigungsartTyp3 .class,
    CodeBESTATArtZahlung.class,
    CodeDABAGPfaendungsart.class,
    CodeSCHIRBaustoff.class,
    CodeDABAGAktionsgruende.class,
    CodeENOVAGueterstand.class,
    CodeGDSAktenreferenzart.class,
    CodeSTRAFFahndungsanlassTyp3 .class,
    CodeSTRAFHaftartTyp3 .class,
    CodeINSOIRIStatus.class,
    CodeGDSZinsberechnung.class,
    CodeVSTREintragungsgruendeInsolvenzgericht.class,
    CodeZPOAnfragetyp.class,
    CodeVSTRGerichtsvollzieherDienstbezeichnung.class,
    CodeREGAllgemeineVertretungsregelungTyp3 .class,
    CodeDABAGRangart.class,
    CodeSTRAFBFJNachrichtencodeBZRMitteilungenTyp3 .class,
    CodeSTRAFBeweismittelTyp3 .class,
    CodeSTRAFWebRegZurechnungTyp3 .class,
    CodeSTRAFBFJHinweisAnlassTyp3 .class,
    CodeSTRAFBFJBenachrichtigungGrundTyp3 .class
})
public class Code {

    @XmlElement(namespace = "", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    @XmlElement(namespace = "")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Sets the value of the listURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * Gets the value of the listVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Sets the value of the listVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

}