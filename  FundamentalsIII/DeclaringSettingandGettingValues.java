import java.util.Arrays;
public class DeclaringSettingandGettingValues
{

    public static void main(){
        int[] intdefault = new int[5];
        int[][] intsquare = new int[5][5];
        String[][] 8x8string = srprinter(8,8);
        double[] doubledefault = new double[5];
        double[][] doublesquare = new double[5][5];
    }

    public static String[][] srprinter(int rows, int cols){
        String[][] newstringar = new String[rows][cols];

        for(int i = 0; i<=rows; i++){
            if(i%2==0){
                for(int j = 0; j<=cols; j++){
                    if(j%2==0){
                        newstringar[i][j] = " ";
                    }else{
                        newstringar[i][j] = "#";
                    }
                }
            }else{
                for(int j = 0; j<=cols; j++){
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
    
    public static String[][] proverload(String[][])
}
