import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player3 extends Bike
{
    public Player3(){
       setName("2");
    }
    
     public Player3(String Name){
       setName(Name);
    }
       
    
    /**
     * Act - do whatever the Player3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        if (Greenfoot.isKeyDown("v"))
        {
            turn(7);
        }
        if (Greenfoot.isKeyDown("c"))
        {
            turn(-7);
        }
        walldeath();
        lazer();
        lazerdeath();
    }    
}
