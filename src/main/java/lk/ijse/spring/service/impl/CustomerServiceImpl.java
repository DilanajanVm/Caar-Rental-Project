package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    CustomerRepo repo;

    @Override
    public void saveCustomer(CustomerDTO dto) {
            Customer c = mapper.map(dto, Customer.class);
            repo.save(c);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (repo.existsById(String.valueOf(dto.getnICNumber()))) {
            Customer c = mapper.map(dto, Customer.class);
            repo.save(c);
        }
    }

    @Override
    public CustomerDTO searchCustomer(String id){
        Optional<Customer> customer = repo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        } else {
            throw new RuntimeException("NO matching Customer for " + id + "ID number");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Now Matching Customer");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }

}
