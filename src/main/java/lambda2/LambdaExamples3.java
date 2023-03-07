package lambda2;

public class LambdaExamples3 {

    static String thirdText = "Hey, a third text";

    private  String fourthText = "Fourth Text";

    public void doIt() {
        // Lambda expression accept variables as long as they are
        // final o efectively final.

        final String otherText = "Hello: ";

        MyInterface1 myInterface1 = (text) -> {
            System.out.println(otherText + text + " " + fourthText);
        };

        // Lambda functions accepts static variables, and they
        // will use the last updated value on that variable.

        // thirdText not modified
        myInterface1.printIt("ABC");

        // thirdText modified
        fourthText = "Blablabla";

        myInterface1.printIt("ABC");
    }

    public static void main(String[] args) {

        LambdaExamples3 instance = new LambdaExamples3();
        instance.doIt();

    }

}