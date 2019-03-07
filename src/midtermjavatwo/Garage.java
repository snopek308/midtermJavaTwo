package midtermjavatwo;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asnopek
 */
public class Garage {
    
    //arraylists to hold cars and money they earn
    //<Car> declares its going to have cars in it
    ArrayList<Car> carGarage = new ArrayList();
    
    //private double for total of money made
    private double totalRevenue;
    private double lostTicketRev;
    private double checkInRev;
    private int carCount;

    
    //method addCar
    //method leaveCar--> car out of array, check time for payment, equation and add to total bank
    //
    //
    
    public Garage()
    {
        carCount = 1;
    }
    
    
    
    public void addCar(Car c)
    
    {
        c.setID(carCount++);
        
        //adding a car to the Arraylist carGarage
        carGarage.add(c);
        System.out.println("Your car ticket number is: " + c.getID());
    }
    
    public void leaveCar(int ID)
    {
        for(int i = 0; i < carGarage.size(); i++)
        {
            if(carGarage.get(i).getID() == ID)
            {
                Car c = carGarage.get(i);
                c.getTime();
                
            }
        }
    }
    
    
}
