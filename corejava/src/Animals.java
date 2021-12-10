class Animal {
    void eat()
    {
        System.out.println("parent eat method");

    }
    void sleep()
    {
        System.out.println("parent sleep method");
         System.out.println("");
    }

}
class Bird extends Animal{
     void eat() {
      
        System.out.println("child eat method");
    }
    void sleep() {
       
        System.out.println("child sleep method");
    }

     void fly()
    {
        System.out.println("child fly method");

    }
}
class Animals{
    public static void main(String[] args) {
        Animal a =new Animal();
        a.eat();
        a.sleep();
        
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}