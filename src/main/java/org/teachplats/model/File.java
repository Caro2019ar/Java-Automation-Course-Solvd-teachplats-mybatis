package org.teachplats.model;

import java.util.Date;

public class File {
    private Long id;
    private String description;
    private Double size;
    private Date fileDate;
    private Long filetypeId;

    public File() {
    }

    public File(Long id, String description, Double size, Date fileDate, Long filetypeId) {
        this.id = id;
        this.description = description;
        this.size = size;
        this.fileDate = fileDate;
        this.filetypeId = filetypeId;
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

    public Long getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Long filetypeId) {
        this.filetypeId = filetypeId;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", fileDate=" + fileDate +
                ", filetypeId=" + filetypeId +
                '}';
    }
}
