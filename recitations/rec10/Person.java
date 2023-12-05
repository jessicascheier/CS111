package recitations.rec10;

public class Person {
    //instance variables
    private int age;
    private String name;
    //constructors
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    //methods
    public int getAge() {
        return this.age;
    }
    public void birthday() {
        this.age+=1;
    }
    public String toString() {
        return this.name + " is " + this.age + " years old";
    }
    //main
    public static void main(String[] args) {

    }
}