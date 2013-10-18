
package com.itsum.sabre.client.dto.ota.airbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="OriginDestinationOption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" maxOccurs="10" minOccurs="0">
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
 *                             &lt;element name="MarriageGrp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                           &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "originDestinationOption"
})
@XmlRootElement(name = "OTA_AirBookRS", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class OTAAirBookRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "OriginDestinationOption", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected OTAAirBookRS.OriginDestinationOption originDestinationOption;
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
     * Gets the value of the originDestinationOption property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirBookRS.OriginDestinationOption }
     *     
     */
    public OTAAirBookRS.OriginDestinationOption getOriginDestinationOption() {
        return originDestinationOption;
    }

    /**
     * Sets the value of the originDestinationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirBookRS.OriginDestinationOption }
     *     
     */
    public void setOriginDestinationOption(OTAAirBookRS.OriginDestinationOption value) {
        this.originDestinationOption = value;
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
     *         &lt;element name="FlightSegment" maxOccurs="10" minOccurs="0">
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
     *                   &lt;element name="MarriageGrp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                 &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class OriginDestinationOption {

        @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<OTAAirBookRS.OriginDestinationOption.FlightSegment> flightSegment;

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
         * {@link OTAAirBookRS.OriginDestinationOption.FlightSegment }
         * 
         * 
         */
        public List<OTAAirBookRS.OriginDestinationOption.FlightSegment> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<OTAAirBookRS.OriginDestinationOption.FlightSegment>();
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
         *         &lt;element name="MarriageGrp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *       &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "marriageGrp",
            "originLocation"
        })
        public static class FlightSegment {

            @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation destinationLocation;
            @XmlElement(name = "MarketingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline marketingAirline;
            @XmlElement(name = "MarriageGrp", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp marriageGrp;
            @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation originLocation;
            @XmlAttribute(name = "ArrivalDateTime")
            protected String arrivalDateTime;
            @XmlAttribute(name = "DepartureDateTime")
            protected String departureDateTime;
            @XmlAttribute
            protected Boolean eTicket;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;
            @XmlAttribute(name = "NumberInParty")
            protected String numberInParty;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation }
             *     
             */
            public OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation }
             *     
             */
            public void setDestinationLocation(OTAAirBookRS.OriginDestinationOption.FlightSegment.DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the marketingAirline property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline }
             *     
             */
            public OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline getMarketingAirline() {
                return marketingAirline;
            }

            /**
             * Sets the value of the marketingAirline property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline }
             *     
             */
            public void setMarketingAirline(OTAAirBookRS.OriginDestinationOption.FlightSegment.MarketingAirline value) {
                this.marketingAirline = value;
            }

            /**
             * Gets the value of the marriageGrp property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp }
             *     
             */
            public OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp getMarriageGrp() {
                return marriageGrp;
            }

            /**
             * Sets the value of the marriageGrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp }
             *     
             */
            public void setMarriageGrp(OTAAirBookRS.OriginDestinationOption.FlightSegment.MarriageGrp value) {
                this.marriageGrp = value;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation }
             *     
             */
            public OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation }
             *     
             */
            public void setOriginLocation(OTAAirBookRS.OriginDestinationOption.FlightSegment.OriginLocation value) {
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
             * Gets the value of the eTicket property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isETicket() {
                return eTicket;
            }

            /**
             * Sets the value of the eTicket property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setETicket(Boolean value) {
                this.eTicket = value;
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
             * Gets the value of the numberInParty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberInParty() {
                return numberInParty;
            }

            /**
             * Sets the value of the numberInParty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberInParty(String value) {
                this.numberInParty = value;
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
            public static class MarriageGrp {

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

}
