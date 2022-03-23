package E07ObjectsAndClasses.P07OrderByAge;

import com.sun.source.tree.BreakTree;

public class PersonInfo {
    private String name;
    private String ID;
    private int age;

    public PersonInfo(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return this.getName() + " with ID: " + this.getID() + " is " + this.getAge() + " years old.";
    }

}
