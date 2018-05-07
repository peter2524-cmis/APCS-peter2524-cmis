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
    private static final int w = 600;
    private static final int h = 600;

    public TVToptions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        cell.scale(10,10);
        setBackground(cell); 
        One one = new One();
        Two two = new Two();
        Three three = new Three();
        Four four = new Four();
        addObject(one,40,40);
        addObject(two,200,40);
        addObject(three,w-200,40);
        addObject(four,w-40,40);
    }

    public boolean tester(){
        return enter;
    }
}
