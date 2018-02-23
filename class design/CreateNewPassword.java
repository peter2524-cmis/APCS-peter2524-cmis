import javax.swing.JOptionPane;
public class CreateNewPassword{
    public static void main(String[] args){
        String password = JOptionPane.showInputDialog("give me a new pasword");
    }

    public String generator(String pass){
        boolean weirdtest = false;
        for(int x = 0; x<pass.length();x++){
            if((pass.substring(x,(x+1)) == "+") || (pass.substring(x,(x+1)) == "-") || (pass.substring(x,(x+1)) == "*") || (pass.substring(x,(x+1)) == "/")){
                weirdtest = true;
            }
        }

        if((pass.length()>6)&&(weirdtest == true)){
            return pass;
        }else{
            String password = JOptionPane.showInputDialog("give me a new pasword");
            return generator(password);
        }
    }
}
