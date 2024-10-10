
let boton = document.getElementById("botonRegistrar");
boton.addEventListener("click", evento=>{
    registrarUsusarios();
});

//creamos un método asíncrono para poder usar el await y el fetch
let registrarUsusarios =  async()=>{

let campos = {};

campos.nombreUsuario = document.getElementById("nombreUsuario").value;
campos.numeroDocumento = document.getElementById("numeroDocumento").value;
campos.correoElectronicoUsuario = document.getElementById("correoElectronicoUsuario").value;
campos.telefonoUsuario = document.getElementById("telefonoUsuario").value;
campos.tipoDeUsuario = document.getElementById("tipoDeUsuario").value;


const peticion = await fetch("http://localhost:8080/api/Registrados",
{
    method:'POST',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(campos)
});
}