package com.springmvc.hibernate.demo.dao;

import com.springmvc.hibernate.demo.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);
}