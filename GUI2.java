import java.awt.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String title)
    {
        fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);

    }
}

class GUI2
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
