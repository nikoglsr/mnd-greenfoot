import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int punktzahl = 0;
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Score(){
    
        setImage(new GreenfootImage("Score: " + punktzahl, 40, Color.GREEN, Color.BLACK));
        
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Score: " + punktzahl, 40, Color.GREEN, Color.BLACK));
    }    
    
    public void scoreErhoehen(){
    punktzahl++;
    }
}
