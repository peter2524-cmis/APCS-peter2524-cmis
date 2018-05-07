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

