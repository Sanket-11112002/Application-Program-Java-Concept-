import java.util.*;

class Assign29_9
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");

        String input = sobj.nextLine();

        int LargestWordLength = 0;

        String[] words = input.split(" ");

        for(String word : words)
        {
            int length = word.length();
            if(length > LargestWordLength)
            {
                LargestWordLength = length;
            }
        }
        System.out.println("the length of Largest word in given string is:"+LargestWordLength);
    }
}