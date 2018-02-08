public class Person{
    private String name;
    private int age;
    private double height;
    private boolean fat;

    public Person(){
        this.name = "ted";
        this.age = 1134;
        this.height = 180.97;
        this.fat = true;

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Double getHeight(){
        return this.height;
    }

    public boolean getFat(){
        return this.fat;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

    public void setFat(boolean newFat){
        this.fat = newFat;
    }

    //accessors mutators

    public boolean goodHat(boolean inHat){
        boolean looksGood;
        if(inHat == true){
            if(this.height<17.0){
                looksGood = true;
            }else{
                looksGood = false;
            }

        }    else{
            looksGood = false;
        }
        return looksGood;
    }
    
    public void fatDapper(boolean looksgood){
        if(looksgood == true){
            this.fat = this.fat;
        }else{
            this.fat = true;
        }
    }
    
    public String toString(){
        String out = "";
        out+= "Name: " + this.name+ "\n";
        out+= "Age: " +this.age+ "\n";
        out+= "height: "+this.height+ "\n";
        out+= "Fat?: " +this.fat;

        return out;
    }
}
