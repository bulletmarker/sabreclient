
package com.itsum.sabre.client.dto.ota.airprice;

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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OriginDestinationInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DestinationLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MarketingCarrier">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OriginLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                           &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceRequestInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OptionalQualifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="VendorPrefs" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Airline">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MiscQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AirExtras" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                         &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BaggageAllowance" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Segment" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Commission" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Endorsements" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="HemisphereCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="JourneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TourCode" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BSPInclusiveTour" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BulkTour" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="InclusiveTour" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SuppressIT" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PricingQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Account" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="BargainFinder" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Historical" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Rebook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BuyingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                       &lt;element name="CommandPricing" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Discount" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="FareBasis" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Corporate" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Fare" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FareOptions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Excursion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Net" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ItineraryOptions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BreakFare" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ForceConnection" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ForceStopOver" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OverrideBreak" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SegmentSelect" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SideTrip" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="NameSelect" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="EndNameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="NetRemit" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CAR" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Cash" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Credit" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Overrides" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FuelSurchargeOverride" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="GoverningCarrierOverride" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Airline">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NoAdvancePurchase" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NoFareRestrictions" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NoMinMaxStay" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NoPenalty" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                         &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Purchase" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Ticketing" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PassengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PlusUp" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ShipsRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Taxes" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="NoTax" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TaxExempt" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TaxOverride" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ValidityDates" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="NotValidAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                                 &lt;element name="NotValidBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                                 &lt;element name="Segment">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="AlternateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attribute name="FutureTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Retain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "originDestinationInformation",
    "priceRequestInformation"
})
@XmlRootElement(name = "OTA_AirPriceRQ", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class OTAAirPriceRQ {

    @XmlElement(name = "OriginDestinationInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected OTAAirPriceRQ.OriginDestinationInformation originDestinationInformation;
    @XmlElement(name = "PriceRequestInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
    protected OTAAirPriceRQ.PriceRequestInformation priceRequestInformation;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirPriceRQ.OriginDestinationInformation }
     *     
     */
    public OTAAirPriceRQ.OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * Sets the value of the originDestinationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirPriceRQ.OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(OTAAirPriceRQ.OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirPriceRQ.PriceRequestInformation }
     *     
     */
    public OTAAirPriceRQ.PriceRequestInformation getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirPriceRQ.PriceRequestInformation }
     *     
     */
    public void setPriceRequestInformation(OTAAirPriceRQ.PriceRequestInformation value) {
        this.priceRequestInformation = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
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
        if (version == null) {
            return "2.1.0";
        } else {
            return version;
        }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlightSegment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DestinationLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MarketingCarrier">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OriginLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                 &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "flightSegment"
    })
    public static class OriginDestinationInformation {

        @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
        protected List<OTAAirPriceRQ.OriginDestinationInformation.FlightSegment> flightSegment;

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment }
         * 
         * 
         */
        public List<OTAAirPriceRQ.OriginDestinationInformation.FlightSegment> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<OTAAirPriceRQ.OriginDestinationInformation.FlightSegment>();
            }
            return this.flightSegment;
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
         *         &lt;element name="DestinationLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MarketingCarrier">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OriginLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *       &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "destinationLocation",
            "marketingCarrier",
            "originLocation"
        })
        public static class FlightSegment {

            @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation;
            @XmlElement(name = "MarketingCarrier", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.MarketingCarrier marketingCarrier;
            @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation;
            @XmlAttribute(name = "ArrivalDateTime")
            protected String arrivalDateTime;
            @XmlAttribute(name = "ConnectionInd")
            protected String connectionInd;
            @XmlAttribute(name = "DepartureDateTime")
            protected String departureDateTime;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public void setDestinationLocation(OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the marketingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.MarketingCarrier }
             *     
             */
            public OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.MarketingCarrier getMarketingCarrier() {
                return marketingCarrier;
            }

            /**
             * Sets the value of the marketingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.MarketingCarrier }
             *     
             */
            public void setMarketingCarrier(OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.MarketingCarrier value) {
                this.marketingCarrier = value;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public void setOriginLocation(OTAAirPriceRQ.OriginDestinationInformation.FlightSegment.OriginLocation value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the arrivalDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalDateTime() {
                return arrivalDateTime;
            }

            /**
             * Sets the value of the arrivalDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalDateTime(String value) {
                this.arrivalDateTime = value;
            }

            /**
             * Gets the value of the connectionInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConnectionInd() {
                return connectionInd;
            }

            /**
             * Sets the value of the connectionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConnectionInd(String value) {
                this.connectionInd = value;
            }

            /**
             * Gets the value of the departureDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * Sets the value of the departureDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureDateTime(String value) {
                this.departureDateTime = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the resBookDesigCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigCode() {
                return resBookDesigCode;
            }

            /**
             * Sets the value of the resBookDesigCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigCode(String value) {
                this.resBookDesigCode = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
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
             *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MarketingCarrier {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "FlightNumber", required = true)
                protected String flightNumber;

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
                 * Gets the value of the flightNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightNumber() {
                    return flightNumber;
                }

                /**
                 * Sets the value of the flightNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightNumber(String value) {
                    this.flightNumber = value;
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
             *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *         &lt;element name="OptionalQualifiers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="VendorPrefs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Airline">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MiscQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AirExtras" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                               &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BaggageAllowance" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Segment" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Commission" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Endorsements" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="HemisphereCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="JourneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TourCode" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BSPInclusiveTour" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="BulkTour" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="InclusiveTour" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SuppressIT" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricingQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Account" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="BargainFinder" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Historical" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Rebook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BuyingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                             &lt;element name="CommandPricing" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Discount" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="FareBasis" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Corporate" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Fare" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FareOptions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Excursion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Net" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ItineraryOptions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BreakFare" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ForceConnection" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ForceStopOver" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="OverrideBreak" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SegmentSelect" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SideTrip" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NameSelect" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="EndNameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NetRemit" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CAR" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Cash" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Credit" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Overrides" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FuelSurchargeOverride" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="GoverningCarrierOverride" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Airline">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NoAdvancePurchase" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NoFareRestrictions" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NoMinMaxStay" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NoPenalty" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                               &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Purchase" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Ticketing" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PassengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PlusUp" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ShipsRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Taxes" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="NoTax" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxExempt" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxOverride" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ValidityDates" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="NotValidAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                                       &lt;element name="NotValidBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                                       &lt;element name="Segment">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="AlternateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="FutureTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Retain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "optionalQualifiers"
    })
    public static class PriceRequestInformation {

        @XmlElement(name = "OptionalQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
        protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers;
        @XmlAttribute(name = "FutureTicket")
        protected Boolean futureTicket;
        @XmlAttribute(name = "Retain")
        protected Boolean retain;

        /**
         * Gets the value of the optionalQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers }
         *     
         */
        public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers getOptionalQualifiers() {
            return optionalQualifiers;
        }

        /**
         * Sets the value of the optionalQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers }
         *     
         */
        public void setOptionalQualifiers(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers value) {
            this.optionalQualifiers = value;
        }

        /**
         * Gets the value of the futureTicket property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFutureTicket() {
            return futureTicket;
        }

        /**
         * Sets the value of the futureTicket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFutureTicket(Boolean value) {
            this.futureTicket = value;
        }

        /**
         * Gets the value of the retain property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetain() {
            return retain;
        }

        /**
         * Sets the value of the retain property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetain(Boolean value) {
            this.retain = value;
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
         *         &lt;element name="FlightQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="VendorPrefs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Airline">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *         &lt;element name="MiscQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AirExtras" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                     &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BaggageAllowance" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Segment" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Commission" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Endorsements" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="HemisphereCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="JourneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TourCode" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BSPInclusiveTour" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="BulkTour" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="InclusiveTour" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SuppressIT" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="PricingQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Account" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="BargainFinder" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Historical" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Rebook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BuyingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                   &lt;element name="CommandPricing" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Discount" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="FareBasis" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Corporate" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Fare" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FareOptions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Excursion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Net" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ItineraryOptions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BreakFare" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ForceConnection" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ForceStopOver" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="OverrideBreak" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SegmentSelect" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SideTrip" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NameSelect" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="EndNameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NetRemit" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CAR" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Cash" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Credit" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Overrides" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FuelSurchargeOverride" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="GoverningCarrierOverride" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Airline">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NoAdvancePurchase" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NoFareRestrictions" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NoMinMaxStay" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NoPenalty" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                     &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Purchase" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Ticketing" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PassengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PlusUp" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ShipsRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Taxes" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="NoTax" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TaxExempt" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TaxOverride" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ValidityDates" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="NotValidAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                             &lt;element name="NotValidBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                             &lt;element name="Segment">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                 &lt;attribute name="AlternateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "flightQualifiers",
            "miscQualifiers",
            "pricingQualifiers"
        })
        public static class OptionalQualifiers {

            @XmlElement(name = "FlightQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers flightQualifiers;
            @XmlElement(name = "MiscQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers miscQualifiers;
            @XmlElement(name = "PricingQualifiers", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers;

            /**
             * Gets the value of the flightQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers }
             *     
             */
            public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers getFlightQualifiers() {
                return flightQualifiers;
            }

            /**
             * Sets the value of the flightQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers }
             *     
             */
            public void setFlightQualifiers(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers value) {
                this.flightQualifiers = value;
            }

            /**
             * Gets the value of the miscQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers }
             *     
             */
            public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers getMiscQualifiers() {
                return miscQualifiers;
            }

            /**
             * Sets the value of the miscQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers }
             *     
             */
            public void setMiscQualifiers(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers value) {
                this.miscQualifiers = value;
            }

            /**
             * Gets the value of the pricingQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers }
             *     
             */
            public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers getPricingQualifiers() {
                return pricingQualifiers;
            }

            /**
             * Sets the value of the pricingQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers }
             *     
             */
            public void setPricingQualifiers(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers value) {
                this.pricingQualifiers = value;
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
             *         &lt;element name="VendorPrefs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Airline">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "vendorPrefs"
            })
            public static class FlightQualifiers {

                @XmlElement(name = "VendorPrefs", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs vendorPrefs;

                /**
                 * Gets the value of the vendorPrefs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs getVendorPrefs() {
                    return vendorPrefs;
                }

                /**
                 * Sets the value of the vendorPrefs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs }
                 *     
                 */
                public void setVendorPrefs(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs value) {
                    this.vendorPrefs = value;
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
                 *         &lt;element name="Airline">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "airline"
                })
                public static class VendorPrefs {

                    @XmlElement(name = "Airline", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline airline;

                    /**
                     * Gets the value of the airline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline getAirline() {
                        return airline;
                    }

                    /**
                     * Sets the value of the airline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline }
                     *     
                     */
                    public void setAirline(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline value) {
                        this.airline = value;
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
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Airline {

                        @XmlAttribute(name = "Code", required = true)
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
             *       &lt;sequence>
             *         &lt;element name="AirExtras" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                           &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BaggageAllowance" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Segment" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Commission" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Endorsements" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="HemisphereCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="JourneyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TourCode" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BSPInclusiveTour" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="BulkTour" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="InclusiveTour" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SuppressIT" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "airExtras",
                "baggageAllowance",
                "commission",
                "endorsements",
                "hemisphereCode",
                "journeyCode",
                "tourCode"
            })
            public static class MiscQualifiers {

                @XmlElement(name = "AirExtras", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras airExtras;
                @XmlElement(name = "BaggageAllowance", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance> baggageAllowance;
                @XmlElement(name = "Commission", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission commission;
                @XmlElement(name = "Endorsements", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements endorsements;
                @XmlElement(name = "HemisphereCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String hemisphereCode;
                @XmlElement(name = "JourneyCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String journeyCode;
                @XmlElement(name = "TourCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode tourCode;

                /**
                 * Gets the value of the airExtras property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras getAirExtras() {
                    return airExtras;
                }

                /**
                 * Sets the value of the airExtras property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras }
                 *     
                 */
                public void setAirExtras(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras value) {
                    this.airExtras = value;
                }

                /**
                 * Gets the value of the baggageAllowance property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBaggageAllowance().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance> getBaggageAllowance() {
                    if (baggageAllowance == null) {
                        baggageAllowance = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance>();
                    }
                    return this.baggageAllowance;
                }

                /**
                 * Gets the value of the commission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission getCommission() {
                    return commission;
                }

                /**
                 * Sets the value of the commission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission }
                 *     
                 */
                public void setCommission(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Commission value) {
                    this.commission = value;
                }

                /**
                 * Gets the value of the endorsements property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements getEndorsements() {
                    return endorsements;
                }

                /**
                 * Sets the value of the endorsements property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements }
                 *     
                 */
                public void setEndorsements(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Endorsements value) {
                    this.endorsements = value;
                }

                /**
                 * Gets the value of the hemisphereCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHemisphereCode() {
                    return hemisphereCode;
                }

                /**
                 * Sets the value of the hemisphereCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHemisphereCode(String value) {
                    this.hemisphereCode = value;
                }

                /**
                 * Gets the value of the journeyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJourneyCode() {
                    return journeyCode;
                }

                /**
                 * Sets the value of the journeyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJourneyCode(String value) {
                    this.journeyCode = value;
                }

                /**
                 * Gets the value of the tourCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode getTourCode() {
                    return tourCode;
                }

                /**
                 * Sets the value of the tourCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode }
                 *     
                 */
                public void setTourCode(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode value) {
                    this.tourCode = value;
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
                 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                 &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "custLoyalty",
                    "qualifier",
                    "ticketing"
                })
                public static class AirExtras {

                    @XmlElement(name = "CustLoyalty", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty> custLoyalty;
                    @XmlElement(name = "Qualifier", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<String> qualifier;
                    @XmlElement(name = "Ticketing", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing> ticketing;
                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;
                    @XmlAttribute(name = "Summary")
                    protected Boolean summary;

                    /**
                     * Gets the value of the custLoyalty property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCustLoyalty().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty> getCustLoyalty() {
                        if (custLoyalty == null) {
                            custLoyalty = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty>();
                        }
                        return this.custLoyalty;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getQualifier().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getQualifier() {
                        if (qualifier == null) {
                            qualifier = new ArrayList<String>();
                        }
                        return this.qualifier;
                    }

                    /**
                     * Gets the value of the ticketing property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTicketing().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing> getTicketing() {
                        if (ticketing == null) {
                            ticketing = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.Ticketing>();
                        }
                        return this.ticketing;
                    }

                    /**
                     * Gets the value of the ind property.
                     * 
                     */
                    public boolean isInd() {
                        return ind;
                    }

                    /**
                     * Sets the value of the ind property.
                     * 
                     */
                    public void setInd(boolean value) {
                        this.ind = value;
                    }

                    /**
                     * Gets the value of the summary property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSummary() {
                        return summary;
                    }

                    /**
                     * Sets the value of the summary property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSummary(Boolean value) {
                        this.summary = value;
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
                     *       &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="TierLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class CustLoyalty {

                        @XmlAttribute(name = "ProgramID", required = true)
                        protected String programID;
                        @XmlAttribute(name = "TierLevel", required = true)
                        protected String tierLevel;

                        /**
                         * Gets the value of the programID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getProgramID() {
                            return programID;
                        }

                        /**
                         * Sets the value of the programID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setProgramID(String value) {
                            this.programID = value;
                        }

                        /**
                         * Gets the value of the tierLevel property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTierLevel() {
                            return tierLevel;
                        }

                        /**
                         * Sets the value of the tierLevel property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTierLevel(String value) {
                            this.tierLevel = value;
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
                     *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Ticketing {

                        @XmlAttribute(name = "EndNumber")
                        protected BigInteger endNumber;
                        @XmlAttribute
                        protected BigInteger eTicketNumber;
                        @XmlAttribute(name = "Number")
                        protected BigInteger number;

                        /**
                         * Gets the value of the endNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getEndNumber() {
                            return endNumber;
                        }

                        /**
                         * Sets the value of the endNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setEndNumber(BigInteger value) {
                            this.endNumber = value;
                        }

                        /**
                         * Gets the value of the eTicketNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getETicketNumber() {
                            return eTicketNumber;
                        }

                        /**
                         * Sets the value of the eTicketNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setETicketNumber(BigInteger value) {
                            this.eTicketNumber = value;
                        }

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setNumber(BigInteger value) {
                            this.number = value;
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
                 *         &lt;element name="Segment" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segment"
                })
                public static class BaggageAllowance {

                    @XmlElement(name = "Segment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment segment;
                    @XmlAttribute(name = "Number")
                    protected String number;
                    @XmlAttribute(name = "Weight")
                    protected String weight;

                    /**
                     * Gets the value of the segment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment getSegment() {
                        return segment;
                    }

                    /**
                     * Sets the value of the segment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment }
                     *     
                     */
                    public void setSegment(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.BaggageAllowance.Segment value) {
                        this.segment = value;
                    }

                    /**
                     * Gets the value of the number property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the weight property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWeight() {
                        return weight;
                    }

                    /**
                     * Sets the value of the weight property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWeight(String value) {
                        this.weight = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;
                        @XmlAttribute(name = "EndNumber")
                        protected String endNumber;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
                        }

                        /**
                         * Gets the value of the endNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndNumber() {
                            return endNumber;
                        }

                        /**
                         * Sets the value of the endNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndNumber(String value) {
                            this.endNumber = value;
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
                 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Commission {

                    @XmlAttribute(name = "Amount")
                    protected String amount;
                    @XmlAttribute(name = "Percent")
                    protected String percent;

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAmount(String value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the percent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPercent() {
                        return percent;
                    }

                    /**
                     * Sets the value of the percent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPercent(String value) {
                        this.percent = value;
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
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Endorsements {

                    @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected String text;
                    @XmlAttribute(name = "Override")
                    protected Boolean override;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the override property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isOverride() {
                        return override;
                    }

                    /**
                     * Sets the value of the override property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setOverride(Boolean value) {
                        this.override = value;
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
                 *         &lt;element name="BSPInclusiveTour" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="BulkTour" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="InclusiveTour" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SuppressIT" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "bspInclusiveTour",
                    "bulkTour",
                    "inclusiveTour",
                    "suppressIT",
                    "text"
                })
                public static class TourCode {

                    @XmlElement(name = "BSPInclusiveTour", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BSPInclusiveTour bspInclusiveTour;
                    @XmlElement(name = "BulkTour", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BulkTour bulkTour;
                    @XmlElement(name = "InclusiveTour", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.InclusiveTour inclusiveTour;
                    @XmlElement(name = "SuppressIT", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT suppressIT;
                    @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected String text;

                    /**
                     * Gets the value of the bspInclusiveTour property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BSPInclusiveTour }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BSPInclusiveTour getBSPInclusiveTour() {
                        return bspInclusiveTour;
                    }

                    /**
                     * Sets the value of the bspInclusiveTour property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BSPInclusiveTour }
                     *     
                     */
                    public void setBSPInclusiveTour(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BSPInclusiveTour value) {
                        this.bspInclusiveTour = value;
                    }

                    /**
                     * Gets the value of the bulkTour property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BulkTour }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BulkTour getBulkTour() {
                        return bulkTour;
                    }

                    /**
                     * Sets the value of the bulkTour property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BulkTour }
                     *     
                     */
                    public void setBulkTour(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.BulkTour value) {
                        this.bulkTour = value;
                    }

                    /**
                     * Gets the value of the inclusiveTour property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.InclusiveTour }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.InclusiveTour getInclusiveTour() {
                        return inclusiveTour;
                    }

                    /**
                     * Sets the value of the inclusiveTour property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.InclusiveTour }
                     *     
                     */
                    public void setInclusiveTour(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.InclusiveTour value) {
                        this.inclusiveTour = value;
                    }

                    /**
                     * Gets the value of the suppressIT property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT getSuppressIT() {
                        return suppressIT;
                    }

                    /**
                     * Sets the value of the suppressIT property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT }
                     *     
                     */
                    public void setSuppressIT(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.TourCode.SuppressIT value) {
                        this.suppressIT = value;
                    }

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BSPInclusiveTour {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BulkTour {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class InclusiveTour {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SuppressIT {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
                            this.ind = value;
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
             *       &lt;sequence>
             *         &lt;element name="Account" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="BargainFinder" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Historical" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Rebook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BuyingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *         &lt;element name="CommandPricing" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Discount" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="FareBasis" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Corporate" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Fare" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FareOptions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Excursion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Net" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ItineraryOptions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BreakFare" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ForceConnection" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ForceStopOver" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="OverrideBreak" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SegmentSelect" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SideTrip" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NameSelect" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EndNameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NetRemit" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CAR" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Cash" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Credit" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Overrides" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FuelSurchargeOverride" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="GoverningCarrierOverride" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Airline">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NoAdvancePurchase" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NoFareRestrictions" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NoMinMaxStay" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NoPenalty" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                           &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Purchase" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Ticketing" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PassengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PlusUp" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ShipsRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Taxes" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="NoTax" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TaxExempt" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TaxOverride" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ValidityDates" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="NotValidAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *                   &lt;element name="NotValidBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *                   &lt;element name="Segment">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *       &lt;attribute name="AlternateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "account",
                "bankersSellingRate",
                "bargainFinder",
                "buyingDate",
                "commandPricing",
                "corporate",
                "fare",
                "fareOptions",
                "itineraryOptions",
                "nameSelect",
                "netRemit",
                "overrides",
                "passengerStatus",
                "passengerType",
                "plusUp",
                "shipsRegistry",
                "taxes",
                "validityDates"
            })
            public static class PricingQualifiers {

                @XmlElement(name = "Account", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account account;
                @XmlElement(name = "BankersSellingRate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String bankersSellingRate;
                @XmlElement(name = "BargainFinder", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder bargainFinder;
                @XmlElement(name = "BuyingDate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String buyingDate;
                @XmlElement(name = "CommandPricing", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing> commandPricing;
                @XmlElement(name = "Corporate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate corporate;
                @XmlElement(name = "Fare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare fare;
                @XmlElement(name = "FareOptions", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions fareOptions;
                @XmlElement(name = "ItineraryOptions", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions itineraryOptions;
                @XmlElement(name = "NameSelect", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect> nameSelect;
                @XmlElement(name = "NetRemit", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit> netRemit;
                @XmlElement(name = "Overrides", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides overrides;
                @XmlElement(name = "PassengerStatus", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String passengerStatus;
                @XmlElement(name = "PassengerType", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengerType;
                @XmlElement(name = "PlusUp", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp plusUp;
                @XmlElement(name = "ShipsRegistry", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String shipsRegistry;
                @XmlElement(name = "Taxes", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes taxes;
                @XmlElement(name = "ValidityDates", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates> validityDates;
                @XmlAttribute(name = "AlternateCurrencyCode")
                protected String alternateCurrencyCode;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "Source")
                protected String source;

                /**
                 * Gets the value of the account property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account getAccount() {
                    return account;
                }

                /**
                 * Sets the value of the account property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account }
                 *     
                 */
                public void setAccount(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account value) {
                    this.account = value;
                }

                /**
                 * Gets the value of the bankersSellingRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBankersSellingRate() {
                    return bankersSellingRate;
                }

                /**
                 * Sets the value of the bankersSellingRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBankersSellingRate(String value) {
                    this.bankersSellingRate = value;
                }

                /**
                 * Gets the value of the bargainFinder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder getBargainFinder() {
                    return bargainFinder;
                }

                /**
                 * Sets the value of the bargainFinder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder }
                 *     
                 */
                public void setBargainFinder(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.BargainFinder value) {
                    this.bargainFinder = value;
                }

                /**
                 * Gets the value of the buyingDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBuyingDate() {
                    return buyingDate;
                }

                /**
                 * Sets the value of the buyingDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBuyingDate(String value) {
                    this.buyingDate = value;
                }

                /**
                 * Gets the value of the commandPricing property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the commandPricing property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCommandPricing().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing> getCommandPricing() {
                    if (commandPricing == null) {
                        commandPricing = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing>();
                    }
                    return this.commandPricing;
                }

                /**
                 * Gets the value of the corporate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate getCorporate() {
                    return corporate;
                }

                /**
                 * Sets the value of the corporate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate }
                 *     
                 */
                public void setCorporate(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate value) {
                    this.corporate = value;
                }

                /**
                 * Gets the value of the fare property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare getFare() {
                    return fare;
                }

                /**
                 * Sets the value of the fare property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare }
                 *     
                 */
                public void setFare(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Fare value) {
                    this.fare = value;
                }

                /**
                 * Gets the value of the fareOptions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions getFareOptions() {
                    return fareOptions;
                }

                /**
                 * Sets the value of the fareOptions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions }
                 *     
                 */
                public void setFareOptions(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions value) {
                    this.fareOptions = value;
                }

                /**
                 * Gets the value of the itineraryOptions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions getItineraryOptions() {
                    return itineraryOptions;
                }

                /**
                 * Sets the value of the itineraryOptions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions }
                 *     
                 */
                public void setItineraryOptions(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions value) {
                    this.itineraryOptions = value;
                }

                /**
                 * Gets the value of the nameSelect property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nameSelect property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNameSelect().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect> getNameSelect() {
                    if (nameSelect == null) {
                        nameSelect = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NameSelect>();
                    }
                    return this.nameSelect;
                }

                /**
                 * Gets the value of the netRemit property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the netRemit property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNetRemit().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit> getNetRemit() {
                    if (netRemit == null) {
                        netRemit = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit>();
                    }
                    return this.netRemit;
                }

                /**
                 * Gets the value of the overrides property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides getOverrides() {
                    return overrides;
                }

                /**
                 * Sets the value of the overrides property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides }
                 *     
                 */
                public void setOverrides(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides value) {
                    this.overrides = value;
                }

                /**
                 * Gets the value of the passengerStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerStatus() {
                    return passengerStatus;
                }

                /**
                 * Sets the value of the passengerStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerStatus(String value) {
                    this.passengerStatus = value;
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
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> getPassengerType() {
                    if (passengerType == null) {
                        passengerType = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType>();
                    }
                    return this.passengerType;
                }

                /**
                 * Gets the value of the plusUp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp getPlusUp() {
                    return plusUp;
                }

                /**
                 * Sets the value of the plusUp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp }
                 *     
                 */
                public void setPlusUp(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PlusUp value) {
                    this.plusUp = value;
                }

                /**
                 * Gets the value of the shipsRegistry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipsRegistry() {
                    return shipsRegistry;
                }

                /**
                 * Sets the value of the shipsRegistry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipsRegistry(String value) {
                    this.shipsRegistry = value;
                }

                /**
                 * Gets the value of the taxes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes }
                 *     
                 */
                public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes getTaxes() {
                    return taxes;
                }

                /**
                 * Sets the value of the taxes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes }
                 *     
                 */
                public void setTaxes(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes value) {
                    this.taxes = value;
                }

                /**
                 * Gets the value of the validityDates property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the validityDates property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValidityDates().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates }
                 * 
                 * 
                 */
                public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates> getValidityDates() {
                    if (validityDates == null) {
                        validityDates = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates>();
                    }
                    return this.validityDates;
                }

                /**
                 * Gets the value of the alternateCurrencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlternateCurrencyCode() {
                    return alternateCurrencyCode;
                }

                /**
                 * Sets the value of the alternateCurrencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlternateCurrencyCode(String value) {
                    this.alternateCurrencyCode = value;
                }

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

                /**
                 * Gets the value of the source property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Sets the value of the source property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
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
                 *       &lt;sequence>
                 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
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
                    "code"
                })
                public static class Account {

                    @XmlElement(name = "Code", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected List<String> code;

                    /**
                     * Gets the value of the code property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the code property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getCode() {
                        if (code == null) {
                            code = new ArrayList<String>();
                        }
                        return this.code;
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
                 *       &lt;attribute name="Historical" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Rebook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BargainFinder {

                    @XmlAttribute(name = "Historical")
                    protected Boolean historical;
                    @XmlAttribute(name = "Rebook")
                    protected Boolean rebook;

                    /**
                     * Gets the value of the historical property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isHistorical() {
                        return historical;
                    }

                    /**
                     * Sets the value of the historical property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setHistorical(Boolean value) {
                        this.historical = value;
                    }

                    /**
                     * Gets the value of the rebook property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isRebook() {
                        return rebook;
                    }

                    /**
                     * Sets the value of the rebook property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setRebook(Boolean value) {
                        this.rebook = value;
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
                 *         &lt;element name="Discount" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="FareBasis" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "discount",
                    "fareBasis"
                })
                public static class CommandPricing {

                    @XmlElement(name = "Discount", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount discount;
                    @XmlElement(name = "FareBasis", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis fareBasis;
                    @XmlAttribute(name = "RPH")
                    protected String rph;

                    /**
                     * Gets the value of the discount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount getDiscount() {
                        return discount;
                    }

                    /**
                     * Sets the value of the discount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount }
                     *     
                     */
                    public void setDiscount(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.Discount value) {
                        this.discount = value;
                    }

                    /**
                     * Gets the value of the fareBasis property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis getFareBasis() {
                        return fareBasis;
                    }

                    /**
                     * Sets the value of the fareBasis property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis }
                     *     
                     */
                    public void setFareBasis(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.CommandPricing.FareBasis value) {
                        this.fareBasis = value;
                    }

                    /**
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRPH(String value) {
                        this.rph = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "AuthCode")
                        protected String authCode;
                        @XmlAttribute(name = "Percent")
                        protected String percent;

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmount(String value) {
                            this.amount = value;
                        }

                        /**
                         * Gets the value of the authCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAuthCode() {
                            return authCode;
                        }

                        /**
                         * Sets the value of the authCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAuthCode(String value) {
                            this.authCode = value;
                        }

                        /**
                         * Gets the value of the percent property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPercent() {
                            return percent;
                        }

                        /**
                         * Sets the value of the percent property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPercent(String value) {
                            this.percent = value;
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
                     *       &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FareBasis {

                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "TicketDesignator")
                        protected String ticketDesignator;

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
                 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id"
                })
                public static class Corporate {

                    @XmlElement(name = "ID", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected List<String> id;
                    @XmlAttribute(name = "Force")
                    protected String force;

                    /**
                     * Gets the value of the id property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the id property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getID().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getID() {
                        if (id == null) {
                            id = new ArrayList<String>();
                        }
                        return this.id;
                    }

                    /**
                     * Gets the value of the force property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getForce() {
                        return force;
                    }

                    /**
                     * Sets the value of the force property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setForce(String value) {
                        this.force = value;
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
                 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Fare {

                    @XmlAttribute(name = "Type", required = true)
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
                 *       &lt;attribute name="Excursion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Net" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FareOptions {

                    @XmlAttribute(name = "Excursion")
                    protected Boolean excursion;
                    @XmlAttribute(name = "Net")
                    protected Boolean net;
                    @XmlAttribute(name = "Public")
                    protected Boolean _public;
                    @XmlAttribute(name = "Private")
                    protected Boolean _private;

                    /**
                     * Gets the value of the excursion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isExcursion() {
                        return excursion;
                    }

                    /**
                     * Sets the value of the excursion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setExcursion(Boolean value) {
                        this.excursion = value;
                    }

                    /**
                     * Gets the value of the net property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isNet() {
                        return net;
                    }

                    /**
                     * Sets the value of the net property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setNet(Boolean value) {
                        this.net = value;
                    }

                    /**
                     * Gets the value of the public property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isPublic() {
                        return _public;
                    }

                    /**
                     * Sets the value of the public property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setPublic(Boolean value) {
                        this._public = value;
                    }

                    /**
                     * Gets the value of the private property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isPrivate() {
                        return _private;
                    }

                    /**
                     * Sets the value of the private property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setPrivate(Boolean value) {
                        this._private = value;
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
                 *         &lt;element name="BreakFare" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ForceConnection" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ForceStopOver" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="OverrideBreak" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SegmentSelect" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SideTrip" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "breakFare",
                    "forceConnection",
                    "forceStopOver",
                    "overrideBreak",
                    "segmentSelect",
                    "sideTrip"
                })
                public static class ItineraryOptions {

                    @XmlElement(name = "BreakFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare> breakFare;
                    @XmlElement(name = "ForceConnection", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection> forceConnection;
                    @XmlElement(name = "ForceStopOver", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver> forceStopOver;
                    @XmlElement(name = "OverrideBreak", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak> overrideBreak;
                    @XmlElement(name = "SegmentSelect", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect> segmentSelect;
                    @XmlElement(name = "SideTrip", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip sideTrip;

                    /**
                     * Gets the value of the breakFare property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the breakFare property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBreakFare().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare> getBreakFare() {
                        if (breakFare == null) {
                            breakFare = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.BreakFare>();
                        }
                        return this.breakFare;
                    }

                    /**
                     * Gets the value of the forceConnection property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the forceConnection property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getForceConnection().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection> getForceConnection() {
                        if (forceConnection == null) {
                            forceConnection = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceConnection>();
                        }
                        return this.forceConnection;
                    }

                    /**
                     * Gets the value of the forceStopOver property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the forceStopOver property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getForceStopOver().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver> getForceStopOver() {
                        if (forceStopOver == null) {
                            forceStopOver = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.ForceStopOver>();
                        }
                        return this.forceStopOver;
                    }

                    /**
                     * Gets the value of the overrideBreak property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the overrideBreak property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOverrideBreak().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak> getOverrideBreak() {
                        if (overrideBreak == null) {
                            overrideBreak = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.OverrideBreak>();
                        }
                        return this.overrideBreak;
                    }

                    /**
                     * Gets the value of the segmentSelect property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the segmentSelect property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSegmentSelect().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect> getSegmentSelect() {
                        if (segmentSelect == null) {
                            segmentSelect = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SegmentSelect>();
                        }
                        return this.segmentSelect;
                    }

                    /**
                     * Gets the value of the sideTrip property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip getSideTrip() {
                        return sideTrip;
                    }

                    /**
                     * Sets the value of the sideTrip property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip }
                     *     
                     */
                    public void setSideTrip(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ItineraryOptions.SideTrip value) {
                        this.sideTrip = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BreakFare {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ForceConnection {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ForceStopOver {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class OverrideBreak {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SegmentSelect {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;
                        @XmlAttribute(name = "EndNumber")
                        protected String endNumber;
                        @XmlAttribute(name = "RPH")
                        protected String rph;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
                        }

                        /**
                         * Gets the value of the endNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndNumber() {
                            return endNumber;
                        }

                        /**
                         * Sets the value of the endNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndNumber(String value) {
                            this.endNumber = value;
                        }

                        /**
                         * Gets the value of the rph property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRPH() {
                            return rph;
                        }

                        /**
                         * Sets the value of the rph property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRPH(String value) {
                            this.rph = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SideTrip {

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;
                        @XmlAttribute(name = "EndNumber")
                        protected String endNumber;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
                        }

                        /**
                         * Gets the value of the endNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndNumber() {
                            return endNumber;
                        }

                        /**
                         * Sets the value of the endNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndNumber(String value) {
                            this.endNumber = value;
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
                 *       &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EndNameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class NameSelect {

                    @XmlAttribute(name = "NameNumber", required = true)
                    protected String nameNumber;
                    @XmlAttribute(name = "EndNameNumber")
                    protected String endNameNumber;

                    /**
                     * Gets the value of the nameNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNameNumber() {
                        return nameNumber;
                    }

                    /**
                     * Sets the value of the nameNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNameNumber(String value) {
                        this.nameNumber = value;
                    }

                    /**
                     * Gets the value of the endNameNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEndNameNumber() {
                        return endNameNumber;
                    }

                    /**
                     * Sets the value of the endNameNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEndNameNumber(String value) {
                        this.endNameNumber = value;
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
                 *         &lt;element name="CAR" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Cash" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Credit" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "car",
                    "cash",
                    "credit"
                })
                public static class NetRemit {

                    @XmlElement(name = "CAR", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR car;
                    @XmlElement(name = "Cash", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash cash;
                    @XmlElement(name = "Credit", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit credit;
                    @XmlAttribute(name = "Code")
                    protected String code;

                    /**
                     * Gets the value of the car property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR getCAR() {
                        return car;
                    }

                    /**
                     * Sets the value of the car property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR }
                     *     
                     */
                    public void setCAR(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.CAR value) {
                        this.car = value;
                    }

                    /**
                     * Gets the value of the cash property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash getCash() {
                        return cash;
                    }

                    /**
                     * Sets the value of the cash property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash }
                     *     
                     */
                    public void setCash(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Cash value) {
                        this.cash = value;
                    }

                    /**
                     * Gets the value of the credit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit getCredit() {
                        return credit;
                    }

                    /**
                     * Sets the value of the credit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit }
                     *     
                     */
                    public void setCredit(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.NetRemit.Credit value) {
                        this.credit = value;
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class CAR {

                        @XmlAttribute(name = "Code", required = true)
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
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Cash {

                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;
                        @XmlAttribute(name = "Amount")
                        protected String amount;

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

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmount(String value) {
                            this.amount = value;
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
                     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Credit {

                        @XmlAttribute(name = "Amount", required = true)
                        protected String amount;

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmount(String value) {
                            this.amount = value;
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
                 *         &lt;element name="FuelSurchargeOverride" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="GoverningCarrierOverride" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Airline">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NoAdvancePurchase" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NoFareRestrictions" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NoMinMaxStay" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NoPenalty" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                 &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Purchase" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Ticketing" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "fuelSurchargeOverride",
                    "governingCarrierOverride",
                    "noAdvancePurchase",
                    "noFareRestrictions",
                    "noMinMaxStay",
                    "noPenalty",
                    "purchase",
                    "ticketing"
                })
                public static class Overrides {

                    @XmlElement(name = "FuelSurchargeOverride", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride fuelSurchargeOverride;
                    @XmlElement(name = "GoverningCarrierOverride", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride> governingCarrierOverride;
                    @XmlElement(name = "NoAdvancePurchase", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase noAdvancePurchase;
                    @XmlElement(name = "NoFareRestrictions", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions noFareRestrictions;
                    @XmlElement(name = "NoMinMaxStay", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay noMinMaxStay;
                    @XmlElement(name = "NoPenalty", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty noPenalty;
                    @XmlElement(name = "Purchase", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase purchase;
                    @XmlElement(name = "Ticketing", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing ticketing;

                    /**
                     * Gets the value of the fuelSurchargeOverride property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride getFuelSurchargeOverride() {
                        return fuelSurchargeOverride;
                    }

                    /**
                     * Sets the value of the fuelSurchargeOverride property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride }
                     *     
                     */
                    public void setFuelSurchargeOverride(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.FuelSurchargeOverride value) {
                        this.fuelSurchargeOverride = value;
                    }

                    /**
                     * Gets the value of the governingCarrierOverride property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the governingCarrierOverride property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGoverningCarrierOverride().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride> getGoverningCarrierOverride() {
                        if (governingCarrierOverride == null) {
                            governingCarrierOverride = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride>();
                        }
                        return this.governingCarrierOverride;
                    }

                    /**
                     * Gets the value of the noAdvancePurchase property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase getNoAdvancePurchase() {
                        return noAdvancePurchase;
                    }

                    /**
                     * Sets the value of the noAdvancePurchase property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase }
                     *     
                     */
                    public void setNoAdvancePurchase(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoAdvancePurchase value) {
                        this.noAdvancePurchase = value;
                    }

                    /**
                     * Gets the value of the noFareRestrictions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions getNoFareRestrictions() {
                        return noFareRestrictions;
                    }

                    /**
                     * Sets the value of the noFareRestrictions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions }
                     *     
                     */
                    public void setNoFareRestrictions(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoFareRestrictions value) {
                        this.noFareRestrictions = value;
                    }

                    /**
                     * Gets the value of the noMinMaxStay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay getNoMinMaxStay() {
                        return noMinMaxStay;
                    }

                    /**
                     * Sets the value of the noMinMaxStay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay }
                     *     
                     */
                    public void setNoMinMaxStay(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoMinMaxStay value) {
                        this.noMinMaxStay = value;
                    }

                    /**
                     * Gets the value of the noPenalty property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty getNoPenalty() {
                        return noPenalty;
                    }

                    /**
                     * Sets the value of the noPenalty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty }
                     *     
                     */
                    public void setNoPenalty(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.NoPenalty value) {
                        this.noPenalty = value;
                    }

                    /**
                     * Gets the value of the purchase property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase getPurchase() {
                        return purchase;
                    }

                    /**
                     * Sets the value of the purchase property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase }
                     *     
                     */
                    public void setPurchase(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Purchase value) {
                        this.purchase = value;
                    }

                    /**
                     * Gets the value of the ticketing property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing getTicketing() {
                        return ticketing;
                    }

                    /**
                     * Sets the value of the ticketing property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing }
                     *     
                     */
                    public void setTicketing(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.Ticketing value) {
                        this.ticketing = value;
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FuelSurchargeOverride {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;sequence>
                     *         &lt;element name="Airline">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "airline"
                    })
                    public static class GoverningCarrierOverride {

                        @XmlElement(name = "Airline", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                        protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline airline;
                        @XmlAttribute(name = "RPH")
                        protected String rph;

                        /**
                         * Gets the value of the airline property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline }
                         *     
                         */
                        public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline getAirline() {
                            return airline;
                        }

                        /**
                         * Sets the value of the airline property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline }
                         *     
                         */
                        public void setAirline(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Overrides.GoverningCarrierOverride.Airline value) {
                            this.airline = value;
                        }

                        /**
                         * Gets the value of the rph property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRPH() {
                            return rph;
                        }

                        /**
                         * Sets the value of the rph property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRPH(String value) {
                            this.rph = value;
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
                         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Airline {

                            @XmlAttribute(name = "Code", required = true)
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoAdvancePurchase {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoFareRestrictions {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoMinMaxStay {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *       &lt;attribute name="PenaltyPercentage" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoPenalty {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;
                        @XmlAttribute(name = "PenaltyPercentage")
                        protected String penaltyPercentage;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
                            this.ind = value;
                        }

                        /**
                         * Gets the value of the penaltyPercentage property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPenaltyPercentage() {
                            return penaltyPercentage;
                        }

                        /**
                         * Sets the value of the penaltyPercentage property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPenaltyPercentage(String value) {
                            this.penaltyPercentage = value;
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
                     *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Purchase {

                        @XmlAttribute(name = "LocationCode", required = true)
                        protected String locationCode;

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
                     *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Ticketing {

                        @XmlAttribute(name = "LocationCode", required = true)
                        protected String locationCode;

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
                 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "Code", required = true)
                    protected String code;
                    @XmlAttribute(name = "Force")
                    protected Boolean force;
                    @XmlAttribute(name = "Quantity", required = true)
                    protected String quantity;

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
                     * Gets the value of the force property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isForce() {
                        return force;
                    }

                    /**
                     * Sets the value of the force property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setForce(Boolean value) {
                        this.force = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQuantity(String value) {
                        this.quantity = value;
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
                 *         &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "ticketDesignator"
                })
                public static class PlusUp {

                    @XmlElement(name = "TicketDesignator", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String ticketDesignator;
                    @XmlAttribute(name = "Amount", required = true)
                    protected String amount;

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
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAmount(String value) {
                        this.amount = value;
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
                 *         &lt;element name="NoTax" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TaxExempt" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TaxOverride" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "noTax",
                    "taxExempt",
                    "taxOverride"
                })
                public static class Taxes {

                    @XmlElement(name = "NoTax", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax noTax;
                    @XmlElement(name = "TaxExempt", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt> taxExempt;
                    @XmlElement(name = "TaxOverride", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride> taxOverride;

                    /**
                     * Gets the value of the noTax property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax getNoTax() {
                        return noTax;
                    }

                    /**
                     * Sets the value of the noTax property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax }
                     *     
                     */
                    public void setNoTax(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.NoTax value) {
                        this.noTax = value;
                    }

                    /**
                     * Gets the value of the taxExempt property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxExempt property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxExempt().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt> getTaxExempt() {
                        if (taxExempt == null) {
                            taxExempt = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt>();
                        }
                        return this.taxExempt;
                    }

                    /**
                     * Gets the value of the taxOverride property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxOverride property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxOverride().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride> getTaxOverride() {
                        if (taxOverride == null) {
                            taxOverride = new ArrayList<OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride>();
                        }
                        return this.taxOverride;
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
                     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class NoTax {

                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         */
                        public boolean isInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         */
                        public void setInd(boolean value) {
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
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TaxExempt {

                        @XmlAttribute(name = "Code", required = true)
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
                     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TaxOverride {

                        @XmlAttribute(name = "Amount", required = true)
                        protected String amount;
                        @XmlAttribute(name = "Code", required = true)
                        protected String code;

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmount(String value) {
                            this.amount = value;
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
                 *         &lt;element name="NotValidAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
                 *         &lt;element name="NotValidBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
                 *         &lt;element name="Segment">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "notValidAfter",
                    "notValidBefore",
                    "segment"
                })
                public static class ValidityDates {

                    @XmlElement(name = "NotValidAfter", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String notValidAfter;
                    @XmlElement(name = "NotValidBefore", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String notValidBefore;
                    @XmlElement(name = "Segment", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
                    protected OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment segment;

                    /**
                     * Gets the value of the notValidAfter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotValidAfter() {
                        return notValidAfter;
                    }

                    /**
                     * Sets the value of the notValidAfter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotValidAfter(String value) {
                        this.notValidAfter = value;
                    }

                    /**
                     * Gets the value of the notValidBefore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNotValidBefore() {
                        return notValidBefore;
                    }

                    /**
                     * Sets the value of the notValidBefore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNotValidBefore(String value) {
                        this.notValidBefore = value;
                    }

                    /**
                     * Gets the value of the segment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment }
                     *     
                     */
                    public OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment getSegment() {
                        return segment;
                    }

                    /**
                     * Sets the value of the segment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment }
                     *     
                     */
                    public void setSegment(OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.ValidityDates.Segment value) {
                        this.segment = value;
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
                     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "Number", required = true)
                        protected String number;
                        @XmlAttribute(name = "EndNumber")
                        protected String endNumber;

                        /**
                         * Gets the value of the number property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumber() {
                            return number;
                        }

                        /**
                         * Sets the value of the number property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumber(String value) {
                            this.number = value;
                        }

                        /**
                         * Gets the value of the endNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndNumber() {
                            return endNumber;
                        }

                        /**
                         * Sets the value of the endNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndNumber(String value) {
                            this.endNumber = value;
                        }

                    }

                }

            }

        }

    }

}
