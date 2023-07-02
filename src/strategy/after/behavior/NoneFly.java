package strategy.after.behavior;

public class NoneFly implements FlyBehavior {
    @Override
    public String fly() {
        return "날 수 없어요";
    }
}
