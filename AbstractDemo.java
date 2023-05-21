abstract class RBI
{
    public abstract float CalculateROI();          // virtual float CalculateROI() = 0;

    public void DisplayRules()
    {
        System.out.println("You have to submit Adhar card & PAN card ");
        System.out.println("Minimum Balance is 10,000 !");
    }
}

class SBI extends RBI
{
     public float CalculateROI()
    {
        return 5.5f;
    }
}

class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}

class AbstractDemo
{
    public static void main(String Arg[])
    {
        // We can not create object of abstract class not upcasting, not no casting of that class

        // RBI obj1 = new RBI();  // No casting     
        // RBI obj2 = new SBI();  // Upcasting      
         RBI obj3 = new BOM();  // Upcasting       

        SBI sobj = new SBI();
        BOM bobj = new BOM();

        obj3.DisplayRules();
        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;

        fRet = obj3.CalculateROI();
        System.out.println("RoI of SBI:"+fRet);

        fRet = sobj.CalculateROI();
        System.out.println("RoI of SBI:"+fRet);     // 5.5

        fRet = bobj.CalculateROI();
        System.out.println("RoI of BOM:"+fRet);     // 7.7


    }
}