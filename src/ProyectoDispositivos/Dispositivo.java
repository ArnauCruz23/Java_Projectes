package ProyectoDispositivos;

public abstract class Dispositivo implements Conectable{
    
    //caracteristicas
    protected String nombre = "Sin Nombre";
    private String descripcion = "Sin Descripción";
    private double precio;
    
    //Constructor
    public Dispositivo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //toString

    @Override
    public String toString() {
        System.out.println("Dispositivo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "euros}'");
        return "Dispositivo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    @Override
    public void conecta(){
        System.out.println("S'ha ences el dispositiu");
    }
    
    @Override
    public void desconecta(){
        System.out.println("S'ha apagat el dispositiu");
    }
    
}
