
//https://stackoverflow.com/questions/9205496/how-to-make-connection-to-postgres-via-node-js
function fazendoLogin()
{
	var email = document.getElementById('email').value;
	var senha = document.getElementById('senha').value;

    const { Client } = require('pg');

    const client = new Client({
      user: 'postgres',
      host: 'localhost',
      database: 'postgres',
      password: '123',
      port: 5432,
    });
    client.connect();

    /*Antes de tudo: npm install pg
    Isso instala o node-postgres
    
    As configurações da tabebla no PostgreSQL:
    
    CREATE TABLE login(
    
        id integer,
        email varchar(100),
        senha varchar(100)
    );
    
    insert into login values(100, 'Vidal', '123');
    insert into login values(200, 'Abreu', '123');
    
    Entendi que ele retorna um "vetor" de tuplas da tabela.
    
    No alert embaixo, ele imprime o atributo ID (mesmo nome da tabela) na posição 0 das tuplas que retornaram.
    No caso, ele retornou apenas uma tupla.
    
    $1::text e $2::text são posições naquela string onde não entrar as variáveis (ou simplesmente conteúdo) que estão
    explicidadas dentro dos colchetes.
    
    */
    client.query('SELECT * FROM login WHERE email = $1::text AND senha = $2::text', [email, senha] ,(err, res) => { 
        alert("ID: " + res.rows[0].id)
        alert("Total de tuplas da consulta: " + res.rowCount)
    });

}