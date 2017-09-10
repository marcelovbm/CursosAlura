var express = require('express');
var load = require('express-load');

module.exports = function () {

    var app = express();

    //SET ENGINE USED TO RENDER VIEWS
    app.set('view engine', 'ejs');
    //SET VIEWS ROUTES AS DEFAULT
    app.set('views', './app/views');

    load('routes', {cwd: 'app'})
        .then('infra')
        .into(app);

    return app;
} 