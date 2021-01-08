package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.impl.CustomerServiceImpl;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/c1")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<StandardResponse> addCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto);
        customerService.saveCustomer(dto);
        StandardResponse success = new StandardResponse(200, "Success", dto);
        return new ResponseEntity(success, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity<StandardResponse> deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
        return new ResponseEntity(new StandardResponse(200,"Delete",null),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDTO dto){
        customerService.updateCustomer(dto);
        return new ResponseEntity(new StandardResponse(200,"Successfullu Update",null),HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> searchCustomer(@PathVariable String id){
        CustomerDTO customerDTO = customerService.searchCustomer(id);
        return new ResponseEntity( new StandardResponse(200,"Search",customerDTO),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllCustomer(){
        System.out.println("GETALL");
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity(new StandardResponse(200,"SuccessGetAll",allCustomers),HttpStatus.OK);
    }

}
