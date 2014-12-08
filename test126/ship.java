import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
   private int spawnCounter;
   private boolean selected = false; 
   private boolean goDown = true;   

   public int getRandomNumber(int start,int end)  
{  
       int normal = Greenfoot.getRandomNumber(end-start+1);  
       return normal+start;  
} 
       

public boolean atWorldEdge()  
    {   
        if(getY() > getWorld().getHeight() - 10)  
            return true;  
        else  
            return false;  
    }    
    
   public void act()  
   {  
    int x = getX();
    int y = getY();

   if (goDown){
        setLocation(getX(), getY()+1);  
   }
   else{
        setRotation(180);
        setLocation(getX(), getY()-1);
   }

   if (Greenfoot.mouseClicked(this)) {
       selected = true;
   }

   if (Greenfoot.mouseClicked(null) && !Greenfoot.mouseClicked(this)) selected = false;

   if (selected && Greenfoot.isKeyDown("left")){
    setLocation(getX()-1, getY());
   }
    
   if (selected && Greenfoot.isKeyDown("right")){
       setLocation(getX()+1, getY());
   }
    
   if(atWorldEdge()) 
   {
       goDown = false;
   }

   Actor a = this.getOneIntersectingObject(ship.class); 
   if ( a != null)
   {
       this.getWorld().removeObject( a );
   }
}
}
