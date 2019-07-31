let Movie = require('./movieModel');
const mongoose = require('mongoose');

exports.create = function (req, res) {
    console.log("REQUEST ", req.body);
    let new_movie = new Movie();
    new_movie._id = req.body._id;
    new_movie.name = req.body.name;
    new_movie.save((err) => {
        res.json({
            status: 'SUCCESS',
            message: 'Saved Movie Successfully'
        });
    });
};

exports.listAll = function (req, res) {
    Movie.find().then(function (movies) {
        res.send(movies);
    });
};

exports.findByID = function (req, res) {
    Movie.findById(req.params.id, function (err, movie) {
        res.send(movie);
    })
};

exports.update = function (req, res) {
    Movie.findById(req.params.id, function (err, movie) {
        movie.name = req.body.name;
        movie.save((err) => {
            res.json({
                status: 'SUCCESS',
                message: 'Updated Movie Successfully'
            });
        });
    })
};

exports.delete = function (req, res) {
    Movie.deleteOne({ _id: req.params.id }, function(err) {
        if (!err) {
            res.json({
                status: 'SUCCESS',
                message: 'Deleted Movie Successfully'
            });
        }
        else {
            res.json({
                status: 'ERROR',
                message: 'Error Deleting'
            });
        }
    });
};

