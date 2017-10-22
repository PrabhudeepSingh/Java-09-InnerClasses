class StaticNested1
{
  static class Nested
  {
     public void mth1()
     {
        System.out.println("static nested class method ");
     }
  }

  public static void main(String[] args)
  {
    Nested nest=new Nested();
    nest.mth1();
  }
} 
