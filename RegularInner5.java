class Outer5
{
  int x=100;
  static int y=150;
  class RegularInner
  {
    public void mth1()
    {
      System.out.println(x);
      System.out.println(y);
    }
  }
  public static void main(String[] args)
  {
    new Outer5().new RegularInner().mth1();
  }
}