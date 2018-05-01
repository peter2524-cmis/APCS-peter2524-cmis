import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{    
    private GreenfootImage cell = new GreenfootImage("bitmap.png");
    public void act() 
    {
        setImage(cell);
        System.out.println(getLength());
    }    
    
    public int getLength(){
        return cell.getWidth();
    }
}
