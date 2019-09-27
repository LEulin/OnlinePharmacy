/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepharmacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eulinle_sd2082
 */
public class Pharmacy {

    private String name;
    private List<Medicine> mForCough = new ArrayList<Medicine>();
    private List<Medicine> mForHeadache = new ArrayList<Medicine>();
    private List<Medicine> mForAllergy = new ArrayList<Medicine>();
    private List<Medicine> mForBodyPain = new ArrayList<Medicine>();
    Scanner input = new Scanner(System.in);

    public Pharmacy(String name) {
        this.name = name;
    }

    public Pharmacy() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Medicine> getmForCough() {
        return mForCough;
    }

    public void setmForCough(List<Medicine> mForCough) {
        this.mForCough = mForCough;
    }

    public List<Medicine> getmForHeadache() {
        return mForHeadache;
    }

    public void setmForHeadache(List<Medicine> mForHeadache) {
        this.mForHeadache = mForHeadache;
    }

    public List<Medicine> getmForAllergy() {
        return mForAllergy;
    }

    public void setmForAllergy(List<Medicine> mForAllergy) {
        this.mForAllergy = mForAllergy;
    }

    public List<Medicine> getmForBodyPain() {
        return mForBodyPain;
    }

    public void setmForBodyPain(List<Medicine> mForBodyPain) {
        this.mForBodyPain = mForBodyPain;
    }

    public boolean addMedicine(Medicine m) {
        System.out.println("In what list of medicines you want to add "+ m.getBrandName()+"\n1. Medicines for Cough\n2. Medicines for Headache\n3. Medicines for Allergies\n4. Medicines for Body pain\n: ");
        String select = input.nextLine();
        switch (select) {
            case "1":
                mForCough.add(m);
                break;
            case "2":
                mForHeadache.add(m);
                break;
            case "3":
                mForAllergy.add(m);
                break;
            case "4":
                mForBodyPain.add(m);
                break;
        }
        return true;
    }

    public void displayAvailableMedicines() {
        System.out.println("Select a list of medicines you want to view.\n1. Medicines for Cough\n2. Medicines for Headache\n3. Medicines for Allergies\n4. Medicines for Body pain\n: ");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            System.out.println("Medicines for Cough\n");
            System.out.println("_______________________________________________________________________________________________");
            System.out.printf(" %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
            System.out.println("_______________________________________________________________________________________________");
            for (int i = 0; i < mForCough.size(); i++) {
                if (mForCough.get(i) instanceof CoughMedicine) {
                    System.out.printf("%-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", mForCough.get(i).getBrandName(), mForCough.get(i).getGenericName(), mForCough.get(i).getType(), mForCough.get(i).getPrice(), mForCough.get(i).getQuantity());
                    System.out.println("\n-----------------------------------------------------------------------------------------------");
                }
            }
        }else if(choice.equals("2")){
            System.out.println("Medicines for Headache\n");
            System.out.println("_________________________________________________________________________________________________________");
            System.out.printf(" %-14s  |  %-14s  |  %-8s  |  %-9s   |   %-10s", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
            System.out.println("_________________________________________________________________________________________________________");
            for (int i = 0; i < mForCough.size(); i++) {
                if (mForCough.get(i) instanceof HeadacheMedicine) {
                    System.out.printf("%-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", mForHeadache.get(i).getBrandName(), mForHeadache.get(i).getGenericName(), mForHeadache.get(i).getType(), mForHeadache.get(i).getPrice(), mForHeadache.get(i).getQuantity());
                    System.out.println("\n-----------------------------------------------------------------------------------------------");
                }
            }
        }
        else if(choice.equals("3")){
            System.out.println("Medicines for Allergies\n");
            System.out.println("_________________________________________________________________________________________________________");
            System.out.printf(" %-14s  |  %-14s  |  %-8s  |  %-9s   |   %-10s", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
            System.out.println("_________________________________________________________________________________________________________");
            for (int i = 0; i < mForCough.size(); i++) {
                if (mForCough.get(i) instanceof AllergiesMedicine) {
                    System.out.printf("%-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", mForAllergy.get(i).getBrandName(), mForAllergy.get(i).getGenericName(), mForAllergy.get(i).getType(), mForAllergy.get(i).getPrice(), mForAllergy.get(i).getQuantity());
                    System.out.println("\n-----------------------------------------------------------------------------------------------");
                }
            }
        }
        else if(choice.equals("4")){
            System.out.println("Medicines for Body Pain\n");
            System.out.println("_________________________________________________________________________________________________________");
            System.out.printf(" %-14s  |  %-14s  |  %-8s  |  %-9s   |   %-10s", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
            System.out.println("_________________________________________________________________________________________________________");
            for (int i = 0; i < mForCough.size(); i++) {
                if (mForCough.get(i) instanceof BodyPainMedicine) {
                    System.out.printf("%-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", mForBodyPain.get(i).getBrandName(), mForBodyPain.get(i).getGenericName(), mForBodyPain.get(i).getType(), mForBodyPain.get(i).getPrice(), mForBodyPain.get(i).getQuantity());
                    System.out.println("\n-----------------------------------------------------------------------------------------------");
                }
            }
        }
    }
}
