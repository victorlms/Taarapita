/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.modelos;

import java.awt.Image;
import java.awt.List;

/**
 *
 * @author abreu
 */

public class Usuario 
{
    private String idUser, nome, sobrenome, senha, email,endereco, telCel, telFixo, cidade, naturalidade,
            nacionalidade,cep, uf, pais, instituicao, cargo;
    private Image foto;//Editar depois
    private Sexo userSexo;
    private Data nascDat;
    private ClasseAcademica tituloAcad;
    private Atividades ativUser[];
    private RedeSocialExternas redeSclExt;
    private final Data nascData;
    
    public Usuario()
    {
        nome = null;
        sobrenome = null;
        senha = null;
        email = null;
        endereco = null;
        telCel = null;
        telFixo = null;
        cidade = null;
        naturalidade = null;
        nacionalidade = null;
        cep = null;
        uf = null;
        pais = null;
        instituicao = null;
        cargo = null;
        //idFoto = null;
        userSexo = Sexo.naoDef;
        ativUser = null;
        redeSclExt = null;
        tituloAcad = null;
        nascData = new Data(false, true);
    }
    
    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    public void setSenha(String s)
    {
        this.senha = s;
    }
    public void setEmail(String e)
    {
        this.email = e;
    }
    public void setNaturalidade(String na)
    {
        this.naturalidade = na;
    }
    public void setNacionalidade(String nc)
    {
        this.nacionalidade = nc;
    }
    public void setCep(String c)
    {
        this.cep = c;
    }
    public void setUf(String u)
    {
        this.uf = u;
    }
    public void setPais(String p)
    {
        this.pais = p;
    }
    public void setInstituicao(String i)
    {
        this.instituicao = i;
    }
    public void setCargo(String c)
    {
        this.cargo = c;
    }
    /*public void setFoto(Image f) //fazer com calma depois
    {
        this.foto = f;
    }*/
    public void setTituloAcad(int ta)
    {
        this.tituloAcad.setClassAcad(ta);
    }
    public void setRedesUsu(RedeSocialExternas r)
    {   
        this.redeSclExt = r;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSobrenome(String sn)
    {
        this.sobrenome = sn;
    }
    public void setCel(String numero)
    {
        this.telCel = numero;
    }
    public void setTelefone(String telefone) 
    {
        this.telFixo = telefone;
    }
    public void setUserSexo(Sexo s)
    {
        this.userSexo = s;
    }
    
    
    public String getTelefone() 
    {
        return telFixo;
    }
    public String getCidade()
    {
        return cidade;
    }
    public String getEndereco() 
    {
        return endereco;
    }
    public String getNome() 
    {
        return nome;
    }
    public String getCel() 
    {
        return telCel;
    }
}
