

package org.demo.info;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("registrationFlow")
public class Address {
    
    private String street;

    private String appartment;

    private String city;

    private String state;

    private String country;

    /**
     * Get the value of country
     *
     * @return the value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the value of country
     *
     * @param country new value of country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get the value of state
     *
     * @return the value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Set the value of state
     *
     * @param state new value of state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get the value of city
     *
     * @return the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of city
     *
     * @param city new value of city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the value of appartment
     *
     * @return the value of appartment
     */
    public String getAppartment() {
        return appartment;
    }

    /**
     * Set the value of appartment
     *
     * @param appartment new value of appartment
     */
    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    /**
     * Get the value of street
     *
     * @return the value of street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set the value of street
     *
     * @param street new value of street
     */
    public void setStreet(String street) {
        this.street = street;
    }

}
