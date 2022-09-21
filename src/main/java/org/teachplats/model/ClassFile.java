package org.teachplats.model;

public class ClassFile {
    private Long id;
    private Long classId;
    private Long fileId;

    public ClassFile() {
    }

    public ClassFile(Long id, Long classId, Long fileId) {
        this.id = id;
        this.classId = classId;
        this.fileId = fileId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "ClassFile{" +
                "id=" + id +
                ", classId=" + classId +
                ", fileId=" + fileId +
                '}';
    }
}
