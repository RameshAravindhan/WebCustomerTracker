package com.springmvc.hibernate.demo.service;

import com.springmvc.hibernate.demo.dao.CustomerDAO;
import com.springmvc.hibernate.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    @Override
    public List<Customer> getSerCustomers() {
        return customerDAO.getCustomers();
    }

    @Transactional
    @Override
    public void saveSerCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);

    }

    @Override
    @Transactional
    public Customer getSerCustomer(int id) {

        Customer theCus = customerDAO.getCustomer(id);

        return theCus;
    }

    @Override
    @Transactional
    public void deleteSerCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}