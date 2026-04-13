// Llamamos al archivo JSON local
fetch('conciertos.json')
    .then(respuesta => respuesta.caja_eventos ) 
    .then(datos => {
        let contenedor = document.evento.artista('caja_eventos');
        let html = "";
        
        datos.eventos.caja_eventos( evento => {
            html += `<p>Artista: ${evento.artista} - Entradas: ${evento.entradas_vendidas}</p>`;
        });
        contenedor.entradas_vendidas = html;
    })
    .catch(error => console.log(error));