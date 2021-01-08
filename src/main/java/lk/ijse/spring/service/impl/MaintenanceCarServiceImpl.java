package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.dto.MaintenanceCarDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.MaintenanceCar;
import lk.ijse.spring.repo.MaintenanceCarRepo;
import lk.ijse.spring.service.MaintenanceCarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MaintenanceCarServiceImpl implements MaintenanceCarService {


    @Autowired
    ModelMapper mapper;

    @Autowired
    MaintenanceCarRepo repo;

    @Override
    public void saveMaintenanceCar(MaintenanceCarDTO dto) {
        MaintenanceCar map = mapper.map(dto, MaintenanceCar.class);
        repo.save(map);
    }

    @Override
    public void updateMaintenanceCar(MaintenanceCarDTO dto) {

    }

    @Override
    public MaintenanceCarDTO searchMaintenanceCar(String id) {
        Optional<MaintenanceCar> maintence = repo.findById(id);
        if (maintence.isPresent()) {
            return mapper.map(maintence.get(), MaintenanceCarDTO.class);
        } else {
            throw new RuntimeException("No matching Maintence for " + id + "ID number");
        }
    }

    @Override
    public void deleteMaintenanceCar(String id) {

    }

    @Override
    public List<MaintenanceCarDTO> getAllMaintenanceCar() {
        List<MaintenanceCar> allMaintence = repo.findAll();
        return mapper.map(allMaintence, new TypeToken<List<MaintenanceCarDTO>>() {
        }.getType());
    }
}
