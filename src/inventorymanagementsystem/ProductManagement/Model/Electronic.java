package inventorymanagementsystem.ProductManagement.Model;

public class Electronic {
    public String brand;
    public String model;
    public int quantity;
    public double price;

    public Electronic(String brand, String model, int quantity, double price) {
        this.brand = brand;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }
    
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
}
