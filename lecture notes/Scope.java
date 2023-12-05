import assignments.a6.StdOut;

public class Scope {
    public static int showScope(int x) {
        int y = 100;
        int z = x * y;
        x++;
        StdOut.println(x + " " + y + " " + z);
        return z; //can't go out and look at or access main's variables
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = showScope(a);
        StdOut.println(a + " " + b + " " + c);
    }
}//overload - different return types, 
//differne t argumetn lists, or a combo of both, 
//unqiue signature for each, no ambiguity
//if computer doesn't know which one to use
//overriding is week 10 briefly object orientation, super()? polymorphism/inheritance
//this.______