package declarative.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        var checkPhoneNum = isPhoneNumValid.and(contains1010).test("009779810105325");
        System.out.println(checkPhoneNum); // true

        System.out.println(validPhoneNum.test("009779810105325", true)); // true
    }

    static Predicate<String> isPhoneNumValid =
            num -> num.startsWith("00977") && num.length() == 15;

    static Predicate<String> contains1010 =
            num -> num.contains("1010");

    static BiPredicate<String, Boolean> validPhoneNum =
            (num, showNum) -> (num.startsWith("00977") && num.length() == 15) && showNum;
}
