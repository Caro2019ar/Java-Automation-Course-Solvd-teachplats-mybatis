package org.teachplats.model;

public class Address {
    private Long id;
    private String street;
    private String number;
    private City city;

    public Address() {
    }

    public Address(String street, String number, City city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public Address(Long id, String street, String number, City city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city=" + city +
                '}';
    }
}
