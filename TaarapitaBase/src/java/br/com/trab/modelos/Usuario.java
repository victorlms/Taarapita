/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.modelos;

import java.awt.Image;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author abreu
 */

public class Usuario 
{
    public String nome, sobrenome, senha, email,endereco, cidade, iduser, uf,
            naturalidade, nacionalidade, cep, pais, instituicao, cargo;
    public List<String> telCel, telFixo;
    public Image foto;//Editar depois
    public Sexo userSexo;
    public Data nascData;
    public String tituloAcad;
    public List<Atividades> ativUser;
    public RedeSocialExternas redeSclExt;
    
    public Usuario()
    {
        iduser = null;
        this.ativUser = new ArrayList<Atividades>();
        nome = null;
        sobrenome = null;
        senha = null;
        email = null;
        endereco = null;
        telCel = new ArrayList<String>();
        telFixo = new ArrayList<String>();
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
    public void setTituloAcad(String ta)
    {
        //this.tituloAcad.setClassAcad(ta);
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
    public void addCel(String n)
    {
        this.telCel.add(n);
    }
    public void addTel(String t) 
    {
        this.telFixo.add(t);
    }
    public void setUserSexo(Sexo s)
    {
        this.userSexo = s;
    }
    public void addAtivNoTopo(Atividades a)
    {
        this.ativUser.add(0, a);
    }
    public void addAtivNoFinal(Atividades a)/*Testar com atencao,
            possivel dar erros*/
    {
        this.ativUser.add(ativUser.size(), a);
    }
    
    public List getLisAtiv()
    {
        return this.ativUser;
    }
    
    public List getTelefone() 
    {
        return this.telFixo;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public String getEndereco() 
    {
        return this.endereco;
    }
    public String getNome() 
    {
        return this.nome;
    }
    public String getSobrenome() 
    {
        return this.sobrenome;
    }
    public List getCel() 
    {
        return this.telCel;
    }
    public String getUserSexo()
    {
        return this.userSexo.getSexo();
    }
    public String getSenha()
    {
        return this.senha;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getNaturalidade()
    {
        return this.naturalidade;
    }
    public String getNacionalidade()
    {
        return this.nacionalidade;
    }
    public String getUF()
    {
        return this.uf;
    }
    public String getPais()
    {
        return this.pais;
    }
    public String getInstituicao()
    {
        return this.instituicao;
    }
    public String getCargo()
    {
        return this.cargo;
    }
   public String getTituloAcad()/*adaptar a classe para reconhecer o sexo*/
    {
       int temp =0;// = Integer.parseInt((String)this.tituloAcad.getClassAcad());
        switch(temp)
        {
            case 0:
                return "Graduando(a)";
            case 1:
                return "Graduado(a)";
            case 2:
                return "Pós-Graduando(a)";
            case 3:
                return "Pós-Graduado(a)";
            case 4:
                return "Mestrando(a)";
            case 5:
                return "Mestre(a)";
            case 6:
                return "Doutorando(a)";
            case 7:
                return "Doutor(a)";
            case 8:
                return "Pós-Doutorando(a)";
            case 9:
                return "Pós-Doutor(a)";
            default:
                return "nd";
        }
    }
   /* public getRedesSociasExt()
        ver com o Gui a melhor maneira de exibir
    
    */
    public Data getData()
    {
        return this.nascData;
    }
}
