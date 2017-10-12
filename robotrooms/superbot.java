import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class superbot extends Robot
{
    public superbot(){
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
     * getY() => returns y coordinate of robot 
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        if(getData(0) == 0){
            if(getX()> 2){
                left();
            }
            else if(getX()< 2){
                right();
            }
            else{
                setData(0,1);
            }
        }
        else if(getData(0) == 1){
            if(getY()> 2){
                up();
            }
            else if(getY()< 2){
                down();
            }
            else{
                setData(0,2);
            }
        }
        else if(getData(0) == 2){
            if(isClearRight()== true){
                
            right();            
        }
   }
}
   
