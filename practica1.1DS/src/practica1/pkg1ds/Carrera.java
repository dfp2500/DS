/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.pkg1ds;
import java.util.ArrayList;

/**
 *
 * @author ricardo
 */
public abstract class Carrera{
    
    private ArrayList<Bicicleta> bicis;
    static private int n = (int) (Math.random()*50 + 10);
    
    Carrera(){
        bicis = new ArrayList<>();
    }
    
    ArrayList<Bicicleta> getBicis(){
        return bicis;
    }
    
}
