package org.teachplats.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class State {
    private Long id;
    private String name;
   // @JsonIgnore
    //private Long countryId;
    //---Tem que inicializar o atributo ou MyBatis reclama de getters/setters
    private Country country=new Country();
    private Set<City> citySet;

    public State() {
    }

    public State(String name) {
        this.name = name;
        //this.countryId= this.country.getId();
        this.citySet=new HashSet<>();
    }

    public State(String name, Long idFromCountry) {
        this.name = name;
        //this.countryId =idFromCountry;
        this.country.setId(idFromCountry);
        this.citySet=new HashSet<>();
    }

    public State(Long id, String name,Long idFromCountry) {
        this.id = id;
        this.name = name;
        //this.countryId =idFromCountry;
        this.country.setId(idFromCountry);
        this.citySet=new HashSet<>();
    }

    public State(Long id, String name,Long idFromCountry, HashSet<City> citySet) {
        this.id = id;
        this.name = name;
        //this.countryId =idFromCountry;
        this.country.setId(idFromCountry);
        this.citySet=citySet;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCountryId(Long id) {
        this.country.setId(id);
    }

    public Long getCountryId() {
        return this.country.getId();
    }

    public void addCityToStateSet(City city) {
        citySet.add(city);
        city.setState(this);
    }

    public void removeCityToStateSet(City city) {
        citySet.remove(city);
        city.setState(null);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("State{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", country=").append(country);
        sb.append(", citySet=").append(citySet);
        sb.append('}');
        return sb.toString();
    }
}
