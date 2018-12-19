package com.tsystems.tu.modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Entidad base de la cual heredan el resto de entidades de nuestra aplicación.
 * Implementa los datos comunes a todas las entidades.
 * @author krequena
 *
 */
@MappedSuperclass
public abstract class EntidadBase {

	@Id
	@Column(name="id")
	protected long id;

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

}
