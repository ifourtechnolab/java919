package patternMatching;

interface Base {}
class Derived implements Base {}



public class Dominance {


    static String test(Base base) {
        return switch(base) {
            case Derived d -> "Derived";
            case Base b -> "B";
            //default -> throw new IllegalArgumentException("Unexpected value: " + base);            // [1]
        };
    }

    public static void main(String[] args) {
        System.out.println(test(new Derived()));
    }
}