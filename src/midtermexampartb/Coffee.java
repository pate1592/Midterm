/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexampartb;

/**
 *
 * @author 
 */
public class Coffee {
      public boolean sugar;
      private int shots ;
      private String size;
      public static String [] size_options={"Small","Medium","Large"};
      
      
      public Coffee(boolean chosensugar,int chosenshots, String chosensize)
    {
        sugar=chosensugar;
        shots=chosenshots;
        size=chosensize;
    }
      
       /*Size for drink
     * */
    public void drink(String size)
    {
        System.out.println("You will be getting  a "+ size +" Coffee! Thank you!");
    }
    
    
    /** the method for calculating charges for adding cream
     * */
    public double ChargesForShots(int shot)
    {
        double amount1=0.0;
        switch(shot)
        {
            case 0: amount1=0.0;
                    break;
            case 1: amount1=2.0;
                    break;
            case 2: amount1=3.0;
                    break;
            case 3: amount1=4.50;
                    break;
            case 4: amount1=5.00;
                    break;  
            default:
                System.out.println("Not a Valid range");
        }
        return amount1;
    }
    
    public double chargesForDrink(String drinkSize)
    {
        double amount2=0.0;
        if(drinkSize.equalsIgnoreCase("Small"))
            amount2=2.0;
        if(drinkSize.equalsIgnoreCase("Medium"))
            amount2=4.0;
        if(drinkSize.equalsIgnoreCase("Large"))
            amount2=6.0;
        
        return amount2;
    }
    
    
     /** the method for calculating the final bill for the Drink
      * It also adds 13% Tax
     * */
    
    public double calculateBill(int shot,String drinkSize)
    {
        double amount=ChargesForShots(shot)+chargesForDrink(drinkSize);
        
        double final_amt=amount + (0.13*amount);
        
        return final_amt;
    }
    
}
