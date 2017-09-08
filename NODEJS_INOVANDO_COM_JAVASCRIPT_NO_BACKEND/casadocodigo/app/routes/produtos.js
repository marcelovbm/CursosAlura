module.exports = function (app) {
    
    console.log("Modulo de Rotas dos Produtos carregada!");
    app.get('/produtos', function(req, res) {
        var mysql = require('mysql');

        console.log('listando...');

        var connection = mysql.createConnection({
            host : 'localhost',
            user : 'root',
            password : '',
            database :  'casadocodigo_nodejs'
        });
        
        connection.connect(function(err) {
            if (err) throw err;
            console.log("Connected!");
          });

        connection.query('select * from produtos', function(err, results){
            // res.send(results);
            res.render('produtos/lista',{lista:results});
        });

        connection.end();
        //res.render('produtos/lista');
    });
}
