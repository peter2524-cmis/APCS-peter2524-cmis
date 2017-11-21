public class InsertionSort
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
        for(int row = 1; row<array.length; row ++){
            for(int i = row; i>0; i--){
                if(array[i]<array[i-1]){
                    int holder = array[i];
                    array[i] = array[i-1];
                    array[i-1] = holder;
                }
                
            }
        }
    }
    
}