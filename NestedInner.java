class InnerExample
{
  class Inner1
  {
     class Inner2
     {
        class Inner3
        {
           public void mth()
           {
             System.out.println("nested inner class method");
           }
        }
     }
  }
}

public class NestedInner
{
  public static void main(String[] args)
  {
    InnerExample i=new InnerExample();
    InnerExample.Inner1 i1=i.new Inner1();
    InnerExample.Inner1.Inner2 i2=i1.new Inner2();
    InnerExample.Inner1.Inner2.Inner3 i3=i2.new Inner3();
    i3.mth();
  }
}
    