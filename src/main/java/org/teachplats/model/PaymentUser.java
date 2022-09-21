package org.teachplats.model;

public class PaymentUser {
    private Long id;
    private Long paymentId;
    private Long usersId;

    public PaymentUser() {
    }

    public PaymentUser(Long id, Long paymentId, Long usersId) {
        this.id = id;
        this.paymentId = paymentId;
        this.usersId = usersId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "PaymentUsers{" +
                "id=" + id +
                ", paymentId=" + paymentId +
                ", usersId=" + usersId +
                '}';
    }
}
