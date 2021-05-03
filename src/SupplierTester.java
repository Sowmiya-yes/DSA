import java.util.function.Supplier;

class supplyIntf implements Supplier<String> {

    @Override
    public String get() {
        return "You can do it";
    }
}

public class SupplierTester {
    public static void main(String[] args) {
        Supplier<String> supplyIntf1 = new supplyIntf();
        Supplier<String> supplyIntf2 = new Supplier<String>() {
            @Override
            public String get() {
                return "You can win";
            }
        };
        Supplier<String> supplyIntf3 = () -> "You are doing well";
        Supplier<String> supplyIntf4 = () ->  {
            return "Keet it up";
        };
        System.out.println(supplyIntf1.get());
        System.out.println(supplyIntf2.get());
        System.out.println(supplyIntf3.get());
        System.out.println(supplyIntf4.get());
    }
}