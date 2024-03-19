/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico3_p1;
import Heroe.FachadaHeroe;
import Puerta.FachadaPuerta;

/**
 *
 * @author Dani
 */
public class Ejercico3_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FachadaHeroe fachadaHeroe = new FachadaHeroe();
        FachadaPuerta fachadaPuerta = new FachadaPuerta();
        
        if(fachadaHeroe.poderEquipoMediano() > fachadaPuerta.defensaPuertaHierroFacil())
            System.out.println("El grupo tiene un poder de: " + fachadaHeroe.poderEquipoMediano() + ", por lo que atraviesa la puerta con capacidad defensiva de: " + fachadaPuerta.defensaPuertaHierroFacil());
        else
            System.out.println("El grupo tiene un poder de: " + fachadaHeroe.poderEquipoMediano() + ", por lo que no atraviesa la puerta con capacidad defensiva de: " + fachadaPuerta.defensaPuertaHierroFacil());
    }
    
}
