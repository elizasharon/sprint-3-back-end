import React from 'react';
import Navbar from './Navbar';
import Sidebar from "./Sidebar";
import Footer from "./Footer";

function Main() {
    return (
        <div className="Main">
            <h2>Main</h2>
            <Navbar/>
            <Sidebar/>
            <Footer/>
        </div>
    );
}

export default Main;