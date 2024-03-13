/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.pkg1ds;

/**
 *
 * @author ricardo
 */
public class FactoriaMontaña implements FactoriaCarreraYBicicleta{

    @Override
    public Carrera crearCarrera() {
        return new CarreraMontaña();
    }

    @Override
    public Bicicleta crearBicicleta() {
        return new BicicletaMontaña();
    }
    
    
}
