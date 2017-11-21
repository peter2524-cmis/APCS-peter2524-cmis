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
        for(int i = 0; i<array.length; i++){
            int find = i;
            int low = array[i];
            for(int j = i; j <array.length; j++){
                if(array[j]<low){
                    low = array[j];
                    find = j;
                }
            }
            int hold = array[i];
            array[i] = array[find];
            array[find] = hold;
            find = i;
        }

    }

}