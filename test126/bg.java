import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 
/**
 * Write a description of class bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class bg extends World
{
   
    
    public void act()     
    {    
    // spawn ships random
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship1(), Greenfoot.getRandomNumber(1000),0);  
        }   
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship2(), Greenfoot.getRandomNumber(1000),0);     
        } 
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship3(), Greenfoot.getRandomNumber(1000),0);     
        } 
        
        if(Greenfoot.getRandomNumber(10000) < 10) {    
            addObject(new ship4(), Greenfoot.getRandomNumber(1000),0);     
        } 
    }
   
    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
    }
}
