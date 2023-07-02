package strategy.after;

import strategy.after.behavior.FlyBehavior;
import strategy.after.behavior.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    protected String performFly() {
        return flyBehavior.fly();
    }

    @Override
    protected String performQuack() {
        return quackBehavior.quack();
    }
}
