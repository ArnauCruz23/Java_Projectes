package ProyectoDispositivos;

public abstract class mobiles extends Dispositivo {
    
    public mobiles(String nombre, String descripcion, int precio){
        
        super(nombre, descripcion, precio);
        
    }
    
    @Override
    public void conecta(){
        System.out.println("S'ha ences el dispositiu portatil");
    }
    
    @Override
    public void desconecta(){
        System.out.println("S'ha apagat el dispositiu portatil");
    }
    
    public abstract void reset();
}
