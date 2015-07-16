package com.luxoft;

/**
 * Created by lina on 14.07.15.
 */
public class Address {
    private String street;
    private String postcode;

    public Address() {

    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean created: " + this);

    }



    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
