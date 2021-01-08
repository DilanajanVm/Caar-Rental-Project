package lk.ijse.spring.repo;

import lk.ijse.spring.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarDetailsRepo extends JpaRepository<CarDetails,String> {
    @Query(value = "SELECT * from cardetails where carAvailerlibilty=:id",nativeQuery = true)
    List<CarDetails> myCardetails(@Param("id") boolean id);
}
