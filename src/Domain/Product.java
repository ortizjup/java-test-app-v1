/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author ortiz
 */
public class Product {
    private String ProductName;
    private double ProductPrice;
    private double ProductQty;
    private String Warehouse;
    
    public Product(String productName, double productPrice, double productQty, String warehouse){
        this.ProductName = productName;
        this.ProductPrice = productPrice;
        this.ProductQty = productQty;
        this.Warehouse = warehouse;
    }
    
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public double getProductQty() {
        return ProductQty;
    }

    public void setProductQty(double ProductQty) {
        this.ProductQty = ProductQty;
    }

    public String getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(String Warehouse) {
        this.Warehouse = Warehouse;
    }
    
    public double GetProductBalanceOnHand(){
        return this.ProductPrice * this.ProductQty;
    }
}
