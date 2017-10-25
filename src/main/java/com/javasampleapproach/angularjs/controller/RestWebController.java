
package com.javasampleapproach.angularjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.angularjs.model.Customer;
import com.javasampleapproach.angularjs.service.CustomerService;

@RestController
public class RestWebController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public void update(@RequestBody Customer customer) {
		customerService.create(customer);
		System.out.println(customer);

	}

}