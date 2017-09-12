
public class underScore
{
    public static String underScorerer(){
        String returnvalue = "";
        int termit=99;
        int count = 0;
        for (count=0;count<termit;count++){
            returnvalue+="underscore("+count+") | " +count;
            
        }
        return returnvalue;
    }
}
