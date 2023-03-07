package lambda;

public class LambdaExamples1 {
    public static void main(String[] args) {
        MyFunction myFunction = text -> System.out.println(text); ;

        myFunction.apply("Hello Function Body");
    }
}
