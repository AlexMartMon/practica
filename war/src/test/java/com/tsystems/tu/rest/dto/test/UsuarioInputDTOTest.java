package com.tsystems.tu.rest.dto.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tsystems.tu.rest.dto.UsuarioDTO;

/**
 * Clase test de UsuarioDTO.
 * 
 * @author krequena
 *
 */
public class UsuarioInputDTOTest {

	@Test
	public void testDto() {
		UsuarioDTO usuarioDto = new UsuarioDTO(0L, "username", "email@email.com");
		assertEquals(0L, usuarioDto.getId());
		assertEquals("username", usuarioDto.getUsername());
		assertEquals("email@email.com", usuarioDto.getEmail());
	}

}
