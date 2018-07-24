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
public class Atividades 
{
    private String mestaDados;
    private Data ativData;
    private TiposAcao evento;
    
    public Atividades(TiposAcao tipo)
    {
        this.ativData = new Data(true, true);
        this.evento = tipo;
        this.mestaDados = null;
    }
    public Atividades(TiposAcao tipo, String meta)
    {
        this.ativData = new Data(true, true);
        this.evento = tipo;
        this.mestaDados = meta;
    }
    public void steMetaDados(String meta)
    {
        this.mestaDados = meta;
    }
    public void setEvento(TiposAcao ev)
    {
        this.evento = ev;
    }
    public void setData(int ano, int mes, int dia, int hora, int min, int seg)
    {
        this.ativData.setAno(ano);
        this.ativData.setMes(mes);
        this.ativData.setDia(dia);
        this.ativData.setHora(hora);
        this.ativData.setMin(min);
        this.ativData.setSeg(seg);
    }
    public void setData(int ano, int mes, int dia, int hora, int min)
    {
        this.ativData.setAno(ano);
        this.ativData.setMes(mes);
        this.ativData.setDia(dia);
        this.ativData.setHora(hora);
        this.ativData.setMin(min);
    }
    public void setData(int hora, int min, int seg)
    {
        this.ativData.setHora(hora);
        this.ativData.setMin(min);
        this.ativData.setSeg(seg);
    }
    public Data getDataComp()
    {
        return this.ativData;
    }
    public String getTipoDoEvento()
    {
        return this.evento.getTipoAcao();
    }
    public String getMetadado()
    {
        return this.mestaDados;
    }
}
