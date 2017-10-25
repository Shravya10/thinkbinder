package com.javasampleapproach.angularjs.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.angularjs.model.Customer;

@Repository
public interface CustomerDao extends MongoRepository<Customer,String>{

public List<Customer> listUser();
	
	public void create(Customer customer);

}
