package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CarDetailsDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carDetail")
@CrossOrigin
public class CarDetailsController {

    @Autowired
    CarService carService;

    @PostMapping
    public ResponseEntity<StandardResponse> addCarDetails(@RequestBody CarDetailsDTO dto){
        System.out.println(dto);
        carService.saveCarDetail(dto);
        StandardResponse success = new StandardResponse(200, "Success", dto);
        return new ResponseEntity(success, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity<StandardResponse> deleteCarDetail(@RequestParam String id) {
        carService.deleteCarDetail(id);
        return new ResponseEntity(new StandardResponse(200, "Delete", id), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<StandardResponse> updateCarDetail(@RequestBody CarDetailsDTO dto) {
        carService.updateCarDetail(dto);
        return new ResponseEntity(new StandardResponse(200, "Successfullu Update", dto), HttpStatus.OK);
    }
    @PutMapping(path = "/visibility")
    public ResponseEntity<StandardResponse> updateCarVisibility(@RequestBody CarDetailsDTO dto){
        System.out.println("Visibility");
        carService.updateVisibale(dto);
        return new ResponseEntity(new StandardResponse(200, "Successfullu Update", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> searchCarDetail(@PathVariable String id) {
        CarDetailsDTO carDetailsDTO = carService.searchCarDetail(id);
        return new ResponseEntity(new StandardResponse(200, "Search", carDetailsDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<StandardResponse> getAllCarDetail() {
        System.out.println("GETALL");
        List<CarDetailsDTO> allCarDetail = carService.getAllCarDetail();
        return new ResponseEntity(new StandardResponse(200, "SuccessGetAll", allCarDetail), HttpStatus.OK);
    }
}
