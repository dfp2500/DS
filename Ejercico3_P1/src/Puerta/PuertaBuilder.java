/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Puerta;

/**
 *
 * @author Dani
 */
public abstract class PuertaBuilder {
    protected Puerta puerta;
    
    public abstract void setPinchos();
    
    public abstract void setCerradura();
    
    public abstract void setBarricada();
    
    public abstract Puerta build();
}
