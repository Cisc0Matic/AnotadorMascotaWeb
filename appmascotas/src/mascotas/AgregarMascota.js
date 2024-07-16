import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function AgregarMascota() {
    let navigate = useNavigate();

    const [mascota, setMascota] = useState({
        nombre: null,
        tipo: null
    });

    const { nombre, tipo } = mascota;

    const onInputChange = (e) => {
        setMascota({ ...mascota, [e.target.name]: e.target.value });
    };

    const onSubmit = async (e) => {
        console.log(mascota.tipo);
        e.preventDefault();
        const urlBase = "http://localhost:8080/app/crear";
        if (mascota.nombre && mascota.tipo) {
            await axios.post(urlBase, mascota);
            navigate('/home');

        } else {
            alert("Todos los campos son requeridos");
        }

    };

    return (
        <div className="container">
            <div className="container text-center" style={{ margin: "30px" }}>
                <h3>Agregar Mascota</h3>

                <form onSubmit={onSubmit}>
                    <div className="mb-3">
                        <label htmlFor="nombre" className="form-label">Nombre</label>
                        <input
                            type="text"
                            className="form-control"
                            id="nombre"
                            name="nombre"
                            required
                            value={nombre}
                            onChange={onInputChange}
                        />
                    </div>

                    <div className="mb-3">
                        <label htmlFor="tipo" className="form-label">Tipo</label>
                        <input
                            type="text"
                            className="form-control"
                            id="tipo"
                            name="tipo"
                            required
                            value={tipo}
                            onChange={onInputChange}
                        />
                    </div>

                    <div className="text-center">
                        <button type="submit" className="btn btn-warning btn-sm me-3">Agregar</button>
                        <a href="/" className="btn btn-danger btn-sm">Regresar</a>
                    </div>
                </form>
            </div>
        </div>
    );
}
