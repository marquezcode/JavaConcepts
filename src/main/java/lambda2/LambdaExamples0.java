package lambda2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LambdaExamples0 {
    public static void main(String[] args) throws IOException {

        // Java lambda expression can implement interfaces with
        // a single unimplemented method (abstract),
        // but as many default or static methods as you like.

        MyInterface myInterface = (String text) -> {
            System.out.println(text);
        };

        myInterface.printIt("Hello world");

        myInterface.printUtf8To("Hello File", new FileOutputStream("data.txt"));

        MyInterface.printItToSystemOut("Hello out");
    }
}
