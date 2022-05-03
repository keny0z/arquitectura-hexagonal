package co.com.keny0z.usuarios.USUARIOS_Api.aplicacion.servicio;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.dto.DtoUsuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.puerto.repositorio.RepositorioUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarUsuarios {
    private final RepositorioUsuario repositorioUsuario;

    public ServicioAplicacionListarUsuarios(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<DtoUsuario> ejecutar(){
        return this.repositorioUsuario.listar();
    }
}
