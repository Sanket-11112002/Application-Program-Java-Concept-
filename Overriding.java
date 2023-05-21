class Base
{
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
    public void gun()
    {
        System.out.println("Inside Base gun");
    }
    public void sun()
    {
        System.out.println("Inside Base sun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside Derived Fun");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
    public void run()
    {
        System.out.println("Inside Derived sun");
    }
}

class Overriding
{
    public static void main(String Arg[])
    {
        Base obj = new Derived();              // Upcasting

        obj.fun();  // Derived fun
        obj.gun();  // Derived gun
        obj.sun();  // Base sun
        // obj.run  // Error

    }
}