package ProyectoDispositivos;

public class Tablet extends mobiles{
    
    public Tablet(String nombre, String descripcion, int precio){
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void reset(){
        System.out.println("S'ha reiniciat la Tablet");
    }
}
