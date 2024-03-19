/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pkg1ds;

import java.util.Random;

/**
 *
 * @author ricardo
 */
public class Practica11DS implements Runnable{

    private Carrera carrera;
    
    public Practica11DS (Carrera carrera){
        this.carrera = carrera;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        
        FactoriaCarreraYBicicleta mon = new FactoriaMontaña();
        FactoriaCarreraYBicicleta carre = new FactoriaCarretera();
        
        Carrera c = carre.crearCarrera();
        Carrera m = mon.crearCarrera();
        
        for(int i = 0; i < r.nextInt(10)+1; i++){
            c.addBici(carre.crearBicicleta());
            m.addBici(mon.crearBicicleta());
        }
        
        Runnable carrerac = new Practica11DS(c);
        Runnable carreram = new Practica11DS(m);
        
        new Thread(carrerac).start();
        new Thread(carreram).start();
    }
    
    @Override
	public void run() {
		this.carrera.salir();
	}
}
