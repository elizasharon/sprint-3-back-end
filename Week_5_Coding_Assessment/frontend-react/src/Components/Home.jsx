import React, {Component} from 'react';
import axios from "axios";

export default class Home extends Component {

    constructor(props) {
        super(props);
        this.state = {
            movie: {
                Title: React.createRef(),
                Released: React.createRef(),
                Plot: React.createRef(),
                Director: React.createRef(),
                Runtime: React.createRef(),
                Language: React.createRef(),
                imdbRating: React.createRef(),
                Actors: React.createRef(),
                Genre: [],
                Images: React.createRef()
            }
        };
        this.tags = ["Action", "Adventure", "Drama", "Sci-Fi", "Thriller", "Horror", "Biography", "Comedy", "Crime", "Fantasy"];
    }

    handleChange = (e) =>{
        let genre = this.state.movie.Genre;
        if(e.target.checked){
           genre.push(e.target.value);
        }
        this.setState({Genre : genre});
    };

    createMovie = () => {

        let movie = {
            Title: this.state.movie.Title.current.value,
            Released: this.state.movie.Released.current.value,
            Plot: this.state.movie.Plot.current.value,
            Director: this.state.movie.Director.current.value,
            Runtime: this.state.movie.Runtime.current.value,
            Language: this.state.movie.Language.current.value,
            imdbRating: this.state.movie.imdbRating.current.value,
            Actors: this.state.movie.Actors.current.value.split(','),
            Genre: this.state.movie.Genre,
            Images: this.state.movie.Images.current.value.split(',')
        };
        console.log(movie);
        axios.post('http://localhost:9999/api/movies',movie)
            .then(res => {
              console.log(res);
            });
    };

    render() {
        return (
            <div className="Home">
                <div className="container">
                    <h2>Create New Movie</h2>
                    <br/>
                    <form>
                        <div className="form-group">
                            <label htmlFor="title">Title : </label>
                            <input type="text" className="form-control" id="title" placeholder="Enter movie title"
                                   ref={this.state.movie.Title} required/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="released">Released Date : </label>
                            <input type="text" className="form-control" id="released"
                                   placeholder="Enter movie released date" ref={this.state.movie.Released} required/>
                            <small id="yearhelp" className="form-text text-muted">Example : 04 May 2012</small>
                        </div>
                        <div className="form-group">
                            <label htmlFor="plot">Plot : </label>
                            <textarea className="form-control" id="plot" rows="3" required ref={this.state.movie.Plot}
                                      aria-required/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="director">Director : </label>
                            <input type="text" className="form-control" id="director" placeholder="Enter Director name"
                                   ref={this.state.movie.Director} required/>
                        </div>

                        <div className="form-group">
                            <label htmlFor="title">Cast : </label>
                            <input type="text" className="form-control" id="title" placeholder="Enter movie Cast"
                                   ref={this.state.movie.Actors} required/>
                            <small id="casthelp" className="form-text text-muted">
                                Enter the movie cast comma seperated.
                                <br/>
                                Example : Sam Worthington, Zoe Saldana, Sigourney Weaver
                            </small>
                        </div>
                        <div className="form-group">
                            <label htmlFor="runtime">Runtime : </label>
                            <input type="text" className="form-control" id="runtime" placeholder="Enter movie runtime"
                                   ref={this.state.movie.Runtime}/>
                            <small id="runtimehelp" className="form-text text-muted">
                                Example : 162 min
                            </small>
                        </div>
                        <div className="form-group">
                            <label htmlFor="language">Language : </label>
                            <input type="text" className="form-control" id="language" placeholder="Enter movie Language"
                                   ref={this.state.movie.Language} required/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="imdbRating">imdbRating : </label>
                            <input type="text" className="form-control" id="imdbRating" placeholder="Enter movie rating"
                                   ref={this.state.movie.imdbRating} required/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="imdbRating">Tags : </label>
                            <br/>
                            {
                                this.tags.map( (tag, index) =>
                                    index !== 5 ?
                                    <div className="form-check-inline" key={index}>
                                        <label className="form-check-label">
                                            <input type="checkbox" name={tag} value={tag}
                                                   onChange={e => this.handleChange(e)}/> {tag}
                                        </label>
                                    </div> : <br key={index}/>

                                )
                            }
                        </div>
                        <div className="form-group">
                            <label htmlFor="title">Images : </label>
                            <input type="text" className="form-control" id="images" placeholder="Enter movie images"
                                   ref={this.state.movie.Images} required/>
                            <small id="casthelp" className="form-text text-muted">
                                Enter the movie images comma seperated.
                                <br/>
                                Example : https://image-one.jpg,https://image-two.jpg
                            </small>
                        </div>
                        <br/>
                        <button type="button" className="btn btn-primary" onClick={this.createMovie}>Create Movie
                        </button>
                    </form>
                    <br/><br/>
                </div>
            </div>
        )
    }
}
