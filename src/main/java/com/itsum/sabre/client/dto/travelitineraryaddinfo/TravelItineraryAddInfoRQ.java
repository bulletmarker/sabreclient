
package com.itsum.sabre.client.dto.travelitineraryaddinfo;

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
 *         &lt;element name="AgencyInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StateCountyProv" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VendorPrefs" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Airline">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *                   &lt;element name="Ticketing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                           &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactNumbers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactNumber" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Corporate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="BC"/>
 *                                 &lt;enumeration value="CC"/>
 *                                 &lt;enumeration value="FR"/>
 *                                 &lt;enumeration value="TO"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GroupInfo" minOccurs="0">
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
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencyInfo",
    "customerInfo"
})
@XmlRootElement(name = "TravelItineraryAddInfoRQ", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class TravelItineraryAddInfoRQ {

    @XmlElement(name = "AgencyInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected TravelItineraryAddInfoRQ.AgencyInfo agencyInfo;
    @XmlElement(name = "CustomerInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected TravelItineraryAddInfoRQ.CustomerInfo customerInfo;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryAddInfoRQ.AgencyInfo }
     *     
     */
    public TravelItineraryAddInfoRQ.AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryAddInfoRQ.AgencyInfo }
     *     
     */
    public void setAgencyInfo(TravelItineraryAddInfoRQ.AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryAddInfoRQ.CustomerInfo }
     *     
     */
    public TravelItineraryAddInfoRQ.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryAddInfoRQ.CustomerInfo }
     *     
     */
    public void setCustomerInfo(TravelItineraryAddInfoRQ.CustomerInfo value) {
        this.customerInfo = value;
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
            return "2.0.0";
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
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StateCountyProv" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VendorPrefs" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Airline">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
     *         &lt;element name="Ticketing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                 &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "address",
        "ticketing"
    })
    public static class AgencyInfo {

        @XmlElement(name = "Address", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected TravelItineraryAddInfoRQ.AgencyInfo.Address address;
        @XmlElement(name = "Ticketing", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing;

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address }
         *     
         */
        public TravelItineraryAddInfoRQ.AgencyInfo.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address }
         *     
         */
        public void setAddress(TravelItineraryAddInfoRQ.AgencyInfo.Address value) {
            this.address = value;
        }

        /**
         * Gets the value of the ticketing property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Ticketing }
         *     
         */
        public TravelItineraryAddInfoRQ.AgencyInfo.Ticketing getTicketing() {
            return ticketing;
        }

        /**
         * Sets the value of the ticketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Ticketing }
         *     
         */
        public void setTicketing(TravelItineraryAddInfoRQ.AgencyInfo.Ticketing value) {
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
         *       &lt;sequence>
         *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StateCountyProv" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VendorPrefs" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Airline">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "addressLine",
            "cityName",
            "countryCode",
            "postalCode",
            "stateCountyProv",
            "streetNmbr",
            "vendorPrefs"
        })
        public static class Address {

            @XmlElement(name = "AddressLine", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected String addressLine;
            @XmlElement(name = "CityName", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected String cityName;
            @XmlElement(name = "CountryCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected String countryCode;
            @XmlElement(name = "PostalCode", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected String postalCode;
            @XmlElement(name = "StateCountyProv", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv stateCountyProv;
            @XmlElement(name = "StreetNmbr", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected String streetNmbr;
            @XmlElement(name = "VendorPrefs", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs vendorPrefs;

            /**
             * Gets the value of the addressLine property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressLine() {
                return addressLine;
            }

            /**
             * Sets the value of the addressLine property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressLine(String value) {
                this.addressLine = value;
            }

            /**
             * Gets the value of the cityName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityName() {
                return cityName;
            }

            /**
             * Sets the value of the cityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityName(String value) {
                this.cityName = value;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Gets the value of the stateCountyProv property.
             * 
             * @return
             *     possible object is
             *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv }
             *     
             */
            public TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv getStateCountyProv() {
                return stateCountyProv;
            }

            /**
             * Sets the value of the stateCountyProv property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv }
             *     
             */
            public void setStateCountyProv(TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv value) {
                this.stateCountyProv = value;
            }

            /**
             * Gets the value of the streetNmbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetNmbr() {
                return streetNmbr;
            }

            /**
             * Sets the value of the streetNmbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetNmbr(String value) {
                this.streetNmbr = value;
            }

            /**
             * Gets the value of the vendorPrefs property.
             * 
             * @return
             *     possible object is
             *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs }
             *     
             */
            public TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs getVendorPrefs() {
                return vendorPrefs;
            }

            /**
             * Sets the value of the vendorPrefs property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs }
             *     
             */
            public void setVendorPrefs(TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs value) {
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
             *       &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class StateCountyProv {

                @XmlAttribute(name = "StateCode", required = true)
                protected String stateCode;

                /**
                 * Gets the value of the stateCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateCode() {
                    return stateCode;
                }

                /**
                 * Sets the value of the stateCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateCode(String value) {
                    this.stateCode = value;
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
             *                 &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                protected TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline airline;

                /**
                 * Gets the value of the airline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline }
                 *     
                 */
                public TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline getAirline() {
                    return airline;
                }

                /**
                 * Sets the value of the airline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline }
                 *     
                 */
                public void setAirline(TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline value) {
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
                 *       &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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

                    @XmlAttribute(name = "Hosted", required = true)
                    protected boolean hosted;

                    /**
                     * Gets the value of the hosted property.
                     * 
                     */
                    public boolean isHosted() {
                        return hosted;
                    }

                    /**
                     * Sets the value of the hosted property.
                     * 
                     */
                    public void setHosted(boolean value) {
                        this.hosted = value;
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
         *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *       &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;
            @XmlAttribute(name = "QueueNumber")
            protected String queueNumber;
            @XmlAttribute(name = "ShortText")
            protected String shortText;
            @XmlAttribute(name = "TicketTimeLimit")
            protected String ticketTimeLimit;
            @XmlAttribute(name = "TicketType", required = true)
            protected String ticketType;

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

            /**
             * Gets the value of the queueNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueNumber() {
                return queueNumber;
            }

            /**
             * Sets the value of the queueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueNumber(String value) {
                this.queueNumber = value;
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

            /**
             * Gets the value of the ticketTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketTimeLimit() {
                return ticketTimeLimit;
            }

            /**
             * Sets the value of the ticketTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketTimeLimit(String value) {
                this.ticketTimeLimit = value;
            }

            /**
             * Gets the value of the ticketType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketType() {
                return ticketType;
            }

            /**
             * Sets the value of the ticketType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketType(String value) {
                this.ticketType = value;
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
     *         &lt;element name="ContactNumbers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactNumber" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Corporate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="BC"/>
     *                       &lt;enumeration value="CC"/>
     *                       &lt;enumeration value="FR"/>
     *                       &lt;enumeration value="TO"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GroupInfo" minOccurs="0">
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
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "contactNumbers",
        "corporate",
        "custLoyalty",
        "customerIdentifier",
        "email",
        "personName"
    })
    public static class CustomerInfo {

        @XmlElement(name = "ContactNumbers", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers contactNumbers;
        @XmlElement(name = "Corporate", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected TravelItineraryAddInfoRQ.CustomerInfo.Corporate corporate;
        @XmlElement(name = "CustLoyalty", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> custLoyalty;
        @XmlElement(name = "CustomerIdentifier", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected String customerIdentifier;
        @XmlElement(name = "Email", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<TravelItineraryAddInfoRQ.CustomerInfo.Email> email;
        @XmlElement(name = "PersonName", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<TravelItineraryAddInfoRQ.CustomerInfo.PersonName> personName;

        /**
         * Gets the value of the contactNumbers property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers }
         *     
         */
        public TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers getContactNumbers() {
            return contactNumbers;
        }

        /**
         * Sets the value of the contactNumbers property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers }
         *     
         */
        public void setContactNumbers(TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers value) {
            this.contactNumbers = value;
        }

        /**
         * Gets the value of the corporate property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryAddInfoRQ.CustomerInfo.Corporate }
         *     
         */
        public TravelItineraryAddInfoRQ.CustomerInfo.Corporate getCorporate() {
            return corporate;
        }

        /**
         * Sets the value of the corporate property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryAddInfoRQ.CustomerInfo.Corporate }
         *     
         */
        public void setCorporate(TravelItineraryAddInfoRQ.CustomerInfo.Corporate value) {
            this.corporate = value;
        }

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
         * {@link TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty }
         * 
         * 
         */
        public List<TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> getCustLoyalty() {
            if (custLoyalty == null) {
                custLoyalty = new ArrayList<TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty>();
            }
            return this.custLoyalty;
        }

        /**
         * Gets the value of the customerIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerIdentifier() {
            return customerIdentifier;
        }

        /**
         * Sets the value of the customerIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerIdentifier(String value) {
            this.customerIdentifier = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelItineraryAddInfoRQ.CustomerInfo.Email }
         * 
         * 
         */
        public List<TravelItineraryAddInfoRQ.CustomerInfo.Email> getEmail() {
            if (email == null) {
                email = new ArrayList<TravelItineraryAddInfoRQ.CustomerInfo.Email>();
            }
            return this.email;
        }

        /**
         * Gets the value of the personName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName }
         * 
         * 
         */
        public List<TravelItineraryAddInfoRQ.CustomerInfo.PersonName> getPersonName() {
            if (personName == null) {
                personName = new ArrayList<TravelItineraryAddInfoRQ.CustomerInfo.PersonName>();
            }
            return this.personName;
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
         *         &lt;element name="ContactNumber" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "contactNumber"
        })
        public static class ContactNumbers {

            @XmlElement(name = "ContactNumber", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected List<TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> contactNumber;

            /**
             * Gets the value of the contactNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contactNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContactNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber }
             * 
             * 
             */
            public List<TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> getContactNumber() {
                if (contactNumber == null) {
                    contactNumber = new ArrayList<TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber>();
                }
                return this.contactNumber;
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
             *       &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ContactNumber {

                @XmlAttribute(name = "InsertAfter")
                protected BigInteger insertAfter;
                @XmlAttribute(name = "LocationCode")
                protected String locationCode;
                @XmlAttribute(name = "NameNumber")
                protected String nameNumber;
                @XmlAttribute(name = "Phone", required = true)
                protected String phone;
                @XmlAttribute(name = "PhoneUseType", required = true)
                protected String phoneUseType;

                /**
                 * Gets the value of the insertAfter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getInsertAfter() {
                    return insertAfter;
                }

                /**
                 * Sets the value of the insertAfter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setInsertAfter(BigInteger value) {
                    this.insertAfter = value;
                }

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
                 * Gets the value of the phone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhone() {
                    return phone;
                }

                /**
                 * Sets the value of the phone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhone(String value) {
                    this.phone = value;
                }

                /**
                 * Gets the value of the phoneUseType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhoneUseType() {
                    return phoneUseType;
                }

                /**
                 * Sets the value of the phoneUseType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhoneUseType(String value) {
                    this.phoneUseType = value;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id"
        })
        public static class Corporate {

            @XmlElement(name = "ID", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
            protected String id;

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
         *       &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "MembershipID", required = true)
            protected String membershipID;
            @XmlAttribute(name = "NameNumber")
            protected String nameNumber;
            @XmlAttribute(name = "ProgramID", required = true)
            protected String programID;
            @XmlAttribute(name = "SegmentNumber")
            protected String segmentNumber;
            @XmlAttribute(name = "TravelingCarrierCode")
            protected String travelingCarrierCode;

            /**
             * Gets the value of the membershipID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMembershipID() {
                return membershipID;
            }

            /**
             * Sets the value of the membershipID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMembershipID(String value) {
                this.membershipID = value;
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
             * Gets the value of the travelingCarrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelingCarrierCode() {
                return travelingCarrierCode;
            }

            /**
             * Sets the value of the travelingCarrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelingCarrierCode(String value) {
                this.travelingCarrierCode = value;
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
         *       &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="BC"/>
         *             &lt;enumeration value="CC"/>
         *             &lt;enumeration value="FR"/>
         *             &lt;enumeration value="TO"/>
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
        public static class Email {

            @XmlAttribute(name = "Address", required = true)
            protected String address;
            @XmlAttribute(name = "NameNumber")
            protected String nameNumber;
            @XmlAttribute(name = "ShortText")
            protected String shortText;
            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
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
         *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GroupInfo" minOccurs="0">
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
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "groupInfo",
            "surname"
        })
        public static class PersonName {

            @XmlElement(name = "GivenName", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected String givenName;
            @XmlElement(name = "GroupInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo groupInfo;
            @XmlElement(name = "Surname", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected String surname;
            @XmlAttribute(name = "Infant")
            protected Boolean infant;
            @XmlAttribute(name = "NameNumber")
            protected String nameNumber;
            @XmlAttribute(name = "NameReference")
            protected String nameReference;
            @XmlAttribute(name = "PassengerType")
            protected String passengerType;

            /**
             * Gets the value of the givenName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGivenName() {
                return givenName;
            }

            /**
             * Sets the value of the givenName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGivenName(String value) {
                this.givenName = value;
            }

            /**
             * Gets the value of the groupInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo }
             *     
             */
            public TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo getGroupInfo() {
                return groupInfo;
            }

            /**
             * Sets the value of the groupInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo }
             *     
             */
            public void setGroupInfo(TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo value) {
                this.groupInfo = value;
            }

            /**
             * Gets the value of the surname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurname() {
                return surname;
            }

            /**
             * Sets the value of the surname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurname(String value) {
                this.surname = value;
            }

            /**
             * Gets the value of the infant property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInfant() {
                return infant;
            }

            /**
             * Sets the value of the infant property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInfant(Boolean value) {
                this.infant = value;
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
             * Gets the value of the nameReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameReference() {
                return nameReference;
            }

            /**
             * Sets the value of the nameReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameReference(String value) {
                this.nameReference = value;
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
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            public static class GroupInfo {

                @XmlElement(name = "VendorPrefs", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs vendorPrefs;
                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "NumSeatsRemaining", required = true)
                protected BigInteger numSeatsRemaining;

                /**
                 * Gets the value of the vendorPrefs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs }
                 *     
                 */
                public TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs getVendorPrefs() {
                    return vendorPrefs;
                }

                /**
                 * Sets the value of the vendorPrefs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs }
                 *     
                 */
                public void setVendorPrefs(TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs value) {
                    this.vendorPrefs = value;
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
                 * Gets the value of the numSeatsRemaining property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumSeatsRemaining() {
                    return numSeatsRemaining;
                }

                /**
                 * Sets the value of the numSeatsRemaining property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumSeatsRemaining(BigInteger value) {
                    this.numSeatsRemaining = value;
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
                    protected TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline airline;

                    /**
                     * Gets the value of the airline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline }
                     *     
                     */
                    public TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline getAirline() {
                        return airline;
                    }

                    /**
                     * Sets the value of the airline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline }
                     *     
                     */
                    public void setAirline(TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline value) {
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

        }

    }

}
