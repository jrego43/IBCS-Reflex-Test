package compsciia;

import compsciia.*;
import static java.lang.Float.parseFloat;
import java.util.*;

public class Person {
    
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private float reactionTime;
    
    public Person() {
        firstName = "John";
        lastName = "Doe";
        gender = "Male";
        age = "50";
        reactionTime = -1;
    }
    
    public Person(String dataLine) {
        int i = 0;
        firstName = dataLine.substring(i, dataLine.indexOf(" ", i));
        i = dataLine.indexOf(" ", i) + 1;
        lastName = dataLine.substring(i, dataLine.indexOf(" ", i));
        i = dataLine.indexOf(" ", i) + 1;
        gender = dataLine.substring(i, dataLine.indexOf(" ", i));
        i = dataLine.indexOf(" ", i) + 1;
        age = dataLine.substring(i, dataLine.indexOf(" ", i));
        i = dataLine.indexOf(" ", i) + 1;
        reactionTime = parseFloat(dataLine.substring(i, dataLine.indexOf(" ", i)));
    }
    
    public Person(String f, String l, String g, String a) {
        firstName = f;
        lastName = l;
        gender = g;
        age = a;
        reactionTime = -1;
    }
    
    public String getFName() {
        return firstName;
    }
    
    public String getLName() {
        return lastName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getAge() {
        return age;
    }
    
    public float getReactionTime() {
        return reactionTime;
    }
    
    public void setReactionTime(float f) {
        reactionTime = f;
    }
    
    public String getData() {
        String line = firstName + " " + lastName + " " + gender + " " + age + " " + reactionTime + " ";
        return line;
    }
    
    public void printInfo() {
        System.out.println(this.getData());
    }
    
}
