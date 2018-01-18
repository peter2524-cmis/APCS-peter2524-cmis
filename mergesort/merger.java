public class merger
{
    public static void main(){
        int[] test = {1,2,5,76,4,2,4,5,76,3,2,1,9}; 
        int[] ender = mergesort(test);
        int[][] splitTest = spliter(test);
        int[] mergeTest = sort(splitTest[0],splitTest[1]);
        int[] splitTest2 = splitTest[1];
        printArray(ender);
    }

    public static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }        
        else{
            int[][] arrs = spliter(arr);
            int[] arr1 = arrs[0];
            //System.out.println(arr1[0]+"\n");
            int[] arr2 = arrs[1];
            //System.out.println(arr2[0]);
            mergesort(arr1);
            mergesort(arr2);
            return sort(arr1,arr2);
        }
    }

    public static int[][] spliter(int[] arr){
        int backer;
        int fronter = arr.length/2;
        if(arr.length%2 == 0){
            backer = arr.length/2;
        }else{
            backer = arr.length/2+1;
        }
        int[] front = new int[fronter];
        int[] back = new int[backer];
        int backer2 = front.length;

        for(int x = 0; x<front.length;x++){
            front[x] = arr[x];

        }
        int count = 0;
        for(int y = backer2; y<arr.length;y++,count ++){
            back[count] = arr[y];

        }
        int[][] arrs = new int[][]{front,back}; 
        return arrs;
    }

    public static int[] sort(int[] a, int[] b){
        int v1 = 0;
        int v2 = 0;
        int[] merged = new int[a.length+b.length];
        for(int c = 0;c<merged.length;c++){
            if((v1<a.length) && (v2<b.length)){
                if(a[v1]<b[v2]){
                    merged[c] = a[v1];
                    v1 = v1+1;
                }else if(a[v1]>b[v2]){
                    merged[c] = b[v2];
                    v2 = v2+1;
                }else{
                    merged[c] = b[v2];
                    v2 = v2+1;
                }
            }else if((v1==a.length) && (v2<b.length)){
                merged[c] = b[v2];
                v2 = v2+1;
            }else if((v1<a.length) && (v2==b.length)){
                merged[c] = a[v1];
                v1 = v1+1;
            }else{
                merged[c] = a[v1];
                v1 = v1+1;
            }

        }
        return merged;
    }

    public static void printArray(int array[]){
        for(int x = 0; x< array.length;x++){
            System.out.println(array[x]);

        }
    }
}

