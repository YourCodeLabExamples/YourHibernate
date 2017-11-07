package com.yourcodelab.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.yourcodelab.model.Customer;

public class CustomerDAO extends GenericDAO{
	public void insert(Customer customer){
		openConnection();
		entityManager.persist(customer);
		closeConnection();
	}
	
	public void update(Customer customer){
		openConnection();
		entityManager.merge(customer);
		closeConnection();
	}
	
	public void delete(Customer customer){
		openConnection();
		entityManager.remove(customer);
		closeConnection();
	}
	
	public Customer findById(Integer id){
		openConnection();
		Query query = entityManager.createQuery("SELECT c FROM Customer c WHERE c.id = :id");
		query.setParameter("id", id);
		
		Customer c = (Customer) query.getSingleResult();
		
		closeConnection();
		
		return c;
	}
	
	public List<Customer> searchByName(String name){
		openConnection();
		Query query = entityManager.createQuery("SELECT c FROM Customer c WHERE c.name LIKE %:name%");
		query.setParameter("name", name);
		
		List<Customer> list = (List<Customer>) query.getResultList();
		
		closeConnection();
		
		return list;
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
