import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends World
{
    
    public void act()     
    {    
      // spawn ships random
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship1(), Greenfoot.getRandomNumber(900),0);  
        }   
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship2(), Greenfoot.getRandomNumber(900),0);     
        } 
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship3(), Greenfoot.getRandomNumber(900),0);     
        } 
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship4(), Greenfoot.getRandomNumber(900),0);     
        } 
    }
    /**
     * Constructor for objects of class Water.
     * 
     */
    public Water()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
}
