import java.util.Scanner;
class Human{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }


    public String getName()
    {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
