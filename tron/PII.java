import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PII extends Penter
{
    /**
     * Act - do whatever the PII wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter") == true){
            Greenfoot.setWorld(new TheGrid(2));
        }
    }    
}
