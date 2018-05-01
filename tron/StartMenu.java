import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    private boolean enter = false;
    private GreenfootImage cell = new GreenfootImage("download.png");
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        cell.scale(10,10);
        setBackground(cell);
        Buttons plane = new PVT();
        Buttons tron = new TVT();
        addObject(plane,40+(285/2),40);
        addObject(tron,40+(289/2),80);
    }

    public boolean tester(){
        return enter;
    }
}
