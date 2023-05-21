class Array1
{
    public static void main(String Arg[])
    {
        // Static Way
        int Arr[] = {10,20,30,40};

        // Dynamic Way
        int Arr1[] = new int[4];
        Arr1[0] = 10;
        Arr1[1] = 20;
        Arr1[2] = 30;
        Arr1[3] = 40;

        System.out.println("Length of Arr is :"+Arr.length);
        System.out.println("Lenght of Arr1 is :"+Arr1.length);
    }
}