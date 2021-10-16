package com.springmvc.hibernate.demo.service;

import com.springmvc.hibernate.demo.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getSerCustomers();

    public void saveSerCustomer(Customer theCustomer);

   public Customer getSerCustomer(int id);

    public  void deleteSerCustomer(int id);
}