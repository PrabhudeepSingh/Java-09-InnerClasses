public class AnonymousInner3
{
  public static void main(String[] args)
  {
    Thread thread=new Thread()
    {  
      public void run()
      {
        for(int i=0;i<10;i++)
           System.out.println("child thread ");
        
      }
   };
  
    thread.start();
    for(int i=0;i<10;i++)
       System.out.println("Main thread ");
    
  }
}