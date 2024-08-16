document.addEventListener("DOMContentLoaded", () => {
    // Variables de estado
    let menuVisible = false;
    const menu = document.getElementById("seleccionOpciones");
    const links = document.querySelectorAll("nav a");

    /**
     * Función para mostrar/ocultar el menú
     */
    function mostrarOcultarMenu() {
        menu.classList.toggle("mostrar");
        menuVisible = !menuVisible;
    }

    // Función para cambiar de página
    function cambiarPagina(url) {
        console.log("Cambiando a la página:", url);
        window.location.href = url;
    }

    // Event Listener para el botón del menú
    document.querySelector(".nav-bar").addEventListener("click", mostrarOcultarMenu);

    // Event Listener para los enlaces del menú
    links.forEach(link => {
        link.addEventListener("click", (event) => {
            event.preventDefault(); // Evita el comportamiento predeterminado del enlace
            const url = link.getAttribute("href"); // Usamos el href para obtener la ruta mapeada
            menu.classList.remove("mostrar");
            menuVisible = false;
            cambiarPagina(url);
        });
    });
});
