package co.com.keny0z.usuarios.USUARIOS_Api.dominio.modelo;

import co.com.keny0z.usuarios.USUARIOS_Api.dominio.excepcion.ExcepcionValorObligatorio;

public class ValidadorArgumento {

    public static void validarObligatorio(Object valor, String mensaje){
        if(valor == null || valor.toString().isEmpty()){
            throw new ExcepcionValorObligatorio(mensaje);
        }
    }
}
