package strategy.after;

import strategy.after.behavior.FlyBehavior;
import strategy.after.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

     Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    protected String swim() {
        return "둥실둥실";
    }

    protected String display() {
        return "오리 보여주기";
    }

    protected abstract String performFly();
    protected abstract String performQuack();

    protected void changeFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
