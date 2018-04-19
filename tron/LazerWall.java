import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LazerWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LazerWall extends Actor
{
    private GreenfootImage wall = new GreenfootImage("lazer.jpeg");

    public void act() {
        wall.scale(3,3);
        setImage(wall);
        List<LazerWall> walls = getObjectsInRange(7,LazerWall.class);
    }

}
