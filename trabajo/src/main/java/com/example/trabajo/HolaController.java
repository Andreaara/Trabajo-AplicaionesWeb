package com.example.trabajo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HolaController {
    @PostMapping(
            path = "/saludo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public Map<String, String> saludo(@RequestBody Map<String, String> datos) {
        String nombre = datos.get("nombreUsuario");
        String contrasena = datos.get("contrasena");

        String mensaje = "Usuario: " + nombre + " Contraseña: " + contrasena;
        return Map.of("mensaje", mensaje);
    }
}
