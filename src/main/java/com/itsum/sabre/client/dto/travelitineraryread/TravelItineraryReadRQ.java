
package com.itsum.sabre.client.dto.travelitineraryread;

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
 *         &lt;element name="MessagingDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Transaction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="PNR"/>
 *                                 &lt;enumeration value="GEN"/>
 *                                 &lt;enumeration value="PAX"/>
 *                                 &lt;enumeration value="FNR"/>
 *                                 &lt;enumeration value="FFT"/>
 *                                 &lt;enumeration value="PHN"/>
 *                                 &lt;enumeration value="AFD"/>
 *                                 &lt;enumeration value="GFD"/>
 *                                 &lt;enumeration value="ADR"/>
 *                                 &lt;enumeration value="CDR"/>
 *                                 &lt;enumeration value="ACR"/>
 *                                 &lt;enumeration value="PPT"/>
 *                                 &lt;enumeration value="HRM"/>
 *                                 &lt;enumeration value="FQP"/>
 *                                 &lt;enumeration value="GRM"/>
 *                                 &lt;enumeration value="BSD"/>
 *                                 &lt;enumeration value="AIT"/>
 *                                 &lt;enumeration value="HOT"/>
 *                                 &lt;enumeration value="CAR"/>
 *                                 &lt;enumeration value="TIN"/>
 *                                 &lt;enumeration value="AX1"/>
 *                                 &lt;enumeration value="AX2"/>
 *                                 &lt;enumeration value="TRM"/>
 *                                 &lt;enumeration value="TFS"/>
 *                                 &lt;enumeration value="FOP"/>
 *                                 &lt;enumeration value="WSR"/>
 *                                 &lt;enumeration value="PH4"/>
 *                                 &lt;enumeration value="FPL"/>
 *                                 &lt;enumeration value="FBL"/>
 *                                 &lt;enumeration value="ACC"/>
 *                                 &lt;enumeration value="ITN"/>
 *                                 &lt;enumeration value="ITR"/>
 *                                 &lt;enumeration value="INV"/>
 *                                 &lt;enumeration value="DDR"/>
 *                                 &lt;enumeration value="PTD"/>
 *                                 &lt;enumeration value="SIP"/>
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
 *         &lt;element name="UniqueID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "messagingDetails",
    "uniqueID"
})
@XmlRootElement(name = "TravelItineraryReadRQ", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class TravelItineraryReadRQ {

    @XmlElement(name = "MessagingDetails", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
    protected TravelItineraryReadRQ.MessagingDetails messagingDetails;
    @XmlElement(name = "UniqueID", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected TravelItineraryReadRQ.UniqueID uniqueID;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the messagingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryReadRQ.MessagingDetails }
     *     
     */
    public TravelItineraryReadRQ.MessagingDetails getMessagingDetails() {
        return messagingDetails;
    }

    /**
     * Sets the value of the messagingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryReadRQ.MessagingDetails }
     *     
     */
    public void setMessagingDetails(TravelItineraryReadRQ.MessagingDetails value) {
        this.messagingDetails = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryReadRQ.UniqueID }
     *     
     */
    public TravelItineraryReadRQ.UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryReadRQ.UniqueID }
     *     
     */
    public void setUniqueID(TravelItineraryReadRQ.UniqueID value) {
        this.uniqueID = value;
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
     *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Transaction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="PNR"/>
     *                       &lt;enumeration value="GEN"/>
     *                       &lt;enumeration value="PAX"/>
     *                       &lt;enumeration value="FNR"/>
     *                       &lt;enumeration value="FFT"/>
     *                       &lt;enumeration value="PHN"/>
     *                       &lt;enumeration value="AFD"/>
     *                       &lt;enumeration value="GFD"/>
     *                       &lt;enumeration value="ADR"/>
     *                       &lt;enumeration value="CDR"/>
     *                       &lt;enumeration value="ACR"/>
     *                       &lt;enumeration value="PPT"/>
     *                       &lt;enumeration value="HRM"/>
     *                       &lt;enumeration value="FQP"/>
     *                       &lt;enumeration value="GRM"/>
     *                       &lt;enumeration value="BSD"/>
     *                       &lt;enumeration value="AIT"/>
     *                       &lt;enumeration value="HOT"/>
     *                       &lt;enumeration value="CAR"/>
     *                       &lt;enumeration value="TIN"/>
     *                       &lt;enumeration value="AX1"/>
     *                       &lt;enumeration value="AX2"/>
     *                       &lt;enumeration value="TRM"/>
     *                       &lt;enumeration value="TFS"/>
     *                       &lt;enumeration value="FOP"/>
     *                       &lt;enumeration value="WSR"/>
     *                       &lt;enumeration value="PH4"/>
     *                       &lt;enumeration value="FPL"/>
     *                       &lt;enumeration value="FBL"/>
     *                       &lt;enumeration value="ACC"/>
     *                       &lt;enumeration value="ITN"/>
     *                       &lt;enumeration value="ITR"/>
     *                       &lt;enumeration value="INV"/>
     *                       &lt;enumeration value="DDR"/>
     *                       &lt;enumeration value="PTD"/>
     *                       &lt;enumeration value="SIP"/>
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
        "applicationID",
        "transaction"
    })
    public static class MessagingDetails {

        @XmlElement(name = "ApplicationID", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected String applicationID;
        @XmlElement(name = "Transaction", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
        protected List<TravelItineraryReadRQ.MessagingDetails.Transaction> transaction;

        /**
         * Gets the value of the applicationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationID() {
            return applicationID;
        }

        /**
         * Sets the value of the applicationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationID(String value) {
            this.applicationID = value;
        }

        /**
         * Gets the value of the transaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelItineraryReadRQ.MessagingDetails.Transaction }
         * 
         * 
         */
        public List<TravelItineraryReadRQ.MessagingDetails.Transaction> getTransaction() {
            if (transaction == null) {
                transaction = new ArrayList<TravelItineraryReadRQ.MessagingDetails.Transaction>();
            }
            return this.transaction;
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
         *       &lt;attribute name="Code" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="PNR"/>
         *             &lt;enumeration value="GEN"/>
         *             &lt;enumeration value="PAX"/>
         *             &lt;enumeration value="FNR"/>
         *             &lt;enumeration value="FFT"/>
         *             &lt;enumeration value="PHN"/>
         *             &lt;enumeration value="AFD"/>
         *             &lt;enumeration value="GFD"/>
         *             &lt;enumeration value="ADR"/>
         *             &lt;enumeration value="CDR"/>
         *             &lt;enumeration value="ACR"/>
         *             &lt;enumeration value="PPT"/>
         *             &lt;enumeration value="HRM"/>
         *             &lt;enumeration value="FQP"/>
         *             &lt;enumeration value="GRM"/>
         *             &lt;enumeration value="BSD"/>
         *             &lt;enumeration value="AIT"/>
         *             &lt;enumeration value="HOT"/>
         *             &lt;enumeration value="CAR"/>
         *             &lt;enumeration value="TIN"/>
         *             &lt;enumeration value="AX1"/>
         *             &lt;enumeration value="AX2"/>
         *             &lt;enumeration value="TRM"/>
         *             &lt;enumeration value="TFS"/>
         *             &lt;enumeration value="FOP"/>
         *             &lt;enumeration value="WSR"/>
         *             &lt;enumeration value="PH4"/>
         *             &lt;enumeration value="FPL"/>
         *             &lt;enumeration value="FBL"/>
         *             &lt;enumeration value="ACC"/>
         *             &lt;enumeration value="ITN"/>
         *             &lt;enumeration value="ITR"/>
         *             &lt;enumeration value="INV"/>
         *             &lt;enumeration value="DDR"/>
         *             &lt;enumeration value="PTD"/>
         *             &lt;enumeration value="SIP"/>
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
        public static class Transaction {

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
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UniqueID {

        @XmlAttribute(name = "ID", required = true)
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

}
