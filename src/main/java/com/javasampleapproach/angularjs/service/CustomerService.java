package com.javasampleapproach.angularjs.service;

import java.util.List;

import com.javasampleapproach.angularjs.model.Customer;

public interface CustomerService {

	public List<Customer> listUser();

	public void create(Customer customer);
}
