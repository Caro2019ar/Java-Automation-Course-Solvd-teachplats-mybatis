package org.teachplats.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Long id;
    private String description;
    private String version;
    private Instrument instrument;
    private List<Evaluation> listEvaluations;


    public Course() {
    }

    public Course(String description, String version, Instrument instrument) {
        this.description = description;
        this.version = version;
        this.instrument = instrument;
        this.listEvaluations = new ArrayList<>();
    }

    public Course(Long id, String description, String version, Instrument instrument) {
        this.id = id;
        this.description = description;
        this.version = version;
        this.instrument = instrument;
        this.listEvaluations = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public List<Evaluation> getListEvaluations() {
        return listEvaluations;
    }

    public void setListEvaluations(List<Evaluation> listEvaluations) {
        this.listEvaluations = listEvaluations;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", instrument=" + instrument +
                ", listEvaluations=" + listEvaluations +
                '}';
    }
}
