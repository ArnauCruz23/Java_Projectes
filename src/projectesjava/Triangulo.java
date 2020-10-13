
package projectesjava;

public class Triangulo {
    
    //propiedades
    private double base;
    private double altura;
    
    public Triangulo(double a, double b) throws Exception{
        if (a <= 0) throw new Exception("La altura tiene que ser positiva: "+ a);
        if (b <= 0) throw new Exception("La altura tiene que ser positiva: "+ b);
        
        this.altura = a;
        this.base = b;
    }
    
    //Getters y Setters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //To String
    @Override
    public String toString() {
        return "Triangulo{" + "base= " + base + ", altura= " + altura + '}';
    }
    
    //Merodos
    public double Costat(){
        double mediabase = this.base/2;
        return Math.sqrt((mediabase*mediabase)+(altura*altura));
    }
    
    public double area(){
        return((this.base*this.altura)/2); 
    }
    
    public double perimetre(){
        return (this.Costat()*2) + this.base;
    }
    
    public static void main(String[] args){
        Triangulo tri = null;
        try{
            tri = new Triangulo(17, 19);
            System.out.println(tri);
            System.out.print("area = "+tri.area() + " , perimtre = "+tri.perimetre());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }  
}
