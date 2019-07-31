const fetch = require('cross-fetch');
fetch('https://jsonplaceholder.typicode.com/users')
    .then(response => {
        console.log(response.json)
                .then(response => console.log(response.data)
                )
        }
    );