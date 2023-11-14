package optimalSort;

import org.junit.jupiter.api.Test;
import sort.Sorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

    private final Sorter quickSort = new QuickSort();

    @Test
    void should_sortArray() {
        //given
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, -5, 3, 1, 2, 10));

        //when
        quickSort.sort(list);

        //then
        List<Integer> expectedList = Arrays.asList(-5, 1, 1, 2, 3, 4, 10);
        assertThat(expectedList).isEqualTo(list);
    }
}