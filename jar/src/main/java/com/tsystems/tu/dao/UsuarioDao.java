package com.tsystems.tu.dao;

import javax.ejb.Stateless;

import com.tsystems.tu.modelo.Usuario;

/**
 * DAO de la entidad Usuario.
 * @author crequena
 *
 */
@Stateless
public class UsuarioDao extends AbstractDao<Usuario> {

	/**
	 * Retorna la clase de la entidad para poder realizar la persistencia.
	 */
	@Override
	public Class<Usuario> getEntityClass() {
		return Usuario.class;
	}

}
