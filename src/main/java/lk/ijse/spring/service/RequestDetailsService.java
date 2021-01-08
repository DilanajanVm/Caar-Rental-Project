package lk.ijse.spring.service;

import lk.ijse.spring.dto.RequestDetailsDTO;

import java.util.List;

public interface RequestDetailsService {
    void addRequestDetail(RequestDetailsDTO dto);
    void updateRequestDetail(RequestDetailsDTO dto);
    void updateRequestDetailAvailability(RequestDetailsDTO dto);
    RequestDetailsDTO searchRequestDetail(int id);
    List<RequestDetailsDTO> searchDriverDetailsID(String id);
    List<RequestDetailsDTO> getAllCarDetail();
}
