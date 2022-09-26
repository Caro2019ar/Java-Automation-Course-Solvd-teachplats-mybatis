package org.teachplats.model;

public class Address {
    private Long id;
    private String street;
    private String number;
    private Long cityId;
    private City city;


    public Address(Long id, String street, String number, Long cityId) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.cityId = cityId;
        this.city.setId(cityId);
    }

    public Address(String street, String number, Long cityId) {
        this.street = street;
        this.number = number;
        this.cityId = cityId;
        this.city.setId(cityId);
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

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
