/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public class FachadaPuerta {
    
    PuertaDirector director;
    PuertaHierroBuilder hierro;
    PuertaMaderaBuilder madera;
    
    public FachadaPuerta(){
        director = new PuertaDirector();
        madera = new PuertaMaderaBuilder();
        hierro = new PuertaHierroBuilder();
    }
    
    public int defensaPuertaMaderaFacil(){
        Puerta maderaFacil = director.createPuertaFacil(madera);
        
        return maderaFacil.capacidadDefensiva();
    }
    
    public int defensaPuertaMaderaMediana(){
        Puerta maderaMediana = director.createPuertaMediana(madera);
        
        return maderaMediana.capacidadDefensiva();
    }
    
    public int defensaPuertaMaderaDificil(){
        Puerta hierroDificil = director.createPuertaDificil(hierro);
        
        return hierroDificil.capacidadDefensiva();
    }
    
    public int defensaPuertaHierroFacil(){
        Puerta hierroFacil = director.createPuertaFacil(hierro);
        
        return hierroFacil.capacidadDefensiva();
    }
    
    public int defensaPuertaHierroMediana(){
        Puerta hierroMediana = director.createPuertaMediana(hierro);
        
        return hierroMediana.capacidadDefensiva();
    }
    
    public int defensaPuertaHierroDificil(){
        Puerta hierroDificil = director.createPuertaDificil(hierro);
        
        return hierroDificil.capacidadDefensiva();
    }
}
