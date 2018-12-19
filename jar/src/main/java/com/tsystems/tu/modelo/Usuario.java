package com.tsystems.tu.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tsystems.tu.utils.Constantes;

/**
 * Entidad Usuario.
 * 
 * @author krequena
 *
 */
@Entity
@Table(name="usuarios")
public class Usuario extends EntidadBase {

	@Column(name="username")
	@NotNull
	@Size(max=Constantes.JPA_LONGITUD_REFERENCIAS)
	private String username;

	@Column(name="email")
	@NotNull
	@Size(max=Constantes.JPA_LONGITUD_EMAIL)
	private String email;

	@Column(name="password")
	@NotNull
	private String password;

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

}
