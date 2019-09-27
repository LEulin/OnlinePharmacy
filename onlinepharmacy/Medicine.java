/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepharmacy;

/**
 *
 * @author eulinle_sd2082
 */
public class Medicine {
    
    private String brandName;
    private String genericName;
    private String type;
    private double price;
    private int quantity;

    public Medicine() {
    }

    public Medicine(String brandName, String genericName, String type, double price, int quantity) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    

    public String getBrandName() {
        return brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" + "brandName=" + brandName + ", genericName=" + genericName + ", type=" + type + ", price=" + price + ", quantity=" + quantity + '}';
    }

}
