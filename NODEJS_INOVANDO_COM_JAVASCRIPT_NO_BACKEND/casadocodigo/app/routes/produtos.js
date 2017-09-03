module.exports = function (app) {
    
    console.log("Modulo de Rotas dos Produtos carregada!");
    app.get('/produtos', function(req, res) {
        var mysql = require('mysql');
        res.render('produtos/lista');
    });
}
