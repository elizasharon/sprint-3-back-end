import React from 'react';
import ReactDOM from 'react-dom';
import Navbar from "./Components/Navbar";
import Home from "./Components/Home";
import About from "./Components/About";
import Movies from "./Components/Movies";
import SingleMovie from "./Components/SingleMovie";
import FilterByTag from "./Components/FilterByTag";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

const router = (
    <Router>
        <div>
            <Navbar/>
            <hr/>
            <Switch>
                <Route exact path="/" component={Movies}/>
                <Route exact path="/about" component={About}/>
                <Route exact path="/create" component={Home}/>
                <Route exact path="/movies/:id" component={SingleMovie}/>
                <Route exact path="/movies/tag/:tag" component={FilterByTag}/>
            </Switch>
        </div>
    </Router>
);

ReactDOM.render(router, document.getElementById('root'));
