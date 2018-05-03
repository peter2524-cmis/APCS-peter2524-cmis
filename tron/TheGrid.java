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
    private int x;
    private static final int w = 600;
    private static final int h = 600;
    public TheGrid(int x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        this.x = x;
        cell.scale(10,10);
        setBackground(cell);
        if(x== 4){
            Bike player1 = new Player1();
            Bike player2 = new Player2();
            Bike player3 = new Player3();
            Bike player4 = new Player4();
            player2.turn(180);
            player3.turn(270);
            player4.turn(90);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
            addObject(player4,w/2,40);
        }else if(x == 3){
            Bike player1 = new Player1();
            Bike player2 = new Player2();
            Bike player3 = new Player3();
            player2.turn(180);
            player3.turn(270);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
        }else{
            Bike player1 = new Player1();
            Bike player2 = new Player2();
            player2.turn(180);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
        }
    }    

    public void act(){
        if(getObjects(Bike.class).size() < 2){
            if(x == 4){
                PAIIII pf = new PAIIII();
                addObject(pf,w/2,h/2);
            }else if(x == 3){
                PAIII pf = new PAIII();
                addObject(pf,w/2,h/2);
            }else{
                PAII pf = new PAII();
                addObject(pf,w/2,h/2);
            }

        }
    }

    public void death(Bike bike){
        removeObject(bike);
        String ded = bike.getName()+" has died";
        //showText(ded,w/2,h/2);
    }
}
