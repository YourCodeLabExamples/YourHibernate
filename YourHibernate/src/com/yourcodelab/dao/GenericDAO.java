package com.yourcodelab.dao;

import javax.persistence.EntityManager;

import com.yourcodelab.util.HibernateUtil;

public class GenericDAO {
	protected EntityManager entityManager;
	
	protected void openConnection(){
		entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
	}
	
	protected void closeConnection(){
		entityManager.close();
	}
}
