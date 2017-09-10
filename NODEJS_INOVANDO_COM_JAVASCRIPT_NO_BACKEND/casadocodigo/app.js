var app = require('./config/express')();

console.log("Modulo Express carregado!");

app.listen(3000, function() {
    console.log("Servidor rodando!");
});