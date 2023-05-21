import java.util.*;

class Collection1
{
    public static void main(String arg[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(10);

        System.out.println("Elements Are :"+lobj);

        Iterator iobj = lobj.iterator();   // i small because it is method
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
    }
}