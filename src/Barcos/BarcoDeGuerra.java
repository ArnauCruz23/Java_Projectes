/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barcos;

/**
 *
 * @author pep
 */
public abstract class BarcoDeGuerra extends Barco {

    private int cañones;

    public BarcoDeGuerra(Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        // llama al constructor de la superclase
        super(motor, eslora, manga, nudos, peso);
        this.cañones = cañones;
        
    }

    @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando barco de guerra...");
    }
    
    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando barco de guerra");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco ordenadamente");
    }

    @Override
    public void comportamiento() {
        System.out.println("Se lian a cañonazos.");
    }
    
    
    
}
