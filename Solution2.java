import java.util.Stack;

/**
 * @description:
 *
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
class Solution2 {
    public String removeDuplicateLetters(String s) {
        // 用于记录字符是否已在结果中出现
        boolean[] vis = new boolean[26];
        // 用于记录每个字符的剩余出现次数
        int[] num = new int[26];

        // 统计每个字符的出现次数
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            num[ch - 'a']--;

            // 如果字符已在栈中，跳过
            if (vis[ch - 'a']) continue;

            // 确保栈中的字符字典序最小，且栈顶字符在后面还会出现
            while (!stack.isEmpty() && stack.peek() > ch && num[stack.peek() - 'a'] > 0) {
                vis[stack.pop() - 'a'] = false;
            }

            // 将当前字符入栈并标记为已出现
            stack.push(ch);
            vis[ch - 'a'] = true;
        }

        // 将栈中的字符构造成字符串
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
