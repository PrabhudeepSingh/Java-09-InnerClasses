class Outer2
{
  class RegularInner
  {
     public void mth1()
     {   
       System.out.println("inner` class method");
     }
  }

  public static void main(String[] args)
  {
    Outer2 outer=new Outer2();
    Outer2.RegularInner regularInner=outer.new RegularInner();
    regularInner.mth1();
  }
}