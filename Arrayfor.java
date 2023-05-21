import java.util.*;

class Arrayfor
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array: ");
        int iSize = sobj.nextInt();   //4

        int Arr[] = new int[iSize];

        System.out.println("Enter the Element in Array");

        Arr[0] = sobj.nextInt();
        Arr[1] =sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();

        System.out.println("Array Element Are:");

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);

    }

}