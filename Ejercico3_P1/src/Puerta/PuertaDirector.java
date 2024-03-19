/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public class PuertaDirector {
    
    public Puerta createPuerta(PuertaBuilder puertaBuilder){
        return puertaBuilder.build();
    }
    
    public Puerta createPuertaFacil(PuertaBuilder puertaBuilder){
        puertaBuilder.setCerradura();
        return puertaBuilder.build();
    }
    
    public Puerta createPuertaMediana(PuertaBuilder puertaBuilder){
        puertaBuilder.setCerradura();
        puertaBuilder.setPinchos();
        return puertaBuilder.build();
    }
    
    public Puerta createPuertaDificil(PuertaBuilder puertaBuilder){
        puertaBuilder.setCerradura();
        puertaBuilder.setPinchos();
        puertaBuilder.setBarricada();
        return puertaBuilder.build();
    }
}
