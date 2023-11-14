package slowSort;

import sort.Sorter;
import java.util.List;

public class BubbleSort implements Sorter {
    @Override
    public void sort(final List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    final int value = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, value);
                }
            }
        }
    }
}
