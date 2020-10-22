package ProyectoLibre;

public abstract class dispositivoTV extends dispositivo {
    
    public dispositivoTV(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void enciende() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha ences el dispositiu TV");
        }
        
    }
    
    @Override
    public void apaga() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha apagat el dispositiu TV");
        }
        
    }
    
    public abstract void cambiarCanal() throws Exception;
}

