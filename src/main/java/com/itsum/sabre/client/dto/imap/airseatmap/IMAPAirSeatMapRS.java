
package com.itsum.sabre.client.dto.imap.airseatmap;

import java.math.BigInteger;
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
 *         &lt;element name="SeatMapResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" maxOccurs="5" minOccurs="0">
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
 *                             &lt;element name="Equipment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FlightDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MarketingAirline" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OperatingAirline" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
 *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Seat" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Characteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SeatMapDetails" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirRows" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AirRow" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AirSeats" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Facility" maxOccurs="9" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                               &lt;attribute name="RowCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CabinClass" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CabinConfiguration" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AirRow" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Facility" maxOccurs="9" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ColumnInformation" maxOccurs="12" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Seat" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="DotNetFixAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SeatOccupationDefault" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="WingRow" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "seatMapResponse"
})
@XmlRootElement(name = "IMAP_AirSeatMapRS", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class IMAPAirSeatMapRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "SeatMapResponse", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected IMAPAirSeatMapRS.SeatMapResponse seatMapResponse;
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
     * Gets the value of the seatMapResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IMAPAirSeatMapRS.SeatMapResponse }
     *     
     */
    public IMAPAirSeatMapRS.SeatMapResponse getSeatMapResponse() {
        return seatMapResponse;
    }

    /**
     * Sets the value of the seatMapResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMAPAirSeatMapRS.SeatMapResponse }
     *     
     */
    public void setSeatMapResponse(IMAPAirSeatMapRS.SeatMapResponse value) {
        this.seatMapResponse = value;
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
     *         &lt;element name="FlightSegment" maxOccurs="5" minOccurs="0">
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
     *                   &lt;element name="Equipment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FlightDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MarketingAirline" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OperatingAirline" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Seat" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Characteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SeatMapDetails" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirRows" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AirRow" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AirSeats" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Facility" maxOccurs="9" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                     &lt;attribute name="RowCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CabinClass" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CabinConfiguration" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AirRow" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Facility" maxOccurs="9" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ColumnInformation" maxOccurs="12" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Seat" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="DotNetFixAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SeatOccupationDefault" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="WingRow" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "flightSegment",
        "seat",
        "seatMapDetails"
    })
    public static class SeatMapResponse {

        @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment> flightSegment;
        @XmlElement(name = "Seat", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<IMAPAirSeatMapRS.SeatMapResponse.Seat> seat;
        @XmlElement(name = "SeatMapDetails", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails> seatMapDetails;

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
         * {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment }
         * 
         * 
         */
        public List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment>();
            }
            return this.flightSegment;
        }

        /**
         * Gets the value of the seat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMAPAirSeatMapRS.SeatMapResponse.Seat }
         * 
         * 
         */
        public List<IMAPAirSeatMapRS.SeatMapResponse.Seat> getSeat() {
            if (seat == null) {
                seat = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.Seat>();
            }
            return this.seat;
        }

        /**
         * Gets the value of the seatMapDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatMapDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatMapDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails }
         * 
         * 
         */
        public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails> getSeatMapDetails() {
            if (seatMapDetails == null) {
                seatMapDetails = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails>();
            }
            return this.seatMapDetails;
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
         *         &lt;element name="Equipment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FlightDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MarketingAirline" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OperatingAirline" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            "equipment",
            "flightDetails",
            "marketingAirline",
            "operatingAirline",
            "originLocation"
        })
        public static class FlightSegment {

            @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.DestinationLocation destinationLocation;
            @XmlElement(name = "Equipment", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.Equipment equipment;
            @XmlElement(name = "FlightDetails", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.FlightDetails flightDetails;
            @XmlElement(name = "MarketingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.MarketingAirline> marketingAirline;
            @XmlElement(name = "OperatingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OperatingAirline> operatingAirline;
            @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OriginLocation originLocation;
            @XmlAttribute(name = "DepartureDateTime")
            protected String departureDateTime;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;
            @XmlAttribute(name = "RPH")
            protected BigInteger rph;

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.DestinationLocation }
             *     
             */
            public IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.DestinationLocation }
             *     
             */
            public void setDestinationLocation(IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the equipment property.
             * 
             * @return
             *     possible object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.Equipment }
             *     
             */
            public IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.Equipment getEquipment() {
                return equipment;
            }

            /**
             * Sets the value of the equipment property.
             * 
             * @param value
             *     allowed object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.Equipment }
             *     
             */
            public void setEquipment(IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.Equipment value) {
                this.equipment = value;
            }

            /**
             * Gets the value of the flightDetails property.
             * 
             * @return
             *     possible object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.FlightDetails }
             *     
             */
            public IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.FlightDetails getFlightDetails() {
                return flightDetails;
            }

            /**
             * Sets the value of the flightDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.FlightDetails }
             *     
             */
            public void setFlightDetails(IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.FlightDetails value) {
                this.flightDetails = value;
            }

            /**
             * Gets the value of the marketingAirline property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marketingAirline property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMarketingAirline().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.MarketingAirline }
             * 
             * 
             */
            public List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.MarketingAirline> getMarketingAirline() {
                if (marketingAirline == null) {
                    marketingAirline = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.MarketingAirline>();
                }
                return this.marketingAirline;
            }

            /**
             * Gets the value of the operatingAirline property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the operatingAirline property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOperatingAirline().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OperatingAirline }
             * 
             * 
             */
            public List<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OperatingAirline> getOperatingAirline() {
                if (operatingAirline == null) {
                    operatingAirline = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OperatingAirline>();
                }
                return this.operatingAirline;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OriginLocation }
             *     
             */
            public IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OriginLocation }
             *     
             */
            public void setOriginLocation(IMAPAirSeatMapRS.SeatMapResponse.FlightSegment.OriginLocation value) {
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
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRPH(BigInteger value) {
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
             *       &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Equipment {

                @XmlAttribute(name = "AirEquipType")
                protected String airEquipType;

                /**
                 * Gets the value of the airEquipType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirEquipType() {
                    return airEquipType;
                }

                /**
                 * Sets the value of the airEquipType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirEquipType(String value) {
                    this.airEquipType = value;
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
            public static class FlightDetails {

                @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
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
            public static class OperatingAirline {

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Characteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Seat {

            @XmlAttribute(name = "Characteristics")
            protected String characteristics;

            /**
             * Gets the value of the characteristics property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCharacteristics() {
                return characteristics;
            }

            /**
             * Sets the value of the characteristics property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCharacteristics(String value) {
                this.characteristics = value;
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
         *         &lt;element name="AirRows" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AirRow" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AirSeats" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Facility" maxOccurs="9" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                           &lt;attribute name="RowCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CabinClass" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CabinConfiguration" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AirRow" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Facility" maxOccurs="9" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ColumnInformation" maxOccurs="12" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Seat" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="DotNetFixAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SeatOccupationDefault" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="WingRow" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airRows",
            "cabinClass",
            "cabinConfiguration"
        })
        public static class SeatMapDetails {

            @XmlElement(name = "AirRows", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows airRows;
            @XmlElement(name = "CabinClass", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinClass> cabinClass;
            @XmlElement(name = "CabinConfiguration", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration> cabinConfiguration;
            @XmlAttribute(name = "RPH")
            protected BigInteger rph;

            /**
             * Gets the value of the airRows property.
             * 
             * @return
             *     possible object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows }
             *     
             */
            public IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows getAirRows() {
                return airRows;
            }

            /**
             * Sets the value of the airRows property.
             * 
             * @param value
             *     allowed object is
             *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows }
             *     
             */
            public void setAirRows(IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows value) {
                this.airRows = value;
            }

            /**
             * Gets the value of the cabinClass property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinClass().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinClass }
             * 
             * 
             */
            public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinClass> getCabinClass() {
                if (cabinClass == null) {
                    cabinClass = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinClass>();
                }
                return this.cabinClass;
            }

            /**
             * Gets the value of the cabinConfiguration property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinConfiguration().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration }
             * 
             * 
             */
            public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration> getCabinConfiguration() {
                if (cabinConfiguration == null) {
                    cabinConfiguration = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration>();
                }
                return this.cabinConfiguration;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRPH(BigInteger value) {
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
             *       &lt;sequence>
             *         &lt;element name="AirRow" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AirSeats" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Facility" maxOccurs="9" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                 &lt;attribute name="RowCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "airRow"
            })
            public static class AirRows {

                @XmlElement(name = "AirRow", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow> airRow;

                /**
                 * Gets the value of the airRow property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the airRow property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAirRow().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow }
                 * 
                 * 
                 */
                public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow> getAirRow() {
                    if (airRow == null) {
                        airRow = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow>();
                    }
                    return this.airRow;
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
                 *         &lt;element name="AirSeats" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Facility" maxOccurs="9" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="RowCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "airSeats"
                })
                public static class AirRow {

                    @XmlElement(name = "AirSeats", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats airSeats;
                    @XmlAttribute(name = "RowCharacteristics")
                    protected String rowCharacteristics;
                    @XmlAttribute(name = "RowNumber")
                    protected String rowNumber;

                    /**
                     * Gets the value of the airSeats property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats }
                     *     
                     */
                    public IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats getAirSeats() {
                        return airSeats;
                    }

                    /**
                     * Sets the value of the airSeats property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats }
                     *     
                     */
                    public void setAirSeats(IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats value) {
                        this.airSeats = value;
                    }

                    /**
                     * Gets the value of the rowCharacteristics property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRowCharacteristics() {
                        return rowCharacteristics;
                    }

                    /**
                     * Sets the value of the rowCharacteristics property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRowCharacteristics(String value) {
                        this.rowCharacteristics = value;
                    }

                    /**
                     * Gets the value of the rowNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRowNumber() {
                        return rowNumber;
                    }

                    /**
                     * Sets the value of the rowNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRowNumber(String value) {
                        this.rowNumber = value;
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
                     *         &lt;element name="AirSeat" maxOccurs="12" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Facility" maxOccurs="9" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "airSeat",
                        "cabinFacilities"
                    })
                    public static class AirSeats {

                        @XmlElement(name = "AirSeat", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.AirSeat> airSeat;
                        @XmlElement(name = "CabinFacilities", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                        protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities> cabinFacilities;

                        /**
                         * Gets the value of the airSeat property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the airSeat property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAirSeat().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.AirSeat }
                         * 
                         * 
                         */
                        public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.AirSeat> getAirSeat() {
                            if (airSeat == null) {
                                airSeat = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.AirSeat>();
                            }
                            return this.airSeat;
                        }

                        /**
                         * Gets the value of the cabinFacilities property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the cabinFacilities property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCabinFacilities().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities }
                         * 
                         * 
                         */
                        public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities> getCabinFacilities() {
                            if (cabinFacilities == null) {
                                cabinFacilities = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities>();
                            }
                            return this.cabinFacilities;
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
                         *       &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class AirSeat {

                            @XmlAttribute(name = "SeatAvailability")
                            protected String seatAvailability;
                            @XmlAttribute(name = "SeatCharacteristics")
                            protected String seatCharacteristics;
                            @XmlAttribute(name = "SeatNumber")
                            protected String seatNumber;

                            /**
                             * Gets the value of the seatAvailability property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSeatAvailability() {
                                return seatAvailability;
                            }

                            /**
                             * Sets the value of the seatAvailability property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSeatAvailability(String value) {
                                this.seatAvailability = value;
                            }

                            /**
                             * Gets the value of the seatCharacteristics property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSeatCharacteristics() {
                                return seatCharacteristics;
                            }

                            /**
                             * Sets the value of the seatCharacteristics property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSeatCharacteristics(String value) {
                                this.seatCharacteristics = value;
                            }

                            /**
                             * Gets the value of the seatNumber property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSeatNumber() {
                                return seatNumber;
                            }

                            /**
                             * Sets the value of the seatNumber property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSeatNumber(String value) {
                                this.seatNumber = value;
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
                         *         &lt;element name="Facility" maxOccurs="9" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "facility"
                        })
                        public static class CabinFacilities {

                            @XmlElement(name = "Facility", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                            protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities.Facility> facility;
                            @XmlAttribute(name = "RowLocation")
                            protected String rowLocation;

                            /**
                             * Gets the value of the facility property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the facility property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getFacility().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities.Facility }
                             * 
                             * 
                             */
                            public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities.Facility> getFacility() {
                                if (facility == null) {
                                    facility = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.AirRows.AirRow.AirSeats.CabinFacilities.Facility>();
                                }
                                return this.facility;
                            }

                            /**
                             * Gets the value of the rowLocation property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRowLocation() {
                                return rowLocation;
                            }

                            /**
                             * Sets the value of the rowLocation property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRowLocation(String value) {
                                this.rowLocation = value;
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
                             *       &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Facility {

                                @XmlAttribute(name = "Characteristic")
                                protected String characteristic;
                                @XmlAttribute(name = "Location")
                                protected String location;

                                /**
                                 * Gets the value of the characteristic property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCharacteristic() {
                                    return characteristic;
                                }

                                /**
                                 * Sets the value of the characteristic property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCharacteristic(String value) {
                                    this.characteristic = value;
                                }

                                /**
                                 * Gets the value of the location property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getLocation() {
                                    return location;
                                }

                                /**
                                 * Sets the value of the location property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setLocation(String value) {
                                    this.location = value;
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
             *       &lt;attribute name="CabinType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CabinClass {

                @XmlAttribute(name = "CabinType")
                protected String cabinType;
                @XmlAttribute(name = "MaxNumberOfSeats")
                protected String maxNumberOfSeats;

                /**
                 * Gets the value of the cabinType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCabinType() {
                    return cabinType;
                }

                /**
                 * Sets the value of the cabinType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCabinType(String value) {
                    this.cabinType = value;
                }

                /**
                 * Gets the value of the maxNumberOfSeats property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaxNumberOfSeats() {
                    return maxNumberOfSeats;
                }

                /**
                 * Sets the value of the maxNumberOfSeats property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaxNumberOfSeats(String value) {
                    this.maxNumberOfSeats = value;
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
             *         &lt;element name="AirRow" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CabinFacilities" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Facility" maxOccurs="9" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ColumnInformation" maxOccurs="12" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Seat" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="DotNetFixAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SeatOccupationDefault" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="WingRow" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airRow",
                "cabinFacilities",
                "columnInformation",
                "seatOccupationDefault",
                "wingRow"
            })
            public static class CabinConfiguration {

                @XmlElement(name = "AirRow", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.AirRow airRow;
                @XmlElement(name = "CabinFacilities", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities> cabinFacilities;
                @XmlElement(name = "ColumnInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation> columnInformation;
                @XmlElement(name = "SeatOccupationDefault", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.SeatOccupationDefault seatOccupationDefault;
                @XmlElement(name = "WingRow", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.WingRow wingRow;
                @XmlAttribute(name = "Class")
                protected String clazz;
                @XmlAttribute(name = "Location")
                protected String location;

                /**
                 * Gets the value of the airRow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.AirRow }
                 *     
                 */
                public IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.AirRow getAirRow() {
                    return airRow;
                }

                /**
                 * Sets the value of the airRow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.AirRow }
                 *     
                 */
                public void setAirRow(IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.AirRow value) {
                    this.airRow = value;
                }

                /**
                 * Gets the value of the cabinFacilities property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cabinFacilities property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCabinFacilities().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities }
                 * 
                 * 
                 */
                public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities> getCabinFacilities() {
                    if (cabinFacilities == null) {
                        cabinFacilities = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities>();
                    }
                    return this.cabinFacilities;
                }

                /**
                 * Gets the value of the columnInformation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the columnInformation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getColumnInformation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation }
                 * 
                 * 
                 */
                public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation> getColumnInformation() {
                    if (columnInformation == null) {
                        columnInformation = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation>();
                    }
                    return this.columnInformation;
                }

                /**
                 * Gets the value of the seatOccupationDefault property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.SeatOccupationDefault }
                 *     
                 */
                public IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.SeatOccupationDefault getSeatOccupationDefault() {
                    return seatOccupationDefault;
                }

                /**
                 * Sets the value of the seatOccupationDefault property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.SeatOccupationDefault }
                 *     
                 */
                public void setSeatOccupationDefault(IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.SeatOccupationDefault value) {
                    this.seatOccupationDefault = value;
                }

                /**
                 * Gets the value of the wingRow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.WingRow }
                 *     
                 */
                public IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.WingRow getWingRow() {
                    return wingRow;
                }

                /**
                 * Sets the value of the wingRow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.WingRow }
                 *     
                 */
                public void setWingRow(IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.WingRow value) {
                    this.wingRow = value;
                }

                /**
                 * Gets the value of the clazz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Sets the value of the clazz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
                }

                /**
                 * Gets the value of the location property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocation() {
                    return location;
                }

                /**
                 * Sets the value of the location property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocation(String value) {
                    this.location = value;
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
                 *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AirRow {

                    @XmlAttribute(name = "EndNumber")
                    protected String endNumber;
                    @XmlAttribute(name = "StartNumber")
                    protected String startNumber;

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
                     * Gets the value of the startNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartNumber() {
                        return startNumber;
                    }

                    /**
                     * Sets the value of the startNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartNumber(String value) {
                        this.startNumber = value;
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
                 *         &lt;element name="Facility" maxOccurs="9" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="RowLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "facility"
                })
                public static class CabinFacilities {

                    @XmlElement(name = "Facility", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities.Facility> facility;
                    @XmlAttribute(name = "RowLocation")
                    protected String rowLocation;

                    /**
                     * Gets the value of the facility property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the facility property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFacility().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities.Facility }
                     * 
                     * 
                     */
                    public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities.Facility> getFacility() {
                        if (facility == null) {
                            facility = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.CabinFacilities.Facility>();
                        }
                        return this.facility;
                    }

                    /**
                     * Gets the value of the rowLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRowLocation() {
                        return rowLocation;
                    }

                    /**
                     * Sets the value of the rowLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRowLocation(String value) {
                        this.rowLocation = value;
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
                     *       &lt;attribute name="Characteristic" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Facility {

                        @XmlAttribute(name = "Characteristic")
                        protected String characteristic;
                        @XmlAttribute(name = "Location")
                        protected String location;

                        /**
                         * Gets the value of the characteristic property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCharacteristic() {
                            return characteristic;
                        }

                        /**
                         * Sets the value of the characteristic property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCharacteristic(String value) {
                            this.characteristic = value;
                        }

                        /**
                         * Gets the value of the location property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLocation() {
                            return location;
                        }

                        /**
                         * Sets the value of the location property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLocation(String value) {
                            this.location = value;
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
                 *         &lt;element name="Seat" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="DotNetFixAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class ColumnInformation {

                    @XmlElement(name = "Seat", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                    protected List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation.Seat> seat;
                    @XmlAttribute(name = "DotNetFixAttribute")
                    protected String dotNetFixAttribute;

                    /**
                     * Gets the value of the seat property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the seat property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSeat().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation.Seat }
                     * 
                     * 
                     */
                    public List<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation.Seat> getSeat() {
                        if (seat == null) {
                            seat = new ArrayList<IMAPAirSeatMapRS.SeatMapResponse.SeatMapDetails.CabinConfiguration.ColumnInformation.Seat>();
                        }
                        return this.seat;
                    }

                    /**
                     * Gets the value of the dotNetFixAttribute property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDotNetFixAttribute() {
                        return dotNetFixAttribute;
                    }

                    /**
                     * Sets the value of the dotNetFixAttribute property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDotNetFixAttribute(String value) {
                        this.dotNetFixAttribute = value;
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
                     *       &lt;attribute name="Column" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Seat {

                        @XmlAttribute(name = "Column")
                        protected String column;
                        @XmlAttribute(name = "Description")
                        protected String description;

                        /**
                         * Gets the value of the column property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getColumn() {
                            return column;
                        }

                        /**
                         * Sets the value of the column property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setColumn(String value) {
                            this.column = value;
                        }

                        /**
                         * Gets the value of the description property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDescription() {
                            return description;
                        }

                        /**
                         * Sets the value of the description property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDescription(String value) {
                            this.description = value;
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
                 *       &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SeatOccupationDefault {

                    @XmlAttribute(name = "Details")
                    protected String details;

                    /**
                     * Gets the value of the details property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDetails() {
                        return details;
                    }

                    /**
                     * Sets the value of the details property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDetails(String value) {
                        this.details = value;
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
                 *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="StartNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class WingRow {

                    @XmlAttribute(name = "EndNumber")
                    protected String endNumber;
                    @XmlAttribute(name = "StartNumber")
                    protected String startNumber;

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
                     * Gets the value of the startNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartNumber() {
                        return startNumber;
                    }

                    /**
                     * Sets the value of the startNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartNumber(String value) {
                        this.startNumber = value;
                    }

                }

            }

        }

    }

}
