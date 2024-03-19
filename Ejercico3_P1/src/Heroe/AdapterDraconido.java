/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heroe;

/**
 *
 * @author Dani
 */
public class AdapterDraconido implements Heroe{

    private Draconido draconido;
    
    AdapterDraconido(Draconido draconido){
        this. draconido =  draconido;
    }
    
    @Override
    public int poder() {
        return draconido.poderDeRaza() * 3;
    }
    
}
