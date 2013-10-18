package com.itsum.sabre.client.dto.fare;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="POS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Source" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PseudoCityCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="16"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MessagingDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MDRSubset" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Segment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Number">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="1"/>
 *                       &lt;maxInclusive value="99"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="EndNumber">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="1"/>
 *                       &lt;maxInclusive value="99"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="8"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CodeContext" default="IATA">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="32"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="8"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CodeContext" default="IATA">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="32"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelDateOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PreferredDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareTypeQualifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AddOnFares" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PrivateFares" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PublicFares" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SecondaryCode" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="XP"/>
 *                                 &lt;enumeration value="XR"/>
 *                                 &lt;enumeration value="XS"/>
 *                                 &lt;enumeration value="XA"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JointFares" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VendorPref" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Number">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="All" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ConnectingCity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="8"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CodeContext" default="IATA">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="32"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareLevel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MiscQualifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PurchaseCity" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LocationCode" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="8"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CodeContext" default="IATA">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="32"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BookingClass" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z]{1}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JourneyType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="RT"/>
 *                                 &lt;enumeration value="OW"/>
 *                                 &lt;enumeration value="HR"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Currency" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CurrencyCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z]{3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GlobalIndicator" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z]{2}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Corporate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Validation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Discount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NetFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaseTaxTotal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "tpaExtensions",
    "segment",
    "originLocation",
    "destinationLocation",
    "travelDateOptions",
    "vendorPref",
    "fareTypeQualifiers",
    "miscQualifiers"
})
@XmlRootElement(name = "FareRQ", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
public class FareRQ {

    @XmlElement(name = "POS", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.POS pos;
    @XmlElement(name = "TPA_Extensions", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.TPAExtensions tpaExtensions;
    @XmlElement(name = "Segment", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.Segment segment;
    @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2003/07", required = true)
    protected FareRQ.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2003/07", required = true)
    protected FareRQ.DestinationLocation destinationLocation;
    @XmlElement(name = "TravelDateOptions", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.TravelDateOptions travelDateOptions;
    @XmlElement(name = "VendorPref", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected List<FareRQ.VendorPref> vendorPref;
    @XmlElement(name = "FareTypeQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.FareTypeQualifiers fareTypeQualifiers;
    @XmlElement(name = "MiscQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRQ.MiscQualifiers miscQualifiers;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.POS }
     *     
     */
    public FareRQ.POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.POS }
     *     
     */
    public void setPOS(FareRQ.POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.TPAExtensions }
     *     
     */
    public FareRQ.TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.TPAExtensions }
     *     
     */
    public void setTPAExtensions(FareRQ.TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.Segment }
     *     
     */
    public FareRQ.Segment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.Segment }
     *     
     */
    public void setSegment(FareRQ.Segment value) {
        this.segment = value;
    }

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.OriginLocation }
     *     
     */
    public FareRQ.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.OriginLocation }
     *     
     */
    public void setOriginLocation(FareRQ.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.DestinationLocation }
     *     
     */
    public FareRQ.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.DestinationLocation }
     *     
     */
    public void setDestinationLocation(FareRQ.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the travelDateOptions property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.TravelDateOptions }
     *     
     */
    public FareRQ.TravelDateOptions getTravelDateOptions() {
        return travelDateOptions;
    }

    /**
     * Sets the value of the travelDateOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.TravelDateOptions }
     *     
     */
    public void setTravelDateOptions(FareRQ.TravelDateOptions value) {
        this.travelDateOptions = value;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRQ.VendorPref }
     * 
     * 
     */
    public List<FareRQ.VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<FareRQ.VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the fareTypeQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.FareTypeQualifiers }
     *     
     */
    public FareRQ.FareTypeQualifiers getFareTypeQualifiers() {
        return fareTypeQualifiers;
    }

    /**
     * Sets the value of the fareTypeQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.FareTypeQualifiers }
     *     
     */
    public void setFareTypeQualifiers(FareRQ.FareTypeQualifiers value) {
        this.fareTypeQualifiers = value;
    }

    /**
     * Gets the value of the miscQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link FareRQ.MiscQualifiers }
     *     
     */
    public FareRQ.MiscQualifiers getMiscQualifiers() {
        return miscQualifiers;
    }

    /**
     * Sets the value of the miscQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRQ.MiscQualifiers }
     *     
     */
    public void setMiscQualifiers(FareRQ.MiscQualifiers value) {
        this.miscQualifiers = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }


    /**
     * Code and optional string to describe a location point.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="LocationCode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="8"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CodeContext" default="IATA">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="32"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation {

        @XmlAttribute(name = "LocationCode", required = true)
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            if (codeContext == null) {
                return "IATA";
            } else {
                return codeContext;
            }
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

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
     *         &lt;element name="FareType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AddOnFares" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PrivateFares" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PublicFares" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SecondaryCode" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="XP"/>
     *                       &lt;enumeration value="XR"/>
     *                       &lt;enumeration value="XS"/>
     *                       &lt;enumeration value="XA"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JointFares" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VendorPref" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Number">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="All" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ConnectingCity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="8"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CodeContext" default="IATA">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="32"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareLevel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    @XmlType(name = "", propOrder = {
        "fareType",
        "addOnFares",
        "privateFares",
        "publicFares",
        "secondaryCode",
        "jointFares",
        "fareLevel"
    })
    public static class FareTypeQualifiers {

        @XmlElement(name = "FareType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.FareType fareType;
        @XmlElement(name = "AddOnFares", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.AddOnFares addOnFares;
        @XmlElement(name = "PrivateFares", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.PrivateFares privateFares;
        @XmlElement(name = "PublicFares", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.PublicFares publicFares;
        @XmlElement(name = "SecondaryCode", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.SecondaryCode secondaryCode;
        @XmlElement(name = "JointFares", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.JointFares jointFares;
        @XmlElement(name = "FareLevel", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.FareTypeQualifiers.FareLevel fareLevel;

        /**
         * Gets the value of the fareType property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.FareType }
         *     
         */
        public FareRQ.FareTypeQualifiers.FareType getFareType() {
            return fareType;
        }

        /**
         * Sets the value of the fareType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.FareType }
         *     
         */
        public void setFareType(FareRQ.FareTypeQualifiers.FareType value) {
            this.fareType = value;
        }

        /**
         * Gets the value of the addOnFares property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.AddOnFares }
         *     
         */
        public FareRQ.FareTypeQualifiers.AddOnFares getAddOnFares() {
            return addOnFares;
        }

        /**
         * Sets the value of the addOnFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.AddOnFares }
         *     
         */
        public void setAddOnFares(FareRQ.FareTypeQualifiers.AddOnFares value) {
            this.addOnFares = value;
        }

        /**
         * Gets the value of the privateFares property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.PrivateFares }
         *     
         */
        public FareRQ.FareTypeQualifiers.PrivateFares getPrivateFares() {
            return privateFares;
        }

        /**
         * Sets the value of the privateFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.PrivateFares }
         *     
         */
        public void setPrivateFares(FareRQ.FareTypeQualifiers.PrivateFares value) {
            this.privateFares = value;
        }

        /**
         * Gets the value of the publicFares property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.PublicFares }
         *     
         */
        public FareRQ.FareTypeQualifiers.PublicFares getPublicFares() {
            return publicFares;
        }

        /**
         * Sets the value of the publicFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.PublicFares }
         *     
         */
        public void setPublicFares(FareRQ.FareTypeQualifiers.PublicFares value) {
            this.publicFares = value;
        }

        /**
         * Gets the value of the secondaryCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.SecondaryCode }
         *     
         */
        public FareRQ.FareTypeQualifiers.SecondaryCode getSecondaryCode() {
            return secondaryCode;
        }

        /**
         * Sets the value of the secondaryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.SecondaryCode }
         *     
         */
        public void setSecondaryCode(FareRQ.FareTypeQualifiers.SecondaryCode value) {
            this.secondaryCode = value;
        }

        /**
         * Gets the value of the jointFares property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.JointFares }
         *     
         */
        public FareRQ.FareTypeQualifiers.JointFares getJointFares() {
            return jointFares;
        }

        /**
         * Sets the value of the jointFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.JointFares }
         *     
         */
        public void setJointFares(FareRQ.FareTypeQualifiers.JointFares value) {
            this.jointFares = value;
        }

        /**
         * Gets the value of the fareLevel property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.FareTypeQualifiers.FareLevel }
         *     
         */
        public FareRQ.FareTypeQualifiers.FareLevel getFareLevel() {
            return fareLevel;
        }

        /**
         * Sets the value of the fareLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.FareTypeQualifiers.FareLevel }
         *     
         */
        public void setFareLevel(FareRQ.FareTypeQualifiers.FareLevel value) {
            this.fareLevel = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AddOnFares {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

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
         *       &lt;attribute name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareLevel {

            @XmlAttribute(name = "MaxNumber")
            protected BigInteger maxNumber;

            /**
             * Gets the value of the maxNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxNumber() {
                return maxNumber;
            }

            /**
             * Sets the value of the maxNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxNumber(BigInteger value) {
                this.maxNumber = value;
            }

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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareType {

            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

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
         *         &lt;element name="VendorPref" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Number">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="All" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ConnectingCity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="8"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CodeContext" default="IATA">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="32"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
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
        @XmlType(name = "", propOrder = {
            "vendorPref",
            "connectingCity"
        })
        public static class JointFares {

            @XmlElement(name = "VendorPref", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected List<FareRQ.FareTypeQualifiers.JointFares.VendorPref> vendorPref;
            @XmlElement(name = "ConnectingCity", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRQ.FareTypeQualifiers.JointFares.ConnectingCity connectingCity;

            /**
             * Gets the value of the vendorPref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVendorPref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareRQ.FareTypeQualifiers.JointFares.VendorPref }
             * 
             * 
             */
            public List<FareRQ.FareTypeQualifiers.JointFares.VendorPref> getVendorPref() {
                if (vendorPref == null) {
                    vendorPref = new ArrayList<FareRQ.FareTypeQualifiers.JointFares.VendorPref>();
                }
                return this.vendorPref;
            }

            /**
             * Gets the value of the connectingCity property.
             * 
             * @return
             *     possible object is
             *     {@link FareRQ.FareTypeQualifiers.JointFares.ConnectingCity }
             *     
             */
            public FareRQ.FareTypeQualifiers.JointFares.ConnectingCity getConnectingCity() {
                return connectingCity;
            }

            /**
             * Sets the value of the connectingCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRQ.FareTypeQualifiers.JointFares.ConnectingCity }
             *     
             */
            public void setConnectingCity(FareRQ.FareTypeQualifiers.JointFares.ConnectingCity value) {
                this.connectingCity = value;
            }


            /**
             * Code and optional string to describe a location point.
             * 
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="8"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CodeContext" default="IATA">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="32"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConnectingCity {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    if (codeContext == null) {
                        return "IATA";
                    } else {
                        return codeContext;
                    }
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

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
             *       &lt;attribute name="Number">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="2"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="All" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class VendorPref {

                @XmlAttribute(name = "Number")
                protected Integer number;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "All")
                protected Boolean all;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumber(Integer value) {
                    this.number = value;
                }

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
                 * Gets the value of the all property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isAll() {
                    if (all == null) {
                        return false;
                    } else {
                        return all;
                    }
                }

                /**
                 * Sets the value of the all property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAll(Boolean value) {
                    this.all = value;
                }

            }

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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PrivateFares {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PublicFares {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

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
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="XP"/>
         *             &lt;enumeration value="XR"/>
         *             &lt;enumeration value="XS"/>
         *             &lt;enumeration value="XA"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SecondaryCode {

            @XmlAttribute(name = "Code")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String code;

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

        }

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
     *         &lt;element name="PurchaseCity" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LocationCode" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="8"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CodeContext" default="IATA">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="32"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BookingClass" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z]{1}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JourneyType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="RT"/>
     *                       &lt;enumeration value="OW"/>
     *                       &lt;enumeration value="HR"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Currency" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CurrencyCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z]{3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GlobalIndicator" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z]{2}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Corporate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Validation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Discount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NetFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BaseTaxTotal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    @XmlType(name = "", propOrder = {
        "purchaseCity",
        "fareBasisCode",
        "ticketDesignator",
        "bookingClass",
        "journeyType",
        "currency",
        "globalIndicator",
        "account",
        "corporate",
        "validation",
        "passengerType",
        "discount",
        "netFare",
        "baseTaxTotal"
    })
    public static class MiscQualifiers {

        @XmlElement(name = "PurchaseCity", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.PurchaseCity purchaseCity;
        @XmlElement(name = "FareBasisCode", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String fareBasisCode;
        @XmlElement(name = "TicketDesignator", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String ticketDesignator;
        @XmlElement(name = "BookingClass", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.BookingClass bookingClass;
        @XmlElement(name = "JourneyType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.JourneyType journeyType;
        @XmlElement(name = "Currency", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.Currency currency;
        @XmlElement(name = "GlobalIndicator", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.GlobalIndicator globalIndicator;
        @XmlElement(name = "Account", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.Account account;
        @XmlElement(name = "Corporate", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.Corporate corporate;
        @XmlElement(name = "Validation", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.Validation validation;
        @XmlElement(name = "PassengerType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<FareRQ.MiscQualifiers.PassengerType> passengerType;
        @XmlElement(name = "Discount", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.Discount discount;
        @XmlElement(name = "NetFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.NetFare netFare;
        @XmlElement(name = "BaseTaxTotal", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.MiscQualifiers.BaseTaxTotal baseTaxTotal;

        /**
         * Gets the value of the purchaseCity property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.PurchaseCity }
         *     
         */
        public FareRQ.MiscQualifiers.PurchaseCity getPurchaseCity() {
            return purchaseCity;
        }

        /**
         * Sets the value of the purchaseCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.PurchaseCity }
         *     
         */
        public void setPurchaseCity(FareRQ.MiscQualifiers.PurchaseCity value) {
            this.purchaseCity = value;
        }

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasisCode(String value) {
            this.fareBasisCode = value;
        }

        /**
         * Gets the value of the ticketDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignator() {
            return ticketDesignator;
        }

        /**
         * Sets the value of the ticketDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignator(String value) {
            this.ticketDesignator = value;
        }

        /**
         * Gets the value of the bookingClass property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.BookingClass }
         *     
         */
        public FareRQ.MiscQualifiers.BookingClass getBookingClass() {
            return bookingClass;
        }

        /**
         * Sets the value of the bookingClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.BookingClass }
         *     
         */
        public void setBookingClass(FareRQ.MiscQualifiers.BookingClass value) {
            this.bookingClass = value;
        }

        /**
         * Gets the value of the journeyType property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.JourneyType }
         *     
         */
        public FareRQ.MiscQualifiers.JourneyType getJourneyType() {
            return journeyType;
        }

        /**
         * Sets the value of the journeyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.JourneyType }
         *     
         */
        public void setJourneyType(FareRQ.MiscQualifiers.JourneyType value) {
            this.journeyType = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.Currency }
         *     
         */
        public FareRQ.MiscQualifiers.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.Currency }
         *     
         */
        public void setCurrency(FareRQ.MiscQualifiers.Currency value) {
            this.currency = value;
        }

        /**
         * Gets the value of the globalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.GlobalIndicator }
         *     
         */
        public FareRQ.MiscQualifiers.GlobalIndicator getGlobalIndicator() {
            return globalIndicator;
        }

        /**
         * Sets the value of the globalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.GlobalIndicator }
         *     
         */
        public void setGlobalIndicator(FareRQ.MiscQualifiers.GlobalIndicator value) {
            this.globalIndicator = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.Account }
         *     
         */
        public FareRQ.MiscQualifiers.Account getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.Account }
         *     
         */
        public void setAccount(FareRQ.MiscQualifiers.Account value) {
            this.account = value;
        }

        /**
         * Gets the value of the corporate property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.Corporate }
         *     
         */
        public FareRQ.MiscQualifiers.Corporate getCorporate() {
            return corporate;
        }

        /**
         * Sets the value of the corporate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.Corporate }
         *     
         */
        public void setCorporate(FareRQ.MiscQualifiers.Corporate value) {
            this.corporate = value;
        }

        /**
         * Gets the value of the validation property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.Validation }
         *     
         */
        public FareRQ.MiscQualifiers.Validation getValidation() {
            return validation;
        }

        /**
         * Sets the value of the validation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.Validation }
         *     
         */
        public void setValidation(FareRQ.MiscQualifiers.Validation value) {
            this.validation = value;
        }

        /**
         * Gets the value of the passengerType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRQ.MiscQualifiers.PassengerType }
         * 
         * 
         */
        public List<FareRQ.MiscQualifiers.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new ArrayList<FareRQ.MiscQualifiers.PassengerType>();
            }
            return this.passengerType;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.Discount }
         *     
         */
        public FareRQ.MiscQualifiers.Discount getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.Discount }
         *     
         */
        public void setDiscount(FareRQ.MiscQualifiers.Discount value) {
            this.discount = value;
        }

        /**
         * Gets the value of the netFare property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.NetFare }
         *     
         */
        public FareRQ.MiscQualifiers.NetFare getNetFare() {
            return netFare;
        }

        /**
         * Sets the value of the netFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.NetFare }
         *     
         */
        public void setNetFare(FareRQ.MiscQualifiers.NetFare value) {
            this.netFare = value;
        }

        /**
         * Gets the value of the baseTaxTotal property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.MiscQualifiers.BaseTaxTotal }
         *     
         */
        public FareRQ.MiscQualifiers.BaseTaxTotal getBaseTaxTotal() {
            return baseTaxTotal;
        }

        /**
         * Sets the value of the baseTaxTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.MiscQualifiers.BaseTaxTotal }
         *     
         */
        public void setBaseTaxTotal(FareRQ.MiscQualifiers.BaseTaxTotal value) {
            this.baseTaxTotal = value;
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
         *       &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "Unique")
            protected Boolean unique;
            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the unique property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isUnique() {
                if (unique == null) {
                    return false;
                } else {
                    return unique;
                }
            }

            /**
             * Sets the value of the unique property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUnique(Boolean value) {
                this.unique = value;
            }

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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BaseTaxTotal {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

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
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z]{1}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BookingClass {

            @XmlAttribute(name = "Code")
            protected String code;

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
         *       &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Corporate {

            @XmlAttribute(name = "Unique")
            protected Boolean unique;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * Gets the value of the unique property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isUnique() {
                if (unique == null) {
                    return false;
                } else {
                    return unique;
                }
            }

            /**
             * Sets the value of the unique property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUnique(Boolean value) {
                this.unique = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

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
         *       &lt;attribute name="CurrencyCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z]{3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Currency {

            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Discount {

            @XmlAttribute(name = "Code")
            protected String code;

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
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z]{2}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GlobalIndicator {

            @XmlAttribute(name = "Code")
            protected String code;

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
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="RT"/>
         *             &lt;enumeration value="OW"/>
         *             &lt;enumeration value="HR"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class JourneyType {

            @XmlAttribute(name = "Type")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NetFare {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType {

            @XmlAttribute(name = "Code")
            protected String code;

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

        }


        /**
         * Code and optional string to describe a location point.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="LocationCode" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="8"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CodeContext" default="IATA">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="32"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchaseCity {

            @XmlAttribute(name = "LocationCode", required = true)
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Validation {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isInd() {
                if (ind == null) {
                    return false;
                } else {
                    return ind;
                }
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

        }

    }


    /**
     * Code and optional string to describe a location point.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="LocationCode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="8"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CodeContext" default="IATA">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="32"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation {

        @XmlAttribute(name = "LocationCode", required = true)
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            if (codeContext == null) {
                return "IATA";
            } else {
                return codeContext;
            }
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

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
     *         &lt;element name="Source" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PseudoCityCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="16"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
    @XmlType(name = "", propOrder = {
        "source"
    })
    public static class POS {

        @XmlElement(name = "Source", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.POS.Source source;

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.POS.Source }
         *     
         */
        public FareRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.POS.Source }
         *     
         */
        public void setSource(FareRQ.POS.Source value) {
            this.source = value;
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
         *       &lt;attribute name="PseudoCityCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="16"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Source {

            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;

            /**
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

        }

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
     *       &lt;attribute name="Number">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="1"/>
     *             &lt;maxInclusive value="99"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="EndNumber">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="1"/>
     *             &lt;maxInclusive value="99"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Segment {

        @XmlAttribute(name = "Number")
        protected Integer number;
        @XmlAttribute(name = "EndNumber")
        protected Integer endNumber;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumber(Integer value) {
            this.number = value;
        }

        /**
         * Gets the value of the endNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getEndNumber() {
            return endNumber;
        }

        /**
         * Sets the value of the endNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setEndNumber(Integer value) {
            this.endNumber = value;
        }

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
     *         &lt;element name="MessagingDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MDRSubset" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "messagingDetails"
    })
    public static class TPAExtensions {

        @XmlElement(name = "MessagingDetails", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRQ.TPAExtensions.MessagingDetails messagingDetails;

        /**
         * Gets the value of the messagingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FareRQ.TPAExtensions.MessagingDetails }
         *     
         */
        public FareRQ.TPAExtensions.MessagingDetails getMessagingDetails() {
            return messagingDetails;
        }

        /**
         * Sets the value of the messagingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRQ.TPAExtensions.MessagingDetails }
         *     
         */
        public void setMessagingDetails(FareRQ.TPAExtensions.MessagingDetails value) {
            this.messagingDetails = value;
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
         *         &lt;element name="MDRSubset" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        @XmlType(name = "", propOrder = {
            "mdrSubset"
        })
        public static class MessagingDetails {

            @XmlElement(name = "MDRSubset", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRQ.TPAExtensions.MessagingDetails.MDRSubset mdrSubset;

            /**
             * Gets the value of the mdrSubset property.
             * 
             * @return
             *     possible object is
             *     {@link FareRQ.TPAExtensions.MessagingDetails.MDRSubset }
             *     
             */
            public FareRQ.TPAExtensions.MessagingDetails.MDRSubset getMDRSubset() {
                return mdrSubset;
            }

            /**
             * Sets the value of the mdrSubset property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRQ.TPAExtensions.MessagingDetails.MDRSubset }
             *     
             */
            public void setMDRSubset(FareRQ.TPAExtensions.MessagingDetails.MDRSubset value) {
                this.mdrSubset = value;
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
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MDRSubset {

                @XmlAttribute(name = "Code")
                protected String code;

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

            }

        }

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
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PreferredDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelDateOptions {

        @XmlAttribute(name = "Date")
        protected String date;
        @XmlAttribute(name = "EndDate")
        protected String endDate;
        @XmlAttribute(name = "ReturnDate")
        protected String returnDate;
        @XmlAttribute(name = "TicketingDate")
        protected String ticketingDate;
        @XmlAttribute(name = "PreferredDate")
        protected String preferredDate;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the returnDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnDate() {
            return returnDate;
        }

        /**
         * Sets the value of the returnDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnDate(String value) {
            this.returnDate = value;
        }

        /**
         * Gets the value of the ticketingDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingDate() {
            return ticketingDate;
        }

        /**
         * Sets the value of the ticketingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingDate(String value) {
            this.ticketingDate = value;
        }

        /**
         * Gets the value of the preferredDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferredDate() {
            return preferredDate;
        }

        /**
         * Sets the value of the preferredDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferredDate(String value) {
            this.preferredDate = value;
        }

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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorPref {

        @XmlAttribute(name = "Code")
        protected String code;

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

    }

}
