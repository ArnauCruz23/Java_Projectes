package ProyectoLibre;

public class lucesLED extends dispositivoDeIluminacion {
    
    public lucesLED(String nombreDispositivo, boolean compatible){
        
        super(nombreDispositivo, compatible);
        
    }
    
    @Override
    public void cambiarColor() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha cambiat el color dels leds");
        }

    }
}
   
