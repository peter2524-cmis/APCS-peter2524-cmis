import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends World
{    private boolean enter = false;
    private GreenfootImage cell = new GreenfootImage("download.png");
    private static final int w = 500;
    private static final int h = 500;
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public enter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        Greenfoot.start();
        cell.scale(10,10);
        setBackground(cell);
        Buttons enter = new Enter();
        addObject(enter,w/2,h/2);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    }
}
