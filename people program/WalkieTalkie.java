import java.util.JOptionPane;
public class WalkieTalkie extends MyDevice{
    private int juice;
    private double kgs;
    private double rangeInMs;
    private int channels;
    public WalkieTalkie(String name,String color,double kgs,double rangeInMs,int channels){
        super.setName(name);
        super.setColor(color);
        this.kgs = kgs;
        this.rangeInMs = rangeInMs;
        this.channels = channels;
    }
    
    public void charge(){
        if(juice<91){
            juice+=10;
        }else{
            int newCharge = 100-juice;
            juice+=newCharge;
        }
    }
    
    public String useMe(){
    }
}
