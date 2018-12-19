package com.tsystems.tu.rest.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase DTO de entrada para el intercambio de datos externos de la API.
 * 
 * @author krequena
 *
 */
@XmlRootElement
public class UsuarioInputDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String email;

	/**
	 * Constructor.
	 */
	public UsuarioInputDTO() {

	}

	/**
	 * Constructor.
	 * 
	 * @param username Nombre de usuario.
	 * @param password Contraseña.
	 * @param email    Correo electrónico.
	 */
	public UsuarioInputDTO(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
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

}
