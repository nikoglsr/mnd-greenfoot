import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test_enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    int leben = 2;
    int zaehler = 12;
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy1(){
      
    }
    
    public void act() 
    {
        if (zaehler <= 12 && zaehler != 0) {
        zaehler--;
        
    }else if (zaehler == 0){
    zaehler = 12;
    }
        
        autoBewegen(getX(),getY());
        autoSchuss();
        enemyDespawnen();
    } 
    
    public void autoBewegen(int x, int y) {
        x = getX();
        y = getY();
        
       
        if (zaehler == 12) {
            setLocation(getX(), getY() + 25);
        }
        if (zaehler == 10) {
            setLocation(getX() + 30, getY());
        }
        if (zaehler == 8) {
            setLocation(getX() + 30, getY());
        }
        if (zaehler == 6) {
            setLocation(getX(), getY() + 25);
        }if (zaehler == 4) {
            setLocation(getX() - 30, getY());
        }
        if (zaehler == 2) {
            setLocation(getX() - 30, getY());
        }
       
    }
    
    
    public void enemyDespawnen(){
        // wenn am Ende der Welt oder getroffen
        Actor schuss = getOneIntersectingObject(schuss.class);
        
        if (schuss != null){
           getWorld().removeObject(schuss);
           leben--;
           
           //Punktzahl erhöhen
           World spaceworld = getWorld();
           Space_Background space = (Space_Background)spaceworld;
           Score score = space.getScore();
           score.scoreErhoehen(); 
       
        
        } else if(getY()==599){
        
          getWorld().removeObject(this);  
        } else if (leben == 0){
            getWorld().removeObject(this);
        }
    }
    
    public void autoSchuss(){
        if (zaehler == 10){
        
            getWorld().addObject(new schuss2(), getX(), getY()+50 );
        }
        
    }
}
