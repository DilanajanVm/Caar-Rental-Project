package lk.ijse.spring.repo;

import lk.ijse.spring.entity.MaintenanceCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceCarRepo extends JpaRepository<MaintenanceCar,String> {
}
