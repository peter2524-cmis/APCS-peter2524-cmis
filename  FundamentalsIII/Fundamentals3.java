import java.util.Arrays;
import java.util.Random;
public class Fundamentals3
{

    //Declaring, Setting and Getting Values

    public static void main(){
        int[] intdefault = new int[5];
        int[][] intsquare = new int[5][5];
        int[][] testIntsquare =new int[][] {
                {0,1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19},
                {20,21,22,23,24}};
        String[][] stringeighter = srprinter(8,8);
        double[] doubledefault = new double[5];
        double[][] doublesquare = new double[5][5];
        print2DArray(testIntsquare, false);
        //snakePrint(testIntsquare);
    }

    public static String[][] srprinter(int rows, int cols){
        String[][] newstringar = new String[rows][cols];

        for(int i = 0; i<=rows-1; i++){
            if(i%2==0){
                for(int j = 0; j<=cols-1; j++){
                    if(j%2==0){
                        newstringar[i][j] = " ";
                    }else{
                        newstringar[i][j] = "#";
                    }
                }
            }else{
                for(int j = 0; j<=cols-1; j++){
                    if(j%2==1){
                        newstringar[i][j] = " ";
                    }else{
                        newstringar[i][j] = "#";
                    }
                }
            }
        }
        return newstringar;
    }

    public static void setValue(String[][] arr, int r, int c, String v){
        for(int i = 0; i<=(arr.length-1); i++){
            for(int j = 0; j<=(arr[0].length-1); j++){
                if(i == r && j == c){
                    arr[i][j] = v;
                }else{
                }
            }
        }

    }

    public static void setValue(int[][] arr, int r, int c, int v){
        for(int i = 0; i<=(arr.length-1); i++){
            for(int j = 0; j<=(arr[0].length-1); j++){
                if(i == r && j == c){
                    arr[i][j] = v;
                }else{
                }
            }
        }

    }

    public static void setValue(double[][] arr, int r, int c, double v){
        for(int i = 0; i<=(arr.length-1); i++){
            for(int j = 0; j<=(arr[0].length-1); j++){
                if(i == r && j == c){
                    arr[i][j] = v;
                }else{
                }
            }
        }

    }

    //Traversing

    public static void initializeArray(int[][] array, int value){
        for(int i = 0; i<=(array.length-1); i++){
            for(int j = 0; j<=(array[0].length-1); j++){
                array[i][j] = value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value){
        for(int i = 0; i<=(array.length-1); i++){
            for(int j = 0; j<=(array[0].length-1); j++){
                array[i][j] = value;
            }
        }
    }

    public static void initializeArray(double[][] array, double value){
        for(int i = 0; i<=(array.length-1); i++){
            for(int j = 0; j<=(array[0].length-1); j++){
                array[i][j] = value;
            }
        }
    }

    public static void initializeIntArray(String[][] array, String value){
        for(int i = 0; i<=(array.length-1); i++){
            for(int j = 0; j<=(array[0].length-1); j++){
                array[i][j] = value;
            }
        }
    }

    public static void print2DArray(int[][] array, boolean rowMajor){
        String printed = "";
        if(rowMajor == true){
            for(int i = 0; i<=(array.length-1); i++){                
                for(int j = 0; j<=(array[0].length-1); j++){
                    printed+=(Integer.toString(array[i][j])+",");
                }
                printed+=("\n");
            }
            System.out.println(printed);
        }else{
            if(rowMajor == false){
                for(int i = 0; i<=(array.length-1); i++){                
                    for(int j = 0; j<=(array[0].length-1); j++){
                        printed+=(Integer.toString(array[j][i])+",");
                    }
                    printed+=("\n");
                }
                System.out.println(printed);
            }
        }
    }

    public static void print2DArray(double[][] array, boolean rowMajor){
        String printed = "";
        if(rowMajor == true){
            for(int i = 0; i<=(array.length-1); i++){                
                for(int j = 0; j<=(array[0].length-1); j++){
                    printed+=(Double.toString(array[i][j])+",");
                }
                printed+=("\n");
            }
            System.out.println(printed);
        }else{
            if(rowMajor == false){
                for(int i = 0; i<=(array[0].length-1); i++){                
                    for(int j = 0; j<=(array[0].length-1); j++){
                        printed+=(Double.toString(array[j][i])+",");
                    }
                    printed+=("\n");
                }
                System.out.println(printed);
            }
        }
    }

    public static void print2DArray(boolean[][] array, boolean rowMajor){
        String printed = "";
        if(rowMajor == true){
            for(int i = 0; i<=(array[0].length-1); i++){                
                for(int j = 0; j<=(array[0].length-1); j++){
                    printed+=(Boolean.toString(array[i][j])+",");
                }
                printed+=("\n");
            }
            System.out.println(printed);
        }else{
            if(rowMajor == false){
                for(int i = 0; i<=(array[0].length-1); i++){                
                    for(int j = 0; j<=(array[0].length-1); j++){
                        printed+=(Boolean.toString(array[j][i])+",");
                    }
                    printed+=("\n");
                }
            }
            System.out.println(printed);
        }
    }

    public static void print2DArray(String[][] array, boolean rowMajor){
        String printed = "";
        if(rowMajor == true){
            for(int i = 0; i<=(array[0].length-1); i++){                
                for(int j = 0; j<=(array[0].length-1); j++){
                    printed+=((array[i][j])+",");
                }
                printed+=("\n");
            }
            System.out.println(printed);
        }else{
            if(rowMajor == false){
                for(int i = 0; i<=(array[0].length-1); i++){                
                    for(int j = 0; j<=(array[0].length-1); j++){
                        printed+=((array[j][i])+",");
                    }
                    printed+=("\n");
                }
                System.out.println(printed);
            }
        }
    }

    public static void snakePrint(int[][] arr){
        String printed = "";
        int alternater = 0;
        for(int i = 0; i<=(arr.length-1);i++){
            if(alternater%2 == 0){
                for(int j = 0; j<=(arr[0].length-1); j++){
                    printed+=(Integer.toString(arr[i][j])+",");
                }
            }else{
                for(int j = (arr[0].length-1); j>=0; j--){
                    printed+=(Integer.toString(arr[i][j])+",");
                }
            }
            alternater+=1;
        }
        System.out.println(printed);
    }

    //modifying

    public static String[][] locate(String[][] arr){
        Random rando = new Random();
        int randr = rando.nextInt(arr.length-1)+0;
        int randc = rando.nextInt(arr[0].length-1)+0;
        int randn = rando.nextInt(9)+0;
        if(arr[randr][randc]==" "){
            if(randc==arr[0].length-1){
                randc-=1;
                arr[randr][randc] = Integer.toString(randn);
                return arr;
            }else{
                randc+=1;
                arr[randr][randc] = Integer.toString(randn);
                return arr;
            }
        }else{arr[randr][randc] = Integer.toString(randn);
            return arr;
        }
    }

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for(int i = 0; i<=(array.length-1);i++){
            for(int j = 0; j<=(array[0].length-1);i++){
                if(array[i][j]==threshold){
                    array[i][j]=newValue;
                }
            }
        }            
        return array;
    }

    public static double[][] shift(double[][] arr, int row){
        double[][] nud = arr;
        for(int i = 0; i<=(arr.length-1);i++){            
            if( i > row ){                               
                nud[i] = arr[i-1];
            }else if(i==row){
                for(int j = 0; j<=(arr[0].length-1);j++){
                    double start = 0;
                    double end = 10;
                    double random = new Random().nextDouble();
                    double result = start + (random * (end - start));
                    nud[i][j] = result;
                }
            }else{
                nud[i] = arr[i];
            }
        }
        return nud;
    }

    public static double[][] rotate(double[][] arr){
        for(int i = 0; i<=(arr.length-1); i++){                
            for(int j = 0; j<=(arr[0].length-1); j++){
                arr[i][j]=arr[j][i];
            }
        }
        return arr;
    }

    public static boolean[][] analyze(double[][] array, double threshold){
        boolean[][] newarray = new boolean[array.length][array[0].length];
        for(int i = 0; i<=(array.length-1); i++){                
            for(int j = 0; j<=(array[0].length-1); j++){
                if(array[i][j]>=threshold){
                    newarray[i][j] = true;               
                }else{
                    newarray[i][j] = false;
                }
            }
        }
        return newarray;
    }

}