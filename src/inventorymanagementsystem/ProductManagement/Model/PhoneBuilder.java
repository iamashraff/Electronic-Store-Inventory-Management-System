package inventorymanagementsystem.ProductManagement.Model;


public class PhoneBuilder {
    private String type;
    private String os;
    private int ram;
    private int storage;
    private String brand;
    private String model;
    private int quantity;
    private double price;
    
    private static PhoneBuilder instance = new PhoneBuilder();
    
    public static PhoneBuilder getInstance() {
        if (instance == null) {
            instance = new PhoneBuilder();
        }
        return instance;
    }

    public PhoneBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public PhoneBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    
     public Phone build(){
         return new Phone(type, os, ram, storage, brand, model, quantity, price);
     }
    
}
