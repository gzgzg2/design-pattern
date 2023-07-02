package strategy.before;

public class RubberDuck extends Duck {
    @Override
    protected String quack() {
        return "none";
    }

    @Override
    protected String dispaly() {
        return super.dispaly();
    }

    @Override
    protected String fly() {
        return "none";
    }

    @Override
    protected String swim() {
        return super.swim();
    }
}
