import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LengthAndTwoValues {


    public static void main(String[] args) {

        alternate(5, "true", "false");


    }
    public static void alternate(int n, String firstValue, String secondValue) {

        List<Object> elemnets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            elemnets.add(firstValue);
            if (elemnets.size() < n) {
                elemnets.add(secondValue);
            }
        }

        System.out.println(elemnets);
    }
}
