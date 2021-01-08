package lk.ijse.spring.controller;


import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.service.PaymentService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")
@CrossOrigin
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public ResponseEntity<StandardResponse> addPayment(@RequestBody PaymentDTO dto){
        System.out.println(dto);
        paymentService.savePayment(dto);
        StandardResponse success = new StandardResponse(200, "Success", dto);
        return new ResponseEntity(success, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllPayment(){
        System.out.println("GETALL");
        List<PaymentDTO> allPayment = paymentService.viewAllPayment();
        return new ResponseEntity(new StandardResponse(200,"getAll",allPayment),HttpStatus.OK);
    }

}
