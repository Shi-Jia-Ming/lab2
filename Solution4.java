import java.util.Arrays;

/**
 * @description:
 *
 * 给定一个无序的数组 nums，返回 数组在排序之后，相邻元素之间最大的差值 。如果数组元素个数小于 2，则返回 0 。
 *
 * 您必须编写一个在「线性时间」内运行并使用「线性额外空间」的算法。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * 示例 2:
 *
 * 输入: nums = [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 *
 *
 * 提示:
 *
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 *
 */
class Solution4 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        int[] buf = new int[n];
        int maxVal = Arrays.stream(nums).max().getAsInt();
        long exp = 1;

        // 基数排序
        while (maxVal / exp > 0) {
            int[] cnt = new int[10];
            
            // 计算每个数字在当前位的出现次数
            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exp) % 10;
                cnt[digit]++;
            }

            // 将计数数组变成前缀和数组
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }

            // 从右向左遍历，按当前位的值进行排序
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) exp) % 10;
                buf[--cnt[digit]] = nums[i];
            }

            // 将排序结果复制回原数组
            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;
        }

        // 找到最大相邻差值
        int ret = 0;
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }
        return ret;
    }
}