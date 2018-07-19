/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.controles;
import br.com.trab.modelos.Usuario;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author abreu
 */
@ManagedBean
@ViewScoped
public class UsuarioMB  implements Serializable{

    private Usuario usu = new Usuario();
    private List<Usuario> usuLista = new ArrayList<Usuario>();
    private boolean edit = false;
    
    public UsuarioMB()
    {}
 
    /**Getters e Setters */
    public Usuario getUsuario() {
        return usu;
    }
 
    public void setUsuario(Usuario usu) {
        this.usu = usu;
    }
 
    public List<Usuario> getUsuarioLista() 
    {
        return usuLista;
    }
 
    public void setUsuarioLista(List<Usuario> usuLista) 
    {
        this.usuLista = usuLista;
    }
    
    public void salvarUsuario()
    {
        usuLista.add(usu);
        usu = new Usuario();
        
        if(edit == true)
            edit = false;

    }
    public void limparCampo()
    {
        if(edit == true)
            salvarUsuario();
        else
            usu.anulandoUsu();
        
        edit = false;
    }
    public void removeUsuario(Usuario x) throws IOException
    {
        usuLista.remove(x);
    }
    public void editUsuario(Usuario x)
    {
        edit = true;
        usu = x;
        usuLista.remove(x);
    }
}
