import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
// Задание №1
        System.out.println("======================= Задание №1 =======================");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Задание №2
        System.out.println("======================= Задание №2 =======================");
        List<Integer> tempListNums = new ArrayList<>(nums);
        Set<Integer> tempSetNums = new HashSet<>();
        for (Integer tempListNum : tempListNums) {
            if (tempListNum % 2 == 0) {
                tempSetNums.add(tempListNum);
            }
        }
        tempListNums.clear();
        tempListNums.addAll(tempSetNums);
        Collections.sort(tempListNums);
        System.out.println(tempListNums);

        // Задание №3
        System.out.println("======================= Задание №3 =======================");
        List<String> words = new ArrayList<>(List.of("окно", "мыло", "село", "капуста", "окно", "село"));
        Set<String> uniqueWord = new HashSet<>(words);
        System.out.println(uniqueWord);

// Задание №4
        System.out.println("======================= Задание №4 =======================");
        System.out.println(words.size() - uniqueWord.size());
    }

}
