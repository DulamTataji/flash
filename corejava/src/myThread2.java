
 class mythread2 extends Thread

  {

  public void run() //running

  {

   for(int i=0;i<=9;++i){

    if (i==5)

    {

   try

    {

  Thread.sleep(10000);//waiting

    }

    catch(Exception e)

    {

    System.out.println(e.toString());

    }

    }

    System.out.println(i+1);

   }

   }

 public static void main(String args[])

   {

  mythread2 mt=new mythread2();//ready

  System.out.println("before starting thread");

 mt.start();//runnable

   }

 }