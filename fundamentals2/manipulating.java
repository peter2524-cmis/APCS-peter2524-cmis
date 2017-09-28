import java.util.Arrays;
public class manipulating
{
    public static void main(){
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
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
        int count = 0;
        if(a.length>b.length){
            for(int i=0;i<=(b.length-1);i+=2,alt++){
                System.out.println(i);
                merge[i] = a[i];
                merge[i+1] = b[i];
            }
            for(int i=b.length-1;i<=a.length-1;i++){
                merge[i] = a[i];
            }

        }
        else if(a.length<b.length){
            for(int i=0;i<=(a.length-1);i+=2,alt++){
                merge[i] = a[i];
                merge[i+1] = b[i];
            }
            for(int i=a.length-1;i<=b.length-1;i++){
                merge[i] = a[i];
            }

        }else{
            for(int i=0;i<=b.length-1;i+=2,alt++,count++){
                System.out.println(i);
                if(count%2==0){
                    merge[i] = a[i];
                    merge[i+1] = b[i];
                }else{
                    merge[i] = a[i-1];
                    merge[i+1] = b[i];
                }
                
            }
        }
        return merge;
    }

    public static void reverse(int[] array){
        int[] stock = array;
        for(int i=0;i<=stock.length;i++){
            array[i] = stock[-(i+1)];
        }
    }

    public static int[] subArray(int[] array, int start, int stop){
        int[] subarray = new int[(stop)-(start)];
        for(int i=start;i<=stop;i++){
            subarray[i] = array[i];
        }
        return subarray;
    }

    public static int[] compareArrays(int[] a, int[] b){
        int ar1 = a.length;
        int ar2 = b.length;
        int i;
        int apoints = 0;
        int bpoints = 0;
        if(ar1>ar2){
            for(i=0;i<=ar2-1;i++){
                if(a[i]>b[i]){
                    apoints += 1;
                }
                else if(a[i]<b[i]){
                    bpoints += 1;
                }else{

                }

            }
            apoints += (ar2-1) - ar1;
            if(apoints>bpoints){
                return a;
            }
            else if(apoints<bpoints){
                return b;
            }else{
                return a;
            }
        }
        else if(ar1<ar2){
            for(i=0;i<=ar1-1;i++){
                if(a[i]>b[i]){
                    apoints += 1;
                }
                else if(a[i]<b[i]){
                    bpoints += 1;
                }else{

                }

            }
            bpoints += (ar1-1) - ar2;
            if(apoints>bpoints){
                return a;
            }
            else if(apoints<bpoints){
                return b;
            }else{
                return b;
            }
        }else{
            for(i=0;i<=ar1-1;i++){
                if(a[i]>b[i]){
                    apoints += 1;
                }
                else if(a[i]<b[i]){
                    bpoints += 1;
                }else{

                }
            }
            if(apoints>bpoints){
                return a;
            }
            else if(apoints<bpoints){
                return b;
            }else{
                return a;
            }
        }

    }

    public static int[] minimize(int[] array, int threshold){
        int[] minimized = new int[array.length];
        for(int i=0;i<=array.length;i++){
            if (array[i] > threshold){
                minimized[i] = threshold;
            }else{
                minimized[i] = array[i];
            }
        }
        return minimized;
    }

    public static void maximize(int[] array, int threshold){
        int[] maximized = new int[array.length];
        for(int i=0;i<=array.length;i++){
            if (array[i] < threshold){
                maximized[i] = threshold;
            }else{
                maximized[i] = array[i];
            }
        }
    }

    public static double[] maxMerge(double[] a, double[] b){
        int ar1 = a.length;
        int ar2 = b.length;
        int i;
        if(ar1>ar2){
            double[] greaters = new double[ar1];
            for(i=0;i<=ar2-1;i++){
                if(b[i]>a[i]){
                    greaters[i] = b[i];
                }else{
                    greaters[i] = a[i];
                }
            }
            for(i=ar2-1;i<=ar1-1;i++){
                greaters[i] = a[i];
            }
            return greaters;
        }
        else if(ar1<ar2){
            double[] greaters = new double[ar2];
            for(i=0;i<=ar1-1;i++){
                if(b[i]>a[i]){
                    greaters[i] = b[i];
                }else{
                    greaters[i] = a[i];
                }
            }
            for(i=ar1-1;i<=ar2-1;i++){
                greaters[i] = a[i];
            }
            return greaters;
        }else{
            double[] greaters = new double[ar2];
            for(i=0;i<=ar1-1;i++){
                if(b[i]>a[i]){
                    greaters[i] = b[i];
                }else{
                    greaters[i] = a[i];
                }
            }
            return greaters;
        }
    }

}
