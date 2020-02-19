/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexampartb;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class DrinkCoffee {
    public static void main(String[] args) {
          Coffee cf =new Coffee(true,0,"");
       
       System.out.println("Welcome! Customize your Coffee");
       
       System.out.println("How many Esspresso Shots do you want(0-4)?");
       
       Scanner sc=new Scanner(System.in);
       int shots=sc.nextInt();
       
       
       System.out.println("Please choose the size");
       for(int i=0; i<Coffee.size_options.length; i++)
        {
            System.out.println(Coffee.size_options[i]);
        }
       sc.nextLine();
        
       String choosenSize=sc.nextLine();
       cf.drink(choosenSize);
        
       //calling the method to calculate the final bill
        System.out.println("Please Pay: $" + cf.calculateBill(shots, choosenSize));
    }
    
    
}
