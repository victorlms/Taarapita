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
public class RedeSocialExternas 
{
    private String facebook, twitter, gPlus, lattes, linkedin;
    private boolean visiFacebook, visiTwitter, visiGPlus, visiLattes, visiLinkedin;
    
    public void setFacebook(String f)
    {
        this.facebook = f;
    }
    public void setTwitter(String t)
    {
        this.twitter = t;
    }
    public void setGPlus(String g)
    {
        this.gPlus = g;
    }
    public void setLattes(String la)
    {
        this.lattes = la;
    }
    public void setLinkedin(String li)
    {
        this.linkedin = li;
    }
    public void setVisualizaFacebook(boolean vf)
    {
        this.visiFacebook = vf;
    }
    public void setVisualizaTwitter(boolean vt)
    {
        this.visiTwitter = vt;
    }
    public void setVisualizaGPlus(boolean vg)
    {
        this.visiGPlus = vg;
    }
    public void setVisualizaLattes(boolean vla)
    {
        this.visiLattes = vla;
    }
    public void setVisualizaLinkedin(boolean vli)
    {
        this.visiLinkedin = vli;
    }
    public String getFacebook()
    {
        return this.facebook;
    }
    public String getTwitter()
    {
        return this.twitter;
    }
    public String getGPlus()
    {
        return this.gPlus;
    }
    public String getLattes()
    {
        return this.lattes;
    }
    public String getLinkedin()
    {
        return this.linkedin;
    }
    public boolean getVisualizaFacebook()
    {
        return this.visiFacebook;
    }
    public boolean getVisualizaTwitter()
    {
        return this.visiTwitter;
    }
    public boolean getVisualizaGPlus()
    {
        return this.visiGPlus;
    }
    public boolean getVisualizaLattes()
    {
        return this.visiLattes;
    }
    public boolean getVisualizaLinkedin()
    {
        return this.visiLinkedin;
    }
}
