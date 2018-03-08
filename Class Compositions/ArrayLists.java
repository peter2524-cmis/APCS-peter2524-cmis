import java.util.ArrayList; 
public class ArrayLists{
    public static void main(String[] args){
        ArrayList<String> Strings = new ArrayList<String>();
        Strings.add("nubs");
        Strings.add("nubs");
        Strings.add("nubs");
        Strings.add("nubs");
        System.out.println(Strings.size());
        for(int i = 0;i<Strings.size();i++){
            System.out.println(Strings.get(i));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(String s: Strings){
            System.out.println(s);
        }
    }
}
