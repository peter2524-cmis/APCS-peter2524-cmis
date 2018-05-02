import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dudgrid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dudgrid extends World
{

    private GreenfootImage cell = new GreenfootImage("download.png");
    private int x;
    private static final int w = 500;
    private static final int h = 500;
    public Dudgrid(int x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        cell.scale(10,10);
        setBackground(cell);
        if(x== 4){
            Bike player1 = new Dudbike();
            Bike player2 = new Dudbike();
            Bike player3 = new Dudbike();
            Bike player4 = new Dudbike();
            player2.turn(180);
            player3.turn(270);
            player4.turn(90);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
            addObject(player4,w/2,40);
        }else if(x == 3){
            Bike player1 = new Dudbike();
            Bike player2 = new Dudbike();
            Bike player3 = new Dudbike();
            player2.turn(180);
            player3.turn(270);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
        }else{
            Bike player1 = new Dudbike();
            Bike player2 = new Dudbike();
            player2.turn(180);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
        }

        if(x == 4){
            PIIII f = new PIIII();
            addObject(f,w/2,h/2);
        }else if(x == 3){
            PIII f = new PIII();
            addObject(f,w/2,h/2);
        }else{
            PII f = new PII();
            addObject(f,w/2,h/2);
        }
    }    

}
