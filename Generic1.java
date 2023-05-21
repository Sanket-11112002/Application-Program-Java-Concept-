
class Generic1
{
    public static void Display(Integer Arr[])
    {
        for(int no : Arr)     // foreach
        {
            System.out.println(no);
        }
        /* for(int i=0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
        */
    }
    public static void main(String Arg[])
    {
        Integer A[] = {10,20,30,40};
        Integer B[] = {50,60,70};

        Display(A);
        Display(B);
    }
}