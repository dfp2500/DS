/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.pkg1ds;

/**
 *
 * @author ricardo
 */
public abstract class Bicicleta{
    
    int id;
    static private int idBici = 0;
    
    Bicicleta(){
        id = idBici;
        idBici++;
    }
    
    int getId(){
        return id;
    }
    
    abstract void abandonar();
    
}
