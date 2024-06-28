interface Ai
{
    void displayA();
}
interface Bi
{
    void displayB();
}
interface Ci{
    void displayC();
}
class Student implements Ai,Bi,Ci{
    public void displayA()
    {
        System.out.println("A");
    }
    public void displayB()
    {
        System.out.println("B");
    }
    public void displayC()
    {
        System.out.println("C");
    }
}
public class Multipleinheri
{
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}
