import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class Bike extends Actor
{
    private String Name;
    private int x11;
    private int y11;
    private int x10;
    private int y10;
    private int x9;
    private int y9;
    private int x8;
    private int y8;
    private int x7;
    private int y7;
    private int x6;
    private int y6;
    private int x5;
    private int y5;
    private int x4;
    private int y4;
    private int x3;
    private int y3;
    private int x2;
    private int y2;
    private int x1;
    private int y1;
    private int pl;
    public String getName(){
        return Name;
    }    

    public Bike(String Name, int pl){
        this.pl = pl;
        this.Name = Name;
    }

    public void lazer(){
        x11 = x10;
        y11 = y10;
        x10 = x9;
        y10 = y9;
        x9 = x8;
        y9 = y8;
        x8 = x7;
        y8 = y7;
        x7 = x6;
        y7 = y6;
        x6 = x5;
        y6 = y5;
        x5 = x4;
        y5 = y4;
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
        if(myWorld.getX() == 1){
            myWorld.addObject(laz,x7,y7);
        }else{
            myWorld.addObject(laz,x4,y4);
        }
    }

    public void act(){
        if(pl == 1){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("s"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("a"))
            {
                turn(-7);
            }
        }else if(pl == 2){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("right"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("down"))
            {
                turn(-7);
            }
        }else if(pl == 3){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("v"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("c"))
            {
                turn(-7);
            }
        }else if(pl == 4){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("m"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("n"))
            {
                turn(-7);
            }
        }else{

        }
    }

    public void lazerdeath(){
        if(isTouching(LazerWall.class) == true|| isTouching(Invisilazer.class) == true){
            TheGrid myWorld = (TheGrid) getWorld();
            myWorld.death(this);
        }
    }

}

