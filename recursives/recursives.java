import java.lang.Math;
public class recursives{
    public static void main(String[] args){
        String gridP = grid(5, 5, "$");
        int mulP = mul(789456,-13);
        int binToDecP = binToDec("1000");
        System.out.println(mulP);
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
        int size = b.length()-1;
        int num = 0;
        int end = 0;
        if(b.charAt(num) == 1){
            if(size == 0){
                end = end*(-1);
            }else{
                
            }
        }
    }

}
