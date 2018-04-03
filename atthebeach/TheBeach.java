
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Important World methods:
 * addObject
 * getObjects
 * setPaintOrder
 * showText
 * 
 * Important Greenfoot methods:
 * stop
 */
public class TheBeach extends World
{
    public static final int W = 900;
    public static final int H = 600;
    public static final int NSTARFISH = 10;
    public static final int NDRAGON = 2;
    public TheBeach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(W, H, 1); 
        setPaintOrder(Fruit.class, Animal.class);
        for(int i = 0; i < NSTARFISH; i++){
            addObject(new Starfish(), (int)(Math.random() * W), (int)(Math.random() * H));
        }
        for(int i = 0; i < NDRAGON; i++){
            addObject(new Dragon(), (int)(Math.random() * W), (int)(Math.random() * H));
        }
    }

    public void act(){
        int knights = 0;
        if(Math.random() > 0.95){
            int x = (int)(Math.random() * W);
            int y = (int)(Math.random() * H);
            if(Math.random() > 0.3){
                addObject(new Banana(), x, y);
            }else{
                addObject(new Cherry(), x, y);
            }
        }
        //Chicken spawner
        List<Dragon> allDragon = getObjects(Dragon.class);
        if(Math.random()>.90){
            int x = (int)(Math.random() * W);
            int y = (int)(Math.random() * H);
            if(allDragon.size() == 0){
            }else{
                addObject(new Chicken(), x, y);
            }
        }

        List<Starfish> allStarfish = getObjects(Starfish.class);
        if(allStarfish.size() == 0 && knights == 0){
            showText("All the starfish are dead!", W/2, H/2);
            // for(int i = 0; i < NSTARFISH; i++){
                // addObject(new Knight(), (int)(Math.random() * W), (int)(Math.random() * H));
                // knights = 1;
            // }
        } else if (allStarfish.size() == 1){
            showText("I'm so lonely!", W/2, H/2);
        }
    }
}