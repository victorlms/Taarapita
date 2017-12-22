/*const config = {
	host: '192.168.0.101',
	port: 5433,
	database: 'postgres',
    user: 'postgres',
    password: '123'    
};
const Promise = require('bluebird');
const initOptions = {
	promiseLib: Promise
};
const pg = require('pg-promise')(initOptions);
const myBank = pg(config);*/



//https://stackoverflow.com/questions/9205496/how-to-make-connection-to-postgres-via-node-js
function fazendoLogin()
{
	var email = document.getElementById('email').value;
	var senha = document.getElementById('senha').value;
	var msg;


		/* pg.request()
	.input(login) //email
	.input(senha) //senha
	.execute('public buscanologin', (err, data) => {
	    if (err)
	        return err;

	    alert (data);
	});*/


	var pg = require('pg');
	var conString = "postgres://postgres:123@192.168.0.101:5433/postgres";

	var client = new pg.Client(conString);
	client.connect();

	var query = client.query("SELECT obs FROM login WHERE email = 'Abreu' AND senha = '123'");

	query.on('row', function(row) {
	    //console.log(row);
	    alert("A mensagem é: %s", row.obs); //Beatle name: John
	});

	query.on('end', function() {
	    client.end();
	});



}