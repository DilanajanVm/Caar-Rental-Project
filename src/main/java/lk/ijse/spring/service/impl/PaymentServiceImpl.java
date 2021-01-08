package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void savePayment(PaymentDTO dto) {
        Payment newPayment = mapper.map(dto, Payment.class);
        repo.save(newPayment);
    }


    @Override
    public List<PaymentDTO> viewAllPayment() {
        List<Payment> all = repo.findAll();
        return mapper.map(all,new TypeToken<List<PaymentDTO>>(){}.getType());
    }

}
