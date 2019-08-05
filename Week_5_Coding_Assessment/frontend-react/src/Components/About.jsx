import React from 'react';
import "../Css/About.css";
function About() {
    return (
        <div className="About">
            <h2>About</h2>
            <br/><br/>
            <div className="content">
                <p>This is the demo React Js Project</p>
                <br/><br/>
                <ul>
                    <li>Home Page Lists All the movies.</li>
                    <li>Get Details will get all the information about the particular movie.</li>
                    <li>By clicking the tags on movies, movies related to particular Genre can be filtered out.</li>
                    <li>Create Movie page can be used to insert new movies.</li>
                </ul>
            </div>
        </div>
    );
}

export default About;