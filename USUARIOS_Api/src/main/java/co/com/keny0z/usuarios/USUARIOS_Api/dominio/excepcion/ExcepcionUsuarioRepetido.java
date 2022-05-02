package co.com.keny0z.usuarios.USUARIOS_Api.dominio.excepcion;

public class ExcepcionUsuarioRepetido extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ExcepcionUsuarioRepetido(String mensaje){
        super(mensaje);
    }
}
