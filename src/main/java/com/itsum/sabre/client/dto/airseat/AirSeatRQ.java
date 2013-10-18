
package com.itsum.sabre.client.dto.airseat;

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
 *         &lt;element name="Seats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Seat">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "seats"
})
@XmlRootElement(name = "AirSeatRQ", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class AirSeatRQ {

    @XmlElement(name = "Seats", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
    protected AirSeatRQ.Seats seats;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link AirSeatRQ.Seats }
     *     
     */
    public AirSeatRQ.Seats getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSeatRQ.Seats }
     *     
     */
    public void setSeats(AirSeatRQ.Seats value) {
        this.seats = value;
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
     *         &lt;element name="Seat">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "seat"
    })
    public static class Seats {

        @XmlElement(name = "Seat", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
        protected AirSeatRQ.Seats.Seat seat;

        /**
         * Gets the value of the seat property.
         * 
         * @return
         *     possible object is
         *     {@link AirSeatRQ.Seats.Seat }
         *     
         */
        public AirSeatRQ.Seats.Seat getSeat() {
            return seat;
        }

        /**
         * Sets the value of the seat property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirSeatRQ.Seats.Seat }
         *     
         */
        public void setSeat(AirSeatRQ.Seats.Seat value) {
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
         *       &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "BoardingPass")
            protected Boolean boardingPass;
            @XmlAttribute(name = "ChangeOfGauge")
            protected Boolean changeOfGauge;
            @XmlAttribute(name = "NameNumber", required = true)
            protected String nameNumber;
            @XmlAttribute(name = "Number")
            protected String number;
            @XmlAttribute(name = "Preference")
            protected String preference;
            @XmlAttribute(name = "SegmentNumber")
            protected String segmentNumber;

            /**
             * Gets the value of the boardingPass property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBoardingPass() {
                return boardingPass;
            }

            /**
             * Sets the value of the boardingPass property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBoardingPass(Boolean value) {
                this.boardingPass = value;
            }

            /**
             * Gets the value of the changeOfGauge property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChangeOfGauge() {
                return changeOfGauge;
            }

            /**
             * Sets the value of the changeOfGauge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChangeOfGauge(Boolean value) {
                this.changeOfGauge = value;
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
             * Gets the value of the preference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreference() {
                return preference;
            }

            /**
             * Sets the value of the preference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreference(String value) {
                this.preference = value;
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

}
