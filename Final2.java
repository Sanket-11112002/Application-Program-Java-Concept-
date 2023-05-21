class Base
{
    public void fun()
    {
        System.out.println("Base Fun");
    }

    final public void gun()
    {
        System.out.println("Base Gun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived Fun");
    }
 /*   public void gun()
    {
        System.out.println("Derived Gun");
    }
    */
}

class Final2
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived();

        bobj.fun();    // Derived Fun
        bobj.gun();   // Base Gun
    }
}