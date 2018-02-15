import javax.swing.JOptionPane;
public class StudentDriver{
    public static void main(String[] args){

        Student senior001 = new Student();
        System.out.println(senior001);
        Student junior001 = new Student("ted", "Gibbson", 16 , 0.8 , 4.0, 4.0, 4.0, 4.0, 4.0);
        System.out.println(junior001);
        JOptionPane.showMessageDialog(null, senior001);
        JOptionPane.showMessageDialog(null, junior001);        
        Student joe = new Student();
        System.out.println(joe);
        double eng = Double.parseDouble(JOptionPane.showInputDialog("what is his english grade"));
        double math = Double.parseDouble(JOptionPane.showInputDialog("what is his math grade"));
        double sci = Double.parseDouble(JOptionPane.showInputDialog("what is his science grade"));
        double fArts = Double.parseDouble(JOptionPane.showInputDialog("what is his Fine arts grade"));
        double socSci = Double.parseDouble(JOptionPane.showInputDialog("what is his social science grade"));
        joe.setGPA(eng,math,sci,fArts,socSci);
        System.out.println(joe);
    }
}

