package co.edu.uniquindio.proyecto.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


public record EditarUsuarioDTO(
        String id,
        @NotBlank @Length(max = 100) String nombre,
        @NotBlank @Length(max = 100) String ciudad,
        @NotBlank @Length(max = 100) String direccion,
        @Length(max = 10) String telefono
) {
}
