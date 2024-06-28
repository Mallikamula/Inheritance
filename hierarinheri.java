 class A
 {
     public void display()
     {
         System.out.println("This is classA");
     }
 }
 class B extends A{
    public void displayB()
    {
        System.out.println("This is classB inherits from classA.");
    }
 }
 class C extends A{
    public void displayC()
    {
        System.out.println("This is class C inherits from classA.");
    }
 }
 class hierarinheri
 {
     public static void main(String[] args)
     {
        B ob=new B();
        ob.display();
        ob.displayB();
        C obj=new C();
        obj.display();
        obj.displayC();
     }
 }