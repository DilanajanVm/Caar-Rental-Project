package lk.ijse.spring.controller;



import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.dto.MaintenanceCarDTO;


import lk.ijse.spring.service.MaintenanceCarService;
import lk.ijse.spring.util.StandardResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Maintenance")
@CrossOrigin
public class MaintenanceCarController {

@Autowired
    MaintenanceCarService maintenanceCarService;

@PostMapping
public ResponseEntity<StandardResponse> addMaintance(@RequestBody MaintenanceCarDTO dto){
    System.out.println(dto);
    maintenanceCarService.saveMaintenanceCar(dto);
    StandardResponse success = new StandardResponse(200, "Success", dto);
    return new ResponseEntity(success, HttpStatus.CREATED);
}



    @GetMapping
    public ResponseEntity<StandardResponse> getAllMAintenance(){
        System.out.println("GETALL");
        List<MaintenanceCarDTO> allMaintenanceCar = maintenanceCarService.getAllMaintenanceCar();
        return new ResponseEntity(new StandardResponse(200,"getAll",allMaintenanceCar),HttpStatus.OK);
    }

}



