package com.tsystems.tu.negocio;

import java.util.List;

import com.tsystems.tu.dao.AbstractDao;
import com.tsystems.tu.modelo.EntidadBase;

/**
 * Clase de servicios CRUD.
 * 
 * @author krequena
 *
 */
public abstract class AbstractService<K extends EntidadBase> {

	/**
	 * Inyección del DAO correspondiente a la entidad.
	 */
	protected AbstractDao<K> dao;

	/**
	 * Método que obtiene una instancia de una entidad a partir de su id.
	 * 
	 * @param id Identificador de la entidad.
	 * @return Instancia.
	 */
	public K obtenerPorId(long id) {
		return dao.obtenerPorId(id);
	}

	/**
	 * Método que obtiene todas las instancias de una entidad.
	 * 
	 * @return Lista de instancias.
	 */
	public List<K> obtenerTodos() {
		return dao.obtenerTodos();
	}

	/**
	 * Método que inserta una instancia de una entidad.
	 * 
	 * @param instancia Instancia a insertar.
	 */
	public void insertar(K instancia) {
		dao.insertar(instancia);
	}

	/**
	 * Método que modifica una instancia de una entidad.
	 * 
	 * @param instancia Instancia a modificar.
	 */
	public K modificar(K instancia) {
		return dao.modificar(instancia);
	}

	/**
	 * Método que elimina una instancia de una entidad a partir de su id.
	 * 
	 * @param id Identificador de la entidad.
	 */
	public void eliminar(long id) {
		K instancia = this.obtenerPorId(id);
		this.eliminar(instancia);
	}

	/**
	 * Método que elimina una instancia de una entidad.
	 * 
	 * @param instancia Instancia a eliminar.
	 */
	public void eliminar(K instancia) {
		dao.eliminar(instancia);
	}

}
