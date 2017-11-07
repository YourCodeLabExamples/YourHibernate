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
	
	public void updateCustomer(Customer customer){
		dao.update(customer);
	}
	
	public void deleteCustomer(Customer customer){
		dao.delete(customer);
	}
	
	public Customer findCustomerById(Integer id){
		return dao.findById(id);
	}
	
	public List<Customer> searchCustomerByName(String name){
		return dao.searchByName(name);
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
}
