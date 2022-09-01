package typeinference;

public class TypeInferenceExample2 {

    enum CoffeeSize{ BIG, MEDIUM, SMALL}
    public static void main(String[] args) {

        for (var e:
             CoffeeSize.values()) {
            System.out.println(e);
        }

    }
}
