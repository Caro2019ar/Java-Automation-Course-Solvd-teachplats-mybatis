package org.teachplats.model;

import javax.xml.bind.annotation.*;
import java.util.HashSet;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="country")
@XmlType(propOrder = { "id", "name", "stateSet" })
public class Country {
    @XmlAttribute
    private Long id;
    @XmlElement
    private String name;
    @XmlElement
    private HashSet<State> stateSet;


    public Country() {
    }



    public Country(String name) {
        this.name = name;
        this.stateSet = new HashSet<>();
    }

    public Country(String name, HashSet<State> stateSet) {
        this.name = name;
        this.stateSet = stateSet;
    }

    public Country(Long id, String name, HashSet<State> stateSet) {
        this.id = id;
        this.name = name;
        this.stateSet = stateSet;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStateToCoutrySet(State state) {
        stateSet.add(state);
        state.setCountry(this);
    }

    public void removeStateToCoutrySet(State state) {
        stateSet.remove(state);
        state.setCountry(null);
    }
    public HashSet<State> getStateSet() {
        return stateSet;
    }

    public void setStateSet(HashSet<State> stateSet) {
        this.stateSet = stateSet;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
