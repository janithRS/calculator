import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("start");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter operator: ");
        String operator = myObj.nextLine();

        ArrayList<Float> numbers = new ArrayList<Float>();

        for (String i : args) {
            numbers.add(Float.parseFloat(i));
        }

        if (operator.equals("+")) {
            System.out.print("Answer: ");
            System.out.println(add(numbers));
        }

    }

    private static Float add(ArrayList<Float> args) {
        Float tot = Float.parseFloat("0");
        for (Float i : args) {
            tot += i;
        }
        return tot;
    }
}
