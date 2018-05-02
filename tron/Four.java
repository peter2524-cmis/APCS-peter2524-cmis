import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class four here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Four extends Numbers
{
    /**
     * Act - do whatever the four wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Dudgrid(4));
        }    
    }    
}
