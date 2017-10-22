class MethodLocalInner2
{
  int x=10;
  static int y=20;
  public static void mth1()
  { 
    class Inner
    {
      public void mth2()
      {
        //System.out.println(x); CE: non-static variable x cannot be referenced from a static context
        System.out.println(y);
      }
    }

    Inner inner=new Inner();
    inner.mth2();
  }

  public static void main(String[] args)
  {
    MethodLocalInner2 inner= new MethodLocalInner2();
    inner.mth1();
  }
}
  