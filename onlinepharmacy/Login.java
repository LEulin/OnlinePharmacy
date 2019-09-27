/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepharmacy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eulinle_sd2082
 */
public class Login {

    ArrayList<User> user = new ArrayList();

    public User login() {
        System.out.println("LOGIN\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        for (User user : user) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

    public void Register() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("REGISTER");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner1.nextInt();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        user.add(new User(name, age, username, password));

    }
    
    public void addUser(){
        
    }
}
