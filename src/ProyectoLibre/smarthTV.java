package ProyectoLibre;

public class smarthTV extends dispositivoTV {
    
    public smarthTV(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void cambiarCanal() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha cambiat de canal");
        }
       
    }
}
    
