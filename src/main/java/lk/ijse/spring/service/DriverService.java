package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDetailDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDetailDTO driverDetailDTO);
    void updateDriver(DriverDetailDTO driverDetailDTO);
    void updateDriverVisibility(DriverDetailDTO driverDetailDTO);
    void deleteDriver(String id);
    DriverDetailDTO searchDriver(String id);
    List<DriverDetailDTO> getAllDriver();


}
