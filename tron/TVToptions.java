import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TVToptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TVToptions extends World
{
    private boolean enter = false;
    private GreenfootImage cell = new GreenfootImage("download.png");
    private static final int w = 500;
    private static final int h = 500;

    public TVToptions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        cell.scale(10,10);
        setBackground(cell);    
        Two two = new Two();
        Three three = new Three();
        Four four = new Four();
        addObject(two,40,40);
        addObject(three,w/2,40);
        addObject(four,w-40,40);
    }

    public boolean tester(){
        return enter;
    }
}
