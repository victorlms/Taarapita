/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.modelos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author abreu
 */
public class Data //o foco da classe é transorte de valor, sendo assim, nao haverá subrotina de calculo
{
    private int seg, min, hora, dia, mes, ano;
    private boolean registroEstatico = false;
    
    private void ajeitandoAHora()//Essa rotina trata o relogio sem executar calculo e passagem temporal.
    {
        Calendar cal = GregorianCalendar.getInstance();
                
        if(this.ano < 1900)
            this.ano = 1900;
        else if(this.ano > cal.get(Calendar.YEAR))
            this.ano = cal.get(Calendar.YEAR);
        
        if(this.mes > 13 )
            this.mes = 12;
        else if(this.mes < 1)
            this.mes = 1;
        
        switch(this.mes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                if(this.dia > 31)
                    this.dia = 31;
                else if(this.dia < 1)
                    this.dia = 1;
            break;
            
            case 4:
            case 6:
            case 8:
            case 10:
                if(this.dia > 30)
                    this.dia = 30;
                else if(this.dia < 1)
                    this.dia = 1;
            break;
            
            case 2:
                int descBis; /*essa variavel vai
                armazenar o valor das duas primeiras
                (de menos valor em potencia) casas decimais 
                do valor do ano afim de conseguimos descobrir
                se o ano é bisistos*/
                
                if(this.ano >= 2000)
                    descBis = this.ano - 2000;
                else
                    descBis = this.ano - 1900;
                
                if((descBis%4)==0)// se for zero é bisisto
                {
                    if(this.dia > 29)
                        this.dia = 29;
                    else if(this.dia < 1)
                        this.dia = 1;
                }
                else //se não é ano normal
                {
                    if(this.dia > 28)
                        this.dia = 28;
                    else if(this.dia < 1)
                        this.dia = 1;
                }
            break;
        }
        
        if(this.hora > 23)
            this.hora = 23;
        else if(this.hora < 0)
            this.hora = 0;
        
        if(this.min > 59)
            this.min = 59;
        else if(this.min < 0)
            this.min = 0;
            
         if(this.seg > 59)
            this.seg = 59;
        else if(this.seg < 0)
            this.seg = 0;
    }
    public Data(){};
    public Data(boolean regEst, int seg,int min,int hora,int dia,int mes,int ano)
    {
        registroEstatico = regEst;
        this.seg = seg;
        this.min = min;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
       ajeitandoAHora();
    }
    public Data(int min,int hora,int dia,int mes,int ano)
    {
        registroEstatico = false;
        this.seg = 0;
        this.min = min;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
       ajeitandoAHora();
    }
    public void setSeg(int seg)
    {
        if(registroEstatico == false)
        { 
            this.seg = seg;
        
        
            if(this.seg > 59)
                this.seg = 59;
            else if(this.seg < 0)
                this.seg = 0;
        }
        //else para tratar o erro
    }
    public void setMin(int m)
    {
        if(registroEstatico == false)
        {
            this.min = m;
        
            if(this.min > 59)
                this.min = 59;
            else if(this.min < 0)
                this.min = 0;
        }
        //else para tratar o erro
    }
    public void setHora(int h)
    {
        if(registroEstatico == false)
        {
            this.hora = h;
        
            if(this.hora > 23)
                this.hora = 23;
            else if(this.hora < 0)
                this.hora = 0;
        }
       //else para tratar o erro

    }
    public void setDia(int d)
    {
        if(registroEstatico == false)
        {
            this.dia = d;
        
            switch(this.mes)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                    if(this.dia > 31)
                        this.dia = 31;
                    else if(this.dia < 1)
                        this.dia = 1;
                break;

                case 4:
                case 6:
                case 8:
                case 10:
                    if(this.dia > 30)
                        this.dia = 30;
                    else if(this.dia < 1)
                        this.dia = 1;
                break;

                case 2:
                    int descBis; /*essa variavel vai
                    armazenar o valor das duas primeiras
                    (de menos valor em potencia) casas decimais 
                    do valor do ano afim de conseguimos descobrir
                    se o ano é bisistos*/


                    if(this.ano >= 2000)
                        descBis = this.ano - 2000;
                    else
                        descBis = this.ano - 1900;

                    if((descBis%4)==0)// se for zero é bisisto
                    {
                        if(this.dia > 29)
                            this.dia = 29;
                        else if(this.dia < 1)
                            this.dia = 1;
                    }
                    else //se não é ano normal
                    {
                        if(this.dia > 28)
                            this.dia = 28;
                        else if(this.dia < 1)
                            this.dia = 1;
                    }
                break;
            }
        }
        
    }
    public void setMes(int m)
    {
         if(registroEstatico == false)
        {
            this.mes = m;
        
            if(this.mes > 12)
                this.mes = 12;
            else if(this.mes < 1)
                this.mes = 1;
        }
       //else para tratar o erro
    }
    public void setAno(int a)
    {
         if(registroEstatico == false)
        {
            this.ano = a;
            Calendar cal = GregorianCalendar.getInstance();
                
            if(this.ano < 1900)
                this.ano = 1900;
            else if(this.ano > cal.get(Calendar.YEAR))
                this.ano = cal.get(Calendar.YEAR);
        }
       //else para tratar o erro
    }
    /*public void setRegEst(boolean r)
    {
        registroEstatico = r;
        //Ver se essa funcao existira msm ou nao
    }*/
    public int getSeg()
    {
        return this.seg;
    }
    public int getMin()
    {
        return this.min;
    }
    public int getHora()
    {
        return this.hora;
    }
    public int getDia()
    {
        return this.dia;
    }
    public int getMes()
    {
        return this.mes;
    }
    public int getAno()
    {
        return this.ano;
    }
    public boolean getRegEst()
    {
        return registroEstatico;
    }
}
