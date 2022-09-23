package org.teachplats.model;

import java.util.Date;

public class File {
    private Long id;
    private String description;
    private Double size;
    private Date fileDate;
    private Filetype filetype;

    public File() {
    }

    public File(String description, Double size, Date fileDate, Filetype filetype) {
        this.description = description;
        this.size = size;
        this.fileDate = fileDate;
        this.filetype = filetype;
    }

    public File(Long id, String description, Double size, Date fileDate, Filetype filetype) {
        this.id = id;
        this.description = description;
        this.size = size;
        this.fileDate = fileDate;
        this.filetype = filetype;
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

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public Filetype getFiletype() {
        return filetype;
    }

    public void setFiletype(Filetype filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", fileDate=" + fileDate +
                ", filetype=" + filetype +
                '}';
    }
}
