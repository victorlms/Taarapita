/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.modelos;

/**
 *
 * @author abreu
 */

public class Usuario 
{
    private String nome;
    private String sobrenome;
    private Sexo userSexo;
    private String endereco;
    private String telCel;
    private String telFixo;
    private String cidade;
    
    public Usuario()
    {
        nome = null;
        endereco = null;
        telCel = null;
        telFixo = null;
        cidade = null;
    }
    public String getCidade()
    {
        return cidade;
    }
    public void anulandoUsu()
    {
        nome = null;
        endereco = null;
        telCel = null;
        telFixo = null;
        cidade = null;
    }
    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNumero() 
    {
        return telCel;
    }

    public void setNumero(String numero)
    {
        this.telCel = numero;
    }

    public String getTelefone() 
    {
        return telFixo;
    }

    public void setTelefone(String telefone) 
    {
        this.telFixo = telefone;
    }
}
