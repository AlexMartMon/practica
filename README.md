# practica
Proyecto base de práctica.

## Contenido.
Clase de servicio web JAX-RS que usa dos DTOs para realizar la entrada y salida de datos.
Clase de servicio EJB accesible por la clase de servicio web.
Clase DAO para realizar la persistencia, accesible por la clase EJB.

## Ejemplo de uso.
### Creación de un Usuario.
Invocar la URL http://localhost:8080/war/rest/usuario desde un cliente REST con los siguientes ajustes:
* Content-Type: application/json
* Datos:
{
  "username": "krequena",
  "password": "abc",
  "email": "krequena@demo.com"
}

### Obtención de un Usuario.
Consumir la URL http://localhost:8080/war/rest/usuario/{id}, donde {id} es el código identificador del usuario.
Ejemplo: http://localhost:8080/war/rest/usuario/0