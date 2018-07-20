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
    graduando(0), graduado(1), posGraduando(2), posGraudado(3), mestrando(4),
    mestre(5), doutorando(6), doutor(7), posDoutorando(8),posDoutor(9);
    
    private int classAcad;
    
    ClasseAcademica(int valor)
    {
        classAcad = valor;
    }
    public void setClassAcad(int novoValor)
    {
        if(!(novoValor < 0 || novoValor > 9))
            classAcad = novoValor;
    }
    public int getClassAcad()
    {
        return classAcad;
    }
}
