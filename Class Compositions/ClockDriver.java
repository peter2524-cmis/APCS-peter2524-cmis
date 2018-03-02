import javax.swing.JOptionPane;
public class ClockDriver{
    public static void main(String[] args){
        ClockStore cs1 = new ClockStore();
        Clock[] clocks = new Clock[3];
        for(int x = 0; x<clocks.length; x++){
            int hours = Integer.parseInt(JOptionPane.showInputDialog("what hour is it"));
            int mins = Integer.parseInt(JOptionPane.showInputDialog("What minute is it"));
            int secs = Integer.parseInt(JOptionPane.showInputDialog("What second is it"));
            clocks[x] = new Clock(hours,mins,secs);
        }
        ClockStore Timelysollutions = new ClockStore(clocks,"Timely Sollutions");
    }
}
