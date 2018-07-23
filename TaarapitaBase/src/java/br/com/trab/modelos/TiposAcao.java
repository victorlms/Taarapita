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
public enum TiposAcao
{
  insercao("new"), edicao("update"), remocao("remove"), erro("error");
  
  private String tipoAcao;
  
  public void setTipoAcao(String acao)
  {
      switch(acao)
        {
            case "n":
                this.tipoAcao = "new";
            break;
            case "u":
                this.tipoAcao  = "update";
            break;
            case "r":
                this.tipoAcao = "remove";
            break;
            case "e":
            default:
                this.tipoAcao  = "error";
            break;
        }
  }
  TiposAcao (String valor)
  {
      setTipoAcao(valor);
  }
  public String getTipoAcao()
  {
    return this.tipoAcao;
  }
}

