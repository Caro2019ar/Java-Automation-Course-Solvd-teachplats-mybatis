package org.teachplats.model;

public class Filetype {
 private Long id;
 private String description;

    public Filetype() {
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
