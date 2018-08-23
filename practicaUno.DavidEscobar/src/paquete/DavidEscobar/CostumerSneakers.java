package paquete.DavidEscobar;

public class CostumerSneakers {
    
    private String marca;
    private String silueta;
    private String nombre;
    private String talla;
    private String costo;

        public CostumerSneakers() {
        this.marca = "Jordan";
        this.silueta = "Air Jordan 3";
        this.nombre = "Black Cement";
        this.talla = "7";
        this.costo = "5500";
    }
        
    public CostumerSneakers(String brand) {
        this.marca = brand;
        this.silueta = "";
        this.nombre = "";
        this.talla = "";
        this.costo = "";
    }
    
    public CostumerSneakers(String brand, String modelo, String colorway) {
        this.marca = brand;
        this.silueta = modelo;
        this.nombre = colorway;
        this.talla = "";
        this.costo = "";
    }
    
    public CostumerSneakers(String marca, String silueta, String colorway, String size) {
        this.marca = marca;
        this.silueta = silueta;
        this.nombre = colorway;
        this.talla = size;
        this.costo = "";
    }
    
    public CostumerSneakers(String brand, String modelo, String colorway, String size, String $) {
        this.marca = brand;
        this.silueta = modelo;
        this.nombre = colorway;
        this.talla = size;
        this.costo = $;
    }
    
    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append(String.format("Marca: %s%n", this.marca));
        value.append(String.format("Silueta: %s%n", this.silueta));
        value.append(String.format("Nombre: %s%n",this.nombre));
        value.append(String.format("Talla: %s%n",this.talla));
        value.append(String.format("Costo: %s%n",this.costo));
        
        return value.toString();
    }
}
