import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class schuss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class schuss2 extends Actor
{
   public schuss2(){
    
    }
    
    public void act() 
    {
        schussBewegen(getX(),getY());
        despawnen(); //muss immer am Ende von act() sein
    } 
    
    public void schussBewegen(int x, int y) {
        
        x = getX();
        y = getY();
        
        setLocation(getX(), getY() + 50);
    
    }
    
    public void despawnen(){ //Schuss und Enemy
    
         if (getY()==599){
        
            getWorld().removeObject(this);
        }
    
    }  
}
