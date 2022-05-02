package co.com.keny0z.usuarios.USUARIOS_Api.dominio.servicio;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.excepcion.ExcepcionUsuarioRepetido;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo.Usuario;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarUsuario {

    private static final String MENSAJE_USUARIO_REPETIDO = "El usuario ya existe en el sistema.";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioGuardarUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public void guardar(Usuario usuario){

        garantizarNoUsuarioRepetido(usuario);
        this.repositorioUsuario.guardar(usuario);
    }

    private void garantizarNoUsuarioRepetido(Usuario usuario){
        if(this.repositorioUsuario.existe(usuario.getCorreoElectronico())){
            throw new ExcepcionUsuarioRepetido(MENSAJE_USUARIO_REPETIDO);
        }
    }

}
