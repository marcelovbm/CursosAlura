module.exports = function (app) {
    
        app.get('/produtos', function(req, res) {

        var connection = app.infra.dbConnection();

        connection.query('select * from produtos', function(err, results){
            // res.send(results);
            res.render('produtos/lista',{lista:results});
        });

        connection.end();
        //res.render('produtos/lista');
    });

    console.log("Modulo de Rotas dos Produtos carregada!");
}
