import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penter extends Inst
{
    private int x;
    public Penter(int x){
        this.x = x;
    }
    public void act(){
        if(x == 4){
            if(Greenfoot.isKeyDown("enter") == true){
                Greenfoot.setWorld(new TheGrid(4));
            }
        }else if(x == 3){
            if(Greenfoot.isKeyDown("enter") == true){
                Greenfoot.setWorld(new TheGrid(3));
            }
        }else if(x == 2){
            if(Greenfoot.isKeyDown("enter") == true){
                Greenfoot.setWorld(new TheGrid(2));
            }
        }else{
            if(Greenfoot.isKeyDown("enter") == true){
                Greenfoot.setWorld(new TheGrid(1));
            }
        }

    }    
}
