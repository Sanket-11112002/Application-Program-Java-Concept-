class Array3
{
    public static void main(String Arg[])
    {
        int Arr[][] = new int [3][];

        Arr[0]=new int[4];

        Arr[0][0] = 1;
        Arr[0][1] = 2;
        Arr[0][2] = 3;
        Arr[0][3] = 4;

        Arr[1]=new int[2];

        Arr[1][0] = 5;
        Arr[1][1] = 6;
        
        Arr[2]=new int[6];

        Arr[2][0] = 7;
        Arr[2][1] = 8;
        Arr[2][2] = 9;
        Arr[2][3] = 10;
        Arr[2][4] = 11;
        Arr[2][5] = 12;

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);
        System.out.println(Arr[1].length);
        System.out.println(Arr[2].length);

        
    }
}