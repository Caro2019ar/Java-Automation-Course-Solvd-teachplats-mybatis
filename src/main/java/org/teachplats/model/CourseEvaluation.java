package org.teachplats.model;

public class CourseEvaluation {
    private Long id;
    private Long courseId;
    private Long evaluationId;

    public CourseEvaluation() {
    }

    public CourseEvaluation(Long id, Long courseId, Long evaluationId) {
        this.id = id;
        this.courseId = courseId;
        this.evaluationId = evaluationId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Long evaluationId) {
        this.evaluationId = evaluationId;
    }

    @Override
    public String toString() {
        return "CourseEvaluation{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", evaluationId=" + evaluationId +
                '}';
    }
}
