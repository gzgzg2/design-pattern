package strategy.after;

import strategy.after.behavior.FlyBehavior;
import strategy.after.behavior.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
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
