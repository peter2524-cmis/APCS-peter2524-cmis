public class FundamentalsIIIQuiz
{
    public static void main(String[] args){
        int[][] scores1 = new int[10][10];
        for(int y = 0; y < scores1.length; y++){
            for(int x = 0; x < scores1[0].length; x++){
                if(Math.random() > 0.95){
                    scores1[y][x] = 1;
                }else{
                    scores1[y][x] = 0;
                }
            }
        }
        int[][] scores2 = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            };

        System.out.println("Test 1\n======");
        printArray(scores1);
        crossOut(scores1);
        printArray(scores1);

        System.out.println("Test 2\n======");
        printArray(scores2);
        crossOut(scores2);
        printArray(scores2);
    }

    public static void printArray(int[][] array){
        System.out.print("{");
        for(int r = 0; r < array.length; r++){
            int[] row = array[r];
            System.out.print("{");
            for(int c = 0; c < row.length;c++){
                System.out.print(row[c] + (c < row.length-1 ? ", " : ""));
            }
            System.out.print("}"+(r < array.length-1 ? ",\n" : ""));
        }

        System.out.println("}\n");            
    }

    /**
     * For each column that contains a 1, replace every value in that column with 1.
     * For each row that contains a 1, replace every value in that row with 1.
     * 
     * Sample out put from call to main(); Note: Array from Test 1 contains random values.
    Test 1
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}
    After
    -----
    {{0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 1, 0, 0, 1, 0, 0, 0, 1, 0}}
    Test 2
    ======
    Before
    ------
    {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}
    After
    -----
    {{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}}
     */
    public static void crossOut(int[][] array){
        int [][] databox = array;
        for(int y = 0; y<  array.length; y++){
            for(int x = 0; x<array[0].length;x++){
                if(array[y][x] == 1){
                    for(int i = 0; i<databox.length; i++){
                        for(int j = 0; j<databox.length; j++){
                            if(i == y){
                                databox[i][j] = 1;
                            }                 
                        }
                    }
                    for(int i = 0; i<databox.length; i++){
                        for(int j = 0; j<databox.length; j++){
                            if(j == x){
                                databox[i][j] = 1;
                            }
                        }
                    }
                }else{
                }

            }
        }

        array = databox;

    }
}