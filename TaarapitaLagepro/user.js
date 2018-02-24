//Variaveis do usuario
var user = {nome, id, senha};
const mainFunction = require('./main.js')
function fazendoLogin(email,senha)
{   
     //Variaveis de ligação ao banco
    const { Client } = require('pg');
    var client = new Client({
      user: 'taarapita',
      host: 'localhost',
      database: 'taarapita',
      password: '632145',
      port: 5432,
    });
    client.connect();

    client.query('SELECT * FROM login WHERE email = $1::text AND senha = $2::text', [email, senha] ,(err, res) => { 
       // alert("ID: " + res.rows[0].id);
       user.id = res.rows[0].id;
        user.nome = res.rows[0].email;
        alert("Total de tuplas da consulta: " + res.rowCount)
    });
    mainFunction.MainWin.reload();
    mainFunction.LoginWin.closed();
    mainFunction.MainWin.show();
}

module.exports = {User: user, login: fazendoLogin};