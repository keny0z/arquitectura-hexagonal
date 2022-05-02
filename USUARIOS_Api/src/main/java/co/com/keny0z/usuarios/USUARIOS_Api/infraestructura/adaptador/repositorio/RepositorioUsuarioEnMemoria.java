package co.com.keny0z.usuarios.USUARIOS_Api.infraestructura.adaptador.repositorio;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.dto.DtoUsuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo.Usuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.puerto.repositorio.RepositorioUsuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RepositorioUsuarioEnMemoria implements RepositorioUsuario {

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    public List<DtoUsuario> listar() {
        return usuarios.stream()
                .map(usuario -> new DtoUsuario(usuario.getCorreoElectronico()))
                .collect(Collectors.toList());
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public boolean existe(String correoElectronico) {
        return usuarios.stream()
                .filter(usuario -> usuario.getCorreoElectronico()
                .equals(correoElectronico))
                .findFirst()
                .isPresent();
    }
}
