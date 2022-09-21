package org.teachplats.model;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class RemotePresent {
    private Long id;
    private String description;

    public RemotePresent() {
    }

    public RemotePresent(Long id, String description) {
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
        return "RemotePresent{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
