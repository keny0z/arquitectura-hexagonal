package co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo;

import static co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo.ValidadorArgumento.validarObligatorio;

public class Usuario {

    private static final String MENSAJE_CLAVE_OBLIGATORIA = "La clave es obligatoria.";
    private static final String MENSAJE_CORREO_OBLIGATORIO = "El correo electronico es obligatorio.";

    private String correoElectronico;
    private String clave;

    public Usuario(String correoElectronico, String clave){

        validarObligatorio(correoElectronico, MENSAJE_CORREO_OBLIGATORIO);
        validarObligatorio(clave, MENSAJE_CLAVE_OBLIGATORIA);

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
