import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player4 extends Bike
{
    public Player4(){
       setName("2");
    }
    
     public Player4(String Name){
       setName(Name);
    }
       
    
    /**
     * Act - do whatever the Player4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        if (Greenfoot.isKeyDown("m"))
        {
            turn(7);
        }
        if (Greenfoot.isKeyDown("n"))
        {
            turn(-7);
        }
        walldeath();
        lazer();
        lazerdeath();
    }    
}
