package ProyectoDispositivos;

public class Portatil extends mobiles{
    
    public Portatil(String nombre, String descripcion, int precio){
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void reset(){
        System.out.println("S'ha reiniciat el Portatil");
    }
}