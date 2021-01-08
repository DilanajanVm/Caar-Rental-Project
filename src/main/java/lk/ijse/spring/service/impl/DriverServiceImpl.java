package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.entity.CarDetails;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    DriverRepo repo;


    @Override
    public void saveDriver(DriverDetailDTO driverDetailDTO) {
        System.out.println("saveDriverImpl");
        Driver d = mapper.map(driverDetailDTO, Driver.class);
        repo.save(d);
        System.out.println("saveDriverImplEnd");
    }

    @Override
    public void updateDriver(DriverDetailDTO driverDetailDTO) {

        if (repo.existsById(String.valueOf(driverDetailDTO.getDriver_NIC()))) {
            Driver d = mapper.map(driverDetailDTO, Driver.class);
            repo.save(d);
        }
    }

    @Override
    public void updateDriverVisibility(DriverDetailDTO dto) {
        if (repo.existsById(dto.getDriver_NIC())){
            System.out.println("UpdateVisibility impl start aaaaaaaaaaaaaa"+dto.getDriver_NIC());
            Driver driver = repo.findById(dto.getDriver_NIC()).get();
            driver.setDriver_Availability(false);
            repo.save(driver);
        }else{
            System.out.println("there is no matching Driver to update!"+dto.getDriver_NIC());
        }
    }

    @Override
    public void deleteDriver(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No matching Driver for " + id + "ID number");
        }

    }

    @Override
    public DriverDetailDTO searchDriver(String id) {
        Optional<Driver> driver = repo.findById(id);
        if (driver.isPresent()) {
            return mapper.map(driver.get(), DriverDetailDTO.class);
        } else {
            throw new RuntimeException("No matching Driver for " + id + "ID number");
        }
    }

    @Override
    public List<DriverDetailDTO> getAllDriver() {
        List<Driver> allDrivers = repo.findAll();
        return mapper.map(allDrivers, new TypeToken<List<DriverDetailDTO>>() {
        }.getType());
    }


}
