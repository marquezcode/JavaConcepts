package lambda;

import java.util.Comparator;
public class LambdaExamples {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };

        int comparison = stringComparator.compare("hello", "world");
        System.out.println(comparison);

        Comparator<String> stringComparatorLambda =
                (o1, o2) -> o1.compareTo(o2);

        int lambdaComparator = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaComparator);
    }
}
