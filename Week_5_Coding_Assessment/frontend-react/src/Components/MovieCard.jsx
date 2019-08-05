import React, {Component} from 'react';
import '../Css/MovieCard.css';
import {Link} from 'react-router-dom';

export default class MovieCard extends Component {

    render() {
        return (
            <div className="SingleMovie">
                <div className="card">
                    <img className="card-img-top" src={this.props.images[2]}/>
                    <div className="card-block">
                        <h4 className="card-title mt-3">{this.props.title}</h4>
                        <div className="meta">
                            <ul className="genre">
                                {this.props.genre.map((genre, index) =>
                                    <li key={index}>
                                        <Link to={'/movies/tag/' + genre}>{genre}</Link>
                                    </li>
                                )}
                            </ul>
                        </div>
                    </div>
                    <div className="card-footer">
                        <b>imdbRating : {this.props.imdbRating}</b>
                        <Link to={`/movies/${this.props.id}`}>
                            <button className="btn btn-primary float-right btn-sm">Show Details</button>
                        </Link>
                    </div>
                </div>
            </div>
        );
    }
}
