import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void shouldSortInteger() {
        List<Comparable> input = new ArrayList<>(Arrays.asList(1,4,5,6,8,3,8));
        List<Comparable> expected = List.of(1,3,4,5,6,8,8);

        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(result,expected);
    }

    @Test
    void shouldSortIntegerAndDouble() {
        List<Comparable> input = new ArrayList<>(Arrays.asList(-9.3,0.2,4,0.1,5,9));
        List<Comparable> expected = List.of(-9.3,0.1,0.2,4,5,9);

        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(result,expected);
    }

    @Test
    void shouldGetEmptyList() {
        List<Comparable> input = new ArrayList<>(Arrays.asList());
        List<Comparable> expected = List.of();

        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(result,expected);
    }

    @Test
    void shouldRemoveNullAndSort() {
        List<Comparable> input = new ArrayList<>(Arrays.asList(null,5.0001));
        List<Comparable> expected = List.of(5.0001);

        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(result,expected);
    }

    @Test
    void shouldThrowRuntimeException() throws RuntimeException {
        List<Comparable> input = null;

        try {
            BubbleSort.sort(input);
            fail();
        } catch (RuntimeException e) {}

    }
}