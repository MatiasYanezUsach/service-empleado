package proyecto.mingeso.microserviceempleado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.mingeso.microserviceempleado.entities.EmpleadoEntity;
import proyecto.mingeso.microserviceempleado.services.EmpleadoService;

import java.util.ArrayList;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<ArrayList<EmpleadoEntity>> obtenerEmpleados() {
        ArrayList<EmpleadoEntity> empleados = empleadoService.obtenerEmpleados();
        if(empleados.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.ok(empleados);
        }
    }
}