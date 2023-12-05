package recitations.rec10;

public class PersonTest {
    public static void main(String[] args){
        Person bruno = new Person("Bruno");
        Person beyonce = new Person("Beyonce", 40);

        if(bruno.getAge()==0){
            System.out.println("passed getAge");
        }
        bruno.birthday();
        bruno.birthday();
        if(bruno.getAge()==2){
            System.out.println("passed birthday");
        }

        if(beyonce.getAge()==40){
            System.out.println("passed overload");
        }

        System.out.println(bruno.toString());
        if((bruno.toString()).equals("Bruno is 2 years old")){
            System.out.println("passed toString");
        }
    }
}