package com.tsystems.tu.utils;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase productora de recursos inyectables.
 * 
 * @author krequena
 *
 */
public class Recursos {

	@Produces
	@PersistenceContext
	private EntityManager em;

}
