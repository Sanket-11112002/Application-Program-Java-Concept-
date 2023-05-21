import Marvellous.Arithematic;
import Marvellous.Mathematics;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithematic aobj = new Arithematic();
        Mathematics mobj = new Mathematics();

        int iRet = 0;

        iRet = aobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);

        iRet = aobj.Addition(10,11);
        System.out.println("Substraction is : "+iRet);

        iRet = mobj.Square(10);
        System.out.println("Square is : "+iRet);

        iRet = mobj.cube(10);
        System.out.println("Cube is : "+iRet);
    }
}