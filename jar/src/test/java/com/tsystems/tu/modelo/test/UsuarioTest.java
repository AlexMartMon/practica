package com.tsystems.tu.modelo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tsystems.tu.modelo.Usuario;

/**
 * Clase de test de la entidad Usuario.
 * @author krequena
 *
 */
public class UsuarioTest {

	@Test
	public void testUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(0L);
		usuario.setUsername("username");
		usuario.setPassword("password");
		usuario.setEmail("email");
		
		assertEquals(usuario.getId(), 0L);
		assertEquals(usuario.getUsername(), "username");
		assertEquals(usuario.getPassword(), "password");
		assertEquals(usuario.getEmail(), "email");
	}
}
