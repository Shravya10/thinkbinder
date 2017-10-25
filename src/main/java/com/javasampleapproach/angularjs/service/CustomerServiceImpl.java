package com.javasampleapproach.angularjs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.angularjs.dao.CustomerDao;
import com.javasampleapproach.angularjs.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public List<Customer> listUser() {

		return customerDao.listUser();
	}

	@Override
	public void create(Customer customer) {
		customerDao.create(customer);
	}
}
