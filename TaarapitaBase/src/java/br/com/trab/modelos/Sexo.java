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
public enum Sexo
{
    feminino("f"), masculino("m"), naoDef("nd");
    
    private String defSexo;
    
    public void setSexo(String novoValor)
    {
        switch(novoValor)
        {
            case "f":
                this.defSexo = "f";
            break;
            case "m":
                this.defSexo = "m";
            break;
            default:
                this.defSexo = "nd";
            break;
        }
    }
    
    Sexo(String valor)
    {
       setSexo(valor);
    }
   
    public String getSexo()
    {
        return this.defSexo;
    }
    
}
