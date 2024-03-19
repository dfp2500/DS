/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heroe;

/**
 *
 * @author Dani
 */
public class FachadaHeroe {
    
    Humano Jose;
    AdapterElfo Marcille;
    AdapterDraconido Shenron;
    
    public FachadaHeroe(){
        Jose = new Humano();
        Marcille = new AdapterElfo(new Elfo());
        Shenron = new AdapterDraconido(new Draconido());
    }
    
    public int poderEquipoPequeño(){
        return Jose.poder();
    }
    
    public int poderEquipoMediano(){
        return Jose.poder()+Marcille.poder();
    }
    
    public int poderEquipoGrande(){       
        return Jose.poder()+Marcille.poder()+Shenron.poder();
    }
}
