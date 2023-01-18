import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BalancedWordsCounter {
    public static void main(String[] args) {
        System.out.println(count("aabbcbccbaa"));
    }

    public static Integer count(String input) {
        if ((input == null) || !isOnlyLetter(input)) {
            throw new RuntimeException();
        }
        if (input.isEmpty()) {
            return 0;
        }

        int count = 0;
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        return count;
    }


    private static boolean isOnlyLetter (String input) {
        return input.matches("[A-Za-z]*");
    }
}

