
package com.itsum.sabre.client.dto.airseat;

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
 *         &lt;element name="Seats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Seat" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightSegment" minOccurs="0">
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
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
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
    "seats"
})
@XmlRootElement(name = "AirSeatRS", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class AirSeatRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "Seats", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected AirSeatRS.Seats seats;
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
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link AirSeatRS.Seats }
     *     
     */
    public AirSeatRS.Seats getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSeatRS.Seats }
     *     
     */
    public void setSeats(AirSeatRS.Seats value) {
        this.seats = value;
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
     *         &lt;element name="Seat" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightSegment" minOccurs="0">
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
        "seat"
    })
    public static class Seats {

        @XmlElement(name = "Seat", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected AirSeatRS.Seats.Seat seat;

        /**
         * Gets the value of the seat property.
         * 
         * @return
         *     possible object is
         *     {@link AirSeatRS.Seats.Seat }
         *     
         */
        public AirSeatRS.Seats.Seat getSeat() {
            return seat;
        }

        /**
         * Sets the value of the seat property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirSeatRS.Seats.Seat }
         *     
         */
        public void setSeat(AirSeatRS.Seats.Seat value) {
            this.seat = value;
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
         *         &lt;element name="FlightSegment" minOccurs="0">
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
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Seat {

            @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected AirSeatRS.Seats.Seat.FlightSegment flightSegment;
            @XmlAttribute(name = "Number")
            protected String number;

            /**
             * Gets the value of the flightSegment property.
             * 
             * @return
             *     possible object is
             *     {@link AirSeatRS.Seats.Seat.FlightSegment }
             *     
             */
            public AirSeatRS.Seats.Seat.FlightSegment getFlightSegment() {
                return flightSegment;
            }

            /**
             * Sets the value of the flightSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirSeatRS.Seats.Seat.FlightSegment }
             *     
             */
            public void setFlightSegment(AirSeatRS.Seats.Seat.FlightSegment value) {
                this.flightSegment = value;
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
                protected AirSeatRS.Seats.Seat.FlightSegment.DestinationLocation destinationLocation;
                @XmlElement(name = "MarketingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected AirSeatRS.Seats.Seat.FlightSegment.MarketingAirline marketingAirline;
                @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected AirSeatRS.Seats.Seat.FlightSegment.OriginLocation originLocation;
                @XmlAttribute(name = "DepartureDateTime")
                protected String departureDateTime;
                @XmlAttribute(name = "FlightNumber")
                protected String flightNumber;
                @XmlAttribute(name = "ResBookDesigCode")
                protected String resBookDesigCode;

                /**
                 * Gets the value of the destinationLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.DestinationLocation }
                 *     
                 */
                public AirSeatRS.Seats.Seat.FlightSegment.DestinationLocation getDestinationLocation() {
                    return destinationLocation;
                }

                /**
                 * Sets the value of the destinationLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.DestinationLocation }
                 *     
                 */
                public void setDestinationLocation(AirSeatRS.Seats.Seat.FlightSegment.DestinationLocation value) {
                    this.destinationLocation = value;
                }

                /**
                 * Gets the value of the marketingAirline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.MarketingAirline }
                 *     
                 */
                public AirSeatRS.Seats.Seat.FlightSegment.MarketingAirline getMarketingAirline() {
                    return marketingAirline;
                }

                /**
                 * Sets the value of the marketingAirline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.MarketingAirline }
                 *     
                 */
                public void setMarketingAirline(AirSeatRS.Seats.Seat.FlightSegment.MarketingAirline value) {
                    this.marketingAirline = value;
                }

                /**
                 * Gets the value of the originLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.OriginLocation }
                 *     
                 */
                public AirSeatRS.Seats.Seat.FlightSegment.OriginLocation getOriginLocation() {
                    return originLocation;
                }

                /**
                 * Sets the value of the originLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirSeatRS.Seats.Seat.FlightSegment.OriginLocation }
                 *     
                 */
                public void setOriginLocation(AirSeatRS.Seats.Seat.FlightSegment.OriginLocation value) {
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

    }

}
