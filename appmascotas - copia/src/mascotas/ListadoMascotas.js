import axios from 'axios';
import React, { useEffect, useState } from 'react'

export default function ListadoMascotas() {

    const urlBase = "http://localhost:8080/app/listar";

const[mascotas, setmascotas] = useState([]);

useEffect(() => {
    cargarMascotas();
}, []);

const cargarMascotas = async ()=> {
    const resultado = await axios.get(urlBase);
    console.log("resultado cargar empleados")
    console.log(resultado.data)
    setmascotas(resultado.data)
}
    return (
        <div className='container'>
            <div className='container text-center' style={{ margin: "30px" }}>
                <h3>Sistema de anotacion de mascotas😼</h3>
            </div>

            <table className="table table-striped table-hover align-middle">
  <thead className='table-dark'> 
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Tipo</th>
    </tr>
  </thead>
  <tbody>
    {
        //iteramos el array de mascotas
        mascotas.map((mascotas, indice)=>(
    <tr key={indice}>
      <th scope="row">{mascotas.idMascota}</th>
      <td>{mascotas.nombre}</td>
      <td>{mascotas.tipo}</td>
    </tr>
))   }
  </tbody>
</table>
        </div>

    )
}
