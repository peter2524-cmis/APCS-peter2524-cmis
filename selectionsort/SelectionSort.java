
public class SelectionSort
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
        int i = 0;
        while(i< array.length){
            int place = 0;
            int find = array[i];
            for(int x = i; x < array.length ; x++){

                if(find > array[x]){
                    //                     int spacer = array[x];
                    //                     array[x] = array[i];
                    //                     array[i] = spacer;
                    //                 }
                    find = array[x];
                    place = x;
                } 

            }            
            int spacer = array[place];
            array[x] = array[i];
            array[i] = spacer;
        }

    }
}