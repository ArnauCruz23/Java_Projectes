/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barcos;

public class Carguero extends BarcoDeMercancias{
    private double kilosDeMercancia;

    public Carguero(double kilosDeMercancia, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor,eslora, manga, nudos, peso);
        this.kilosDeMercancia = kilosDeMercancia;
    }
}
