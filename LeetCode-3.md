LeetCode-3题解

题目：	给定一个字符串，请你找出其中不含有重复字符的 **最长子串** 的长度。





题解思路： 滑动窗口的解法

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);  //left下标指向最近一次重复子串的最后的位置
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1); //判断前后的字符子串哪个更长
        }
        return max;
        
    }
}

```



