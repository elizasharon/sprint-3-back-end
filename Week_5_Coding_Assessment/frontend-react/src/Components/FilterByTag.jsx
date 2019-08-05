import React, {Component} from 'react';
import axios from "axios";
import MovieCard from "./MovieCard";
import '../Css/FilterByTag.css'

export default class FilterByTag extends Component {

    constructor(props) {
        super(props);
        this.state = {movies: []};
    }



    componentDidMount() {
        const {tag} = this.props.match.params;
        axios.get(`http://localhost:9999/api/movies/tag/${tag}`)
            .then(res => {
                console.log(res.data);
                this.setState({movies: res.data})
            });
    }

    componentDidUpdate() {
        const {tag} = this.props.match.params;
        axios.get(`http://localhost:9999/api/movies/tag/${tag}`)
            .then(res => {
                console.log(res.data);
                this.setState({movies: res.data})
            });
    }

    render() {

        return (
            <div className="FilterByTag">

                <div className="container">

                    <h1>Filter Movie By Tags</h1>
                    <br/>
                    <h2>Genre : {this.props.match.params.tag}</h2>

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
