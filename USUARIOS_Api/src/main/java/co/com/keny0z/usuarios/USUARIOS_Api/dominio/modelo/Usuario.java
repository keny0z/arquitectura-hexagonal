package co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo;

public class Usuario {

    private String correoElectronico;
    private String clave;

    public Usuario(String correoElectronico, String clave){
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getClave() {
        return clave;
    }
}
