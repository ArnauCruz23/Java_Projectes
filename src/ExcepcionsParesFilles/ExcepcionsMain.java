package ExcepcionsParesFilles;

public class ExcepcionsMain {
    //Només positius
    //Numero 1 ha de ser parell
    //Numero 2 ha de ser imparell
    //Suma fins a 100.
    
    
    public static void main(String[] args) {
        
        
        try{
            Matematicas sumar = new Matematicas(40, 3);
            sumar.toString();
            sumar.sumar();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Fi del programa... ");
        }
    }
}
