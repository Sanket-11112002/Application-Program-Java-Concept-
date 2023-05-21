
class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic()   // Default Constructor
    {
        System.out.println("Inside default constructor");
        this.No1=0;
        this.No2=0;
    }
    public Arithematic(int i, int j)   //Parametrised constructor
    {
        System.out.println("Inside Parametrised constructor");
        this.No1=i;
        this.No2=j;
    }
    
     public int Addition()
    {
        int Ans=0;
        Ans=this.No1 + this.No2;
        return Ans;
    }

    public int substraction()
    {
        int Ans=0;
        Ans=this.No1 - this.No2;
        return Ans;
    }
}

class OOP
{
    public static void main(String Arg[])
    {
        System.out.println("Inside Main Function...");

        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(11,10);

        int iRet = 0;

        iRet = obj1.Addition();    // 0
        System.out.println("Addition is :"+iRet);

        iRet = obj1.substraction();    // 0
        System.out.println("Substraction is :"+iRet);

         iRet = obj2.Addition();    // 21
        System.out.println("Addition is :"+iRet);

        iRet = obj2.substraction();    // 1
        System.out.println("Substraction is :"+iRet);
    }
}