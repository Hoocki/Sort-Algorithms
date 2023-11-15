package optimalSort;

import java.util.List;
import sort.Sorter;

public class HeapSort implements Sorter {

    @Override
    public void sort(final List<Integer> nums) {
        for (int i = nums.size() / 2 - 1; i >= 0; i--) {
            maxHeapify(nums, nums.size(), i);
        }

        for (int i = nums.size() - 1; i > 0; i--) {
            final int temp = nums.get(i);
            nums.set(i, nums.get(0));
            nums.set(0, temp);
            maxHeapify(nums, i, 0);
        }
    }

    private void maxHeapify(final List<Integer> nums, final int heapSize, final int index) {
        final int left = 2 * index + 1;
        final int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && nums.get(left) > nums.get(largest)) {
            largest = left;
        }
        if (right < heapSize && nums.get(right) > nums.get(largest)) {
            largest = right;
        }
        if (largest != index) {
            final int temp = nums.get(index);
            nums.set(index, nums.get(largest));
            nums.set(largest, temp);
            maxHeapify(nums, heapSize, largest);
        }
    }
}
