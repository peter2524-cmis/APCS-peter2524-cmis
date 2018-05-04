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
            Bike player1 = new Bike("1",1);
            Bike player2 = new Bike("2",2);
            Bike player3 = new Bike("3",3);
            Bike player4 = new Bike("4",4);
            player2.turn(180);
            player3.turn(270);
            player4.turn(90);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
            addObject(player4,w/2,40);
        }else if(x == 3){
            Bike player1 = new Bike("1",1);
            Bike player2 = new Bike("2",2);
            Bike player3 = new Bike("3",3);
            player2.turn(180);
            player3.turn(270);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
            addObject(player3,w/2,h-40);
        }else{
            Bike player1 = new Bike("1",1);
            Bike player2 = new Bike("2",2);
            player2.turn(180);
            addObject(player1,40,h/2);
            addObject(player2,w-40,h/2);
        }
        
        for(int r = 0; r<=w;r = r+10){
            for(int c = 0; c<=h;c = c+10){
                if(r == 0||r == w || c == 0 || c== h){
                    addObject(new Invisilazer(),r,c);
                }
            }
        }
    }    

    public void act(){
        if(getObjects(Bike.class).size() < 2){
            if(x == 4){
                PlayAgain pf = new PlayAgain(4);
                addObject(pf,w/2,h/2);
            }else if(x == 3){
                PlayAgain pf = new PlayAgain(3);
                addObject(pf,w/2,h/2);
            }else{
                PlayAgain pf = new PlayAgain(2);
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
