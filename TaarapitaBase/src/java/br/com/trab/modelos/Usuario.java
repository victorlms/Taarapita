/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.modelos;

import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;

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
    private Data nascData;
    private ClasseAcademica tituloAcad;
    private ArrayList ativUser;
    private RedeSocialExternas redeSclExt;
    
    public Usuario()
    {
        this.ativUser = new ArrayList();
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
    public void addAtivNoTopo(Atividades a)
    {
        this.ativUser.add(0, a);
    }
    public void addAtivNoFinal(Atividades a)/*Testar com atencao,
            possivel dar erros*/
    {
        this.ativUser.add(ativUser.size(), a);
    }
    
    public ArrayList getLisAtiv()
    {
        return this.ativUser;
    }
    
    public String getTelefone() 
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
    public String getCel() 
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
    public String getIntuicao()
    {
        return this.instituicao;
    }
    public String getCargo()
    {
        return this.cargo;
    }
    public String getTituloAcad()/*adaptar a classe para reconhecer o sexo*/
    {
        switch(this.tituloAcad.getClassAcad())
        {
            case 0:
                return "Graduando";
            
            case 1:
                
                return "Graduado";
            case 2:
                return "Pós-graduando";
                
            case 3:
                return "Pós-Graduado";
                
            case 4:
                return "Mestrando";
                
            case 5:
                return "Mestre";
            case 6:
                return "Doutorando";
            case 7:
                return "Doutor";
            case 8:
                return "Pós-Doutorando";
            case 9:
                return "Pós-Doutor";
            default:
                return "nd";
        }
    }
    /*public getRedesSociasExt()
        ver com o Gui a melhor maneira de exibir
    
    */
    public Data getData()
    {
        return this.nascData;
    }
}
