package org.teachplats.model;

public class UsersCourse {
    private Long id;
    private Long userId;
    private Long courseId;

    public UsersCourse() {
    }

    public UsersCourse(Long id, Long userId, Long courseId) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "UsersCourse{" +
                "id=" + id +
                ", userId=" + userId +
                ", courseId=" + courseId +
                '}';
    }
}
