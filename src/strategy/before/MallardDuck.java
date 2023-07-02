package strategy.before;

public class MallardDuck extends Duck {
    @Override
    protected String quack() {
        return super.quack();
    }

    @Override
    protected String dispaly() {
        return "청둥오리";
    }

    @Override
    protected String fly() {
        return super.fly();
    }

    @Override
    protected String swim() {
        return super.swim();
    }
}
