import React from 'react'
import {Link} from 'react-router-dom'

export default function NavBar() {
  return (
 <div classNameName='container'>
    <nav className="navbar navbar-expand-lg navbar-dark bg-secondary">
  <div className="container-fluid">
    <a className="navbar-brand" href="/">Sistema de anotacion de mascotas😼</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div className="navbar-nav">
        <Link className="nav-link active" aria-current="page" to="/home">Home🏠</Link>
        <Link className="nav-link" to="/agregar">Agregar📃✏</Link>
      </div>
    </div>
  </div>
</nav>
     </div>
  )
}
