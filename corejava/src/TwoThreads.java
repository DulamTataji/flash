public class TwoThreads extends Thread

{

 public void run()

 {

 try

 {

 String name=Thread.currentThread().getName();

 if(name.equals("First"))

 {

 for(int i=1;i<=20;++i)

  {

  if(i==5)

  Thread.sleep(10);

  System.out.println(name+" value "+i);

  }

 }

 else if(name.equals("Second"))

 {

  for(int i=20;i>=1;--i)

  {

   if(i==15)

  Thread.sleep(10);

  System.out.println(name+" value "+i);

  }

 }

 }

 catch(InterruptedException ie)

  {

  ie.printStackTrace();

  }

 }

 public static void main(String[] args)

 {

 TwoThreads th1=new TwoThreads();

 th1.setName("First");

 TwoThreads th2=new TwoThreads();

 th2.setName("Second");

 th1.start();

 th2.start();

 }

}

