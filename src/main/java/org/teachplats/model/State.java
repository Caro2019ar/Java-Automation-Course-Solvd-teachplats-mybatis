package org.teachplats.model;

public class State {
    private Long id;
    private String name;
    private Country country=new Country();

    public State() {
    }

    public State(String name, Long countryId) {
        this.name = name;
        this.country.setId(countryId);
    }

    public State(Long id, String name,Long countryId) {
        this.id = id;
        this.name = name;
        this.country.setId(countryId);
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


     public Long getCountryId (){
         Long countryId = this.country.getId();
         return countryId;
     }


    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
