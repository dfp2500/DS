/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.pkg1ds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public abstract class Carrera{
    protected ArrayList<Bicicleta> bicis;
    protected Random r;
    int bicisSalida;
    int bicisLlegada;
    int porcentajeSalida;
    String tipo;
    ArrayList<Bicicleta> ranking;
    
    Carrera(){
        bicis = new ArrayList<>();
        r = new Random();
        ranking = new ArrayList<>();
        bicisLlegada = 0;
        tipo = "";
    }
    
    void addBici(Bicicleta bici){
        bicis.add(bici);
    }
    
    ArrayList<Bicicleta> getBicis(){     
        return bicis;
    }
    
    void comenzarCarrera(){
        bicisSalida = r.nextInt(bicis.size())+1; 
        System.out.println("Comienza la carrera de "+ tipo + " con " + bicisSalida + " competidores: \n");
        for (int i = 0; i<bicisSalida; i++){
            System.out.println(bicis.get(i).getId()+"\n");
        }
    }
    
    ArrayList<Bicicleta> finalCarrera(){
        Collections.shuffle(bicis, r);
        
        bicisLlegada -= bicisSalida*porcentajeSalida;
        
        for(int i = 0; i<bicisLlegada; i++){
            ranking.add(bicis.get(i));
        }
        
        return ranking;
    }
    
    void Carrera(){
        comenzarCarrera();
        try {
            Thread.sleep(45*1000);
        } catch (Exception e) {
           System.out.println(e);
        }
        finalCarrera();
        System.out.println("Salen un " + porcentajeSalida + "% de las bicis de la carrera de " + tipo + ": \n");
        for(int i = bicisLlegada; i < bicisSalida; i++)
            System.out.println(bicis.get(i).getId() + "\n");
        
        try {
            Thread.sleep(15*1000);
        } catch (Exception e) {
           System.out.println(e);
        }
        
        System.out.println("El ranking de la carrera de " + tipo + " acaba como: \n");
        for(int i = 0; i < bicisLlegada; i++){
            System.out.println((i+1) + ". " + bicis.get(i).getId() + "\n");
        }
    }
    
}
