import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test_player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test_player extends player_and_enemy
{
    /**
     * Act - do whatever the test_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(getX(), getY());
    }    
    public void move(int x, int y){
        x = getX();
        y = getY();
        
        if (Greenfoot.isKeyDown("w"))
        {setLocation(x, y - 10);} 
        if (Greenfoot.isKeyDown("s"))
        {setLocation(x, y + 10);}
        if (Greenfoot.isKeyDown("d"))
        {setLocation(x + 10, y);}
        if (Greenfoot.isKeyDown("a"))
        {setLocation(x - 10, y); }
    }
}
