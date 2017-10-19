class Outer3
{
  class RegularInner
  {
     public void mth1()
     {   
       System.out.println("inner class method");
     }
  }

  public void mth2()
  {
    RegularInner regularInner=new RegularInner();
    regularInner.mth1();
  }

  public static void main(String[] args)
  {
    Outer3 outer=new Outer3();
    outer.mth2();
  }
}