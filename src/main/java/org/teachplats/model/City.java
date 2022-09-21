package org.teachplats.model;

public class City {
    private Long id;
    private String name;
    private Long stateId;

    public City() {
    }

    public City(Long id, String name, Long stateId) {
        this.id = id;
        this.name = name;
        this.stateId = stateId;
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

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stateId=" + stateId +
                '}';
    }
}
