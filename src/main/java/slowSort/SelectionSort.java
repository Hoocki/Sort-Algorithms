package slowSort;

import sort.Sorter;
import java.util.List;

public class SelectionSort implements Sorter {
    @Override
    public void sort(final List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(index) > nums.get(j)) {
                    index = j;
                }
            }
            final int value = nums.get(i);
            nums.set(i, nums.get(index));
            nums.set(index, value);
        }
    }
}