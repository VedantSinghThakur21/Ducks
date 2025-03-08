public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new Flying();
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck!!");
    }
}
