import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainWorkWithNumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);

        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        Collections.sort(evenNumbers);

        for (Integer num : evenNumbers) {
            System.out.println(num);
        }
    }
}