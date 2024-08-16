package com.TechnologyAdvanceSolutions.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionControlador {

    @GetMapping("/inicio")
    public String mostrarInicio() {
        System.out.println("EJECUTANDO INICIO");
        return "Index";
    }

    @GetMapping("/software")
    public String mostrarSoftware() {
        System.out.println("EJECUTANDO SOFTWARE");
        return "/seccionesGenerales/seccionSoftware/Software";
    }

    @GetMapping("/hardware")
    public String mostrarHardware() {
        System.out.println("EJECUTANDO HARDWARE");
        return "/seccionesGenerales/seccionHardware/Hardware";
    }
}
