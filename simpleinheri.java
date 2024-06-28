class E
{
    public void displayA()
    {
        System.out.println("This is parent Class");
        }
    }
    class F extends E {
        public void displayB() {
            System.out.println("This is child class");
        }
    }
    class simpleinheritance {
    public static void main(String args[])
    {
        F obj=new F();
        obj.displayA();
        obj.displayB();
    }
}
