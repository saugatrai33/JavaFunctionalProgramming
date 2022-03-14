package declarative.supplier;

import java.util.function.Supplier;

public class _Suppliers {
    public static void main(String[] args) {
        System.out.println(getUrl.get());
    }

    static Supplier<String> getUrl =
            () -> "http://127.0.0.0/helloWorld";
}
