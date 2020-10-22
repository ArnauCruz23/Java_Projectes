package ProyectoLibre;

public class cadenaDeMusica extends dispositivoMusica {
    
    public cadenaDeMusica(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void cambiarEQ() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha cambiat el EQ");
        }
       
    }
}
   
