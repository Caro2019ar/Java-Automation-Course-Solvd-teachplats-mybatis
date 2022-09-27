package org.teachplats.service;

import org.teachplats.dao.PaymentDAO;
import org.teachplats.dao.PaymentMethodDAO;
import org.teachplats.model.Payment;

import java.util.List;

public class PaymentMethodServiceImp implements IPaymentMethodService {
    PaymentMethodDAO paymentMethodDAO = new PaymentMethodDAO();

    @Override
    public void create(Payment payment) {
        paymentMethodDAO.create(payment);
    }

    @Override
    public Payment searchById(Long id) {
        return paymentMethodDAO.getById(id);
    }

    @Override
    public List<Payment> listAll() {
        return paymentMethodDAO.getAll();
    }

    @Override
    public void update(Payment payment) {
        paymentMethodDAO.update(payment);
    }

    @Override
    public void deleteById(Long id) {
        paymentMethodDAO.removeById(id);
    }
}
