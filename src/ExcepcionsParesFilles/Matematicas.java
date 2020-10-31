package ExcepcionsParesFilles;

public class Matematicas {
    
    int numero1;
    int numero2;
    
    public Matematicas(int numero1, int numero2){
        
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        System.out.println("El numero 1 = "+numero1+" El numero 2 = "+numero2);
        return "Matematicas{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';       
    }
    
    
    public void sumar()throws Exception{
        
        int numerofinal;
        numerofinal = numero1 + numero2;
        
        if(numero1 < 0 || numero2 < 0){
            throw new Exception("ERROR: Es negatiu");
        }
        else if(numero1%2!=0){
            throw new Exception("ERROR: El nuemero "+numero1+" no es parell");
        }
        else if(numero2%2==0){
            throw new Exception("ERROR: El nuemero "+numero2+" no es imparell");
        }
        else if(numerofinal >= 100){
            throw new Exception("ERROR: El numero supera el 100");
        }
        else{
            System.out.println("El resutat és " +numerofinal);
        }
        
        
    }
    
    
}
