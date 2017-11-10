/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        boolean test = false;        
        while( !test){
            test = true;
            for(int i=0, j=1 ; j < array.length; i++, j++){
                    if(array[i] > array[j]){
                        test = false;
                        int spacer = array[i];
                        array[i] = array[j];
                        array[j] = spacer;
                    }
                }
            }
        }
    }