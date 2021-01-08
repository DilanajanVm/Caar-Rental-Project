package lk.ijse.spring.repo;

import lk.ijse.spring.entity.RequestDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RequestDetailsRepo extends JpaRepository<RequestDetails,Integer> {
    Optional<RequestDetails> findByRequestID(int id);
    List<RequestDetails> findAllByRequestDriverID(String dr002);
//    findBy
}
