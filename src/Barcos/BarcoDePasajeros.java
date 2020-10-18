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
public abstract class BarcoDePasajeros extends Barco {

    private int camarotes;
    private int pasajeros;

    public BarcoDePasajeros(int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.camarotes = camarotes;
        this.pasajeros = pasajeros;
    }

    @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando barco de pasajeros...");
    }

    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando barco de pasejeros...");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonamos el barco corriendo.");
    }

    @Override
    public void comportamiento() {
        System.out.println("A esconderse toca.");
    }
    
    

}
