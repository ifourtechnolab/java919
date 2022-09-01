package switchEnhancements;

import java.util.*;

public class SwitchExpressionExample {

    static int colon(String s) {
        var result = switch(s) {
            case "i": yield 1;
            case "j": yield 2;
            case "k": yield 3;
            default:  yield 0;
        };
        return result;
    }
    static int arrow(String s) {
        var result = switch(s) {
            case "i" -> 1;
            case "j" -> 2;
            case "k" -> 3;
            default  -> 0;
        };
        return result;
    }
    public static void main(String[] args) {

        for(var s: new String[]{"i", "j", "k", "z"}) {
            System.out.println(colon(s));
            System.out.println(arrow(s));
        }
    }

}
