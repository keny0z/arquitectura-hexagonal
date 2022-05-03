package co.com.keny0z.usuarios.USUARIOS_Api.aplicacion.servicio;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo.Usuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.servicio.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarUsuario {

    private final ServicioGuardarUsuario servicioGuardarUsuario;

    public ServicioAplicacionGuardarUsuario(ServicioGuardarUsuario servicioGuardarUsuario){
        this.servicioGuardarUsuario = servicioGuardarUsuario;
    }

    public void ejecutar(String correoElectronico, String clave){
        this.servicioGuardarUsuario.guardar(new Usuario(correoElectronico,clave));
    }
}
