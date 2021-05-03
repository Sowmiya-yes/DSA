import java.util.function.Function;

class FuncIntf implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Hello " + name;
    }
}

public class FunctionTester {
    public static void main(String[] args) {
        Function<String, String> funcInt1 = new FuncIntf();
        Function<String, String> funcIntf2 = new Function<String, String>() {
            @Override
            public String apply(String name) {
                return "Hello " + name;
            }
        };
        Function<String, String> funcIntf3 = (name) -> "Hello " + name;
        Function<String, String> funcIntf4 = (name) ->  {
            return "Hello " + name;
        };
        System.out.println(funcInt1.apply("Sowmiya"));
        System.out.println(funcIntf2.apply("Sowmi"));
        System.out.println(funcIntf3.apply("Sowm"));
        System.out.println(funcIntf4.apply("Sow"));
    }
}