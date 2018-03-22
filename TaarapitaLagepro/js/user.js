//Variaveis do usuario
var user = {nome, id, senha};
const mainFunction = require('./main.js')
function fazendoLogin(email,senha)
{   
     //Variaveis de ligação ao banco
    const { Client } = require('pg');

    var fs = require("fs");

    var client = new Client({
      user: 'taarapita',
      host: 'localhost',
      database: 'taarapita',
      password: '632145',
      port: 5432,
    });
    client.connect();

    //Exemplo de inserção testada e funcional!
    //client.query('INSERT INTO login VALUES(300, $1, $2)', [email, senha] ,(err, res) => { 

    client.query('SELECT * FROM login WHERE email = $1::text AND senha = $2::text', [email, senha] ,(err, res) => { 
      /*O método writeFile abaixo permite a criação de um arquivo .json com todo o resultado da consulta, incluindo tuplas e
      atributos.*/
      fs.writeFile("./resultado.json", JSON.stringify(res.rows, null, "    "));
    });

    /*A variável resultado recebe toda a estrutura do arquivo resultado.json o tornando um vetor de estrutura, mesmo tendo apenas
    um resultado*/
    var resutado = JSON.parse(require('fs').readFileSync("./resultado.json", 'utf8'));

    alert(resutado[0].id);

    //mainFunction.MainWin.reload();
    //mainFunction.LoginWin.closed();
    //mainFunction.MainWin.show();
}

module.exports = {User: user, login: fazendoLogin};