import java.util.Arrays;
import java.util.Random;
public class CreatingAndLooping
{

    static int[] IntTestArray =new int[] {1,2,3,4,6,7,8,9,12,231,4,457,456};
    public static void main(String[] args){
        int[] intArray =new int[] {4689, 2756465, 8723657, 834765, 2};
        double[] dubArray =new double[] {46.89, 5887.9, 32.6, 69.69, 45.3};
        String[] strArray = new String[] {"Gut","gfkjfg", "fjdgh", "hgbf" ,"p"};
        System.out.println("int one is:"+intArray[0]);
        System.out.println("double three is:"+dubArray[2]);
        System.out.println("string five is:"+strArray[4]);
    }

    public static void printArray(int array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(char array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(boolean array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(long array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(short array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(float array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(byte array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(double array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static void printArray(String array[], boolean skip){

        int termit = array.length;
        int x=0;
        while(x!=termit){
            if (skip==false ){

                System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]); 
            }
            else if (skip== true){
                if (x%2==0){
                    System.out.println("the "+x+"st Value of "+Arrays.toString(array)+" is "+array[x]);
                }
                else if(x%2!=0){
                    System.out.println("\n");
                }
            }
            x++;
        }

    }

    public static int lastItem(int array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static boolean lastItem(boolean array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static char lastItem(char array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static short lastItem(short array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static long lastItem(long array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static double lastItem(double array[]){
        int last = array.length - 1;
        return (array[last]);
    }

    public static boolean middleItem(boolean array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static short middleItem(short array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static byte middleItem(byte array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static int middleItem(int array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static char middleItem(char array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static float middleItem(float array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static double middleItem(double array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static long middleItem(long array[]){
        int oddEven = array.length%2;
        int midp1 = array.length;
        int midp2 = oddEven;
        if (oddEven == 1){
            midp2+=1;
        }
        return array[midp2];
    } 

    public static int[] randomInts(int count, int min, int max){
        Random rand = new Random();
        int[] randomIntsArray = new int[count];
        randomIntsArray[0] = rand.nextInt(max)+min;
        for(int start=1;start<randomIntsArray.length;start++){            
            randomIntsArray[start]= rand.nextInt(max)+min;
        }
        return randomIntsArray;
    }

    public static double[] randomDoubles(int count, double min, double max){
        Random rand = new Random();
        double[] randomDoubles = new double[count];
        double first = -min + rand.nextDouble() * max; 
        for(int start=1;start<count;start++){
            double rando = new Random().nextDouble();
            randomDoubles[start] = rando;
        }
        return randomDoubles;
    }

    public static boolean[] copy(boolean[] array){
        boolean[] copy = new boolean[array.length];
        for (int i = 0; i<=array.length;i++){
            
        }
    }
}

