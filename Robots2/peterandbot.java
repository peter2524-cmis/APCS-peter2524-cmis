import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class peterandbot extends Robot
{
    public peterandbot(){
        super(Color.black);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * get() => returns y coordinate of robot 
     */
    public void behave(){

        int randomNum = 1 + (int)(Math.random() * 4);
        if(isClearRight()==false){
            randomNum = 1 + (int)(Math.random() * 3);
            if(randomNum==1){
                left();
            }
            else if(randomNum==2){
                down();
            } 
            else if(randomNum==3){
                up();
            }

        }
        else if(isClearLeft()==false){
            randomNum = 1 + (int)(Math.random() * 3);
            if(randomNum==1){
                right();
            }
            else if(randomNum==2){
                down();
            } 
            else if(randomNum==3){
                up();
            }

        }
        else if(isClearUp()==false){
            randomNum = 1 + (int)(Math.random() * 3);
            if(randomNum==1){
                right();
            }
            else if(randomNum==2){
                down();
            } 
            else if(randomNum==3){
                left();
            }
        }
        else if(isClearDown()==false){
            randomNum = 1 + (int)(Math.random() * 3);
            if(randomNum==1){
                right();
            }
            else if(randomNum==2){
                up();
            } 
            else if(randomNum==3){
                left();
            }
        }else{
                if(randomNum==1){
                    left();
                }
                else if(randomNum==2){
                    right();
                } 
                else if(randomNum==3){
                    up();
                }
                else if(randomNum==4){
                    down();
                }

            }
        }
    }
