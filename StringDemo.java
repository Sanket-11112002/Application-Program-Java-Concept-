

class StringDemo
{
    public static void main(String A[])
    {
        char Arr[] = {'H','e','l','l','o'};

        String str1 = new String(Arr);

        String str2 = "Hello";

        String str3 = new String("Hello");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        
    }
}