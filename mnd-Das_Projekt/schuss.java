import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test_schuss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class schuss extends Actor
{
    public schuss(){
    
    }
    
    public void act() 
    {
        schussBewegen(getX(),getY());
        despawnen(); //muss immer am Ende von act() sein
    } 
    
    public void schussBewegen(int x, int y) {
        
        x = getX();
        y = getY();
        
        setLocation(getX(), getY() - 50);
    
    }
    
    public void despawnen(){ //Schuss und Enemy
    
         if (getY()==0){
        
            getWorld().removeObject(this);
        }
    
    }



}   
