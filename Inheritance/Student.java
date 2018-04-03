import java.util.*;
public class Student extends Person
{
    private List<String> learnedStuff;
    private double learningAbility;
    public Student(String name, double learningAbility){
        super(name);    
        this.learningAbility = learningAbility;
        this.learnedStuff = new ArrayList<String>();
    }

    public boolean learn(String lesson){
        boolean success = false;
        if(Math.random() > learningAbility){
            System.out.println("here");
            learnedStuff.add(lesson);
            success = true;
        }
        return success;
    }
    
    public boolean learn(Teacher teacher, String lesson){
        return teacher.teach(this, lesson);
    }
    
    public boolean eat(String food){
        boolean success = false;
        if (!food.equals("bananas")){
            setLifeForce(0.1);
        } else {
            setLifeForce(Math.random());
            success = true;
        }
        return success;
    }
    
    
    public String toString(){
        return super.toString() + " I'm a student";
        
    }
    
}
