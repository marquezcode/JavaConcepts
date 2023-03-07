package lambda;

public class LambdaExamples2 {
    public static void main(String[] args) {
        MyFunction2 myFunction = (text1, text2) -> {
            System.out.println(text1 + " + " + text2);
            return (text1 + " + " + text2);
        };

        String returnValue = myFunction.apply("Hello Function Body", "Test");
        System.out.println(returnValue);

        MyFunction2 myFunction2 = myFunction;
        String returnValue2 = myFunction2.apply("Text 1", "Text 2");
        System.out.println(returnValue2);
    }
}
