package org.teachplats.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "filetype")
@XmlType(propOrder = {"id", "description"})
public class Filetype {
    @XmlAttribute
    private Long id;
    @XmlElement
    private String description;

    public Filetype() {
    }

    public Filetype(String description) {
        this.description = description;
    }

    public Filetype(Long id, String description) {
        this.id = id;
        this.description = description;
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

    @Override
    public String toString() {
        return "Filetype{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
