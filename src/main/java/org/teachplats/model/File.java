package org.teachplats.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="file")
@XmlType(propOrder = { "id", "description", "size", "fileDate", "filetype" })
public class File {
    @XmlAttribute
    private Long id;
    @XmlElement
    private String description;
    @XmlElement
    private Double size;
    @XmlElement
    private Date fileDate;
    @XmlElement
    private Filetype filetype = new Filetype();


    public File() {
    }

    public File(String description, Double size, Date fileDate, Long filetypeId) {
        this.description = description;
        this.size = size;
        this.fileDate = fileDate;
        this.filetype.setId(filetypeId);

    }

    public File(Long id, String description, Double size, Date fileDate, Long filetypeId) {
        this.id = id;
        this.description = description;
        this.size = size;
        this.fileDate = fileDate;
        this.filetype.setId(filetypeId);

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

    public Long getFileTypeId() {
        return this.filetype.getId();
    }
    public void setFileTypeId(Long fileTypeId) {
         this.filetype.setId(fileTypeId);
    }

    public void setFiletype(Filetype filetype) {
        this.filetype = filetype;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("File{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", size=").append(size);
        sb.append(", fileDate=").append(fileDate);
        sb.append(", filetype=").append(filetype);
        sb.append('}');
        return sb.toString();
    }
}
