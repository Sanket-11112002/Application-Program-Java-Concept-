import java.util.*;

class Arrayfor1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt=0;

        System.out.println("Enter the Element of Array");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array Elements are:");
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
}