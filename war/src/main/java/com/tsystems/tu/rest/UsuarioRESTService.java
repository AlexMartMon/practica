package com.tsystems.tu.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tsystems.tu.modelo.Usuario;
import com.tsystems.tu.negocio.UsuarioService;
import com.tsystems.tu.rest.dto.UsuarioDTO;
import com.tsystems.tu.rest.dto.UsuarioInputDTO;

/**
 * Clase de implementación de un WS REST.
 * 
 * @author krequena
 *
 */
@Path("/usuario")
public class UsuarioRESTService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@EJB
	private UsuarioService usuarioService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response obtenerUsuario(@PathParam("id") final long id) {
		logger.info("Obtener Usuario por id: {}", id);

		// Invocar al EJB.
		Usuario usuario = usuarioService.obtenerPorId(id);
		
		if(usuario == null) {
			// Si no se encuentra el usuario, se devuelve un código HTTP 204 - No content.
			return Response.noContent().build();
		}

		// Retornar el resultado.
		UsuarioDTO usuarioDto = new UsuarioDTO(usuario.getId(), usuario.getUsername(), usuario.getEmail());
		return Response.ok(usuarioDto).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerUsuarios() {
		logger.info("Obtener Usuarios.");

		// Invocar al EJB.
		List<Usuario> usuarios = usuarioService.obtenerTodos();

		// Retornar el resultado.
		List<UsuarioDTO> usuariosDto = new ArrayList<>();
		for(Usuario usuario : usuarios) {
			usuariosDto.add(new UsuarioDTO(usuario.getId(), usuario.getUsername(), usuario.getEmail()));
		}
		return Response.ok(usuariosDto).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearUsuario(final UsuarioInputDTO usuarioDto) {
		logger.info("Crear usuario.");

		// Invocar al EJB.
		Usuario usuario = new Usuario();
		usuario.setUsername(usuarioDto.getUsername());
		usuario.setPassword(usuarioDto.getPassword());
		usuario.setEmail(usuarioDto.getEmail());
		usuarioService.insertar(usuario);

		// Retornar el resultado.
		return Response.ok().build();
	}

}
