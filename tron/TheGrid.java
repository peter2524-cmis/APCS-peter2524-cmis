import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheGrid extends World
{
    private GreenfootImage cell = new GreenfootImage("download.png");
    
    private static final int w = 800;
    private static final int h = 500;
    public TheGrid()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        cell.scale(10,10);
        setBackground(cell);
        Bike player1 = new Player1();
        Bike player2 = new Player2();
        player2.turn(180);
        addObject(player1,40,h/2);
        addObject(player2,w-40,h/2);
    }
    
    public void death(Bike bike){
        removeObject(bike);
        String ded = bike.getName()+" has died";
        showText(ded,w/2,h/2);
    }
}
