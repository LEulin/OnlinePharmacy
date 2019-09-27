/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinepharmacy;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eulinle_sd2082
 */
public class HeadacheMedicine extends Medicine{
    
    private List<HeadacheMedicine> medicineForHeadache = new ArrayList<HeadacheMedicine>();
    
    
    public HeadacheMedicine() {
    }

    public HeadacheMedicine(String brandName, String genericName, String type, double price, int quantity) {
        super(brandName, genericName, type, price, quantity);
    }
 
    
}
