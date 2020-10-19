
package Barcos;

public class AcorazadoBismark extends BarcoDeGuerra{
    
    private int bombas;

    public AcorazadoBismark(int bombas, Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        super(motor, eslora, manga, nudos, peso, cañones);
        this.bombas = bombas;
    }

    public void arranca() {
        // ...
        System.out.println("Arrancando barco de guerra Bismark ...");
    }

    public void atraca() {
        // ...
        System.out.println("Atracando barco de guerra Bismark...");
    }
    
    public void comportamiento() {
        // ...
        System.out.println("El Bismark dispara y hunde el Principe de gales a cañonazos ...");
    }
}
