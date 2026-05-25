// Last updated: 5/25/2026, 11:10:22 AM
import java.util.*;

class Solution {

    int[] count;
    int[] indexes;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        count = new int[n];
        indexes = new int[n];

        for (int i = 0; i < n; i++)
            indexes[i] = i;

        mergeSort(nums, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int c : count)
            result.add(c);

        return result;
    }

    private void mergeSort(int[] nums, int left, int right) {

        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        int rightCount = 0;

        while (i <= mid && j <= right) {

            if (nums[indexes[j]] < nums[indexes[i]]) {

                temp[k++] = indexes[j++];
                rightCount++;

            } else {

                count[indexes[i]] += rightCount;
                temp[k++] = indexes[i++];
            }
        }

        while (i <= mid) {

            count[indexes[i]] += rightCount;
            temp[k++] = indexes[i++];
        }

        while (j <= right) {
            temp[k++] = indexes[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            indexes[left + p] = temp[p];
        }
    }
}