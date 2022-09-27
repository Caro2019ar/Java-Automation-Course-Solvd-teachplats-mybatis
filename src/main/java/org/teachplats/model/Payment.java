package org.teachplats.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class Payment {
   @JsonProperty
    private Long id;
    @JsonProperty("date")
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private java.util.Date payDate;
    @JsonProperty
    private Double value;
    @JsonIgnore
    private PaymentMethod paymentMethod=new PaymentMethod();

    public Payment() {
    }

    public Payment(Date payDate, Double value,  Long paymethodId) {
        this.payDate = payDate;
        this.value = value;
        this.paymentMethod.setId(paymethodId);
    }

    public Payment(Long id, Date payDate, Double value, Long paymethodId) {
        this.id = id;
        this.payDate = payDate;
        this.value = value;
        this.paymentMethod.setId(paymethodId);
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
        return paymentMethod.getId();
    }

    public void setPaymethodId(Long paymethodId) {
        this.paymentMethod.setId(paymethodId);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Payment{");
        sb.append("id=").append(id);
        sb.append(", payDate=").append(payDate);
        sb.append(", value=").append(value);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append('}');
        return sb.toString();
    }
}
