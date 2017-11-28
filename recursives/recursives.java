import java.lang.Math;
public class recursives{
    public static void main(String[] args){
        String gridP = grid(5, 5, "$");
        int mulP = mul(789456,-13);
        int binToDecP = binToDec("101111001");
        System.out.println(binToDecP);
    }

    public static String grid(int w, int h, String symbol){
        int wh = w;
        if( h == 0 ){
            return "";
        }else{
            if(w==0){
                w = wh;
                return "\n"+symbol+grid(w,h-1,symbol);
            }else{
                return symbol+grid(w-1,h,symbol);
            }
        }
    }

    public static int mul(int a, int b){
        if(b==0){
            return 0;
        }else{
            if(b>0){
                return a+mul(a,b-1);
            }else{
                a = (-a);
                b = (-b);
                return mul(a,b);
            }
        }
    }

    public static int binToDec(String b){  
        int len = b.length();       
        String now = b.substring(0,1);
        String later = b.substring(1);      
        if(len == 0){
            return 0;
        }

        return Integer.parseInt(now) * (int)Math.pow(2, len-1) + binToDec(later);
    }
}