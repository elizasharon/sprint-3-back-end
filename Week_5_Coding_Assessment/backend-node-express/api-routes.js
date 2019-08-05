let router = require('express').Router();

let MoviesController = require('./moviesController');

router.get('/', function (req, res) {
    res.json({
        status: 'API is working',
        message: 'MoviesApp REST API'
    })
});

router.route('/movies')
    .get(MoviesController.listAll)
    .post(MoviesController.create);

router.route('/movies/:id')
    .get(MoviesController.findByID)
    .put(MoviesController.update)
    .delete(MoviesController.delete);

router.route('/movies/tag/:tag')
    .get(MoviesController.findByTag);

module.exports = router;