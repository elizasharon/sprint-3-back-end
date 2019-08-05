const mongoose = require('mongoose');

const movieSchema = mongoose.Schema({

    Title: {
        type: String,
        required: true
    },
    Year: {
        type: String,
        required: false
    },
    Released: {
        type: String,
        required: true
    },
    Runtime: {
        type: String,
        required: false
    },
    Genre: {
        type: Array,
        required: false
    },
    Director: {
        type: String,
        required: true
    },
    Actors: {
        type: Array,
        required: true
    },
    Plot: {
        type: String,
        required: true
    },
    Language: {
        type: String,
        required: true
    },
    imdbRating: {
        type: String,
        required: true
    },
    Images: {
        type: Array,
        required: false
    }
});

module.exports = mongoose.model('Movie', movieSchema);