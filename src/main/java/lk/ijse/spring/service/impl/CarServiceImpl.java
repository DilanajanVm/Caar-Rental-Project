package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDetailsDTO;
import lk.ijse.spring.entity.CarDetails;
import lk.ijse.spring.repo.CarDetailsRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarDetailsRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCarDetail(CarDetailsDTO dto) {
        System.out.println("CarImpl");
        System.out.println(dto);
        CarDetails carDetails = mapper.map(dto, CarDetails.class);
        repo.save(carDetails);
    }

    @Override
    public void updateCarDetail(CarDetailsDTO dto) {
        if (repo.existsById(String.valueOf(dto.getCarNumber()))){
            CarDetails carDetails = mapper.map(dto, CarDetails.class);
            repo.save(carDetails);
        }
    }

    @Override
    public void updateVisibale(CarDetailsDTO dto) {
        if (repo.existsById(dto.getCarNumber())){
        System.out.println("UpdateVisibility impl start"+dto.getCarNumber());
            CarDetails carDetails = repo.findById(dto.getCarNumber()).get();
            carDetails.setCarAvailerlibilty(false);
            repo.save(carDetails);
    }else{
         System.out.println("there is no matching Car Details to update!"+dto.getCarNumber());
        }
    }



    @Override
    public CarDetailsDTO searchCarDetail(String id) {
        Optional<CarDetails> customer = repo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CarDetailsDTO.class);
        } else {
            throw new RuntimeException("NO matching Car for " + id + "number Plate Number");
        }
    }

    @Override
    public void deleteCarDetail(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        
        } else {
            throw new RuntimeException("Now Matching Car Details");
        }

    }

    @Override
    public List<CarDetailsDTO> getAllCarDetail() {
        List<CarDetails> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarDetailsDTO>>() {
        }.getType());
    }
}
