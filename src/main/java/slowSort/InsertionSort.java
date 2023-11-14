package slowSort;

import sort.Sorter;
import java.util.List;

public class InsertionSort implements Sorter {
    @Override
    public void sort(final List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int value = nums.get(i);
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (value >= nums.get(j)) {
                    break;
                }
                nums.set(index, nums.get(j));
                nums.set(j, value);
                value = nums.get(j);
                index = j;
            }
        }
    }
}
