package co.com.keny0z.usuarios.USUARIOS_Api.dominio.puerto;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.dto.DtoUsuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo.Usuario;

import java.util.List;

public interface RepositorioUsuario {

    List<DtoUsuario> listar();

    void guardar(Usuario usuario);
    boolean existe(String correoElectronico);
}
