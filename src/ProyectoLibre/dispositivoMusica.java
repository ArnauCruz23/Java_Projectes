package ProyectoLibre;

public abstract class dispositivoMusica extends dispositivo {
    
    public dispositivoMusica(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void enciende() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha ences el dispositiu de Musica");
        }
        
    }
    
    @Override
    public void apaga()throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha apagat el dispositiu de Musica");
        }
        
    }
    
    public abstract void cambiarEQ() throws Exception;
}
