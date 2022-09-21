package org.teachplats.model;

public class State {
    private Long id;
    private String name;
    private Long countryId;

    public State() {
    }

    public State(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public State(Long id, String name, Long countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
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

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                '}';
    }
}

