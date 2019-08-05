const express = require('express');
const router = require('./api-routes');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

let cors = require('cors');

let app = express();


let mongoDB = 'mongodb://127.0.0.1/test';
mongoose.connect(mongoDB, {useNewUrlParser: true});
let db = mongoose.connection;
if (!db) {
    console.log("Error connecting database ");
} else {
    console.log("Database is connected");
}

app.use(cors());
app.use(bodyParser.urlencoded({
    extended:true
}));
app.use(bodyParser.json());


app.use('/api', router);
app.get('/', (req, res) => {
    res.send({message: 'Bazinga!'});
});

let port = process.env.PORT || 9999;

app.listen(port, () => {
    console.log('Example app listening on port 9999!')
});