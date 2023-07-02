package strategy.after;

import strategy.after.behavior.*;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new RocketFly(), new LoudQuack());
        System.out.println("-------- 청둥오리 --------");
        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performQuack());
        Duck redHeadDuck = new RedHeadDuck(new RocketFly(), new LowPitchedQuack());
        System.out.println("-------- 빨간오리 --------");
        System.out.println(redHeadDuck.performFly());
        System.out.println(redHeadDuck.performQuack());
        Duck rubberDuck = new RubberDuck(new NoneFly(), new MuteQuack());
        System.out.println("-------- 러버덕 --------");
        System.out.println(rubberDuck.performFly());
        System.out.println(rubberDuck.performQuack());
    }
}
