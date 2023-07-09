import java.util.Random;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //task 1
        Predicate<Integer>  predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        Predicate<Integer> predicate1 = i -> i > 0;

        System.out.println(predicate.test(5));
        System.out.println(predicate1.test(-5));

        //task2

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Приветствую, " + s + "!");
            }
        };
        Consumer<String> consumer1 = s -> System.out.println("Приветствую, " + s + "!");
        consumer.accept("Петр");
        consumer1.accept("Петр");

        //task3

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double, Long> function1 = Math::round;

        System.out.println(function.apply(3.5647));
        System.out.println(function1.apply(3.5647));

        //task4

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(101);
            }
        };
        Supplier<Integer> supplier1 = () ->{
            Random random = new Random();
            return random.nextInt(101);
        };
        System.out.println(supplier.get());
        System.out.println(supplier1.get());
    }
}