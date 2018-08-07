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
public enum ClasseAcademica {
    graduando("0"), graduado("1"), posGraduando("2"), posGraudado("3"), mestrando("4"),
    mestre("5"), doutorando("6"), doutor("7"), posDoutorando("8"),posDoutor("9");
    
    private String classAcad;
    
    public void setClassAcad(String valor)
    {
        int novoValor = Integer.parseInt((String) valor);
        if(!(novoValor < 0 || novoValor > 9))
            classAcad = valor;
    }
    
    ClasseAcademica(String valor)
    {
       setClassAcad(valor);
    }
    
    public String getClassAcad()
    {
        return classAcad;
    }
}
