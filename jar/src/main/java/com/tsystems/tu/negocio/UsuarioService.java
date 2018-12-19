package com.tsystems.tu.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tsystems.tu.dao.UsuarioDao;
import com.tsystems.tu.modelo.Usuario;

/**
 * EJB de servicios de la entidad Usuario.
 * 
 * @author krequena
 *
 */
@Stateless
public class UsuarioService extends AbstractService<Usuario> {

	@EJB
	protected void setDao(UsuarioDao dao) {
		super.dao = dao;
	}

}
