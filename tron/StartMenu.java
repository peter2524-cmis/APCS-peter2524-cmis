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
    private static final int w = 600;
    private static final int h = 600;
    
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        cell.scale(10,10);
        setBackground(cell);
        Buttons plane = new PVT();
        Buttons tron = new TVT();
        //addObject(plane,w/2,h/2+20);
        addObject(tron,w/2,h/2-20);
    }

    public boolean tester(){
        return enter;
    }
}
