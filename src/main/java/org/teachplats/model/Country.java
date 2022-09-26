package org.teachplats.model;

import java.util.HashSet;

public class Country {
    private Long id;
    private String name;
    private HashSet<State> stateSet;


    public Country() {
    }

    public HashSet<State> getStateSet() {
        return stateSet;
    }

    public void setStateSet(HashSet<State> stateSet) {
        this.stateSet = stateSet;
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

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
