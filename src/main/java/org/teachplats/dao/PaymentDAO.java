package org.teachplats.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.model.Payment;

import java.util.List;

public class PaymentDAO extends BaseDAO<Payment> implements IPaymentDAO{

    private final Logger logger = LogManager.getLogger(PaymentDAO.class);

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
