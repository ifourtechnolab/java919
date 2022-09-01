package typeinference;


import java.util.ArrayList;

public class TypeInferenceExample1 {

    //It can not be used for instance variables
    //var s3 = "Instance Hello";

    public static void main(String[] args) {

        //Explicit Declaration

        String s = "Hello";
        int i = 123;

        //Using Type Inference
        var j = 123;

        //Can be also used to declare user defined class objects
        var obj = new TypeInferenceExample1();
        var obj2 = obj;

        //var must be initialized at compile-time
        //var noInit;
        //noInit = 12;

        //can not infer type if null is passed
        //var aNull = null;
    }


    public void methodWithPossibleProblem(){

        //This will make a reference variable which will point to an ArrayList object which stores Object
        var genList = new ArrayList<>();
        genList.add(new Object());
        genList.add(new TypeInferenceExample1());
        genList.add(new ArrayList<>());

        //As seen above this Arraylist has not been specified any type so it can take any object
        //This creates problem in real world scenarios

        //This will make a reference variable which will point to an ArrayList object which stores Object
        // of TypeInference type
        var specificList = new ArrayList<TypeInferenceExample1>();
        specificList.add(new TypeInferenceExample1());
        //specificList.add(new Object());
        // uncommenting this statement will give compiler error saying 'type mismatch'
    }
}
