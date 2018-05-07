import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baddy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baddy extends Actor
{
    private String Name;
    private int x4;
    private int y4;
    private int x3;
    private int y3;
    private int x2;
    private int y2;
    private int x1;
    private int y1;
    private int pl;

    public void lazer(){
        x4 = x3;
        y4 = y3;
        x3 = x2;
        y3 = y2;
        x2 = x1;
        y2 = y1;
        x1 = getX();
        y1 = getY();
        TheGrid myWorld = (TheGrid) getWorld();
        LazerWall laz = new LazerWall();
        myWorld.addObject(laz,x4,y4);
    }

    public void act() 
    {
        TheGrid myWorld = (TheGrid) getWorld();

    }

    public void lazerdeath(){
        if(isTouching(LazerWall.class) == true|| isTouching(Invisilazer.class) == true){
            TheGrid myWorld = (TheGrid) getWorld();
            myWorld.death(this);
        }
    }
}
