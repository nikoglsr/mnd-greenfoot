import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space_Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space_Background extends World
{
    int enemyZaehler = 0;
    Score score = new Score();
    /**
     * Constructor for objects of class Space_Background.
     * 
     */
    
    public Score getScore(){
        
        return score;
    
    }
    
   
    public Space_Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        Greenfoot.setSpeed(37);
        start();
    }
    
    public void act(){
        spawnEnemy();
    }
    
    public void spawnEnemy(){
         enemyZaehler++;    
         if (enemyZaehler > 44){
                addObject(new Enemy1(), Greenfoot.getRandomNumber(700), 0);
                enemyZaehler = 0;
         }
    }
    
    private void start(){;
    addObject(score, 70, 50);
    player player = new player();
    addObject(player,350,470);
    player.setLocation(350, 470);
    
    leben1 leben1 = new leben1();
    addObject(leben1, 680, 550);
     leben2 leben2 = new leben2();
    addObject(leben2, 650, 550);
     leben3 leben3 = new leben3();
    addObject(leben3, 620, 550);
    }
    
}   
