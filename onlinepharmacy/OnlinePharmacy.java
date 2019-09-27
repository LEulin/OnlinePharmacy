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
public class OnlinePharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pharmacy rose = new Pharmacy("Rose");
        CoughMedicine ambroxol = new CoughMedicine("Ambroxol","Mucosolvan     ","Capsule", (float) 10.56, 50);
        CoughMedicine vicks = new CoughMedicine("Vicks","Dextromethorphan","Vaporub", (float) 25.0, 50);
        CoughMedicine robitussin = new CoughMedicine("Robitussin","Dextromethorphan", "Syrup", (float) 50.5, 10);
        HeadacheMedicine biogesic = new HeadacheMedicine("Biogesic","Paracetamol", "Tablet", (float) 25.0, 30);
        HeadacheMedicine medicol = new HeadacheMedicine("Medicol","Ibuprofen", "Capsule", (float) 10.0, 60);
        HeadacheMedicine migranal = new HeadacheMedicine("Migranal","Dihydroergotamine", "Tablet", (float) 12.0, 80);
        AllergiesMedicine cetirizine = new AllergiesMedicine("Cetirizine","Zyrtec", "Capsule", (float) 6.50, 50);
        AllergiesMedicine antazoline = new AllergiesMedicine("Antazoline","Vasocon A", "Capsule", (float) 20.3, 50);
        AllergiesMedicine oxy = new AllergiesMedicine("Oxymetazoline","Afrin", "Tablet", (float) 13.7, 50);
        BodyPainMedicine alaxan = new BodyPainMedicine("AlaxanFR","Ibuprofen", "Capsule", (float) 15.0, 50);
        BodyPainMedicine celexa = new BodyPainMedicine("Celexa","Citalopram", "Tablet", (float) 12.0, 60);
        BodyPainMedicine aspirin = new BodyPainMedicine("Aspirin Free Anacin","Acetaminophen", "Capsule", (float) 19.0, 80);
        
        rose.addMedicine(ambroxol);
        rose.addMedicine(vicks);
        rose.addMedicine(robitussin);
        rose.displayAvailableMedicines();
        rose.addMedicine(biogesic);
        rose.addMedicine(medicol);
        rose.addMedicine(migranal);
        rose.displayAvailableMedicines();
        rose.addMedicine(cetirizine);
        rose.addMedicine(antazoline);
        rose.addMedicine(oxy);
        rose.displayAvailableMedicines();
        rose.addMedicine(alaxan);
        rose.addMedicine(celexa);
        rose.addMedicine(aspirin);
        rose.displayAvailableMedicines();
        
    }
    
}
