let router = require('express').Router();
let MoviesController = require('./moviesController');


router.route('/movies')
    .get(MoviesController.listAll)
    .post(MoviesController.create);

router.route('/movies/:id')
    .get(MoviesController.findByID)
    .put(MoviesController.update)
    .delete(MoviesController.delete);

module.exports = router;