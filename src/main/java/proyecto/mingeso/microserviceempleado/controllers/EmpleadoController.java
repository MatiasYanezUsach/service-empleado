package proyecto.mingeso.microserviceempleado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.mingeso.microserviceempleado.entities.EmpleadoEntity;
import proyecto.mingeso.microserviceempleado.services.EmpleadoService;

import java.util.ArrayList;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "http://localhost:3000")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<ArrayList<EmpleadoEntity>> obtenerEmpleados() {
        ArrayList<EmpleadoEntity> empleados = empleadoService.obtenerEmpleados();
        if(empleados.isEmpty()) {
            return ResponseEntity.ok(empleados);
        }
        else {
            return ResponseEntity.ok(empleados);
        }
    }
    @GetMapping("/byRut/{rut_dado}")
    public ResponseEntity<EmpleadoEntity> obtenerEmpleado(@PathVariable("rut_dado") String rut_dado) {
        EmpleadoEntity empleado = empleadoService.findByRut(rut_dado);
        if(empleado == null){
            return ResponseEntity.ok(empleado);
        }
        else{
            return ResponseEntity.ok(empleado);
        }
    }
}