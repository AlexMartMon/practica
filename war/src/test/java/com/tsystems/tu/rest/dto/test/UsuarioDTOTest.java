package com.tsystems.tu.rest.dto.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tsystems.tu.rest.dto.UsuarioInputDTO;


/**
 * Clase test de UsuarioDTO.
 * 
 * @author krequena
 *
 */
public class UsuarioDTOTest {

	@Test
	public void testDto() {
		UsuarioInputDTO usuarioDto = new UsuarioInputDTO("username", "password", "email@email.com");
		assertEquals("username", usuarioDto.getUsername());
		assertEquals("password", usuarioDto.getPassword());
		assertEquals("email@email.com", usuarioDto.getEmail());
	}

}
