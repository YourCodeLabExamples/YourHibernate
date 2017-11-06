package com.yourcodelab.service;

import java.util.List;

import com.yourcodelab.dao.CustomerDAO;
import com.yourcodelab.model.Customer;

public class CustomerService {
	private CustomerDAO dao;
	
	public CustomerService(){
		dao = new CustomerDAO();
	}
	
	public void insertCustomer(Customer customer){
		dao.insert(customer);
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
}
