package com.tsystems.tu.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase DTO para el intercambio de datos externos de la API.
 * 
 * @author krequena
 *
 */
@XmlRootElement
public class UsuarioDTO {

	private long id;
	private String username;
	private String email;

	/**
	 * Constructor.
	 * 
	 * @param id       Identificador del usuario.
	 * @param username Nombre de usuario.
	 * @param email    E-mail.
	 */
	public UsuarioDTO(long id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public final void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

}
