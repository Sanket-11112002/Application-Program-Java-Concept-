/* 
class Object
{
    // Code
}
*/

class Demo                          // class Demo extends Object
{
    public int Addition(int A, int B)
    {
        return A+B;
    }
    public int Addition(int A, int B, int C)
    {
        return A+B+C;
    }
    public double Addition(double A, double B)
    {
        return A+B;
    }
    public double Addition(double A, double B, double C)
    {
        return A+B+C;
    }
}

class Overloading
{
    public static void main(String Arg[])
    {
    Demo bobj = new Demo();

    int A = 10, B = 20, C = 40, iRet = 0;
    double i = 10.22 , j = 20.21, k = 5.3, dRet = 0.0;

    iRet = bobj.Addition(A,B);   // CALL 10
    System.out.println(iRet);

    iRet = bobj.Addition(A,B,C);   // CALL 14
    System.out.println(iRet);

    dRet = bobj.Addition(i,j);   // CALL 18
    System.out.println(dRet);

    dRet = bobj.Addition(i,j,C);   // CALL 22
    System.out.println(dRet);
    }
}