import javax.swing.JOptionPane; 
public class SongDriver{
    public static void main(String[] args){
        Song song1 = new Song();
        System.out.println(song1);
        Song song2 = new Song("Hatred Copter", 110, 176, 2006);
        System.out.println(song2);
        String newYear = JOptionPane.showInputDialog("what year was the song released in");
        int result = Integer.parseInt(newYear);
        song1.setYearReleased(result);
        JOptionPane.showMessageDialog(null,"the year is"+song1.getYearReleased());
    }
}