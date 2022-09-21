package org.teachplats.model;

public class Evaluation {
    private Long id;
    private String description;
    private Float score;

    public Evaluation() {
    }

    public Evaluation(Long id, String description, Float score) {
        this.id = id;
        this.description = description;
        this.score = score;
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

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }
}
