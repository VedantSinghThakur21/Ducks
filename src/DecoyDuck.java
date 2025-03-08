public class DecoyDuck extends Duck {
    public DecoyDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Floating();
        flyBehaviour = new NotFly();


    }
    public void display() {
        System.out.println("I am Decoy Duck");
    }
}
