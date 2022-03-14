package declarative.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {
    public static void main(String[] args) {

        var lastNum = incrementByOne.
                andThen(multiplyBy5).
                andThen(divideBy5).
                apply(2);

        System.out.println(lastNum); // 3

        System.out.println(helloOrWorld.apply(20, 50000.0)); // Hello

        System.out.println(stringFunction.apply(20)); // World
    }

    static Function<Integer, Integer> incrementByOne = number -> ++number;

    static Function<Integer, Integer> multiplyBy5 = num -> num * 5;

    static Function<Integer, Integer> divideBy5 = num -> num / 5;

    static Function<Integer, String> stringFunction = num -> {
        if (num == 1) {
            return "Hello";
        } else {
            return "World";
        }
    };

    static BiFunction<Integer, Double, String> helloOrWorld =
            (age, price) -> {
                if (age > 15 || price < 15000) {
                    return "Hello";
                } else {
                    return "World";
                }
            };
}
