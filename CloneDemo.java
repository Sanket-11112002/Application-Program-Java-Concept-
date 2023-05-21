class Student implements Cloneable
{
    public String name;
    public int marks;
    public int age;

    public Student (String str, int a, int b)
    {
        this.name = str;
        this.marks = a;
        this.age = b;
    }
   
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo 
{
    public static void main(String A[])
    {
        try
        {
            Student obj1 = new Student("Sanket",87,27);
            Student obj2 = (Student)obj1.clone();

            System.out.println("Name :"+obj1.name);
            System.out.println("Marks :"+obj1.marks);
            System.out.println("Age :"+obj1.age);

            System.out.println("Name :"+obj1.name);
            System.out.println("Marks :"+obj1.marks);
            System.out.println("Age :"+obj1.age);
        }
        catch(Exception obj)
        {

        }
    }
}