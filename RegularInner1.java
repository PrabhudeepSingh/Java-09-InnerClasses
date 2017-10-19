class Outer1
{
  class RegularInner
  {
   /* public static void main(String[] args){System.out.println("outer class main method");}
      RE: Illegal static declaration in inner class */
  }

  public static void main(String[] args)
  {
    System.out.println("outer class main method");
  }
}