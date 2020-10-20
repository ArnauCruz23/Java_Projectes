package ProyectoDispositivos;

public abstract class sobremesa extends Dispositivo {
    
    public sobremesa(String nombre, String descripcion, int precio){
        
        super(nombre, descripcion, precio);
        
    }
    
    @Override
    public void conecta(){
        System.out.println("S'ha ences el dispositiu de sobretaula");
    }
    
    @Override
    public void desconecta(){
        System.out.println("S'ha apagat el dispositiu de sobretaula");
    }
    
}
