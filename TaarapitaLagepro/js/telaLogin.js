
//https://stackoverflow.com/questions/9205496/how-to-make-connection-to-postgres-via-node-js
function fazendoLogin()
{
	var email = document.getElementById('email').value;
	var senha = document.getElementById('senha').value;

    const { Client } = require('pg')

    const client = new Client({
      user: 'postgres',
      host: 'localhost',
      database: 'postgres',
      password: '123',
      port: 5432,
    })
    client.connect()

    /*Antes de tudo: npm install pg
    Isso instala o node-postgres
    
    As configurações da tabebla no PostgreSQL:
    
    CREATE TABLE login(
    
        id integer,
        email varchar(100),
        senha varchar(100)
    );
    
    insert into login values(100, 'Vidal', '123');
    
    Entendi que ele retorna um "vetor" de tuplas da tabela.
    
    No alert embaixo, ele imprime o atributo ID (mesmo nome da tabela) na posição 0 das tuplas que retornaram.
    No caso, ele retornou apenas uma tupla.
        
    O que não consegui fazer foi incluir as variaveis email e senha para a query abaixo.
    */
    client.query('SELECT * FROM login', (err, res) => { 
        alert("ID: " + res.rows[0].id)
        alert("Total de tuplas da consulta": " + res.rowCount)
        client.end();
    })

}