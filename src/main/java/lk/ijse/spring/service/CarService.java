package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDetailsDTO;

import java.util.List;

public interface CarService {
    void saveCarDetail(CarDetailsDTO dto);
    void updateCarDetail(CarDetailsDTO dto);
    void updateVisibale(CarDetailsDTO dto);
    CarDetailsDTO searchCarDetail(String id);
    void deleteCarDetail(String id);
    List<CarDetailsDTO> getAllCarDetail();
}
