package org.teachplats.model;

public class City {
    private Long id;
    private String name;

    //---Tem que inicializar o atributo ou MyBatis reclama de getters/setters
    private State state = new State();

    public City() {
    }


    public City(String name, Long stateId) {
        this.name = name;
        this.state.setId(stateId);
    }

    public City(Long id, String name, Long stateId) {
        this.id = id;
        this.name = name;
        this.state.setId(stateId);
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
        return this.state.getId();
    }

    public void setStateId(Long stateId) {
        this.state.setId(stateId);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", stateId=").append(this.state.getId());
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
