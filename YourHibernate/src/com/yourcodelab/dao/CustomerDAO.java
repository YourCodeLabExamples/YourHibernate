package com.yourcodelab.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.yourcodelab.model.Customer;

public class CustomerDAO extends GenericDAO{
	public void insert(Customer customer){
		openConnection();
		entityManager.persist(customer);
		closeConnection();
	}
	
	public List<Customer> listAll(){
		List<Customer> listCustomer = new ArrayList<Customer>();
		try{
			openConnection();
			listCustomer = (List<Customer>) entityManager.createQuery("SELECT c FROM Customer c").getResultList();
			closeConnection();
		}catch(Exception e){
			System.out.println("Error - Data Base");
		}
		return listCustomer;
	}
}
