
public class SuitOfArmour
{
    public static void main(String[] args){
        Helmet s = new Helmet();
        System.out.println(s);
        s.type = "salet";
        s.size = 3;
        s.strength = 3.4;
        s.frilled = true;
        System.out.println(s.type);
        System.out.println(s.size);
        System.out.println(s.strength);
        System.out.println("is it frilled? " + s.frilled);
        System.out.println("\n");
        Helmet h = new Helmet();
        System.out.println(h);
        System.out.println(h.type);
        System.out.println(h.size);
        System.out.println(h.strength);
        System.out.println(h.frilled);
    }
}
