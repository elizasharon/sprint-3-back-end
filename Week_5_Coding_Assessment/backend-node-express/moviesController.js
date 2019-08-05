let Movie = require('./movieModel');
const mongoose = require('mongoose');

exports.create = function (req, res) {
    console.log("REQUEST ", req.body);
   Movie.create(req.body, (err, response)=>{
        console.log(response);
       if(res){
           res.json({
               status: 'SUCCESS',
               message: 'Saved Movie Successfully'
           });
       }
       else{
           res.json({
               status: 'ERROR',
               message: 'Error Creating Movie'
           });
       }
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

exports.findByTag = function (req, res) {
    Movie.find({"Genre" : req.params.tag}, function (err, movies) {
        res.send(movies);
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
    Movie.remove({ _id: req.params.id }, function(err) {
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

