package inventorymanagementsystem.ProductManagement.Model;


public class Computer extends Electronic {
    
    public String type;
    public String processor;
    public int ram;
    public int storage;
    
    
    
    public Computer(String type, String processor, int ram, int storage, String brand, String model, int quantity, double price) {
        super(brand, model, quantity, price);
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

}
