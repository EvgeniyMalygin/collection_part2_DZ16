import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
// Задание №1
        System.out.println("======================= Задание №1 =======================");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}