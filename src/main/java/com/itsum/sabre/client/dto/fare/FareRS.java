package com.itsum.sabre.client.dto.fare;

import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Warnings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Warning" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HeaderInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginLocation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DestinationLocation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TripType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="VendorPref" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CompanyShortName">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="32"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="TravelSector">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9A-Z]{1,3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="8"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CodeContext">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="32"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="PreferLevel" default="Preferred">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Only"/>
 *                                 &lt;enumeration value="Unacceptable"/>
 *                                 &lt;enumeration value="Preferred"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TravelDateOptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Currency" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SabreServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="NoReturnFlightSegment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="YYInfo" minOccurs="0">
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
 *                   &lt;element name="AdditionalVendorInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MarketingCarrier" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NumNonstops" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="NumIntermediates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="NumConnecting" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GlobalIndicator" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MaxPermittedMileage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TariffVendor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LineNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QuoteDescripton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FareBasis" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BaseFareCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="BaseSellingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BaseSellingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CAT22Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CAT35FareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BookingClass" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AlternateBookingClass" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaseFare" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DirectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TaxInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OneWayTax" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OneWayTaxPlusFare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RoundTripTax" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RoundTripTaxPlusFare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Airline" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EffectiveDate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ExpirationDate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TicketDate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdvancePurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MinStay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MaxStay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoutingDesignator" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Vendor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PrivateFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ConstructedFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NetFare" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SeasonalApplication" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SameDayFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Rule" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GlobalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HostCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Errors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Error" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ErrorInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "success",
    "warnings",
    "headerInfo",
    "lineNumber",
    "routing",
    "tpaExtensions",
    "errors"
})
@XmlRootElement(name = "FareRS", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
public class FareRS {

    @XmlElement(name = "Success", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected String success;
    @XmlElement(name = "Warnings", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRS.Warnings warnings;
    @XmlElement(name = "HeaderInfo", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRS.HeaderInfo headerInfo;
    @XmlElement(name = "LineNumber", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected List<FareRS.LineNumber> lineNumber;
    @XmlElement(name = "Routing", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected List<FareRS.Routing> routing;
    @XmlElement(name = "TPA_Extensions", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRS.TPAExtensions tpaExtensions;
    @XmlElement(name = "Errors", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
    protected FareRS.Errors errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "Version")
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
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link FareRS.Warnings }
     *     
     */
    public FareRS.Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRS.Warnings }
     *     
     */
    public void setWarnings(FareRS.Warnings value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the headerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareRS.HeaderInfo }
     *     
     */
    public FareRS.HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    /**
     * Sets the value of the headerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRS.HeaderInfo }
     *     
     */
    public void setHeaderInfo(FareRS.HeaderInfo value) {
        this.headerInfo = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRS.LineNumber }
     * 
     * 
     */
    public List<FareRS.LineNumber> getLineNumber() {
        if (lineNumber == null) {
            lineNumber = new ArrayList<FareRS.LineNumber>();
        }
        return this.lineNumber;
    }

    /**
     * Gets the value of the routing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRS.Routing }
     * 
     * 
     */
    public List<FareRS.Routing> getRouting() {
        if (routing == null) {
            routing = new ArrayList<FareRS.Routing>();
        }
        return this.routing;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link FareRS.TPAExtensions }
     *     
     */
    public FareRS.TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRS.TPAExtensions }
     *     
     */
    public void setTPAExtensions(FareRS.TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link FareRS.Errors }
     *     
     */
    public FareRS.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRS.Errors }
     *     
     */
    public void setErrors(FareRS.Errors value) {
        this.errors = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Error" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ErrorInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "error"
    })
    public static class Errors {

        @XmlElement(name = "Error", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.Errors.Error error;

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.Errors.Error }
         *     
         */
        public FareRS.Errors.Error getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.Errors.Error }
         *     
         */
        public void setError(FareRS.Errors.Error value) {
            this.error = value;
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
         *         &lt;element name="ErrorInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "errorInfo"
        })
        public static class Error {

            @XmlElement(name = "ErrorInfo", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRS.Errors.Error.ErrorInfo errorInfo;
            @XmlAttribute(name = "ErrorCode")
            protected String errorCode;
            @XmlAttribute(name = "Severity")
            protected String severity;
            @XmlAttribute(name = "ErrorMessage")
            protected String errorMessage;

            /**
             * Gets the value of the errorInfo property.
             * 
             * @return
             *     possible object is
             *     {@link FareRS.Errors.Error.ErrorInfo }
             *     
             */
            public FareRS.Errors.Error.ErrorInfo getErrorInfo() {
                return errorInfo;
            }

            /**
             * Sets the value of the errorInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRS.Errors.Error.ErrorInfo }
             *     
             */
            public void setErrorInfo(FareRS.Errors.Error.ErrorInfo value) {
                this.errorInfo = value;
            }

            /**
             * Gets the value of the errorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorCode() {
                return errorCode;
            }

            /**
             * Sets the value of the errorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorCode(String value) {
                this.errorCode = value;
            }

            /**
             * Gets the value of the severity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeverity() {
                return severity;
            }

            /**
             * Sets the value of the severity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeverity(String value) {
                this.severity = value;
            }

            /**
             * Gets the value of the errorMessage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorMessage() {
                return errorMessage;
            }

            /**
             * Sets the value of the errorMessage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorMessage(String value) {
                this.errorMessage = value;
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
             *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "message"
            })
            public static class ErrorInfo {

                @XmlElement(name = "Message", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
                protected String message;

                /**
                 * Gets the value of the message property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Sets the value of the message property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
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
     *         &lt;element name="OriginLocation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DestinationLocation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TripType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VendorPref" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CompanyShortName">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="32"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="TravelSector">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9A-Z]{1,3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="8"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CodeContext">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="32"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="PreferLevel" default="Preferred">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Only"/>
     *                       &lt;enumeration value="Unacceptable"/>
     *                       &lt;enumeration value="Preferred"/>
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
     *                 &lt;attribute name="OriginDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Currency" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SabreServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="NoReturnFlightSegment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="YYInfo" minOccurs="0">
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
     *         &lt;element name="AdditionalVendorInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MarketingCarrier" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NumNonstops" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NumIntermediates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NumConnecting" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GlobalIndicator" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MaxPermittedMileage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TariffVendor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "originLocation",
        "destinationLocation",
        "tripType",
        "vendorPref",
        "travelDateOptions",
        "currency",
        "sabreServiceLevel",
        "noReturnFlightSegment",
        "yyInfo",
        "additionalVendorInfo",
        "globalIndicator",
        "maxPermittedMileage",
        "tariffVendor",
        "text"
    })
    public static class HeaderInfo {

        @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.OriginLocation originLocation;
        @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.DestinationLocation destinationLocation;
        @XmlElement(name = "TripType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.TripType tripType;
        @XmlElement(name = "VendorPref", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<FareRS.HeaderInfo.VendorPref> vendorPref;
        @XmlElement(name = "TravelDateOptions", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.TravelDateOptions travelDateOptions;
        @XmlElement(name = "Currency", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.Currency currency;
        @XmlElement(name = "SabreServiceLevel", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<String> sabreServiceLevel;
        @XmlElement(name = "NoReturnFlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<String> noReturnFlightSegment;
        @XmlElement(name = "YYInfo", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.YYInfo yyInfo;
        @XmlElement(name = "AdditionalVendorInfo", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.AdditionalVendorInfo additionalVendorInfo;
        @XmlElement(name = "GlobalIndicator", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.GlobalIndicator globalIndicator;
        @XmlElement(name = "MaxPermittedMileage", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.MaxPermittedMileage maxPermittedMileage;
        @XmlElement(name = "TariffVendor", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.HeaderInfo.TariffVendor tariffVendor;
        @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<String> text;

        /**
         * Gets the value of the originLocation property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.OriginLocation }
         *     
         */
        public FareRS.HeaderInfo.OriginLocation getOriginLocation() {
            return originLocation;
        }

        /**
         * Sets the value of the originLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.OriginLocation }
         *     
         */
        public void setOriginLocation(FareRS.HeaderInfo.OriginLocation value) {
            this.originLocation = value;
        }

        /**
         * Gets the value of the destinationLocation property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.DestinationLocation }
         *     
         */
        public FareRS.HeaderInfo.DestinationLocation getDestinationLocation() {
            return destinationLocation;
        }

        /**
         * Sets the value of the destinationLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.DestinationLocation }
         *     
         */
        public void setDestinationLocation(FareRS.HeaderInfo.DestinationLocation value) {
            this.destinationLocation = value;
        }

        /**
         * Gets the value of the tripType property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.TripType }
         *     
         */
        public FareRS.HeaderInfo.TripType getTripType() {
            return tripType;
        }

        /**
         * Sets the value of the tripType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.TripType }
         *     
         */
        public void setTripType(FareRS.HeaderInfo.TripType value) {
            this.tripType = value;
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
         * {@link FareRS.HeaderInfo.VendorPref }
         * 
         * 
         */
        public List<FareRS.HeaderInfo.VendorPref> getVendorPref() {
            if (vendorPref == null) {
                vendorPref = new ArrayList<FareRS.HeaderInfo.VendorPref>();
            }
            return this.vendorPref;
        }

        /**
         * Gets the value of the travelDateOptions property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.TravelDateOptions }
         *     
         */
        public FareRS.HeaderInfo.TravelDateOptions getTravelDateOptions() {
            return travelDateOptions;
        }

        /**
         * Sets the value of the travelDateOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.TravelDateOptions }
         *     
         */
        public void setTravelDateOptions(FareRS.HeaderInfo.TravelDateOptions value) {
            this.travelDateOptions = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.Currency }
         *     
         */
        public FareRS.HeaderInfo.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.Currency }
         *     
         */
        public void setCurrency(FareRS.HeaderInfo.Currency value) {
            this.currency = value;
        }

        /**
         * Gets the value of the sabreServiceLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sabreServiceLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSabreServiceLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSabreServiceLevel() {
            if (sabreServiceLevel == null) {
                sabreServiceLevel = new ArrayList<String>();
            }
            return this.sabreServiceLevel;
        }

        /**
         * Gets the value of the noReturnFlightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the noReturnFlightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNoReturnFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNoReturnFlightSegment() {
            if (noReturnFlightSegment == null) {
                noReturnFlightSegment = new ArrayList<String>();
            }
            return this.noReturnFlightSegment;
        }

        /**
         * Gets the value of the yyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.YYInfo }
         *     
         */
        public FareRS.HeaderInfo.YYInfo getYYInfo() {
            return yyInfo;
        }

        /**
         * Sets the value of the yyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.YYInfo }
         *     
         */
        public void setYYInfo(FareRS.HeaderInfo.YYInfo value) {
            this.yyInfo = value;
        }

        /**
         * Gets the value of the additionalVendorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.AdditionalVendorInfo }
         *     
         */
        public FareRS.HeaderInfo.AdditionalVendorInfo getAdditionalVendorInfo() {
            return additionalVendorInfo;
        }

        /**
         * Sets the value of the additionalVendorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.AdditionalVendorInfo }
         *     
         */
        public void setAdditionalVendorInfo(FareRS.HeaderInfo.AdditionalVendorInfo value) {
            this.additionalVendorInfo = value;
        }

        /**
         * Gets the value of the globalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.GlobalIndicator }
         *     
         */
        public FareRS.HeaderInfo.GlobalIndicator getGlobalIndicator() {
            return globalIndicator;
        }

        /**
         * Sets the value of the globalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.GlobalIndicator }
         *     
         */
        public void setGlobalIndicator(FareRS.HeaderInfo.GlobalIndicator value) {
            this.globalIndicator = value;
        }

        /**
         * Gets the value of the maxPermittedMileage property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.MaxPermittedMileage }
         *     
         */
        public FareRS.HeaderInfo.MaxPermittedMileage getMaxPermittedMileage() {
            return maxPermittedMileage;
        }

        /**
         * Sets the value of the maxPermittedMileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.MaxPermittedMileage }
         *     
         */
        public void setMaxPermittedMileage(FareRS.HeaderInfo.MaxPermittedMileage value) {
            this.maxPermittedMileage = value;
        }

        /**
         * Gets the value of the tariffVendor property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.HeaderInfo.TariffVendor }
         *     
         */
        public FareRS.HeaderInfo.TariffVendor getTariffVendor() {
            return tariffVendor;
        }

        /**
         * Sets the value of the tariffVendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.HeaderInfo.TariffVendor }
         *     
         */
        public void setTariffVendor(FareRS.HeaderInfo.TariffVendor value) {
            this.tariffVendor = value;
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
         *         &lt;element name="MarketingCarrier" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NumNonstops" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NumIntermediates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NumConnecting" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "text",
            "marketingCarrier"
        })
        public static class AdditionalVendorInfo {

            @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected String text;
            @XmlElement(name = "MarketingCarrier", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected List<FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier> marketingCarrier;

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
             * Gets the value of the marketingCarrier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marketingCarrier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMarketingCarrier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier }
             * 
             * 
             */
            public List<FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier> getMarketingCarrier() {
                if (marketingCarrier == null) {
                    marketingCarrier = new ArrayList<FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier>();
                }
                return this.marketingCarrier;
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
             *         &lt;element name="NumNonstops" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NumIntermediates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NumConnecting" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "numNonstops",
                "numIntermediates",
                "numConnecting"
            })
            public static class MarketingCarrier {

                @XmlElement(name = "NumNonstops", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
                protected FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumNonstops numNonstops;
                @XmlElement(name = "NumIntermediates", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
                protected FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumIntermediates numIntermediates;
                @XmlElement(name = "NumConnecting", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
                protected FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumConnecting numConnecting;
                @XmlAttribute(name = "Code")
                protected String code;

                /**
                 * Gets the value of the numNonstops property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumNonstops }
                 *     
                 */
                public FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumNonstops getNumNonstops() {
                    return numNonstops;
                }

                /**
                 * Sets the value of the numNonstops property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumNonstops }
                 *     
                 */
                public void setNumNonstops(FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumNonstops value) {
                    this.numNonstops = value;
                }

                /**
                 * Gets the value of the numIntermediates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumIntermediates }
                 *     
                 */
                public FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumIntermediates getNumIntermediates() {
                    return numIntermediates;
                }

                /**
                 * Sets the value of the numIntermediates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumIntermediates }
                 *     
                 */
                public void setNumIntermediates(FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumIntermediates value) {
                    this.numIntermediates = value;
                }

                /**
                 * Gets the value of the numConnecting property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumConnecting }
                 *     
                 */
                public FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumConnecting getNumConnecting() {
                    return numConnecting;
                }

                /**
                 * Sets the value of the numConnecting property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumConnecting }
                 *     
                 */
                public void setNumConnecting(FareRS.HeaderInfo.AdditionalVendorInfo.MarketingCarrier.NumConnecting value) {
                    this.numConnecting = value;
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
                public static class NumConnecting {

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
                public static class NumIntermediates {

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
                public static class NumNonstops {

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
         *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                return codeContext;
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
         *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "Text")
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
        public static class MaxPermittedMileage {

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
         *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                return codeContext;
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
         *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TariffVendor {

            @XmlAttribute(name = "Text")
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
         *       &lt;attribute name="OriginDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "OriginDate")
            protected String originDate;
            @XmlAttribute(name = "EndDate")
            protected String endDate;
            @XmlAttribute(name = "ReturnDate")
            protected String returnDate;

            /**
             * Gets the value of the originDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginDate() {
                return originDate;
            }

            /**
             * Sets the value of the originDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginDate(String value) {
                this.originDate = value;
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
         *       &lt;attribute name="Text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TripType {

            @XmlAttribute(name = "Text", required = true)
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
         *       &lt;attribute name="CompanyShortName">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="32"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="TravelSector">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9A-Z]{1,3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="8"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CodeContext">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="32"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="PreferLevel" default="Preferred">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Only"/>
         *             &lt;enumeration value="Unacceptable"/>
         *             &lt;enumeration value="Preferred"/>
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
        public static class VendorPref {

            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "PreferLevel")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String preferLevel;

            /**
             * Gets the value of the companyShortName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyShortName() {
                return companyShortName;
            }

            /**
             * Sets the value of the companyShortName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyShortName(String value) {
                this.companyShortName = value;
            }

            /**
             * Gets the value of the travelSector property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelSector() {
                return travelSector;
            }

            /**
             * Sets the value of the travelSector property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelSector(String value) {
                this.travelSector = value;
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
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
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

            /**
             * Gets the value of the preferLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferLevel() {
                if (preferLevel == null) {
                    return "Preferred";
                } else {
                    return preferLevel;
                }
            }

            /**
             * Sets the value of the preferLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferLevel(String value) {
                this.preferLevel = value;
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
        public static class YYInfo {

            @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
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
     *         &lt;element name="QuoteDescripton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FareBasis" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BaseFareCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BaseSellingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BaseSellingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CAT22Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CAT35FareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BookingClass" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AlternateBookingClass" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PassengerType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BaseFare" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DirectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OneWayTax" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OneWayTaxPlusFare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RoundTripTax" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RoundTripTaxPlusFare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Airline" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EffectiveDate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExpirationDate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TicketDate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdvancePurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MinStay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MaxStay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoutingDesignator" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Vendor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PrivateFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ConstructedFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NetFare" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SeasonalApplication" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SameDayFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Rule" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "quoteDescripton",
        "fareBasis",
        "fareType",
        "bookingClass",
        "alternateBookingClass",
        "cabin",
        "passengerType",
        "baseFare",
        "taxInfo",
        "airline",
        "effectiveDate",
        "expirationDate",
        "ticketDate",
        "advancePurchase",
        "minStay",
        "maxStay",
        "routingDesignator",
        "vendor",
        "privateFare",
        "constructedFare",
        "netFare",
        "seasonalApplication",
        "sameDayFare",
        "restrictions",
        "rule"
    })
    public static class LineNumber {

        @XmlElement(name = "QuoteDescripton", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String quoteDescripton;
        @XmlElement(name = "FareBasis", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.FareBasis fareBasis;
        @XmlElement(name = "FareType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String fareType;
        @XmlElement(name = "BookingClass", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.BookingClass bookingClass;
        @XmlElement(name = "AlternateBookingClass", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.AlternateBookingClass alternateBookingClass;
        @XmlElement(name = "Cabin", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String cabin;
        @XmlElement(name = "PassengerType", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<FareRS.LineNumber.PassengerType> passengerType;
        @XmlElement(name = "BaseFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<FareRS.LineNumber.BaseFare> baseFare;
        @XmlElement(name = "TaxInfo", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.TaxInfo taxInfo;
        @XmlElement(name = "Airline", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.Airline airline;
        @XmlElement(name = "EffectiveDate", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.EffectiveDate effectiveDate;
        @XmlElement(name = "ExpirationDate", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.ExpirationDate expirationDate;
        @XmlElement(name = "TicketDate", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.TicketDate ticketDate;
        @XmlElement(name = "AdvancePurchase", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String advancePurchase;
        @XmlElement(name = "MinStay", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.MinStay minStay;
        @XmlElement(name = "MaxStay", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.MaxStay maxStay;
        @XmlElement(name = "RoutingDesignator", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.RoutingDesignator routingDesignator;
        @XmlElement(name = "Vendor", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.Vendor vendor;
        @XmlElement(name = "PrivateFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String privateFare;
        @XmlElement(name = "ConstructedFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String constructedFare;
        @XmlElement(name = "NetFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.NetFare netFare;
        @XmlElement(name = "SeasonalApplication", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<String> seasonalApplication;
        @XmlElement(name = "SameDayFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String sameDayFare;
        @XmlElement(name = "Restrictions", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String restrictions;
        @XmlElement(name = "Rule", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.LineNumber.Rule rule;
        @XmlAttribute(name = "Number", required = true)
        protected String number;

        /**
         * Gets the value of the quoteDescripton property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuoteDescripton() {
            return quoteDescripton;
        }

        /**
         * Sets the value of the quoteDescripton property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuoteDescripton(String value) {
            this.quoteDescripton = value;
        }

        /**
         * Gets the value of the fareBasis property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.FareBasis }
         *     
         */
        public FareRS.LineNumber.FareBasis getFareBasis() {
            return fareBasis;
        }

        /**
         * Sets the value of the fareBasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.FareBasis }
         *     
         */
        public void setFareBasis(FareRS.LineNumber.FareBasis value) {
            this.fareBasis = value;
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
         * Gets the value of the bookingClass property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.BookingClass }
         *     
         */
        public FareRS.LineNumber.BookingClass getBookingClass() {
            return bookingClass;
        }

        /**
         * Sets the value of the bookingClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.BookingClass }
         *     
         */
        public void setBookingClass(FareRS.LineNumber.BookingClass value) {
            this.bookingClass = value;
        }

        /**
         * Gets the value of the alternateBookingClass property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.AlternateBookingClass }
         *     
         */
        public FareRS.LineNumber.AlternateBookingClass getAlternateBookingClass() {
            return alternateBookingClass;
        }

        /**
         * Sets the value of the alternateBookingClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.AlternateBookingClass }
         *     
         */
        public void setAlternateBookingClass(FareRS.LineNumber.AlternateBookingClass value) {
            this.alternateBookingClass = value;
        }

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabin() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabin(String value) {
            this.cabin = value;
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
         * {@link FareRS.LineNumber.PassengerType }
         * 
         * 
         */
        public List<FareRS.LineNumber.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new ArrayList<FareRS.LineNumber.PassengerType>();
            }
            return this.passengerType;
        }

        /**
         * Gets the value of the baseFare property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseFare property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaseFare().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRS.LineNumber.BaseFare }
         * 
         * 
         */
        public List<FareRS.LineNumber.BaseFare> getBaseFare() {
            if (baseFare == null) {
                baseFare = new ArrayList<FareRS.LineNumber.BaseFare>();
            }
            return this.baseFare;
        }

        /**
         * Gets the value of the taxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.TaxInfo }
         *     
         */
        public FareRS.LineNumber.TaxInfo getTaxInfo() {
            return taxInfo;
        }

        /**
         * Sets the value of the taxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.TaxInfo }
         *     
         */
        public void setTaxInfo(FareRS.LineNumber.TaxInfo value) {
            this.taxInfo = value;
        }

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.Airline }
         *     
         */
        public FareRS.LineNumber.Airline getAirline() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.Airline }
         *     
         */
        public void setAirline(FareRS.LineNumber.Airline value) {
            this.airline = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.EffectiveDate }
         *     
         */
        public FareRS.LineNumber.EffectiveDate getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.EffectiveDate }
         *     
         */
        public void setEffectiveDate(FareRS.LineNumber.EffectiveDate value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.ExpirationDate }
         *     
         */
        public FareRS.LineNumber.ExpirationDate getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.ExpirationDate }
         *     
         */
        public void setExpirationDate(FareRS.LineNumber.ExpirationDate value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the ticketDate property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.TicketDate }
         *     
         */
        public FareRS.LineNumber.TicketDate getTicketDate() {
            return ticketDate;
        }

        /**
         * Sets the value of the ticketDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.TicketDate }
         *     
         */
        public void setTicketDate(FareRS.LineNumber.TicketDate value) {
            this.ticketDate = value;
        }

        /**
         * Gets the value of the advancePurchase property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvancePurchase() {
            return advancePurchase;
        }

        /**
         * Sets the value of the advancePurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvancePurchase(String value) {
            this.advancePurchase = value;
        }

        /**
         * Gets the value of the minStay property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.MinStay }
         *     
         */
        public FareRS.LineNumber.MinStay getMinStay() {
            return minStay;
        }

        /**
         * Sets the value of the minStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.MinStay }
         *     
         */
        public void setMinStay(FareRS.LineNumber.MinStay value) {
            this.minStay = value;
        }

        /**
         * Gets the value of the maxStay property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.MaxStay }
         *     
         */
        public FareRS.LineNumber.MaxStay getMaxStay() {
            return maxStay;
        }

        /**
         * Sets the value of the maxStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.MaxStay }
         *     
         */
        public void setMaxStay(FareRS.LineNumber.MaxStay value) {
            this.maxStay = value;
        }

        /**
         * Gets the value of the routingDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.RoutingDesignator }
         *     
         */
        public FareRS.LineNumber.RoutingDesignator getRoutingDesignator() {
            return routingDesignator;
        }

        /**
         * Sets the value of the routingDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.RoutingDesignator }
         *     
         */
        public void setRoutingDesignator(FareRS.LineNumber.RoutingDesignator value) {
            this.routingDesignator = value;
        }

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.Vendor }
         *     
         */
        public FareRS.LineNumber.Vendor getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.Vendor }
         *     
         */
        public void setVendor(FareRS.LineNumber.Vendor value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the privateFare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrivateFare() {
            return privateFare;
        }

        /**
         * Sets the value of the privateFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateFare(String value) {
            this.privateFare = value;
        }

        /**
         * Gets the value of the constructedFare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstructedFare() {
            return constructedFare;
        }

        /**
         * Sets the value of the constructedFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstructedFare(String value) {
            this.constructedFare = value;
        }

        /**
         * Gets the value of the netFare property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.NetFare }
         *     
         */
        public FareRS.LineNumber.NetFare getNetFare() {
            return netFare;
        }

        /**
         * Sets the value of the netFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.NetFare }
         *     
         */
        public void setNetFare(FareRS.LineNumber.NetFare value) {
            this.netFare = value;
        }

        /**
         * Gets the value of the seasonalApplication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seasonalApplication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeasonalApplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSeasonalApplication() {
            if (seasonalApplication == null) {
                seasonalApplication = new ArrayList<String>();
            }
            return this.seasonalApplication;
        }

        /**
         * Gets the value of the sameDayFare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSameDayFare() {
            return sameDayFare;
        }

        /**
         * Sets the value of the sameDayFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSameDayFare(String value) {
            this.sameDayFare = value;
        }

        /**
         * Gets the value of the restrictions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestrictions() {
            return restrictions;
        }

        /**
         * Sets the value of the restrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestrictions(String value) {
            this.restrictions = value;
        }

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.LineNumber.Rule }
         *     
         */
        public FareRS.LineNumber.Rule getRule() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.LineNumber.Rule }
         *     
         */
        public void setRule(FareRS.LineNumber.Rule value) {
            this.rule = value;
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
        public static class AlternateBookingClass {

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
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DirectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            @XmlAttribute(name = "DecimalPlaces")
            protected String decimalPlaces;
            @XmlAttribute(name = "DirectionInd")
            protected String directionInd;

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

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDecimalPlaces(String value) {
                this.decimalPlaces = value;
            }

            /**
             * Gets the value of the directionInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectionInd() {
                return directionInd;
            }

            /**
             * Sets the value of the directionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectionInd(String value) {
                this.directionInd = value;
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
         *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EffectiveDate {

            @XmlAttribute(name = "Date")
            protected String date;

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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExpirationDate {

            @XmlAttribute(name = "Date")
            protected String date;

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
         *       &lt;attribute name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BaseFareCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BaseSellingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BaseSellingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CAT22Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CAT35FareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            @XmlAttribute(name = "BaseFareAmount")
            protected BigDecimal baseFareAmount;
            @XmlAttribute(name = "BaseFareCurrencyCode")
            protected String baseFareCurrencyCode;
            @XmlAttribute(name = "PassengerType")
            protected String passengerType;
            @XmlAttribute(name = "BaseSellingAmount")
            protected BigDecimal baseSellingAmount;
            @XmlAttribute(name = "BaseSellingCurrencyCode")
            protected String baseSellingCurrencyCode;
            @XmlAttribute(name = "CAT22Ind")
            protected String cat22Ind;
            @XmlAttribute(name = "CAT35FareAmount")
            protected BigDecimal cat35FareAmount;
            @XmlAttribute(name = "CorporateID")
            protected String corporateID;

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
             * Gets the value of the baseFareAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseFareAmount() {
                return baseFareAmount;
            }

            /**
             * Sets the value of the baseFareAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseFareAmount(BigDecimal value) {
                this.baseFareAmount = value;
            }

            /**
             * Gets the value of the baseFareCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseFareCurrencyCode() {
                return baseFareCurrencyCode;
            }

            /**
             * Sets the value of the baseFareCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseFareCurrencyCode(String value) {
                this.baseFareCurrencyCode = value;
            }

            /**
             * Gets the value of the passengerType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerType() {
                return passengerType;
            }

            /**
             * Sets the value of the passengerType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerType(String value) {
                this.passengerType = value;
            }

            /**
             * Gets the value of the baseSellingAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseSellingAmount() {
                return baseSellingAmount;
            }

            /**
             * Sets the value of the baseSellingAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseSellingAmount(BigDecimal value) {
                this.baseSellingAmount = value;
            }

            /**
             * Gets the value of the baseSellingCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseSellingCurrencyCode() {
                return baseSellingCurrencyCode;
            }

            /**
             * Sets the value of the baseSellingCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseSellingCurrencyCode(String value) {
                this.baseSellingCurrencyCode = value;
            }

            /**
             * Gets the value of the cat22Ind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAT22Ind() {
                return cat22Ind;
            }

            /**
             * Sets the value of the cat22Ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAT22Ind(String value) {
                this.cat22Ind = value;
            }

            /**
             * Gets the value of the cat35FareAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCAT35FareAmount() {
                return cat35FareAmount;
            }

            /**
             * Sets the value of the cat35FareAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCAT35FareAmount(BigDecimal value) {
                this.cat35FareAmount = value;
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
        public static class MaxStay {

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
        public static class MinStay {

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
        public static class NetFare {

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
        public static class RoutingDesignator {

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
         *       &lt;sequence>
         *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "category"
        })
        public static class Rule {

            @XmlElement(name = "Category", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected List<String> category;

            /**
             * Gets the value of the category property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the category property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCategory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCategory() {
                if (category == null) {
                    category = new ArrayList<String>();
                }
                return this.category;
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
         *         &lt;element name="OneWayTax" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OneWayTaxPlusFare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RoundTripTax" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RoundTripTaxPlusFare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "oneWayTax",
            "oneWayTaxPlusFare",
            "roundTripTax",
            "roundTripTaxPlusFare"
        })
        public static class TaxInfo {

            @XmlElement(name = "OneWayTax", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRS.LineNumber.TaxInfo.OneWayTax oneWayTax;
            @XmlElement(name = "OneWayTaxPlusFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRS.LineNumber.TaxInfo.OneWayTaxPlusFare oneWayTaxPlusFare;
            @XmlElement(name = "RoundTripTax", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRS.LineNumber.TaxInfo.RoundTripTax roundTripTax;
            @XmlElement(name = "RoundTripTaxPlusFare", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
            protected FareRS.LineNumber.TaxInfo.RoundTripTaxPlusFare roundTripTaxPlusFare;

            /**
             * Gets the value of the oneWayTax property.
             * 
             * @return
             *     possible object is
             *     {@link FareRS.LineNumber.TaxInfo.OneWayTax }
             *     
             */
            public FareRS.LineNumber.TaxInfo.OneWayTax getOneWayTax() {
                return oneWayTax;
            }

            /**
             * Sets the value of the oneWayTax property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRS.LineNumber.TaxInfo.OneWayTax }
             *     
             */
            public void setOneWayTax(FareRS.LineNumber.TaxInfo.OneWayTax value) {
                this.oneWayTax = value;
            }

            /**
             * Gets the value of the oneWayTaxPlusFare property.
             * 
             * @return
             *     possible object is
             *     {@link FareRS.LineNumber.TaxInfo.OneWayTaxPlusFare }
             *     
             */
            public FareRS.LineNumber.TaxInfo.OneWayTaxPlusFare getOneWayTaxPlusFare() {
                return oneWayTaxPlusFare;
            }

            /**
             * Sets the value of the oneWayTaxPlusFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRS.LineNumber.TaxInfo.OneWayTaxPlusFare }
             *     
             */
            public void setOneWayTaxPlusFare(FareRS.LineNumber.TaxInfo.OneWayTaxPlusFare value) {
                this.oneWayTaxPlusFare = value;
            }

            /**
             * Gets the value of the roundTripTax property.
             * 
             * @return
             *     possible object is
             *     {@link FareRS.LineNumber.TaxInfo.RoundTripTax }
             *     
             */
            public FareRS.LineNumber.TaxInfo.RoundTripTax getRoundTripTax() {
                return roundTripTax;
            }

            /**
             * Sets the value of the roundTripTax property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRS.LineNumber.TaxInfo.RoundTripTax }
             *     
             */
            public void setRoundTripTax(FareRS.LineNumber.TaxInfo.RoundTripTax value) {
                this.roundTripTax = value;
            }

            /**
             * Gets the value of the roundTripTaxPlusFare property.
             * 
             * @return
             *     possible object is
             *     {@link FareRS.LineNumber.TaxInfo.RoundTripTaxPlusFare }
             *     
             */
            public FareRS.LineNumber.TaxInfo.RoundTripTaxPlusFare getRoundTripTaxPlusFare() {
                return roundTripTaxPlusFare;
            }

            /**
             * Sets the value of the roundTripTaxPlusFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareRS.LineNumber.TaxInfo.RoundTripTaxPlusFare }
             *     
             */
            public void setRoundTripTaxPlusFare(FareRS.LineNumber.TaxInfo.RoundTripTaxPlusFare value) {
                this.roundTripTaxPlusFare = value;
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
            public static class OneWayTax {

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
            public static class OneWayTaxPlusFare {

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
            public static class RoundTripTax {

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
            public static class RoundTripTaxPlusFare {

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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TicketDate {

            @XmlAttribute(name = "Date")
            protected String date;

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
        public static class Vendor {

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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GlobalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Routing {

        @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected List<String> text;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "GlobalIndicator")
        protected String globalIndicator;
        @XmlAttribute(name = "MileageAllowance")
        protected String mileageAllowance;

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
         * Gets the value of the globalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlobalIndicator() {
            return globalIndicator;
        }

        /**
         * Sets the value of the globalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlobalIndicator(String value) {
            this.globalIndicator = value;
        }

        /**
         * Gets the value of the mileageAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMileageAllowance() {
            return mileageAllowance;
        }

        /**
         * Sets the value of the mileageAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMileageAllowance(String value) {
            this.mileageAllowance = value;
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
     *         &lt;element name="HostCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "hostCommand"
    })
    public static class TPAExtensions {

        @XmlElement(name = "HostCommand", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected String hostCommand;

        /**
         * Gets the value of the hostCommand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostCommand() {
            return hostCommand;
        }

        /**
         * Sets the value of the hostCommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostCommand(String value) {
            this.hostCommand = value;
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
     *         &lt;element name="Warning" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "warning"
    })
    public static class Warnings {

        @XmlElement(name = "Warning", namespace = "http://webservices.sabre.com/sabreXML/2003/07")
        protected FareRS.Warnings.Warning warning;

        /**
         * Gets the value of the warning property.
         * 
         * @return
         *     possible object is
         *     {@link FareRS.Warnings.Warning }
         *     
         */
        public FareRS.Warnings.Warning getWarning() {
            return warning;
        }

        /**
         * Sets the value of the warning property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRS.Warnings.Warning }
         *     
         */
        public void setWarning(FareRS.Warnings.Warning value) {
            this.warning = value;
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
         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Warning {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ShortText")
            protected String shortText;

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
