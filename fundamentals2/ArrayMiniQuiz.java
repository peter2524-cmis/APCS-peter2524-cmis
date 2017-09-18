import java.util.Arrays;  
public class ArrayMiniQuiz
{
    public static void main(String[] args){
        int[] a1 = {2, 4, 6, 8, 10, 12};
        int[] a2 = new int[5];

        a2[0] = a1[a1.length - 1];
        a2[1] = a1[a1.length - a1[0]];
        a2[a1[1]] = a1[a2[a1[1]]];
        a2[a2[a2.length - 1]] = a1[a1[1]];
        a2[a1[1] - 1] = a1[1] - a2[a2.length - 1];
        System.out.println(Arrays.toString(a2));
    }
}