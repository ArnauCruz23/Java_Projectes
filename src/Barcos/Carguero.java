package Barcos;

public class Carguero extends BarcoDeMercancias{
    private double pesoMercancia;

    public Carguero(double pesoMercancia, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor,eslora, manga, nudos, peso);
        this.pesoMercancia = pesoMercancia;
    }
}
