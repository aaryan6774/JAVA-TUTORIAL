
class Calculator
{
    int a;

    public int add()
    {
        System.out.println("add");
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        calc.add();


    }
}
