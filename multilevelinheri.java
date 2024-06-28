class A1
{
    public void displayA()
    {
        System.out.println("This is classA");
    }
}
class B1 extends A1 {
    public void displayB() {
        System.out.println("This is classB");
    }
}
class C1 extends B1{
    public void displayC() {
        System.out.println("This is classC");
    }
}
public class multilevelinheri {
    public static void main(String args[])
    {
        C1 obj=new C1();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}