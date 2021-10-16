package com.springmvc.hibernate.demo.controller;

import com.springmvc.hibernate.demo.dao.CustomerDAO;
import com.springmvc.hibernate.demo.entity.Customer;
import com.springmvc.hibernate.demo.service.CustomerService;
import org.hibernate.query.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/list")
    public String customerDisplay(Model model) {

        List<Customer> allCustomers = customerService.getSerCustomers();
        model.addAttribute("customers", allCustomers);
        return "customer_list";
    }

    @GetMapping("/showFormForAdd")
    public String addCustomer(Model model) {

        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {

        customerService.saveSerCustomer(theCustomer);

        return "redirect:/customer/list";
    }

    @GetMapping("/UpdateCustomer")
    public String updateCustomer(Model model,@RequestParam int id) {

        Customer updatedCustomer = customerService.getSerCustomer(id);
        model.addAttribute("customer",updatedCustomer);

        return "customer-form";
    }

    @GetMapping("/DeleteCustomer")
    public String deleteCustomer(Model model,@RequestParam int id) {

       customerService.deleteSerCustomer(id);


        return "redirect:/customer/list";
    }


}