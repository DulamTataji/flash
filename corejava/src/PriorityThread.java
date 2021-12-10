public class PriorityThread extends Thread

 {

 public void run()

 {

 for( int i =1 ; i <6 ; i++ )

  {

System.out.println(Thread.currentThread().getName() + " "+ i);

 } // Thread.currentThread( ).getName( ) gets the name of the

 } // thread currently running with the processor

 public static void main(String args[ ] )

 {

 PriorityThread rp1=new PriorityThread();

 rp1.setPriority(10) ;

 rp1.setName( "First Thread" ) ;

 PriorityThread rp2 = new PriorityThread();

 rp2.setPriority(MIN_PRIORITY);

 rp2.setName( "Second Thread" ) ;

 rp2.start( ) ;

 rp1.start( ) ; // even rp2 is started first, rp1 starts first

 } // as rp1 is set to max priority. If a sleep( ) is given in the run( ), both threads

} // will execute, as rp2 is called in the sleep time of rp1







