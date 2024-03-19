/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heroe;

/**
 *
 * @author Dani
 */
public class cliente {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humano Juan = new Humano();
        AdapterElfo Galadriel = new AdapterElfo(new Elfo());
        AdapterDraconido Draken = new AdapterDraconido(new Draconido());
        
        System.out.println(Juan.poder());
        System.out.println(Galadriel.poder());
        System.out.println(Draken.poder());
    }
    
}
