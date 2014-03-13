
package com.dfwcomputech.japp.remotecontract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrentUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCurrentUserResponse" type="{http://remotecontract.japp.dfwcomputech.com}jAppUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentUserResponse", propOrder = {
    "getCurrentUserResponse"
})
public class GetCurrentUserResponse {

    protected JAppUser getCurrentUserResponse;

    /**
     * Gets the value of the getCurrentUserResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAppUser }
     *     
     */
    public JAppUser getGetCurrentUserResponse() {
        return getCurrentUserResponse;
    }

    /**
     * Sets the value of the getCurrentUserResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAppUser }
     *     
     */
    public void setGetCurrentUserResponse(JAppUser value) {
        this.getCurrentUserResponse = value;
    }

}
