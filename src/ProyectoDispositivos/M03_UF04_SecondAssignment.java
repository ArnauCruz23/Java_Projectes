package ProyectoDispositivos;

public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        
        mobiles mob1 = new Tablet("Samsung", "Tablet Samsung", 1000);
        mob1.toString();
        mob1.conecta();
        mob1.desconecta();
        mob1.reset();
        
        mobiles mob2 = new Portatil("MSI", "Portatil MSI", 1000);
        mob2.toString();
        mob2.conecta();
        mob2.desconecta();
        mob2.reset();
        
        Dispositivo sob1 = new Ordenador("MSI G", "Orenador de sobremesa MSI", 1000);
        sob1.toString();
        sob1.conecta();
        sob1.desconecta();
        
        Dispositivo sob2 = new TerminalDeVenta("Terminal de Venta", "Es un Terminal de Venta", 1000);
        sob2.toString();
        sob2.conecta();
        sob2.desconecta();
        
        
    }
    
}
