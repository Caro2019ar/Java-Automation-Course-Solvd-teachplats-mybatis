package org.teachplats.model;

public class Course {
    private Long id;
    private String description;
    private String version;
    private Long instrumentId;

    public Course() {
    }

    public Course(Long id, String description, String version, Long instrumentId) {
        this.id = id;
        this.description = description;
        this.version = version;
        this.instrumentId = instrumentId;
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

    public Long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", instrumentId=" + instrumentId +
                '}';
    }
}
