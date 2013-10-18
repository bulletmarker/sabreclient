
package com.itsum.sabre.client.dto.ota.airprice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import com.itsum.sabre.client.dto.common.ApplicationResults;


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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/>
 *         &lt;element name="PriceQuote" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MiscInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HeaderInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BargainFinder" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AlternateBooking" maxOccurs="24" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DivideParty" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="ValidatingCarrier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OptionalCharges" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ChargeDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ChargeBreakdown" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Base" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Equiv" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PassengerTypeQuantity" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Taxes" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Total" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                                 &lt;element name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                                 &lt;element name="PurchaseBy" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
 *                                                 &lt;element name="ReasonForIssuance" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SSIM" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SSR" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Ticket" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TourCode" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="VendorPrefs" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Airline" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="CommericalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="EMD_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FeeApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FQTV_Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="GuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="IATA_Application" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RefundForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SegmentJourneyCouponInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ItineraryInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="DestinationLocation" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="MarketingAirline" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="OriginLocation" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                                                         &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="BookingMethodReq" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TicketingInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Ticketing" maxOccurs="9" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PersonName" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="GivenName" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Surname" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PricedItinerary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AncillaryFees" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FeeInformation" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FareCalculation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ItinTotalFare" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BaseFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Commission" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="EquivFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PrivateFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Taxes" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotalFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Warnings" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PassengerTypeQuantity" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FareBasis" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TicketingFees" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FeeInformation" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                           &lt;/sequence>
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationResults",
    "priceQuote"
})
@XmlRootElement(name = "OTA_AirPriceRS", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class OTAAirPriceRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "PriceQuote", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected OTAAirPriceRS.PriceQuote priceQuote;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the priceQuote property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirPriceRS.PriceQuote }
     *     
     */
    public OTAAirPriceRS.PriceQuote getPriceQuote() {
        return priceQuote;
    }

    /**
     * Sets the value of the priceQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirPriceRS.PriceQuote }
     *     
     */
    public void setPriceQuote(OTAAirPriceRS.PriceQuote value) {
        this.priceQuote = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MiscInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HeaderInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BargainFinder" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AlternateBooking" maxOccurs="24" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DivideParty" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="ValidatingCarrier" minOccurs="0">
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
     *                   &lt;element name="OptionalCharges" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ChargeDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ChargeBreakdown" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Base" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Equiv" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PassengerTypeQuantity" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Taxes" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Total" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                                       &lt;element name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                                       &lt;element name="PurchaseBy" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
     *                                       &lt;element name="ReasonForIssuance" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SSIM" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SSR" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Ticket" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TourCode" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="VendorPrefs" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Airline" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                     &lt;attribute name="CommericalName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="EMD_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FeeApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FQTV_Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="GuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="IATA_Application" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RefundForm" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SegmentJourneyCouponInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ItineraryInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="DestinationLocation" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="MarketingAirline" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="OriginLocation" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                                               &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="BookingMethodReq" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TicketingInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Ticketing" maxOccurs="9" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PersonName" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="GivenName" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Surname" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PricedItinerary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AncillaryFees" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FeeInformation" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FareCalculation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ItinTotalFare" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BaseFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Commission" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="EquivFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PrivateFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Taxes" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotalFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Warnings" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                     &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PassengerTypeQuantity" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FareBasis" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TicketingFees" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FeeInformation" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;/sequence>
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "miscInformation",
        "pricedItinerary"
    })
    public static class PriceQuote {

        @XmlElement(name = "MiscInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected OTAAirPriceRS.PriceQuote.MiscInformation miscInformation;
        @XmlElement(name = "PricedItinerary", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected OTAAirPriceRS.PriceQuote.PricedItinerary pricedItinerary;

        /**
         * Gets the value of the miscInformation property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation }
         *     
         */
        public OTAAirPriceRS.PriceQuote.MiscInformation getMiscInformation() {
            return miscInformation;
        }

        /**
         * Sets the value of the miscInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation }
         *     
         */
        public void setMiscInformation(OTAAirPriceRS.PriceQuote.MiscInformation value) {
            this.miscInformation = value;
        }

        /**
         * Gets the value of the pricedItinerary property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary }
         *     
         */
        public OTAAirPriceRS.PriceQuote.PricedItinerary getPricedItinerary() {
            return pricedItinerary;
        }

        /**
         * Sets the value of the pricedItinerary property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary }
         *     
         */
        public void setPricedItinerary(OTAAirPriceRS.PriceQuote.PricedItinerary value) {
            this.pricedItinerary = value;
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
         *         &lt;element name="HeaderInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BargainFinder" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AlternateBooking" maxOccurs="24" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DivideParty" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="ValidatingCarrier" minOccurs="0">
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
         *         &lt;element name="OptionalCharges" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ChargeDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ChargeBreakdown" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Base" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Equiv" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PassengerTypeQuantity" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Taxes" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Total" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                             &lt;element name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                             &lt;element name="PurchaseBy" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
         *                             &lt;element name="ReasonForIssuance" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SSIM" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SSR" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Ticket" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TourCode" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="VendorPrefs" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Airline" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                           &lt;attribute name="CommericalName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="EMD_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FeeApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FQTV_Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="GuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="IATA_Application" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RefundForm" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SegmentJourneyCouponInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ItineraryInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="DestinationLocation" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="MarketingAirline" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="OriginLocation" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="BookingMethodReq" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TicketingInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Ticketing" maxOccurs="9" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PersonName" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="GivenName" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Surname" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                     &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "headerInformation",
            "optionalCharges"
        })
        public static class MiscInformation {

            @XmlElement(name = "HeaderInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation headerInformation;
            @XmlElement(name = "OptionalCharges", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges> optionalCharges;

            /**
             * Gets the value of the headerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation }
             *     
             */
            public OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation getHeaderInformation() {
                return headerInformation;
            }

            /**
             * Sets the value of the headerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation }
             *     
             */
            public void setHeaderInformation(OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation value) {
                this.headerInformation = value;
            }

            /**
             * Gets the value of the optionalCharges property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the optionalCharges property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOptionalCharges().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges }
             * 
             * 
             */
            public List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges> getOptionalCharges() {
                if (optionalCharges == null) {
                    optionalCharges = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges>();
                }
                return this.optionalCharges;
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
             *         &lt;element name="BargainFinder" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AlternateBooking" maxOccurs="24" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DivideParty" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="LastTicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="ValidatingCarrier" minOccurs="0">
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
                "bargainFinder",
                "divideParty",
                "lastTicketingDate",
                "text",
                "validatingCarrier"
            })
            public static class HeaderInformation {

                @XmlElement(name = "BargainFinder", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder bargainFinder;
                @XmlElement(name = "DivideParty", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty divideParty;
                @XmlElement(name = "LastTicketingDate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String lastTicketingDate;
                @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<String> text;
                @XmlElement(name = "ValidatingCarrier", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier validatingCarrier;

                /**
                 * Gets the value of the bargainFinder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder getBargainFinder() {
                    return bargainFinder;
                }

                /**
                 * Sets the value of the bargainFinder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder }
                 *     
                 */
                public void setBargainFinder(OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder value) {
                    this.bargainFinder = value;
                }

                /**
                 * Gets the value of the divideParty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty getDivideParty() {
                    return divideParty;
                }

                /**
                 * Sets the value of the divideParty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty }
                 *     
                 */
                public void setDivideParty(OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.DivideParty value) {
                    this.divideParty = value;
                }

                /**
                 * Gets the value of the lastTicketingDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastTicketingDate() {
                    return lastTicketingDate;
                }

                /**
                 * Sets the value of the lastTicketingDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastTicketingDate(String value) {
                    this.lastTicketingDate = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<String>();
                    }
                    return this.text;
                }

                /**
                 * Gets the value of the validatingCarrier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier getValidatingCarrier() {
                    return validatingCarrier;
                }

                /**
                 * Sets the value of the validatingCarrier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier }
                 *     
                 */
                public void setValidatingCarrier(OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.ValidatingCarrier value) {
                    this.validatingCarrier = value;
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
                 *         &lt;element name="AlternateBooking" maxOccurs="24" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "alternateBooking"
                })
                public static class BargainFinder {

                    @XmlElement(name = "AlternateBooking", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking> alternateBooking;

                    /**
                     * Gets the value of the alternateBooking property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the alternateBooking property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAlternateBooking().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking> getAlternateBooking() {
                        if (alternateBooking == null) {
                            alternateBooking = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.HeaderInformation.BargainFinder.AlternateBooking>();
                        }
                        return this.alternateBooking;
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
                     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AlternateBooking {

                        @XmlAttribute(name = "ResBookDesigCode")
                        protected String resBookDesigCode;

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
                 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DivideParty {

                    @XmlAttribute(name = "ResBookDesigCode")
                    protected String resBookDesigCode;

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
                public static class ValidatingCarrier {

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
             *         &lt;element name="ChargeDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ChargeBreakdown" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Base" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Equiv" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PassengerTypeQuantity" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Taxes" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Total" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *                   &lt;element name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *                   &lt;element name="PurchaseBy" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
             *                   &lt;element name="ReasonForIssuance" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SSIM" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SSR" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Ticket" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TourCode" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="VendorPrefs" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Airline" minOccurs="0">
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
             *                 &lt;attribute name="CommericalName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="EMD_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FeeApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FQTV_Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="GuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="IATA_Application" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RefundForm" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SegmentJourneyCouponInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ItineraryInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="DestinationLocation" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="MarketingAirline" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="OriginLocation" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
             *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="BookingMethodReq" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TicketingInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Ticketing" maxOccurs="9" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PersonName" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="GivenName" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Surname" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                           &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "chargeDetails",
                "itineraryInfo",
                "ticketingInfo"
            })
            public static class OptionalCharges {

                @XmlElement(name = "ChargeDetails", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails chargeDetails;
                @XmlElement(name = "ItineraryInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo itineraryInfo;
                @XmlElement(name = "TicketingInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo ticketingInfo;

                /**
                 * Gets the value of the chargeDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails getChargeDetails() {
                    return chargeDetails;
                }

                /**
                 * Sets the value of the chargeDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails }
                 *     
                 */
                public void setChargeDetails(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails value) {
                    this.chargeDetails = value;
                }

                /**
                 * Gets the value of the itineraryInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo getItineraryInfo() {
                    return itineraryInfo;
                }

                /**
                 * Sets the value of the itineraryInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo }
                 *     
                 */
                public void setItineraryInfo(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo value) {
                    this.itineraryInfo = value;
                }

                /**
                 * Gets the value of the ticketingInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo getTicketingInfo() {
                    return ticketingInfo;
                }

                /**
                 * Sets the value of the ticketingInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo }
                 *     
                 */
                public void setTicketingInfo(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo value) {
                    this.ticketingInfo = value;
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
                 *         &lt;element name="ChargeBreakdown" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Base" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Equiv" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PassengerTypeQuantity" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Taxes" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Total" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
                 *         &lt;element name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
                 *         &lt;element name="PurchaseBy" type="{http://webservices.sabre.com/sabreXML/2011/10}date" minOccurs="0"/>
                 *         &lt;element name="ReasonForIssuance" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SSIM" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SSR" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Ticket" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TourCode" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="VendorPrefs" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Airline" minOccurs="0">
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
                 *       &lt;attribute name="CommericalName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DisplayOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="EMD_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FeeApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FQTV_Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="GuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="IATA_Application" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RefundForm" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SegmentJourneyCouponInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "chargeBreakdown",
                    "discontinueDate",
                    "effectiveDate",
                    "purchaseBy",
                    "reasonForIssuance",
                    "ssim",
                    "ssr",
                    "ticket",
                    "tourCode",
                    "vendorPrefs"
                })
                public static class ChargeDetails {

                    @XmlElement(name = "ChargeBreakdown", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown chargeBreakdown;
                    @XmlElement(name = "DiscontinueDate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String discontinueDate;
                    @XmlElement(name = "EffectiveDate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String effectiveDate;
                    @XmlElement(name = "PurchaseBy", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected String purchaseBy;
                    @XmlElement(name = "ReasonForIssuance", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance reasonForIssuance;
                    @XmlElement(name = "SSIM", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM ssim;
                    @XmlElement(name = "SSR", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR ssr;
                    @XmlElement(name = "Ticket", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket ticket;
                    @XmlElement(name = "TourCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode tourCode;
                    @XmlElement(name = "VendorPrefs", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs vendorPrefs;
                    @XmlAttribute(name = "CommericalName")
                    protected String commericalName;
                    @XmlAttribute(name = "DisplayOnly")
                    protected Boolean displayOnly;
                    @XmlAttribute(name = "EMD_Type")
                    protected String emdType;
                    @XmlAttribute(name = "FeeApplication")
                    protected String feeApplication;
                    @XmlAttribute(name = "FQTV_Tier")
                    protected String fqtvTier;
                    @XmlAttribute(name = "GuaranteeInd")
                    protected String guaranteeInd;
                    @XmlAttribute(name = "IATA_Application")
                    protected String iataApplication;
                    @XmlAttribute(name = "NameNumber")
                    protected String nameNumber;
                    @XmlAttribute(name = "Owner")
                    protected String owner;
                    @XmlAttribute(name = "RefundForm")
                    protected String refundForm;
                    @XmlAttribute(name = "RPH")
                    protected String rph;
                    @XmlAttribute(name = "SegmentJourneyCouponInd")
                    protected String segmentJourneyCouponInd;

                    /**
                     * Gets the value of the chargeBreakdown property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown getChargeBreakdown() {
                        return chargeBreakdown;
                    }

                    /**
                     * Sets the value of the chargeBreakdown property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown }
                     *     
                     */
                    public void setChargeBreakdown(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown value) {
                        this.chargeBreakdown = value;
                    }

                    /**
                     * Gets the value of the discontinueDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDiscontinueDate() {
                        return discontinueDate;
                    }

                    /**
                     * Sets the value of the discontinueDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDiscontinueDate(String value) {
                        this.discontinueDate = value;
                    }

                    /**
                     * Gets the value of the effectiveDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffectiveDate() {
                        return effectiveDate;
                    }

                    /**
                     * Sets the value of the effectiveDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffectiveDate(String value) {
                        this.effectiveDate = value;
                    }

                    /**
                     * Gets the value of the purchaseBy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPurchaseBy() {
                        return purchaseBy;
                    }

                    /**
                     * Sets the value of the purchaseBy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPurchaseBy(String value) {
                        this.purchaseBy = value;
                    }

                    /**
                     * Gets the value of the reasonForIssuance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance getReasonForIssuance() {
                        return reasonForIssuance;
                    }

                    /**
                     * Sets the value of the reasonForIssuance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance }
                     *     
                     */
                    public void setReasonForIssuance(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ReasonForIssuance value) {
                        this.reasonForIssuance = value;
                    }

                    /**
                     * Gets the value of the ssim property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM getSSIM() {
                        return ssim;
                    }

                    /**
                     * Sets the value of the ssim property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM }
                     *     
                     */
                    public void setSSIM(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSIM value) {
                        this.ssim = value;
                    }

                    /**
                     * Gets the value of the ssr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR getSSR() {
                        return ssr;
                    }

                    /**
                     * Sets the value of the ssr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR }
                     *     
                     */
                    public void setSSR(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.SSR value) {
                        this.ssr = value;
                    }

                    /**
                     * Gets the value of the ticket property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket getTicket() {
                        return ticket;
                    }

                    /**
                     * Sets the value of the ticket property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket }
                     *     
                     */
                    public void setTicket(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.Ticket value) {
                        this.ticket = value;
                    }

                    /**
                     * Gets the value of the tourCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode getTourCode() {
                        return tourCode;
                    }

                    /**
                     * Sets the value of the tourCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode }
                     *     
                     */
                    public void setTourCode(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.TourCode value) {
                        this.tourCode = value;
                    }

                    /**
                     * Gets the value of the vendorPrefs property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs getVendorPrefs() {
                        return vendorPrefs;
                    }

                    /**
                     * Sets the value of the vendorPrefs property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs }
                     *     
                     */
                    public void setVendorPrefs(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs value) {
                        this.vendorPrefs = value;
                    }

                    /**
                     * Gets the value of the commericalName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCommericalName() {
                        return commericalName;
                    }

                    /**
                     * Sets the value of the commericalName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCommericalName(String value) {
                        this.commericalName = value;
                    }

                    /**
                     * Gets the value of the displayOnly property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isDisplayOnly() {
                        return displayOnly;
                    }

                    /**
                     * Sets the value of the displayOnly property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setDisplayOnly(Boolean value) {
                        this.displayOnly = value;
                    }

                    /**
                     * Gets the value of the emdType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEMDType() {
                        return emdType;
                    }

                    /**
                     * Sets the value of the emdType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEMDType(String value) {
                        this.emdType = value;
                    }

                    /**
                     * Gets the value of the feeApplication property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFeeApplication() {
                        return feeApplication;
                    }

                    /**
                     * Sets the value of the feeApplication property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFeeApplication(String value) {
                        this.feeApplication = value;
                    }

                    /**
                     * Gets the value of the fqtvTier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFQTVTier() {
                        return fqtvTier;
                    }

                    /**
                     * Sets the value of the fqtvTier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFQTVTier(String value) {
                        this.fqtvTier = value;
                    }

                    /**
                     * Gets the value of the guaranteeInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGuaranteeInd() {
                        return guaranteeInd;
                    }

                    /**
                     * Sets the value of the guaranteeInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGuaranteeInd(String value) {
                        this.guaranteeInd = value;
                    }

                    /**
                     * Gets the value of the iataApplication property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIATAApplication() {
                        return iataApplication;
                    }

                    /**
                     * Sets the value of the iataApplication property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIATAApplication(String value) {
                        this.iataApplication = value;
                    }

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
                     * Gets the value of the owner property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOwner() {
                        return owner;
                    }

                    /**
                     * Sets the value of the owner property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOwner(String value) {
                        this.owner = value;
                    }

                    /**
                     * Gets the value of the refundForm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRefundForm() {
                        return refundForm;
                    }

                    /**
                     * Sets the value of the refundForm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRefundForm(String value) {
                        this.refundForm = value;
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
                     * Gets the value of the segmentJourneyCouponInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSegmentJourneyCouponInd() {
                        return segmentJourneyCouponInd;
                    }

                    /**
                     * Sets the value of the segmentJourneyCouponInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSegmentJourneyCouponInd(String value) {
                        this.segmentJourneyCouponInd = value;
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
                     *         &lt;element name="Base" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Equiv" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PassengerTypeQuantity" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Taxes" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Total" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="NoChargeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "base",
                        "equiv",
                        "passengerTypeQuantity",
                        "taxes",
                        "total"
                    })
                    public static class ChargeBreakdown {

                        @XmlElement(name = "Base", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base base;
                        @XmlElement(name = "Equiv", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv equiv;
                        @XmlElement(name = "PassengerTypeQuantity", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity passengerTypeQuantity;
                        @XmlElement(name = "Taxes", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes taxes;
                        @XmlElement(name = "Total", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total total;
                        @XmlAttribute(name = "NoChargeInd")
                        protected String noChargeInd;

                        /**
                         * Gets the value of the base property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base getBase() {
                            return base;
                        }

                        /**
                         * Sets the value of the base property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base }
                         *     
                         */
                        public void setBase(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Base value) {
                            this.base = value;
                        }

                        /**
                         * Gets the value of the equiv property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv getEquiv() {
                            return equiv;
                        }

                        /**
                         * Sets the value of the equiv property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv }
                         *     
                         */
                        public void setEquiv(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Equiv value) {
                            this.equiv = value;
                        }

                        /**
                         * Gets the value of the passengerTypeQuantity property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity getPassengerTypeQuantity() {
                            return passengerTypeQuantity;
                        }

                        /**
                         * Sets the value of the passengerTypeQuantity property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity }
                         *     
                         */
                        public void setPassengerTypeQuantity(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.PassengerTypeQuantity value) {
                            this.passengerTypeQuantity = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes }
                         *     
                         */
                        public void setTaxes(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes value) {
                            this.taxes = value;
                        }

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total }
                         *     
                         */
                        public void setTotal(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Total value) {
                            this.total = value;
                        }

                        /**
                         * Gets the value of the noChargeInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNoChargeInd() {
                            return noChargeInd;
                        }

                        /**
                         * Sets the value of the noChargeInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNoChargeInd(String value) {
                            this.noChargeInd = value;
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
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Base {

                            @XmlAttribute(name = "Amount")
                            protected String amount;
                            @XmlAttribute(name = "CurrencyCode")
                            protected String currencyCode;

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
                         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Equiv {

                            @XmlAttribute(name = "Amount")
                            protected String amount;
                            @XmlAttribute(name = "CurrencyCode")
                            protected String currencyCode;

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
                         *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class PassengerTypeQuantity {

                            @XmlAttribute(name = "Code")
                            protected String code;
                            @XmlAttribute(name = "Group")
                            protected String group;

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
                             * Gets the value of the group property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getGroup() {
                                return group;
                            }

                            /**
                             * Sets the value of the group property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setGroup(String value) {
                                this.group = value;
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
                         *         &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "tax"
                        })
                        public static class Taxes {

                            @XmlElement(name = "Tax", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                            protected List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax> tax;
                            @XmlAttribute(name = "Ind")
                            protected String ind;

                            /**
                             * Gets the value of the tax property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the tax property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getTax().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax }
                             * 
                             * 
                             */
                            public List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax> getTax() {
                                if (tax == null) {
                                    tax = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.ChargeBreakdown.Taxes.Tax>();
                                }
                                return this.tax;
                            }

                            /**
                             * Gets the value of the ind property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getInd() {
                                return ind;
                            }

                            /**
                             * Sets the value of the ind property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setInd(String value) {
                                this.ind = value;
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
                             *       &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Tax {

                                @XmlAttribute(name = "Amount")
                                protected String amount;
                                @XmlAttribute(name = "TaxCode")
                                protected String taxCode;

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
                                 * Gets the value of the taxCode property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getTaxCode() {
                                    return taxCode;
                                }

                                /**
                                 * Sets the value of the taxCode property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setTaxCode(String value) {
                                    this.taxCode = value;
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
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Total {

                            @XmlAttribute(name = "Amount")
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
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class ReasonForIssuance {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Code")
                        protected String code;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
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
                     *       &lt;sequence>
                     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    public static class SSIM {

                        @XmlElement(name = "Code", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
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
                     *       &lt;sequence>
                     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    public static class SSR {

                        @XmlElement(name = "Code", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
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
                     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Simultaneous" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Ticket {

                        @XmlAttribute(name = "Number")
                        protected String number;
                        @XmlAttribute(name = "Simultaneous")
                        protected String simultaneous;

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
                         * Gets the value of the simultaneous property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSimultaneous() {
                            return simultaneous;
                        }

                        /**
                         * Sets the value of the simultaneous property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSimultaneous(String value) {
                            this.simultaneous = value;
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
                     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "text"
                    })
                    public static class TourCode {

                        @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected String text;

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
                     *         &lt;element name="Airline" minOccurs="0">
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
                        "airline"
                    })
                    public static class VendorPrefs {

                        @XmlElement(name = "Airline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline airline;

                        /**
                         * Gets the value of the airline property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline getAirline() {
                            return airline;
                        }

                        /**
                         * Sets the value of the airline property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline }
                         *     
                         */
                        public void setAirline(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ChargeDetails.VendorPrefs.Airline value) {
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
                        public static class Airline {

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
                 *       &lt;sequence>
                 *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="DestinationLocation" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="MarketingAirline" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="OriginLocation" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                 *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="BookingMethodReq" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class ItineraryInfo {

                    @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment> flightSegment;
                    @XmlAttribute(name = "BookingMethodReq")
                    protected String bookingMethodReq;
                    @XmlAttribute(name = "SegmentCount")
                    protected String segmentCount;

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
                     * {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment> getFlightSegment() {
                        if (flightSegment == null) {
                            flightSegment = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment>();
                        }
                        return this.flightSegment;
                    }

                    /**
                     * Gets the value of the bookingMethodReq property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBookingMethodReq() {
                        return bookingMethodReq;
                    }

                    /**
                     * Sets the value of the bookingMethodReq property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBookingMethodReq(String value) {
                        this.bookingMethodReq = value;
                    }

                    /**
                     * Gets the value of the segmentCount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSegmentCount() {
                        return segmentCount;
                    }

                    /**
                     * Sets the value of the segmentCount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSegmentCount(String value) {
                        this.segmentCount = value;
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
                     *         &lt;element name="DestinationLocation" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="MarketingAirline" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="OriginLocation" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                     *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "marketingAirline",
                        "originLocation"
                    })
                    public static class FlightSegment {

                        @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation destinationLocation;
                        @XmlElement(name = "MarketingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline marketingAirline;
                        @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation originLocation;
                        @XmlAttribute(name = "DepartureDateTime")
                        protected String departureDateTime;
                        @XmlAttribute(name = "FlightNumber")
                        protected String flightNumber;
                        @XmlAttribute(name = "ResBookDesigCode")
                        protected String resBookDesigCode;
                        @XmlAttribute(name = "SegmentNumber")
                        protected String segmentNumber;
                        @XmlAttribute(name = "Status")
                        protected String status;

                        /**
                         * Gets the value of the destinationLocation property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation getDestinationLocation() {
                            return destinationLocation;
                        }

                        /**
                         * Sets the value of the destinationLocation property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation }
                         *     
                         */
                        public void setDestinationLocation(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.DestinationLocation value) {
                            this.destinationLocation = value;
                        }

                        /**
                         * Gets the value of the marketingAirline property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline getMarketingAirline() {
                            return marketingAirline;
                        }

                        /**
                         * Sets the value of the marketingAirline property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline }
                         *     
                         */
                        public void setMarketingAirline(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.MarketingAirline value) {
                            this.marketingAirline = value;
                        }

                        /**
                         * Gets the value of the originLocation property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation getOriginLocation() {
                            return originLocation;
                        }

                        /**
                         * Sets the value of the originLocation property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation }
                         *     
                         */
                        public void setOriginLocation(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.ItineraryInfo.FlightSegment.OriginLocation value) {
                            this.originLocation = value;
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
                         * Gets the value of the segmentNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSegmentNumber() {
                            return segmentNumber;
                        }

                        /**
                         * Sets the value of the segmentNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSegmentNumber(String value) {
                            this.segmentNumber = value;
                        }

                        /**
                         * Gets the value of the status property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStatus() {
                            return status;
                        }

                        /**
                         * Sets the value of the status property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStatus(String value) {
                            this.status = value;
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
                         *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                            @XmlAttribute(name = "LocationCode")
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
                         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class MarketingAirline {

                            @XmlAttribute(name = "Code")
                            protected String code;
                            @XmlAttribute(name = "FlightNumber")
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
                         *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                            @XmlAttribute(name = "LocationCode")
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
                 *         &lt;element name="Ticketing" maxOccurs="9" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PersonName" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="GivenName" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Surname" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *                 &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "ticketing"
                })
                public static class TicketingInfo {

                    @XmlElement(name = "Ticketing", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing> ticketing;

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
                     * {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing> getTicketing() {
                        if (ticketing == null) {
                            ticketing = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing>();
                        }
                        return this.ticketing;
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
                     *         &lt;element name="Coupon" maxOccurs="16" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PersonName" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="GivenName" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Surname" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                     *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "coupon",
                        "personName"
                    })
                    public static class Ticketing {

                        @XmlElement(name = "Coupon", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon> coupon;
                        @XmlElement(name = "PersonName", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName personName;
                        @XmlAttribute
                        protected String eTicketNumber;
                        @XmlAttribute(name = "ReferenceNumber")
                        protected String referenceNumber;

                        /**
                         * Gets the value of the coupon property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the coupon property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCoupon().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon }
                         * 
                         * 
                         */
                        public List<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon> getCoupon() {
                            if (coupon == null) {
                                coupon = new ArrayList<OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.Coupon>();
                            }
                            return this.coupon;
                        }

                        /**
                         * Gets the value of the personName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName }
                         *     
                         */
                        public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName getPersonName() {
                            return personName;
                        }

                        /**
                         * Sets the value of the personName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName }
                         *     
                         */
                        public void setPersonName(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName value) {
                            this.personName = value;
                        }

                        /**
                         * Gets the value of the eTicketNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getETicketNumber() {
                            return eTicketNumber;
                        }

                        /**
                         * Sets the value of the eTicketNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setETicketNumber(String value) {
                            this.eTicketNumber = value;
                        }

                        /**
                         * Gets the value of the referenceNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getReferenceNumber() {
                            return referenceNumber;
                        }

                        /**
                         * Sets the value of the referenceNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setReferenceNumber(String value) {
                            this.referenceNumber = value;
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
                         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Coupon {

                            @XmlAttribute(name = "Number")
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
                         *       &lt;sequence>
                         *         &lt;element name="GivenName" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Surname" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "givenName",
                            "surname"
                        })
                        public static class PersonName {

                            @XmlElement(name = "GivenName", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                            protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName givenName;
                            @XmlElement(name = "Surname", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                            protected OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname surname;

                            /**
                             * Gets the value of the givenName property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName }
                             *     
                             */
                            public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName getGivenName() {
                                return givenName;
                            }

                            /**
                             * Sets the value of the givenName property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName }
                             *     
                             */
                            public void setGivenName(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.GivenName value) {
                                this.givenName = value;
                            }

                            /**
                             * Gets the value of the surname property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname }
                             *     
                             */
                            public OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname getSurname() {
                                return surname;
                            }

                            /**
                             * Sets the value of the surname property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname }
                             *     
                             */
                            public void setSurname(OTAAirPriceRS.PriceQuote.MiscInformation.OptionalCharges.TicketingInfo.Ticketing.PersonName.Surname value) {
                                this.surname = value;
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
                             *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class GivenName {

                                @XmlAttribute(name = "Number")
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
                             *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Surname {

                                @XmlAttribute(name = "Number")
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

                        }

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
         *         &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AncillaryFees" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FeeInformation" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FareCalculation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ItinTotalFare" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BaseFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Commission" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="EquivFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PrivateFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Taxes" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TotalFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Warnings" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                           &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PassengerTypeQuantity" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FareBasis" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TicketingFees" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FeeInformation" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;/sequence>
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airItineraryPricingInfo"
        })
        public static class PricedItinerary {

            @XmlElement(name = "AirItineraryPricingInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo> airItineraryPricingInfo;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "TotalAmount")
            protected String totalAmount;

            /**
             * Gets the value of the airItineraryPricingInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airItineraryPricingInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirItineraryPricingInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo }
             * 
             * 
             */
            public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo> getAirItineraryPricingInfo() {
                if (airItineraryPricingInfo == null) {
                    airItineraryPricingInfo = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo>();
                }
                return this.airItineraryPricingInfo;
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
             * Gets the value of the totalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalAmount() {
                return totalAmount;
            }

            /**
             * Sets the value of the totalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalAmount(String value) {
                this.totalAmount = value;
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
             *         &lt;element name="AncillaryFees" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FeeInformation" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FareCalculation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ItinTotalFare" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BaseFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Commission" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="EquivFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PrivateFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Taxes" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TotalFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Warnings" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                 &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PassengerTypeQuantity" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FareBasis" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TicketingFees" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FeeInformation" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "ancillaryFees",
                "fareCalculation",
                "itinTotalFare",
                "passengerTypeQuantity",
                "ptcFareBreakdown",
                "ticketingFees"
            })
            public static class AirItineraryPricingInfo {

                @XmlElement(name = "AncillaryFees", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees> ancillaryFees;
                @XmlElement(name = "FareCalculation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation fareCalculation;
                @XmlElement(name = "ItinTotalFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare itinTotalFare;
                @XmlElement(name = "PassengerTypeQuantity", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity passengerTypeQuantity;
                @XmlElement(name = "PTC_FareBreakdown", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown> ptcFareBreakdown;
                @XmlElement(name = "TicketingFees", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees> ticketingFees;

                /**
                 * Gets the value of the ancillaryFees property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ancillaryFees property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAncillaryFees().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees }
                 * 
                 * 
                 */
                public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees> getAncillaryFees() {
                    if (ancillaryFees == null) {
                        ancillaryFees = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees>();
                    }
                    return this.ancillaryFees;
                }

                /**
                 * Gets the value of the fareCalculation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation getFareCalculation() {
                    return fareCalculation;
                }

                /**
                 * Sets the value of the fareCalculation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation }
                 *     
                 */
                public void setFareCalculation(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.FareCalculation value) {
                    this.fareCalculation = value;
                }

                /**
                 * Gets the value of the itinTotalFare property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare getItinTotalFare() {
                    return itinTotalFare;
                }

                /**
                 * Sets the value of the itinTotalFare property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
                 *     
                 */
                public void setItinTotalFare(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare value) {
                    this.itinTotalFare = value;
                }

                /**
                 * Gets the value of the passengerTypeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
                 *     
                 */
                public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity getPassengerTypeQuantity() {
                    return passengerTypeQuantity;
                }

                /**
                 * Sets the value of the passengerTypeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
                 *     
                 */
                public void setPassengerTypeQuantity(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity value) {
                    this.passengerTypeQuantity = value;
                }

                /**
                 * Gets the value of the ptcFareBreakdown property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPTCFareBreakdown().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown }
                 * 
                 * 
                 */
                public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown> getPTCFareBreakdown() {
                    if (ptcFareBreakdown == null) {
                        ptcFareBreakdown = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown>();
                    }
                    return this.ptcFareBreakdown;
                }

                /**
                 * Gets the value of the ticketingFees property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ticketingFees property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTicketingFees().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees }
                 * 
                 * 
                 */
                public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees> getTicketingFees() {
                    if (ticketingFees == null) {
                        ticketingFees = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees>();
                    }
                    return this.ticketingFees;
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
                 *         &lt;element name="FeeInformation" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "feeInformation"
                })
                public static class AncillaryFees {

                    @XmlElement(name = "FeeInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation feeInformation;

                    /**
                     * Gets the value of the feeInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation getFeeInformation() {
                        return feeInformation;
                    }

                    /**
                     * Sets the value of the feeInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation }
                     *     
                     */
                    public void setFeeInformation(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.FeeInformation value) {
                        this.feeInformation = value;
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
                     *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="NumFees" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "taxAmount",
                        "taxID"
                    })
                    public static class FeeInformation {

                        @XmlElement(name = "TaxAmount", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<String> taxAmount;
                        @XmlElement(name = "TaxID", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<String> taxID;
                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "NumFees")
                        protected String numFees;
                        @XmlAttribute(name = "NameNumber")
                        protected String nameNumber;
                        @XmlAttribute(name = "SegmentNumber")
                        protected String segmentNumber;

                        /**
                         * Gets the value of the taxAmount property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getTaxAmount().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getTaxAmount() {
                            if (taxAmount == null) {
                                taxAmount = new ArrayList<String>();
                            }
                            return this.taxAmount;
                        }

                        /**
                         * Gets the value of the taxID property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the taxID property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getTaxID().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getTaxID() {
                            if (taxID == null) {
                                taxID = new ArrayList<String>();
                            }
                            return this.taxID;
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
                         * Gets the value of the numFees property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumFees() {
                            return numFees;
                        }

                        /**
                         * Sets the value of the numFees property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumFees(String value) {
                            this.numFees = value;
                        }

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
                         * Gets the value of the segmentNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSegmentNumber() {
                            return segmentNumber;
                        }

                        /**
                         * Sets the value of the segmentNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSegmentNumber(String value) {
                            this.segmentNumber = value;
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
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                    "text"
                })
                public static class FareCalculation {

                    @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<String> text;

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getText() {
                        if (text == null) {
                            text = new ArrayList<String>();
                        }
                        return this.text;
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
                 *         &lt;element name="BaseFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Commission" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="EquivFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PrivateFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Taxes" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TotalFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Warnings" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseFare",
                    "commission",
                    "equivFare",
                    "privateFare",
                    "taxes",
                    "totalFare",
                    "warnings"
                })
                public static class ItinTotalFare {

                    @XmlElement(name = "BaseFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare baseFare;
                    @XmlElement(name = "Commission", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission commission;
                    @XmlElement(name = "EquivFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare equivFare;
                    @XmlElement(name = "PrivateFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare privateFare;
                    @XmlElement(name = "Taxes", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes taxes;
                    @XmlElement(name = "TotalFare", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare totalFare;
                    @XmlElement(name = "Warnings", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings warnings;
                    @XmlAttribute(name = "NonRefundableInd")
                    protected String nonRefundableInd;

                    /**
                     * Gets the value of the baseFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare getBaseFare() {
                        return baseFare;
                    }

                    /**
                     * Sets the value of the baseFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
                     *     
                     */
                    public void setBaseFare(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare value) {
                        this.baseFare = value;
                    }

                    /**
                     * Gets the value of the commission property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission getCommission() {
                        return commission;
                    }

                    /**
                     * Sets the value of the commission property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission }
                     *     
                     */
                    public void setCommission(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission value) {
                        this.commission = value;
                    }

                    /**
                     * Gets the value of the equivFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare getEquivFare() {
                        return equivFare;
                    }

                    /**
                     * Sets the value of the equivFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
                     *     
                     */
                    public void setEquivFare(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare value) {
                        this.equivFare = value;
                    }

                    /**
                     * Gets the value of the privateFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare getPrivateFare() {
                        return privateFare;
                    }

                    /**
                     * Sets the value of the privateFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare }
                     *     
                     */
                    public void setPrivateFare(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.PrivateFare value) {
                        this.privateFare = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
                     *     
                     */
                    public void setTaxes(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes value) {
                        this.taxes = value;
                    }

                    /**
                     * Gets the value of the totalFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare getTotalFare() {
                        return totalFare;
                    }

                    /**
                     * Sets the value of the totalFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
                     *     
                     */
                    public void setTotalFare(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare value) {
                        this.totalFare = value;
                    }

                    /**
                     * Gets the value of the warnings property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings getWarnings() {
                        return warnings;
                    }

                    /**
                     * Sets the value of the warnings property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings }
                     *     
                     */
                    public void setWarnings(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings value) {
                        this.warnings = value;
                    }

                    /**
                     * Gets the value of the nonRefundableInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNonRefundableInd() {
                        return nonRefundableInd;
                    }

                    /**
                     * Sets the value of the nonRefundableInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNonRefundableInd(String value) {
                        this.nonRefundableInd = value;
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
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BaseFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CapAmountInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        @XmlAttribute(name = "CapAmountInd")
                        protected String capAmountInd;
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
                         * Gets the value of the capAmountInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCapAmountInd() {
                            return capAmountInd;
                        }

                        /**
                         * Sets the value of the capAmountInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCapAmountInd(String value) {
                            this.capAmountInd = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class EquivFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class PrivateFare {

                        @XmlAttribute(name = "Ind")
                        protected String ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setInd(String value) {
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
                     *         &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "tax"
                    })
                    public static class Taxes {

                        @XmlElement(name = "Tax", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax> tax;
                        @XmlAttribute(name = "TotalAmount")
                        protected String totalAmount;

                        /**
                         * Gets the value of the tax property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the tax property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getTax().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax }
                         * 
                         * 
                         */
                        public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax> getTax() {
                            if (tax == null) {
                                tax = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax>();
                            }
                            return this.tax;
                        }

                        /**
                         * Gets the value of the totalAmount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTotalAmount() {
                            return totalAmount;
                        }

                        /**
                         * Sets the value of the totalAmount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTotalAmount(String value) {
                            this.totalAmount = value;
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
                         *       &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="TicketingTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Tax {

                            @XmlAttribute(name = "Amount")
                            protected String amount;
                            @XmlAttribute(name = "TaxCode")
                            protected String taxCode;
                            @XmlAttribute(name = "TaxName")
                            protected String taxName;
                            @XmlAttribute(name = "TicketingTaxCode")
                            protected String ticketingTaxCode;

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
                             * Gets the value of the taxCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTaxCode() {
                                return taxCode;
                            }

                            /**
                             * Sets the value of the taxCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTaxCode(String value) {
                                this.taxCode = value;
                            }

                            /**
                             * Gets the value of the taxName property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTaxName() {
                                return taxName;
                            }

                            /**
                             * Sets the value of the taxName property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTaxName(String value) {
                                this.taxName = value;
                            }

                            /**
                             * Gets the value of the ticketingTaxCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTicketingTaxCode() {
                                return ticketingTaxCode;
                            }

                            /**
                             * Sets the value of the ticketingTaxCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTicketingTaxCode(String value) {
                                this.ticketingTaxCode = value;
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
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TotalFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *       &lt;sequence>
                     *         &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "warning"
                    })
                    public static class Warnings {

                        @XmlElement(name = "Warning", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning> warning;

                        /**
                         * Gets the value of the warning property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the warning property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getWarning().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning }
                         * 
                         * 
                         */
                        public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning> getWarning() {
                            if (warning == null) {
                                warning = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning>();
                            }
                            return this.warning;
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
                         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Warning {

                            @XmlAttribute(name = "ShortText")
                            protected String shortText;

                            /**
                             * Gets the value of the shortText property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getShortText() {
                                return shortText;
                            }

                            /**
                             * Sets the value of the shortText property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setShortText(String value) {
                                this.shortText = value;
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
                 *         &lt;element name="FareBasis" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
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
                    "fareBasis",
                    "surcharges"
                })
                public static class PTCFareBreakdown {

                    @XmlElement(name = "FareBasis", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis fareBasis;
                    @XmlElement(name = "Surcharges", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges> surcharges;

                    /**
                     * Gets the value of the fareBasis property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis getFareBasis() {
                        return fareBasis;
                    }

                    /**
                     * Sets the value of the fareBasis property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
                     *     
                     */
                    public void setFareBasis(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis value) {
                        this.fareBasis = value;
                    }

                    /**
                     * Gets the value of the surcharges property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the surcharges property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSurcharges().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges }
                     * 
                     * 
                     */
                    public List<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges> getSurcharges() {
                        if (surcharges == null) {
                            surcharges = new ArrayList<OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges>();
                        }
                        return this.surcharges;
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
                     *       &lt;attribute name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FilingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="SurfaceSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        @XmlAttribute(name = "ContractNumber")
                        protected String contractNumber;
                        @XmlAttribute(name = "CorporateID")
                        protected String corporateID;
                        @XmlAttribute(name = "FarePassengerType")
                        protected String farePassengerType;
                        @XmlAttribute(name = "FareType")
                        protected String fareType;
                        @XmlAttribute(name = "FilingCarrier")
                        protected String filingCarrier;
                        @XmlAttribute(name = "GlobalInd")
                        protected String globalInd;
                        @XmlAttribute(name = "Market")
                        protected String market;
                        @XmlAttribute(name = "SurfaceSegment")
                        protected String surfaceSegment;
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
                         * Gets the value of the contractNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getContractNumber() {
                            return contractNumber;
                        }

                        /**
                         * Sets the value of the contractNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setContractNumber(String value) {
                            this.contractNumber = value;
                        }

                        /**
                         * Gets the value of the corporateID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCorporateID() {
                            return corporateID;
                        }

                        /**
                         * Sets the value of the corporateID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCorporateID(String value) {
                            this.corporateID = value;
                        }

                        /**
                         * Gets the value of the farePassengerType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFarePassengerType() {
                            return farePassengerType;
                        }

                        /**
                         * Sets the value of the farePassengerType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFarePassengerType(String value) {
                            this.farePassengerType = value;
                        }

                        /**
                         * Gets the value of the fareType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFareType() {
                            return fareType;
                        }

                        /**
                         * Sets the value of the fareType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFareType(String value) {
                            this.fareType = value;
                        }

                        /**
                         * Gets the value of the filingCarrier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFilingCarrier() {
                            return filingCarrier;
                        }

                        /**
                         * Sets the value of the filingCarrier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFilingCarrier(String value) {
                            this.filingCarrier = value;
                        }

                        /**
                         * Gets the value of the globalInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getGlobalInd() {
                            return globalInd;
                        }

                        /**
                         * Sets the value of the globalInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setGlobalInd(String value) {
                            this.globalInd = value;
                        }

                        /**
                         * Gets the value of the market property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMarket() {
                            return market;
                        }

                        /**
                         * Sets the value of the market property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMarket(String value) {
                            this.market = value;
                        }

                        /**
                         * Gets the value of the surfaceSegment property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSurfaceSegment() {
                            return surfaceSegment;
                        }

                        /**
                         * Sets the value of the surfaceSegment property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSurfaceSegment(String value) {
                            this.surfaceSegment = value;
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


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Surcharges {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Ind")
                        protected String ind;
                        @XmlAttribute(name = "Type")
                        protected String type;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setInd(String value) {
                            this.ind = value;
                        }

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
                 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PassengerTypeQuantity {

                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "Quantity")
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
                 *         &lt;element name="FeeInformation" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "feeInformation"
                })
                public static class TicketingFees {

                    @XmlElement(name = "FeeInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation feeInformation;

                    /**
                     * Gets the value of the feeInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation }
                     *     
                     */
                    public OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation getFeeInformation() {
                        return feeInformation;
                    }

                    /**
                     * Sets the value of the feeInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation }
                     *     
                     */
                    public void setFeeInformation(OTAAirPriceRS.PriceQuote.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation value) {
                        this.feeInformation = value;
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
                     *       &lt;attribute name="AccountData" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FeeInformation {

                        @XmlAttribute(name = "AccountData")
                        protected String accountData;
                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "FunctionCode")
                        protected String functionCode;
                        @XmlAttribute(name = "ServiceType")
                        protected String serviceType;

                        /**
                         * Gets the value of the accountData property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAccountData() {
                            return accountData;
                        }

                        /**
                         * Sets the value of the accountData property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAccountData(String value) {
                            this.accountData = value;
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

                        /**
                         * Gets the value of the functionCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFunctionCode() {
                            return functionCode;
                        }

                        /**
                         * Sets the value of the functionCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFunctionCode(String value) {
                            this.functionCode = value;
                        }

                        /**
                         * Gets the value of the serviceType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getServiceType() {
                            return serviceType;
                        }

                        /**
                         * Sets the value of the serviceType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setServiceType(String value) {
                            this.serviceType = value;
                        }

                    }

                }

            }

        }

    }

}
