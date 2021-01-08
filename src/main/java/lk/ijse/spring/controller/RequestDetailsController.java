package lk.ijse.spring.controller;


import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.dto.RequestDetailsDTO;
import lk.ijse.spring.service.RequestDetailsService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/requestDetail")
@CrossOrigin
public class RequestDetailsController {

    @Autowired
    RequestDetailsService requestDetailsService;

    @PostMapping
    public ResponseEntity<StandardResponse> addDriver(@RequestBody RequestDetailsDTO dto){
        System.out.println(dto);
        requestDetailsService.addRequestDetail(dto);
        StandardResponse success = new StandardResponse(200, "Success", dto);
        return new ResponseEntity(success, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody RequestDetailsDTO dto){
        System.out.println(dto.getRequestedDate()+"Request");
        requestDetailsService.updateRequestDetail(dto);
        return new ResponseEntity(new StandardResponse(200,"Success",null),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllRequestDetails() {
        System.out.println("GETALL");
        List<RequestDetailsDTO> allCarDetail = requestDetailsService.getAllCarDetail();
        return new ResponseEntity(new StandardResponse(200, "SuccessGetAll", allCarDetail), HttpStatus.OK);
    }


    @PutMapping(path = "/visibility")
    public ResponseEntity<StandardResponse> updateRequestVisibility(@RequestBody RequestDetailsDTO dto){
        System.out.println("Visibility of Request");
        requestDetailsService.updateRequestDetailAvailability(dto);
        return new ResponseEntity(new StandardResponse(200, "Successfullu Update", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> searchRequest(@PathVariable("id") int id){
        System.out.println(id);
        RequestDetailsDTO requestDetailsDTO = requestDetailsService.searchRequestDetail(id);
        return new ResponseEntity( new StandardResponse(200,"Search",requestDetailsDTO),HttpStatus.OK);
    }

//    findDriverResult

    @GetMapping(path = "driverId/{id}")
    public ResponseEntity<StandardResponse> searchDriverById(@PathVariable("id") String id){
        System.out.println(id);
        List<RequestDetailsDTO> requestDetailsDTO= requestDetailsService.searchDriverDetailsID(id);
        return new ResponseEntity( new StandardResponse(200,"Search",requestDetailsDTO),HttpStatus.OK);
    }

}
