package optimalSort;

import sort.Sorter;
import java.util.List;

public class QuickSort implements Sorter {

    @Override
    public void sort(final List<Integer> nums) {
        quickSort(nums, 0, nums.size() - 1);
    }

    private void quickSort(final List<Integer> nums, final int low, final int high) {
        if (low < high) {
            final int partitionIndex = partition(nums, low, high);

            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    private int partition(final List<Integer> nums, final int low, final int high) {
        final int pivot = nums.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums.get(j) <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(final List<Integer> nums, final int i, final int j) {
        final int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

}
