import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import axios from "axios";
import "../Css/SingleMovie.css";


export default class SingleMovie extends Component {

    constructor(props) {
        super(props);
        this.state = {movie: {Images: []}};
    }

    componentDidMount() {
        const {id} = this.props.match.params;
        axios.get(`http://localhost:9999/api/movies/${id}`)
            .then(res => {
                console.log(res.data);
                this.setState({movie: res.data})
            });
    }

    render() {
        return (
            <div className="SingleMovie">
                <div className="row">
                    <div className="col-md-6">

                        <div id="carouselExampleIndicators" className="carousel slide" data-ride="carousel" data-interval="2500">

                            <div className="carousel-inner">
                                <div className="carousel-item active">
                                    <img className="d-block w-100" src={this.state.movie.Images[0]} alt=""/>
                                </div>
                                {
                                    this.state.movie.Images.map((image, index) =>
                                        index !== 0 ?
                                            <div className="carousel-item" key={index}>
                                                <img className="d-block w-100" src={image} alt=""/>
                                            </div> : <b key={index}/>
                                    )

                                }
                            </div>

                            <a className="carousel-control-prev" href="#carouselExampleIndicators" role="button"
                               data-slide="prev">
                                <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span className="sr-only">Previous</span>
                            </a>
                            <a className="carousel-control-next" href="#carouselExampleIndicators" role="button"
                               data-slide="next">
                                <span className="carousel-control-next-icon" aria-hidden="true"></span>
                                <span className="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                    <div className="col-md-6">
                        <div className="card">
                            <div className="card-block">
                                <h4 className="card-title mt-3">{this.state.movie.Title}</h4>
                                <div className="meta">
                                    <ul className="genre">
                                        {
                                            this.state.movie.Genre ?
                                                this.state.movie.Genre.map
                                                (
                                                    (genre, index) =>
                                                        <li key={index}>
                                                            <Link to={'/movies/tag/' + genre}>{genre}</Link>
                                                        </li>
                                                ) : <p/>
                                        }
                                    </ul>
                                </div>
                                <div className="card-text">
                                    <p>{this.state.movie.Plot}</p>
                                    <div className="row">
                                        <div className="col-md-6">
                                            <span><b>Cast :- </b></span>
                                            <ul className="actors">
                                                {
                                                    this.state.movie.Actors ?
                                                        this.state.movie.Actors.map
                                                        (
                                                            (actor, index) => <li key={index}>{actor}</li>
                                                        ) : <p/>
                                                }
                                            </ul>
                                        </div>
                                        <div className="col-md-6">
                                            <br/>
                                            <span><b>Director : </b>{this.state.movie.Director}</span>
                                            <br/>
                                            <span><b>Runtime : </b>{this.state.movie.Runtime}</span>
                                            <br/>
                                            <span><b>Language : </b>{this.state.movie.Language}</span>
                                            <br/>
                                            {
                                                this.state.movie.Year ?
                                                <span><b>Year : </b>{this.state.movie.Year}<br/></span>: <p></p>
                                            }
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div className="card-footer">
                                <b>imdbRating : {this.state.movie.imdbRating}</b>
                                <b className="year">Released : {this.state.movie.Released}</b>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="getAllMovies-btn">
                    <br/>
                    <Link to="/">
                        <button className="btn btn-primary">Get All Movies</button>
                    </Link>
                </div>
            </div>

        );
    }
}