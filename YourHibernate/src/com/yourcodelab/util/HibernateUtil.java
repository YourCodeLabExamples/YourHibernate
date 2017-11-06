package com.yourcodelab.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author imssbora
 * Reference: https://www.boraji.com/hibernate-5-basic-configuration-example
 */
public class HibernateUtil {
	private static final String PERSISTENCE_UNIT_NAME = "yourcodelab";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
	   if (factory == null) {
	     factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	   }
	    return factory;
	}

	  public static void shutdown() {
	    if (factory != null) {
	      factory.close();
	    }
	  }
}
