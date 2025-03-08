abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }


    abstract public void display();

    public void performQuack() {
        quackBehaviour.quack(); //Note: We dont specify which Quack method we are calling
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }





}
