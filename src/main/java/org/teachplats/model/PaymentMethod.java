package org.teachplats.model;

import java.lang.ref.PhantomReference;

public class PaymentMethod {
    private Long id;
    private String description;

    public PaymentMethod() {
    }

    public PaymentMethod(Long id, String description) {
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
        return "PaymentMethod{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
