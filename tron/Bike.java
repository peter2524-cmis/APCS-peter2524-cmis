import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bike extends Actor implements WallDeath
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
    public String getName(){
        return Name;
    }    

    public void setName(String Name){
        this.Name = Name;
    }

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

    public abstract void act();

    public void walldeath(){
        if(isAtEdge() == true){
            TheGrid myWorld = (TheGrid) getWorld();
            myWorld.death(this);
        }
    }

    public void lazerdeath(){
        if(isTouching(LazerWall.class) == true){
            TheGrid myWorld = (TheGrid) getWorld();
            myWorld.death(this);
        }
    }
}

