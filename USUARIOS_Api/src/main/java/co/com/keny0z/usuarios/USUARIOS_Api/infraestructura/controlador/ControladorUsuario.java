package co.com.keny0z.usuarios.USUARIOS_Api.infraestructura.controlador;

import co.com.keny0z.usuarios.USUARIOS_Api.aplicacion.servicio.ServicioAplicacionGuardarUsuario;
import co.com.keny0z.usuarios.USUARIOS_Api.aplicacion.servicio.ServicioAplicacionListarUsuarios;
import co.com.keny0z.usuarios.USUARIOS_Api.dominio.dto.DtoUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ControladorUsuario {

    private final ServicioAplicacionListarUsuarios servicioAplicacionListarUsuarios;
    private final ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario;

    public ControladorUsuario(ServicioAplicacionListarUsuarios servicioAplicacionListarUsuarios, ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario){
        this.servicioAplicacionListarUsuarios = servicioAplicacionListarUsuarios;
        this.servicioAplicacionGuardarUsuario = servicioAplicacionGuardarUsuario;
    }

    @RequestMapping("/usuarios")
    public List<DtoUsuario> listar(){
        return this.servicioAplicacionListarUsuarios.ejecutar();
    }

    @PostMapping("/usuarios")
    public void guardar(@RequestBody Map<String, Object> json){
        this.servicioAplicacionGuardarUsuario.ejecutar(obtenerValor(json, "correoElectronico"), obtenerValor(json, "clave"));
    }

    private String obtenerValor(Map<String, Object> json, String llave){
        return json.get(llave).toString();
    }
}
