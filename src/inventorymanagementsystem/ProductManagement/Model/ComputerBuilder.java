package inventorymanagementsystem.ProductManagement.Model;


public class ComputerBuilder {
    private String type;
    private String processor;
    private int ram;
    private int storage;
    private String brand;
    private String model;
    private int quantity;
    private double price;
    
    private static ComputerBuilder instance = new ComputerBuilder();
    
    public static ComputerBuilder getInstance() {
        if (instance == null) {
            instance = new ComputerBuilder();
        }
        return instance;
    }

    public ComputerBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ComputerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    
    public Computer build(){
        return new Computer(type, processor, ram, storage, brand, model, quantity, price);
    }
    
    
}
