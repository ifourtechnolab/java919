package switchEnhancements;

import static java.util.stream.IntStream.range;

public class ArrowInSwitch {
    static void colons(int i) {
        switch(i) {
            case 1: System.out.println("one");
                    break;
            case 2: System.out.println("two");
                    break;
            default: System.out.println("default");
        }
    }

    static void arrows(int i) {
        switch(i) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("default");
        }
    }

    static void multiparam(String s) {
        switch(s) {
            case "XX", null -> System.out.println("XX|null");
            case "CC", "BB" -> System.out.println("CC|BB");
            default   -> System.out.println("default");
        }
    }
    static void checkNull(String s) {
        switch (s) {
            case "XX" -> System.out.println("XX");
            case null -> System.out.println("null");
            default -> System.out.println("default");
        }
    }

    public static void main(String[] args) {
        colons(1);
        arrows(2);
        checkNull(null);
        multiparam("CC");
    }
}

