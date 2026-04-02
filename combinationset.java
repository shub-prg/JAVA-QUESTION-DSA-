import java.util.*;

class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        check(candidates, 0, target, new ArrayList<>());
        return res;
    }

    void check(int[] nums, int i, int target, ArrayList<Integer> arr) {
        // Base case
        if (target == 0) {
            res.add(new ArrayList<>(arr));
            return;
        }

        if (target < 0 || i == nums.length) return;

        // ✅ Take the current element
        arr.add(nums[i]);
        check(nums, i, target - nums[i], arr); // reuse same index
        arr.remove(arr.size() - 1);

        // ✅ Skip the current element
        check(nums, i + 1, target, arr);
    }
}
