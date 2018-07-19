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
    private String endereco;
    private String numero;
    private String telefone;
    private String cidade;

    public Usuario()
    {
        nome = null;
        endereco = null;
        numero = null;
        telefone = null;
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
        numero = null;
        telefone = null;
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
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }
}
