package ProyectoLibre;

public abstract class dispositivoDeIluminacion extends dispositivo {
    
    public dispositivoDeIluminacion(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void enciende() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha ences les llums LED");
        }
            
    }
    
    @Override
    public void apaga() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'han apagat les llums LED");
        };

    }
    
    public abstract void cambiarColor() throws Exception;
}
