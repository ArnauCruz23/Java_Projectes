package ProyectoLibre;

/*Un mando a distancia Universal que puede conectarse a varios dispositivos distintos. Según el disositivo puede hacer 
unas acciones u otras*/

public class ProyectoLibre {
    
    public static void main(String[] args) {
        
        dispositivoDeIluminacion lucesLED = new lucesLED("Luces de navidad", true);
        try{
            lucesLED.toString();
            lucesLED.apaga();
            lucesLED.enciende();
            lucesLED.cambiarColor();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }
        
        dispositivoDeIluminacion lucesLEDfalse = new lucesLED("Luces de navidad", false);
        try{
            lucesLEDfalse.toString();
            lucesLEDfalse.apaga();
            lucesLEDfalse.enciende();
            lucesLEDfalse.cambiarColor();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }finally{
            System.out.println("Patata");
        }
        
        dispositivoMusica cadena = new cadenaDeMusica("Sunstech", true);
        try{
            cadena.toString();
            cadena.apaga();
            cadena.enciende();
            cadena.cambiarEQ();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }
        
        dispositivoMusica cadenaF = new cadenaDeMusica("Sunstech", false);
        try{
            cadenaF.toString();
            cadenaF.apaga();
            cadenaF.enciende();
            cadenaF.cambiarEQ();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }
        
        dispositivoTV TV = new smarthTV("Thomson", true);
        try{
            TV.toString();
            TV.apaga();
            TV.enciende();
            TV.cambiarCanal();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }
        
        dispositivoTV TVf = new smarthTV("Thomson", false);
        try{
            TVf.toString();
            TVf.apaga();
            TVf.enciende();
            TVf.cambiarCanal();
        }catch(Exception e){
            System.out.println("No se ha podido conectar" + e.getMessage());
        }
    }
    
    
    
}
