// MethodDemo.java

 class MethodDemo //extends Thread

           {

 public static void main(String args[])

           {

 Thread t1 = new Thread(); // create a thread with Thread class

System.out.println("Deault t1 Name: " + t1.getName()); // prints Thread-0

 t1.setName("Hello Thread");

System.out.println("t1 Name after assigning: "+ t1.getName()); // Hello Thread

System.out.println( "Default Priority of t1: " + t1.getPriority()); // prints 5

 t1.setPriority(Thread.MAX_PRIORITY);

System.out.println( "Priority of t1 after setting: " + t1.getPriority()); // prints 10

System.out.println( "Default thread group of t1: "+t1.getThreadGroup());// prints main

System.out.println( "Default t1 isDaemon( ): "+t1.isDaemon()); // false

 t1.setDaemon(true);

System.out.println( "After setting t1 isDaemon(): "+t1.isDaemon()); // true

System.out.println( "t1.isAlive( ): " + t1.isAlive()); // prints false as start( ) is not called still

System.out.println( "t1.isInterrupted( ): " + t1.isInterrupted()); // false

System.out.println("name of the current thread is "+Thread.currentThread().getName());

 }

 }