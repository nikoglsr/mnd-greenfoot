import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    boolean schussbereit = true;
    int leben = 3;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public player() {
    
    }
    
    
    public void act() 
    {
        bewegen(getX(), getY());
        schiessen();
    }
    
    public void bewegen (int x, int y){
        x = getX();
        y = getY();
 
        if (Greenfoot.isKeyDown("a")){
                setLocation(getX() - 30, getY());
            }
        if (Greenfoot.isKeyDown("d")){
                setLocation(getX() + 30, getY());
            }
        }
        
        public void schiessen(){
    
        if (Greenfoot.isKeyDown("space") && schussbereit == true){
        
            getWorld().addObject(new schuss(), getX(), getY()-50 );
            schussbereit = false;
        }
        else if (!Greenfoot.isKeyDown("space")){
        
            schussbereit = true;
        }
    }
    
        public void lebenVerlieren(){
         
        
    }
}