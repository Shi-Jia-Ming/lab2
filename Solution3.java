import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 *
 * 给你一个由 无重复 正整数组成的集合 nums ，请你找出并返回其中最大的整除子集 answer ，子集中每一元素对 (answer[i], answer[j]) 都应当满足：
 * answer[i] % answer[j] == 0 ，或
 * answer[j] % answer[i] == 0
 * 如果存在多个有效解子集，返回其中任何一个均可。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[1,2]
 * 解释：[1,3] 也会被视为正确答案。
 * 示例 2：
 *
 * 输入：nums = [1,2,4,8]
 * 输出：[1,2,4,8]
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 2 * 109
 * nums 中的所有整数 互不相同
 *
 */
class Solution3 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        if (len == 0) return new ArrayList<>();

        Arrays.sort(nums);  // 对数组进行排序
        int[] dp = new int[len];
        Arrays.fill(dp, 1); // 每个元素的初始状态都是长度为 1 的子集
        int maxSize = 1;    // 最大子集的长度
        int maxValIndex = 0; // 最大子集的最后一个元素的索引

        // 第 1 步：动态规划找出最大子集的个数
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxValIndex = i;
            }
        }

        // 第 2 步：倒推获得最大子集
        List<Integer> res = new ArrayList<>();
        int currentValue = nums[maxValIndex];
        int currentSize = maxSize;

        for (int i = maxValIndex; i >= 0; i--) {
            if (dp[i] == currentSize && currentValue % nums[i] == 0) {
                res.add(nums[i]);
                currentValue = nums[i];
                currentSize--;
            }
        }

        return res;
    }
}