//Name - Vedant Singh Thakur
// PRN - 23070126144
// batch - AIML B3
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("------------");

        RubberDuck rb = new RubberDuck();
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("------------");

        RedHeadDuck rd = new RedHeadDuck();
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("------------");

        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("------------");
    }
}