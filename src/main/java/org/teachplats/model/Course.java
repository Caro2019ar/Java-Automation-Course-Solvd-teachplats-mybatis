package org.teachplats.model;

import java.util.List;

public class Course {
    private Long id;
    private String description;
    private String version;
    private Instrument instrument;
    private List<User> userList;
    private List<Classes> classesList;
    private List<Evaluation> evaluationList;

    public Course() {
    }

    public Course(Long id, String description, String version, Instrument instrument) {
        this.id = id;
        this.description = description;
        this.version = version;
        this.instrument = instrument;
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

    public Instrument getinstrument() {
        return instrument;
    }

    public void setinstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", instrument=").append(instrument);
        sb.append('}');
        return sb.toString();
    }
}
