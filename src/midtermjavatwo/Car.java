package midtermjavatwo;


import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asnopek
 */
public class Car {
    
    private LocalDateTime time;
    private int ID;

    //get methods
    //set methods
    //constructor time
    
    //constructing car to get the data of date and time
    //whenever we make a new car, it sets it to the whatever the current time it
    public Car()
    {
        this.time = LocalDateTime.now();
    }
    
    //returning the variable time
    public LocalDateTime getTime()
    {
       return time; 
    }
    
    //returns whatever is in the int ID
    //in getters you have to declare type which you are returning
    //any time I create a getting, you have to declare the type
    public int getID()
    {
        return ID;
    }
    
    //changes the ID to the int we're taking in
    public void setID(int i)
    {
        ID = i;
    }
    
    
    
    
    
}
