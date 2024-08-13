document.addEventListener("DOMContentLoaded", () => {
    // Función para cargar un archivo HTML en un elemento
    function loadHTML(file, elementId) {
        fetch(file)
            .then(response => response.text())
            .then(data => {
                document.getElementById(elementId).innerHTML = data;
            })
            .catch(error => console.error('Error al cargar el archivo:', error));
    }

    // Cargar el header y el footer en el DOM
    loadHTML('menuOciones.html', 'menuOpciones-container');
    loadHTML('footer.html', 'footer-container');
});
