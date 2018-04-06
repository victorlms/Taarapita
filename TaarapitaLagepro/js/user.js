//Funcao construtora da variavel de usuario
function  User
(id, nome, sobrenome, sexo,
  email, tel, cel, naturalidade,
  nacionalidade, cep, endereco,
  num_endereco, bairro, compl_endereco, cidade,
  uf, pais, instituicao, cargo,
  id_foto, nivel_academico){

    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.sexo = sexo;
    this.email = email;
    this.tel = tel;
    this.cel = cel;
    this.naturalidade = naturalidade;
    this.nacionalidade = nacionalidade;
    this.cep = cep;
    this.endereco = endereco;
    this.num_endereco = num_endereco;
    this.bairro = bairro;
    this.compl_endereco = compl_endereco;
    this.cidade = cidade;
    this.uf = uf;
    this.pais = pais;
    this.instituicao = instituicao;
    this.cargo = cargo;
    this.id_foto = id_foto;
    this.nivel_academico = nivel_academico;

}
//funcão contrutora temporaria
function UserTest(id, email, senha)
{
  this.id = id;
  this.nome = email;
  this.senha = senha;
}

function lendoArq()//Retorna as informações gravadas no arquivo
{
  var temp;
  var fs = require('fs');

  temp = JSON.parse(fs.readFileSync('./resultado.json', 'utf8'));

  return temp;
}

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
    //resul = JSON.parse(fs.readFileSync("./resultado.json", 'utf8'));
    alert("Tá feito!");
}


module.exports = {Ususario: User, LendoArq: lendoArq,
  User_Test: UserTest,login: fazendoLogin};