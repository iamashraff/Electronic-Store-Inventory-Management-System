package inventorymanagementsystem.ProductManagement.Model;

public class Phone extends Electronic  {
    public String type;
    public String os;
    public int ram;
    public int storage;

    public Phone(String type, String os, int ram, int storage, String brand, String model, int quantity, double price) {
        super(model, brand, quantity, price);
        this.type = type;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
    }
    
    
}
