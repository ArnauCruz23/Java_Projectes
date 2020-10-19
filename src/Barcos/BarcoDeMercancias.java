package Barcos;

public abstract class BarcoDeMercancias extends Barco {

    private int mercancia;

    public BarcoDeMercancias(Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.mercancia = mercancia;
    }

    @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando barco Mercante...");
    }

    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando barco Mercante... Listo para la descarga...");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonamos el barco corriendo.");
    }

    @Override
    public void comportamiento() {
        System.out.println("Descarga la Mercancia... Listo para cargar de nuevo...");
    }
    
    

}