package co.edu.uniquindio.proyecto.controladores;

import co.edu.uniquindio.proyecto.servicios.UsuarioServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    private UsuarioServicio usuarioServicio;

}




