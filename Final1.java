class Demo
{
    public int No1;
    final public int No2;
    final public int No3;

    public Demo(int i, int j, int k )
    {
        this.No1 = i;
        this.No2 = j;
        this.No3 = k;

    }

}

class Final1
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo(11,21,31);

        dobj.No1++;
        System.out.println(dobj.No1);
        System.out.println(dobj.No2);
        System.out.println(dobj.No3);

        // dobj.No2++;
        // dobj.No3++;

    }
}