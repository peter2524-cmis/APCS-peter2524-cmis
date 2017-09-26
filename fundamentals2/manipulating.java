import java.util.Arrays;
public class manipulating
{
    public static void main(){
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        int[] b = {4,5,6,7,9,3,2,1,5,6};
        int[] test = merge(a,b);

        CreatingAndLooping.printArray(test,false);
    }

    public static int[] concat(int[] a, int[] b){
        int[] concat = new int[a.length+b.length];
        for(int i = 0; i<= concat.length; i++){
            if (i>(a.length-1)){
                concat[i] =  b[(i-a.length)];
            }
            else{
                concat[i] = a[i];
            }            
        }
        return concat;
    }

    public static int[] merge(int[] a, int[] b){
        int[] merge = new int[a.length+b.length];
        int alt = 0;
        merge[0] = a[0];
        for(int i =1;i<= merge.length+1; i++){
            if (i%2==1){                                               
                alt +=1;
                merge[i]= a[alt];
            }
            else{
                merge[i] = b[alt];
            }
        }
        return merge;
    }
    public static void reverse(int[] array){
        int[] stock = array;
    }

}

