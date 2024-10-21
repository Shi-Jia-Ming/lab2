import java.util.*;

/*
 * @Description
 * 重复 DNA 序列
 * DNA 序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'。
 * 例如，"ACGAATTCCG" 是一个 DNA 序列。
 * 在研究 DNA 时，识别 DNA 中的重复序列非常有用。
 * 给定一个表示 DNA 序列的字符串 s，返回所有在 DNA 分子中出现不止一次的长度为 10 的序列(子字符串)。
 * 
 * 示例 1：
 * 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * 输出：["AAAAACCCCC","CCCCCAAAAA"]
 * 示例 2：
 * 输入：s = "AAAAAAAAAAAAA"
 * 输出：["AAAAAAAAAA"]
 */

//对的对的
class Solution17 {
    static final int L = 10;
    
    Map<Character, Integer> bin = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('C', 1);
        put('G', 2);
        put('T', 3);
    }};

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>(); // 修正：初始化 ans 为 ArrayList
        int n = s.length(); // 修正：获取字符串长度
        
        if (n <= L) {
            return ans; // 如果长度小于等于 10，直接返回空结果
        }
        
        int x = 0;
        // 计算前 9 个字符的哈希值
        for (int i = 0; i < L - 1; ++i) {
            x = (x << 2) | bin.get(s.charAt(i)); // 将字符转换为二进制表示
        }
        
        Map<Integer, Integer> cnt = new HashMap<>(); // 修正：初始化计数器
        for (int i = 0; i <= n - L; ++i) {
            x = ((x << 2) | bin.get(s.charAt(i + L - 1))) & ((1 << (L * 2)) - 1); // 更新哈希值
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            if (cnt.get(x) == 2) {
                ans.add(s.substring(i, i + L)); // 找到重复序列，加入结果
            }
        }
        return ans;
    }
}
