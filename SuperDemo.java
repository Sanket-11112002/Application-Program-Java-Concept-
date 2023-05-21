class Base
{
    public int A;
    public Base()
    {
        System.out.println("Inside Base Default Constructor:");
        this.A = 11;
    }
    public Base(int i)
    {
        System.out.println("Inside Base Parameterised Constructor:");
        this.A = i;
    }
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base                   // class Derived : public Base in C++
{
    public int A;
    public Derived()
    {
        super(11);
        System.out.println("Inside Derived Constructor:");
        this.A = 51;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");

        System.out.println("Value of A :"+A);      // 51
        System.out.println("Value of A :"+this.A);      // 51
        System.out.println("Value of A :"+super.A);      // 11

        fun();
    }
}
class SuperDemo
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();             // no casting

        dobj.gun();

    }
}

// 1. Access data of parent from child
// 2. call method of parent from child
// 3. call constructor of parent from child

// Base bobj = new Base();        // no casting
// Base bobj1 = new Derived();    // upcasting
// Derived dobj = new Base();     // downcasting
