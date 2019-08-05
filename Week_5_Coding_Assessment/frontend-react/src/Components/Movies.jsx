import React, {Component} from 'react';
import axios from 'axios';
import MovieCard from "./MovieCard";
// import MovieCard from "./MovieCard";

export default class Movies extends Component {

    constructor(props) {
        super(props);
        this.state = {movies: []};
    }

    componentDidMount() {
        axios.get('http://localhost:9999/api/movies')
            .then(res => {
                //console.log(res.data);
                this.setState({movies: res.data});
            });
    }

    render() {

        return (
            <div className="Movies">

                <div className="container">

                    <div className="row">
                        {
                            this.state.movies.map((movie, index) =>
                                <div className="col-sm-6 col-md-4 col-lg-3 mt-4" key={index}>
                                    <MovieCard id={movie._id} title={movie.Title} images={movie.Images}
                                               genre={movie.Genre} imdbRating={movie.imdbRating}/>
                                </div>
                            )
                        }
                    </div>


                </div>

            </div>
        );
    }
}