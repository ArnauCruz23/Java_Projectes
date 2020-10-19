package Barcos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     * 
     * Crea una nueva subclase de Barco llamada BarcoDeMercancias 
     * 
     * Crea una nueva subclase o más de BarcoDeMercancias llamada Carguero
     * 
     * 
     */
    public static void main(String[] args) {
        
        Barco barcoMercante = new Carguero(1000, new Motor(200), 1, 2, 1, 2000);
        barcoMercante.arranca();
        barcoMercante.atraca();
        barcoMercante.comportamiento();
        
        Barco bismark = new AcorazadoBismark(1000, new Motor(3000), 1, 2, 3, 3, 5);
        
        bismark.arranca();
        bismark.atraca();
        bismark.comportamiento();
        

    }

}
