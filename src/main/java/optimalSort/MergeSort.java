package optimalSort;

import sort.Sorter;
import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorter {

    private void merge(final List<Integer> nums, final List<Integer> leftList, final List<Integer> rightList, final int left, final int right) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftList.get(i) <= rightList.get(j)) {
                nums.set(k++, leftList.get(i++));
            }
            else {
                nums.set(k++, rightList.get(j++));
            }
        }
        while (i < left) {
            nums.set(k++, leftList.get(i++));
        }
        while (j < right) {
            nums.set(k++, rightList.get(j++));
        }
    }

    @Override
    public void sort(final List<Integer> nums) {
        final int n = nums.size();
        if (n < 2) {
            return;
        }

        final int mid = n / 2;
        final List<Integer> leftList = new ArrayList<>();
        final List<Integer> rightList = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            final int value = nums.get(i);
            leftList.add(value);
        }
        for (int i = mid; i < n; i++) {
            final int value = nums.get(i);
            rightList.add(value);
        }
        sort(leftList);
        sort(rightList);

        merge(nums, leftList, rightList, mid, n - mid);
    }
}
