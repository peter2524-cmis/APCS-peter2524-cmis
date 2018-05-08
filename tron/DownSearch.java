import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DownSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DownSearch extends Actor
{
    /**
     * Act - do whatever the DownSearch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjects(Baddy.class).size()>0){
            move(3);
        }    
        if(isTouching(LazerWall.class) == true|| isTouching(Invisilazer.class) == true){
            turn(7);
        }
    }
}
