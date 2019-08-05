import React from 'react';
import {Link} from 'react-router-dom';
import '../Css/Navbar.css';

function Navbar() {
    return (
        <div className="Navbar-container">

            <nav className="navbar navbar-dark bg-dark navbar-expand-sm">
                <a className="navbar-brand" href="/">
                    <img
                        src="https://cdn4.iconfinder.com/data/icons/logos-3/600/React.js_logo-512.png"
                        width="30" height="30" alt="logo"/>
                </a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-list-2"
                        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"/>
                </button>
                <div className="collapse navbar-collapse" id="navbar-list-2">
                    <ul className="navbar-nav">
                        <li className="nav-item active">
                            <Link to="/" className="nav-link">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/create" className="nav-link">Create Movie</Link>
                        </li>
                        <li className="nav-item">
                            <Link to="/about" className="nav-link">About</Link>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
    );
}

export default Navbar;