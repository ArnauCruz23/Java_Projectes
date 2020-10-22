package ProyectoLibre;

public abstract class dispositivo implements controla{
    
    String nombreDispositivo;
    boolean compatible = false;
    
    //Constructor
    public dispositivo(String nombreDispositivo, boolean compatible) {
        this.nombreDispositivo = nombreDispositivo;
        this.compatible = compatible;
    }
    
    //Getters i Setters
    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }
    
    //toString

    @Override
    public String toString() {
        if(compatible == true){
            System.out.println("El dispositivo " + nombreDispositivo + " es compatible");
            return "dispositivo{" + "nombreDispositivo=" + nombreDispositivo + ", compatible= Es compatible }";
        }else{
            System.out.println("El dispositivo " + nombreDispositivo + " no es compatible");
            return "dispositivo{" + "nombreDispositivo=" + nombreDispositivo + ", compatible= No es compatible }";
        }
    }
    
    @Override
    public void enciende() throws Exception{
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha ences el dispositiu");
        }
    }
    
    @Override
    public void apaga() throws Exception{
        
        if(this.compatible == false){
            throw new Exception(" No es compatible");
        }else{
            System.out.println("S'ha apagat el dispositiu");
        }
        
    }
    
    
}
