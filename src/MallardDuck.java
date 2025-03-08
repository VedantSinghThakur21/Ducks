import java.io.Flushable;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new Flying();


    }
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
