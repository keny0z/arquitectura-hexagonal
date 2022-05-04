package co.com.keny0z.usuarios.USUARIOS_Api.infraestructura.controlador.error;

public class Error {

    private String nombreExcepcion;
    private String mensaje;

    public Error(String nombreExcepcion, String mensaje){
        this.nombreExcepcion = nombreExcepcion;
        this.mensaje = mensaje;
    }

    public String getNombreExcepcion(){
        return nombreExcepcion;
    }

    public String getMensaje(){
        return mensaje;
    }
}
