package strategy.after.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "울지 않아요";
    }
}
