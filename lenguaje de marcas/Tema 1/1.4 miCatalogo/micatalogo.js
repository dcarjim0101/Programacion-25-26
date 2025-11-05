// Archivo: micatalogo.js
/*
 UD1.4. JavaScript, DOM y AJAX
 Ciclo formativo: Desarrollo de Aplicaciones Web
 Departamento de Informática
 Curso 2025/2026
 Módulo profesional: Lenguajes de marcas y sistemas de gestión de la información.
 (El texto original solicitado se preserva aquí como comentario para no romper la ejecución.)
*/
document.addEventListener('DOMContentLoaded', function () {
	const tituloPrincipal = document.getElementById('titulo-catalogo');
	const mainContainer = document.getElementById('catalogo-container');

	// 1. MANIPULACIÓN INICIAL: Confirmar que JS está activo
	if (tituloPrincipal) {
		tituloPrincipal.textContent = 'Catálogo Dinámico (Cargando datos XML...)';
	}

	function cargarYGenerarCatalogo() {
		// 2. FETCH/AJAX: Solicitar el archivo XML
		fetch('micatalogo.xml')
			.then(response => {
				if (!response.ok) throw new Error('Error en la respuesta: ' + response.status);
				return response.text();
			})
			.then(xmlTexto => {
				// 3. PARSEO XML: Convertir el texto a un objeto manipulable
				const parser = new DOMParser();
				const xmlDoc = parser.parseFromString(xmlTexto, 'application/xml');

				// Actualizar el título al tener los datos listos
				if (tituloPrincipal) {
					tituloPrincipal.textContent = 'Catálogo de Productos - Interactivo LMSGI';
				}

				// Comprobar contenedor
				if (!mainContainer) {
					console.error('No se encontró el contenedor con id "catalogo-container"');
					return;
				}

				// 4. RECORRIDO Y GENERACIÓN DINÁMICA
				const productosXML = xmlDoc.querySelectorAll('producto');
				if (!productosXML || productosXML.length === 0) {
					mainContainer.innerHTML = '<p>No hay productos disponibles.</p>';
					return;
				}

				productosXML.forEach((productoXML, index) => {
					// a) Extracción de datos (Lectura de nodos y atributos) con comprobaciones
					const nombreNode = productoXML.querySelector('nombre');
					const descripcionNode = productoXML.querySelector('descripcion');
					const precioNode = productoXML.querySelector('precio');
					const categoriaNode = productoXML.querySelector('categoria');
					const imagenNode = productoXML.querySelector('imagen');

					const nombre = nombreNode ? nombreNode.textContent : 'Sin nombre';
					const descripcion = descripcionNode ? descripcionNode.textContent : '';
					const precio = precioNode ? precioNode.textContent : '';
					const moneda = precioNode ? (precioNode.getAttribute('moneda') || '') : '';
					const categoria = categoriaNode ? categoriaNode.textContent : '';
					const imagenUrl = imagenNode ? (imagenNode.getAttribute('url') || '') : '';
					const idProducto = productoXML.getAttribute('id') || '';

					// b) CREACIÓN DE LA ESTRUCTURA HTML (se usa innerHTML para simplificar)
					const section = document.createElement('section');
					section.classList.add('producto-destacado');
					section.innerHTML = `
						<img src="${imagenUrl}" alt="${nombre}" class="producto-img">
						<h2>${nombre}</h2>
						<p>${descripcion}</p>
						<p class="precio">Precio: ${precio} ${moneda}</p>
						<a href="#" class="enlace-compra">Comprar ahora</a>
						<button id="btn-detalles-${index}">Ver Detalles Técnicos</button>
						<div id="detalles-${index}" class="detalles-extra oculto">
							<p><strong>Referencia:</strong> ${idProducto}</p>
							<p><strong>Categoría:</strong> ${categoria}</p>
						</div>
					`;

					// c) INYECCIÓN en el DOM
					mainContainer.appendChild(section);

					// 5. ASIGNACIÓN DE EVENTOS (Interactividad)
					// Usar querySelector sobre la section para evitar buscar por id globalmente
					const botonDetalles = section.querySelector(`#btn-detalles-${index}`);
					const detallesDiv = section.querySelector(`#detalles-${index}`);
					if (botonDetalles && detallesDiv) {
						botonDetalles.addEventListener('click', function (e) {
							e.preventDefault();
							// CLAVE: Alternar la clase 'oculto'
							detallesDiv.classList.toggle('oculto');
							/*
							 UD1.4. JavaScript, DOM y AJAX
							 Departamento de Informática
							 Curso 2025/2026
							 Ciclo formativo: Desarrollo de Aplicaciones Web
							 Módulo profesional: Lenguajes de marcas y sistemas de gestión de la información.
							 (Texto original preservado como comentario para que no provoque errores.)
							*/
							// Lógica de cambio de texto del botón
							this.textContent = detallesDiv.classList.contains('oculto') ? 'Ver Detalles Técnicos' : 'Ocultar Detalles';
						});
					}
				});
			})
			.catch(error => {
				// Manejo de errores de carga del XML
				if (tituloPrincipal) {
					tituloPrincipal.textContent = 'ERROR: No se pudo cargar el catálogo. Revise la consola.';
				}
				console.error('Error en la carga del catálogo XML:', error);
			});
	}

	// Iniciar el proceso
	cargarYGenerarCatalogo();
});
