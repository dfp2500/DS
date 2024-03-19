/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public class cliente {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuertaMaderaBuilder madera = new PuertaMaderaBuilder();
        PuertaHierroBuilder hierro = new PuertaHierroBuilder();
        PuertaDirector director = new PuertaDirector();
        
        Puerta maderaFacil = director.createPuertaFacil(madera);
        Puerta maderaDificil = director.createPuertaDificil(madera);
        Puerta hierroDificil = director.createPuertaDificil(hierro);
        
        System.out.println(maderaFacil.capacidadDefensiva());
        System.out.println(maderaDificil.capacidadDefensiva());
        System.out.println(hierroDificil.capacidadDefensiva());
    }
    
}
