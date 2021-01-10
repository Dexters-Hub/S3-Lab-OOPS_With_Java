class A{
    void displayA() {
        System.out.println("This is Parent class");
    }
}
class B extends A{
    void displayB() {
        System.out.println("This is Child class");
    }
}
public class exampleOfInheritance {
    public static void main(String[] args) {

        A ob1 = new A();
        ob1.displayA();

        B ob2 = new B();
        ob2.displayB();

        ob2.displayA();
    }
}