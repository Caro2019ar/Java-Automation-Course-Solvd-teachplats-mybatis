package org.teachplats.service;

import org.teachplats.dao.PaymentDAO;
import org.teachplats.model.Payment;

import java.util.List;

public class PaymentServiceImp implements IPaymentService {
    PaymentDAO paymentDAO = new PaymentDAO();

    @Override
    public void create(Payment payment) {
        paymentDAO.create(payment);
    }

    @Override
    public Payment searchById(Long id) {
        return paymentDAO.getById(id);
    }

    @Override
    public List<Payment> listAll() {
        return paymentDAO.getAll();
    }

    @Override
    public void update(Payment payment) {
        paymentDAO.update(payment);
    }

    @Override
    public void deleteById(Long id) {
        paymentDAO.removeById(id);
    }
}
