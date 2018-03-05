public class Roster{
    private Student[] roster = new Student[3];
    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public Roster(){
        for(int x = 0; x< roster.length; x++){
            roster[x] = new Student();
        }
    }

    public Roster(String x){
        for(int x = 0; x<roster.length; x++){
            String fname = getSaltString();
            String lname = getSaltString();
            Student(fname,lname, int age, double height, double eng,
            double math , double sci, double fArts, double socsci )
        }
    }
}
