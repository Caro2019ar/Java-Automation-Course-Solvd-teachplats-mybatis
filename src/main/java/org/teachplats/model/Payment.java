package org.teachplats.model;

import java.util.Date;

public class Payment {
    private Long id;
    private Date payDate;
    private Double value;
    private Long paymethodId;

    public Payment() {
    }

    public Payment(Long id, Date payDate, Double value, Long paymethodId) {
        this.id = id;
        this.payDate = payDate;
        this.value = value;
        this.paymethodId = paymethodId;
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

    public Long getPaymethodId() {
        return paymethodId;
    }

    public void setPaymethodId(Long paymethodId) {
        this.paymethodId = paymethodId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", payDate=" + payDate +
                ", value=" + value +
                ", paymethodId=" + paymethodId +
                '}';
    }
}
