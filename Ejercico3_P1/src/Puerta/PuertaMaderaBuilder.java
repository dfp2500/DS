/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public class PuertaMaderaBuilder extends PuertaBuilder {

    PuertaMaderaBuilder(){
        super();
        this.reset();
    }
    
    public void reset(){
        this.puerta = new Puerta();
        this.puerta.material = "Madera";
    }
    
    @Override
    public void setPinchos() {
        this.puerta.pinchos = 100;
    }

    @Override
    public void setCerradura() {
        this.puerta.cerradura = 50;
    }

    @Override
    public void setBarricada() {
        this.puerta.barricada = 150;
    }

    @Override
    public Puerta build() {
        Puerta puerta = this.puerta;
        this.reset();
        return puerta;
    }
    
}
