import java.util.Arrays;

/*
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */
class Solution16 {
    public String largestNumber(int[] nums) {
        int n = nums.length; // 修正：使用 length 属性而非方法
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i]; // 修正：使用 [] 访问数组
        }

        // 自定义排序规则
        Arrays.sort(numsArr, (x, y) -> {
            // 将两个数字 x 和 y 进行字符串连接并比较
            String s1 = String.valueOf(x) + String.valueOf(y);
            String s2 = String.valueOf(y) + String.valueOf(x);
            return s2.compareTo(s1); // 降序排列
        });

        // 如果第一个元素是 0，说明所有元素都是 0
        if (numsArr[0] == 0) {
            return "0";
        }

        // 构建结果字符串
        StringBuilder ret = new StringBuilder(); // 修正：使用 = 赋值而非 ===
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString(); // 修正：调用 toString() 方法
    }
}
