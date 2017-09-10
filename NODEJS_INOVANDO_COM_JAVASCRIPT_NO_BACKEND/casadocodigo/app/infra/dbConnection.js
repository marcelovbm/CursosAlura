var mysql = require('mysql');

function creadDBConnection(){
    
    var dbConnection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : 'root',
        database :  'casadocodigo_nodejs'
    });

    dbConnection.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
    });

    return dbConnection;
}

//wrapper
module.exports = function(){
    return creadDBConnection;
}