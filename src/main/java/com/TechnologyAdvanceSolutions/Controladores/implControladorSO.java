package com.TechnologyAdvanceSolutions.Controladores;

import org.springframework.web.bind.annotation.GetMapping;

public class implControladorSO implements ControladorSO {

    @GetMapping("/sistemasOperativos")
    public String mostrarSO() {
        return "/seccionesGenerales/seccionSoftware/SistemasOperativos";
    }

    @GetMapping("/linux")
    public String mostrarLinux() {
        return "/seccionesGenerales/seccionSoftware/SistemasOperativos/Linux";
    }

    @GetMapping("/macOS")
    public String mostrarMacOS() {
        return "/seccionesGenerales/seccionSoftware/SistemasOperativos/MacOs";
    }

    @GetMapping("/windows")
    public String mostrarWindows() {
        return "/seccionesGenerales/seccionSoftware/SistemasOperativos/windows";
    }

}
