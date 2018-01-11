package models;


public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
    public Address(String street, String city, String state, String country, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
}
