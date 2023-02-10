/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Domain.Product;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ortiz
 */
public class ProductoService {

    ArrayList<Product> _products;

    public ProductoService() {
        this._products = new ArrayList<>();
    }

    public ArrayList<Product> GetAllProducts() {
        return this._products;
    }

    public void AddProduct(Product product) {
        _products.add(product);
    }

    public void RemoveAll(ArrayList<Product> products) {
        this._products.removeAll(products);
    }

    public double GetProductBoh(String warheouse) {
        double warehouseBoh = 0;

        for (var x : this._products) {
            if (x.getWarehouse().contains(warheouse)) {
                warehouseBoh = x.GetProductBalanceOnHand() + warehouseBoh;
            }
        }

        return warehouseBoh;
    }

    public String GetWarehouseWithMaxAmonut() {
        HashMap<String, ArrayList<Product>> map = new HashMap<>();

        for (Product prd : this._products) {
            String key = prd.getWarehouse();
            if (map.containsKey(key)) {
                ArrayList<Product> list = map.get(key);
                list.add(prd);

            } else {
                ArrayList<Product> list = new ArrayList<>();
                list.add(prd);
                map.put(key, list);
            }
        }
        
        return "";
    }
}
