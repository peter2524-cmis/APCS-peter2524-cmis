import javax.swing.JOptionPane;
public class WalkieTalkie extends MyDevice{
    private int juice;
    private double kgs;
    private double rangeInMs;
    private int channels;
    public WalkieTalkie(String name,String color,double kgs,double rangeInMs,int channels){
        super(name,color);
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
        String said = JOptionPane.showInputDialog("What will you say?");
        return said;
    }
    
    public String toString(){
        String out="";
        out+="this device is a walkie talkie and \n";
        out+=super.toString();
        out+="it weighs "+kgs+" Kilograms \n";
        out+="It has a range of "+rangeInMs+" metres \n";
        out+="and it has "+channels+" channels \n";
        return out;
    }
}
