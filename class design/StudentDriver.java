import javax.swing.JOptionPane;
public class StudentDriver{
    public static void main(String[] args){
  
        Student senior001 = new Student();
        System.out.println(senior001);
        Student junior001 = new Student("ted", "Gibbson", 16 , 0.8);
        System.out.println(junior001);
        JOptionPane.showMessageDialog(null, senior001);
        JOptionPane.showMessageDialog(null, junior001);
    }
}

