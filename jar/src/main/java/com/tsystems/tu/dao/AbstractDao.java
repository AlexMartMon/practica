package com.tsystems.tu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tsystems.tu.modelo.EntidadBase;

/**
 * Clase abstracta de DAO genérico.
 * 
 * @author krequena
 *
 */
public abstract class AbstractDao<K extends EntidadBase> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PersistenceContext(unitName="bd")
	public EntityManager entityManager;

	public abstract Class<K> getEntityClass();

	/**
	 * Método que obtiene una instancia de una entidad a partir de su id.
	 * 
	 * @param id Identificador de la entidad.
	 * @return Instancia.
	 */
	public K obtenerPorId(long id) {
		logger.info("{}Dao, obtenerPorId: {}", this.getEntityClass().getName(), id);
		return entityManager.find(this.getEntityClass(), id);
	}

	/**
	 * Método que obtiene todas las instancias de una entidad.
	 * 
	 * @return Lista de instancias.
	 */
	public List<K> obtenerTodos() {
		logger.info("{}Dao, obtenerTodos.", this.getEntityClass().getName());
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<K> cq = cb.createQuery(this.getEntityClass());
		Root<K> rootEntry = cq.from(this.getEntityClass());
		CriteriaQuery<K> all = cq.select(rootEntry);
		TypedQuery<K> query = entityManager.createQuery(all);
		return query.getResultList();
	}

	/**
	 * Método que inserta una instancia de una entidad.
	 * 
	 * @param instancia Instancia a insertar.
	 * 
	 */
	public void insertar(K instancia) {
		logger.info("{}Dao, insertar id: {}", this.getEntityClass().getName(), instancia.getId());
		entityManager.persist(instancia);
	}

	/**
	 * Método que modifica una instancia de una entidad.
	 * 
	 * @param instancia Instancia a modificar.
	 */
	public K modificar(K instancia) {
		logger.info("{}Dao, modificar id: {}", this.getEntityClass().getName(), instancia.getId());
		return entityManager.merge(instancia);
	}

	/**
	 * Método que elimina una instancia de una entidad a partir de su id.
	 * 
	 * @param id Identificador de la entidad. Excepción.
	 */
	public void eliminar(long id) {
		logger.info("{}Dao, eliminar id: {}", this.getEntityClass().getName(), id);
		K instancia = this.obtenerPorId(id);
		this.eliminar(instancia);
	}

	/**
	 * Método que elimina una instancia de una entidad.
	 * 
	 * @param instancia Instancia a eliminar.
	 */
	public void eliminar(K instancia) {
		logger.info("{}Dao, eliminar id: {}", this.getEntityClass().getName(), instancia.getId());
		entityManager.remove(instancia);
	}

}