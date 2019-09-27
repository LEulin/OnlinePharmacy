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
public class BodyPainMedicine extends Medicine{

    private List<BodyPainMedicine> medicineForBodyPain = new ArrayList<BodyPainMedicine>();
    public BodyPainMedicine() {
    }

    public BodyPainMedicine(String brandName, String genericName, String type, double price, int quantity) {
        super(brandName, genericName, type, price, quantity);
    }


}
