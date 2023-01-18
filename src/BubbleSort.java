import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    public static List<Comparable> sort(List<Comparable> input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException();
        }
        removeNullValue(input);

        ArrayList<Comparable> list = new ArrayList<>(input);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j-1) instanceof Double && list.get(j) instanceof Integer) {
                    Double temp = ((Integer) list.get(j)).doubleValue();
                    if (list.get(j - 1).compareTo(temp) > 0) {
                        Collections.swap(list, j - 1, j);
                    }
                }
                if (list.get(j-1) instanceof Integer && list.get(j) instanceof Double) {
                    Double temp = ((Integer) list.get(j-1)).doubleValue();
                    if (temp.compareTo(((Double) list.get(j)).doubleValue()) > 0) {
                        Collections.swap(list, j - 1, j);
                    }
                }
                if (list.get(j-1) instanceof Integer && list.get(j) instanceof Integer) {
                    if (list.get(j-1).compareTo(list.get(j)) > 0) {
                        Collections.swap(list, j - 1, j);
                    }
                }
                if (list.get(j-1) instanceof Double && list.get(j) instanceof Double) {
                    if (list.get(j-1).compareTo(list.get(j)) > 0) {
                        Collections.swap(list, j - 1, j);
                    }
                }
            }
        }
        List<Comparable> result = list;
        return result;
    }

    private static void removeNullValue(List<Comparable> input) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == null) {
                input.remove(i);
                i++;
            }
        }
    }
}
