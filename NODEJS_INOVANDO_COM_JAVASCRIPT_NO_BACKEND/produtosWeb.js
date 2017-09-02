var http = require('http');
var porta = 3000;
var ip = "localhost";
//cria servidor
var server = http.createServer(function(req, res) {
    if (req.url == "/produtos") {
        res.end('<html><body>Request recebido!</body></html>');
    } else {
        console.log("Recebendo request");
        res.writeHead(200, { 'Content-Type': 'text/html' });
        res.end('<html><body>Request recebido!</body></html>');
    }
});

//fica escutando na prota 3000
server.listen(porta, ip);

console.log('Servidor rodando!');