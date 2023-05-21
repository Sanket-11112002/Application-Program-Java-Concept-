interface Circle
{
    public final float PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculeteCircumfarnce(float Radius);
}

class Demo implements Circle
{
    public float CalculateArea(float Radius)
    {
        return PI*Radius*Radius;
    }

    public float CalculeteCircumfarnce(float Radius)
    {
        return 2*PI*Radius;
    }
}

class InterfaceDemo
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();

         float fRet = 0.0f;

        fRet = obj.CalculateArea(10.0f);
        System.out.println("Area of Circle is:"+fRet);

        fRet = obj.CalculeteCircumfarnce(11.11f);
        System.out.println("Circumfarance of Circle is:"+fRet);

    }
}