package co.com.keny0z.usuarios.USUARIOS_Api.dominio.dto;

public class DtoUsuario {
    private String correoElectronico;

    public DtoUsuario(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }
}
