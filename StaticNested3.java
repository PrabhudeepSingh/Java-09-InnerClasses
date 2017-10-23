class StaticNested3
{  
  int x=10;
  static int y=20;
  static class Nested
  {
     public void mth1()
     {
        //System.out.println(x); CE: non-static variable x cannot be referenced from a static context
        System.out.println(y);
     }
  }

  public static void main(String[] args)
  {
    Nested nest=new Nested();
    nest.mth1();
  }
} 
