public class ArrayMungerSol
{
    public static void main(String[] args){
        int[] a = {2, 3, 7, 6};
        int[] b = {0, 1, 2, 3, 4, 5};
        int[] r = munge(a, b);
        for(int i: r){
            System.out.println(i);
        }
    }

    /**
     * Write a method that takes 2 integer arrays as arguments.
     * It should return the the array for which the sum of the first, last, and middle values is the greatest.
     * If the sum is equal, it should return an array that contains the sum of the first values, 
     * the sum of the middle values, and the sum of the last values.
     */
    public static int[] munge(int[] arr1, int[] arr2){
        int test1 = arr1[0] + arr1[arr1.length/2] + arr1[arr1.length-1];
        int test2 = arr2[0] + arr2[arr2.length/2] + arr2[arr2.length-1];
        int[] middleValues = new int[3];
        middleValues[0] = arr1[0] + arr2[0];
        middleValues[1] = arr1[arr1.length/2]+arr2[arr2.length/2];
        middleValues[2] = arr1[arr1.length-1] + arr2[arr2.length-1];
        if(test1>test2){
            return arr1;
        }
        else if(test1<test2){
            return arr2;
        }else{
            return middleValues;
        }
    }
}