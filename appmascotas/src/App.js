import { BrowserRouter, Route, Routes } from "react-router-dom";
import ListadoMascotas from "./mascotas/ListadoMascotas";
import AgregarMascota from "./mascotas/AgregarMascota";
import NavBar from "./navegacion/NavBar";

function App() {
  return (
    <BrowserRouter>
      <NavBar />
      <Routes>
        <Route path="/" element={<div className="container text-center" style={{ margin: "30px" }}>
          ¡Bienvenido!
        </div>} />
        <Route path="/home" element={<ListadoMascotas />} />
        <Route path="/agregar" element={<AgregarMascota />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
