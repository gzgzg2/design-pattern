package strategy.before;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println(mallardDuck.fly());
        System.out.println(mallardDuck.dispaly());
        System.out.println(mallardDuck.swim());
        System.out.println(mallardDuck.quack());

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println(redHeadDuck.fly());
        System.out.println(redHeadDuck.dispaly());
        System.out.println(redHeadDuck.swim());
        System.out.println(redHeadDuck.quack());

        Duck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.fly());
        System.out.println(rubberDuck.dispaly());
        System.out.println(rubberDuck.swim());
        System.out.println(rubberDuck.quack());
    }
}
