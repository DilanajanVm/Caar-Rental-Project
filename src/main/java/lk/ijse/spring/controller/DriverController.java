package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CarDetailsDTO;
import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping
    public ResponseEntity<StandardResponse> addDriver(@RequestBody DriverDetailDTO dto){
        System.out.println(dto);
        driverService.saveDriver(dto);
        StandardResponse success = new StandardResponse(200, "Success", dto);
        return new ResponseEntity(success, HttpStatus.CREATED);
    }


    @DeleteMapping(params = {"id"})
    public ResponseEntity<StandardResponse> deleteDriver(@RequestParam String id){
        driverService.deleteDriver(id);
        return new ResponseEntity(new StandardResponse(200,"Delete",null),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<StandardResponse> updateDriver(@RequestBody DriverDetailDTO dto){
        driverService.updateDriver(dto);
        return new ResponseEntity(new StandardResponse(200,"Successfullu Update",null),HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> searchDriver(@PathVariable("id") String id){
        DriverDetailDTO driverDetailDTO = driverService.searchDriver(id);
        return new ResponseEntity( new StandardResponse(200,"Search",driverDetailDTO),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllDriverr(){
        System.out.println("GETALL");
        List<DriverDetailDTO> allDriver = driverService.getAllDriver();
        return new ResponseEntity(new StandardResponse(200,"getAll",allDriver),HttpStatus.OK);
    }


    @PutMapping(path = "/visibility")
    public ResponseEntity<StandardResponse> updateCarVisibility(@RequestBody DriverDetailDTO dto){
        System.out.println("Visibility");
        driverService.updateDriverVisibility(dto);
        return new ResponseEntity(new StandardResponse(200, "Successfullu Update", null), HttpStatus.OK);
    }


}
