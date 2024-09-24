package com.TechnologyAdvanceSolutions.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionControlador extends implControladorSO
        implements ControladorInicio, ControladorSoftware, ControladorHardware {

    @GetMapping("/inicio")
    public String mostrarInicio() {
        return "Index";
    }

    @GetMapping("/hardware")
    public String mostrarHardware() {
        System.out.println("EJECUTANDO HARDWARE");
        return "/seccionesGenerales/seccionHardware/Hardware";
    }

    @GetMapping("/software")
    public String mostrarSoftware() {
        System.out.println("EJECUTANDO SOFTWARE");
        return "/seccionesGenerales/seccionSoftware/Software";
    }

}
