import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PIIII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PIIII extends Penter
{
    /**
     * Act - do whatever the PIIII wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 if(Greenfoot.isKeyDown("enter") == true){
            Greenfoot.setWorld(new TheGrid(4));
        }
    }    
}
