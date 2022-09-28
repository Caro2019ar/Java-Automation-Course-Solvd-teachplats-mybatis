package org.teachplats.model;

import javax.xml.bind.annotation.XmlTransient;

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

    //Tem que colocar Transient aqui em City p/ nao gerar o stateID no JaxbStateTest
    @XmlTransient
    public void setStateId(Long stateId) {
        this.state.setId(stateId);
    }

    public State getState() {
        return state;
    }
    //Tem que colocar Transient aqui em City p/ nao gerar o stateID no JaxbStateTest
    @XmlTransient
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
