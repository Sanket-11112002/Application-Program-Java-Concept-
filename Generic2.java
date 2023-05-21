
class Generic2
{
    public static <T> void Display(T Arr[])
    {
        for(T no : Arr)           // foreach
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
        Float B[] = {50.56f,60.23f,70.25f};
        Double C[] = {50.56,60.258,90.59};

        Display(A);
        Display(B);
        Display(C);
    }
}