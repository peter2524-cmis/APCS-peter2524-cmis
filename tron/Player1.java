import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Bike
{
    public Player1(){
       setName("1");
    }
    
     public Player1(String Name){
       setName(Name);
    }
    public void act(){
        move(3);
        if (Greenfoot.isKeyDown("s"))
        {
            turn(7);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-7);
        }
        walldeath();
        lazer();
        lazerdeath();
    }
}
