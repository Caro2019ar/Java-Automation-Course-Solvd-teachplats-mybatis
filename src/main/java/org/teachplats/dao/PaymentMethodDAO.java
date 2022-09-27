package org.teachplats.dao;

import org.teachplats.model.Payment;

import java.util.List;

public class PaymentMethodDAO extends BaseDAO<Payment> implements IPaymethodDAO{
    @Override
    public void create(Payment object) {

    }

    @Override
    public Payment getById(Long id) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public void update(Payment payment) {

    }

    @Override
    public List<Payment> getAll() {
        return null;
    }
}
