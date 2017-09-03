var app = require('express')();
//SET ENGINE USED TO RENDER VIEWS
app.set('view engine', 'ejs');
//SET VIEWS ROUTES AS DEFAULT
app.set('views', './app/views');

module.exports = function () {

    console.log("Modulo Express carregado!");
    return app;
} 