package lk.ijse.spring.service;

import lk.ijse.spring.dto.MaintenanceCarDTO;
import org.springframework.stereotype.Service;

import java.util.List;



public interface MaintenanceCarService {
    void saveMaintenanceCar(MaintenanceCarDTO dto);
    void updateMaintenanceCar(MaintenanceCarDTO dto);
    MaintenanceCarDTO searchMaintenanceCar(String id);
    void deleteMaintenanceCar(String id);
    List<MaintenanceCarDTO> getAllMaintenanceCar();
}
