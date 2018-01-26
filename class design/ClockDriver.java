import javax.swing.JOptionPane;
public class ClockDriver{
    public static void main(String[] args){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        int hours = Integer.parseInt(JOptionPane.showInputDialog("what hour is it"));
        int mins = Integer.parseInt(JOptionPane.showInputDialog("What minute is it"));
        int secs = Integer.parseInt(JOptionPane.showInputDialog("What second is it"));
        Clock BedroomClock = new Clock(hours,mins,secs);
        System.out.println(BedroomClock);
    }
}
