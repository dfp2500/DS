/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heroe;

/**
 *
 * @author Dani
 */
public class AdapterElfo implements Heroe{

    private Elfo elfo;
    
    AdapterElfo(Elfo elfo){
        this.elfo = elfo;
    }
    
    @Override
    public int poder() {
        return (elfo.espiritualidad() * elfo.mana())/2;
    }
    
}
