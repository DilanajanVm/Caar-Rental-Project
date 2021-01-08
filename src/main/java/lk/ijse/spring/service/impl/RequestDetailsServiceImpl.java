package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDetailDTO;
import lk.ijse.spring.dto.RequestDetailsDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.RequestDetails;
import lk.ijse.spring.repo.RequestDetailsRepo;
import lk.ijse.spring.service.RequestDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RequestDetailsServiceImpl implements RequestDetailsService {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    RequestDetailsRepo repo;


    @Override
    public void addRequestDetail(RequestDetailsDTO requestDetailsDTO) {
        System.out.println("AddRequestDetails");
        RequestDetails rd = mapper.map(requestDetailsDTO,RequestDetails.class);
        repo.save(rd);
        System.out.println("Save Request !");
    }

    @Override
    public void updateRequestDetail(RequestDetailsDTO dto) {
        if (repo.existsById(dto.getRequestID())){
            RequestDetails rqDetails = mapper.map(dto, RequestDetails.class);
            repo.save(rqDetails);
        }
    }

    @Override
    public void updateRequestDetailAvailability(RequestDetailsDTO dto) {
        if (repo.existsById(dto.getRequestID())){
            System.out.println("UpdateVisibility impl start request  "+dto.getRequestID());
            RequestDetails requestDetails = repo.findById(dto.getRequestID()).get();
            requestDetails.setRequestStatus(true);
            repo.save(requestDetails);
        }else{
            System.out.println("there is no matching Request to update!"+dto.getRequestID());
        }
    }

    @Override
    public RequestDetailsDTO searchRequestDetail(int id) {
        System.out.println(id+"String Impl");
        String s = String.valueOf(id);
        Optional<RequestDetails> byId = repo.findByRequestID(id);
        System.out.println(byId);
        if (byId.isPresent()) {
            return mapper.map(byId.get(), RequestDetailsDTO.class);
        } else {
            throw new RuntimeException("No matching Request for " + id + " You had  Input");
        }
    }

    @Override
    public List<RequestDetailsDTO> searchDriverDetailsID(String id) {
//        Optional<RequestDetails> allByRequestDriverID = repo.findAllByRequestDriverID(id);
//        if (allByRequestDriverID.isPresent()){
//            return  mapper.map(allByRequestDriverID,new TypeToken<List<RequestDetailsDTO>>(){}.getType());
//        }else{
//            throw new RuntimeException("No matching Request for " + id + " You had  Input");
//        }

        List<RequestDetails> dr002 = repo.findAllByRequestDriverID(id);
//        System.out.println(dr002);
        return  mapper.map(dr002,new TypeToken<List<RequestDetailsDTO>>(){}.getType());
    }

    @Override
    public List<RequestDetailsDTO> getAllCarDetail() {
        System.out.println("Add Request Details !");
        List<RequestDetails> all = repo.findAll();
        return  mapper.map(all,new TypeToken<List<RequestDetailsDTO>>(){}.getType());

    }

}
