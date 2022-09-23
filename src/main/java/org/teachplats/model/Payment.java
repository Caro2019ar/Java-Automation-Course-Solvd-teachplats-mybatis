package org.teachplats.model;

import java.util.Date;

public class Payment {
    private Long id;
    private Date payDate;
    private Double value;
    private PaymentMethod paymentMethod;

    public Payment() {
    }

    public Payment(Date payDate, Double value, PaymentMethod paymentMethod) {
        this.payDate = payDate;
        this.value = value;
        this.paymentMethod = paymentMethod;
    }

    public Payment(Long id, Date payDate, Double value, PaymentMethod paymentMethod) {
        this.id = id;
        this.payDate = payDate;
        this.value = value;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payDate=" + payDate +
                ", value=" + value +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
