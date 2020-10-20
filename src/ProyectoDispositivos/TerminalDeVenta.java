package ProyectoDispositivos;

public class TerminalDeVenta extends sobremesa{
    
    public TerminalDeVenta(String nombre, String descripcion, int precio){
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void conecta(){
        System.out.println("S'ha ences el Terminal de Venta");
    }
    
    @Override
    public void desconecta(){
        System.out.println("S'ha apagat el Terminal de Venta");
    }
}
