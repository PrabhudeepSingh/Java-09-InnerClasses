class MethodLocalInner1
{
  public void mth1()
  { 
    int z=10;
    class Inner
    {
      public void sum(int x,int y)
      {
        System.out.println("the sum is  "+(x+y));
        System.out.println(z);
      }
    }

    Inner inner=new Inner();
    inner.sum(10,20);
    inner.sum(100,200);
  }

  public static void main(String[] args)
  {
    MethodLocalInner1 inner= new MethodLocalInner1();
    inner.mth1();
  }
}
  