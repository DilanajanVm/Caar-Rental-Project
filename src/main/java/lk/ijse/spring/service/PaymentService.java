package lk.ijse.spring.service;

import lk.ijse.spring.dto.PaymentDTO;


import java.util.List;

public interface PaymentService {
    void savePayment(PaymentDTO dto);
    List<PaymentDTO> viewAllPayment();

}
