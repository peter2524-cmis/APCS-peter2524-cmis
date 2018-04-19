import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Bike
{
    public Player2(){
       setName("2");
    }
    
     public Player2(String Name){
       setName(Name);
    }
       
    
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        if (Greenfoot.isKeyDown("right"))
        {
            turn(7);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-7);
        }
        walldeath();
        lazer();
        lazerdeath();
    }    
}
