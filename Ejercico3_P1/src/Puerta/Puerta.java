/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public class Puerta {
    public String material;
    public int pinchos;
    public int cerradura;
    public int barricada;
    
    Puerta(){
        material = "";
        pinchos = 0;
        cerradura = 0;
        barricada = 0;
    }
    
    public int capacidadDefensiva(){
        return (pinchos+cerradura+barricada);
    }
}
