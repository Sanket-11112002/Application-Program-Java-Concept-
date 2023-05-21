import java.util.*;

class Arraywhile
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;
        System.out.println("Enter the Element of Array:");

        while(iCnt < iSize)
        {
            Arr[iCnt] = sobj.nextInt();
            iCnt++;
        }

        System.out.println("Array Elements Are :");
         iCnt = 0;
        while(iCnt < iSize)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
    

    }
}