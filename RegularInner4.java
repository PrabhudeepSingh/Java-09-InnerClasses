class Outer4
{
  class RegularInner
  {
     public void mth1()
     {   
       System.out.println("inner class method");
     }
  }

  public static void main(String[] args)
  {
    Outer4 outer=new Outer4();
    Outer.RegularInner regularInner=outer.new RegularInner();
    outer.mth1();
  }
}