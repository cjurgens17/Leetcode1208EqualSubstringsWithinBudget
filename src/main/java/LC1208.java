public class LC1208 {

    public static void main(String[] args) {
        System.out.println(maxSubstring("abcd","bcdf", 3));
        System.out.println(maxSubstring("abcd","cdef", 3));
        System.out.println(maxSubstring("abcd","acde",0));
        System.out.println(maxSubstring("anryddgaqpjdw","zjhotgdlmadcf",5));
    }

    //You are given two strings s and t of the same length and an integer maxCost.
    //
    //You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).
    //
    //Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "abcd", t = "bcdf", maxCost = 3
    //Output: 3
    //Explanation: "abc" of s can change to "bcd".
    //That costs 3, so the maximum length is 3.
    //Example 2:
    //
    //Input: s = "abcd", t = "cdef", maxCost = 3
    //Output: 1
    //Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.
    //Example 3:
    //
    //Input: s = "abcd", t = "acde", maxCost = 0
    //Output: 1
    //Explanation: You cannot make any change, so the maximum length is 1.
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 105
    //t.length == s.length
    //0 <= maxCost <= 106
    //s and t consist of only lowercase English letters.

    public static int maxSubstring(String s, String t, int maxCost){
        int curr = 0;
        int left = 0;
        int subLen = 0;

        for(int right = 0;right<s.length();right++){
            curr += Math.abs(s.charAt(right) - t.charAt(right));
            if(curr <= maxCost){
                subLen = Math.max(subLen, right - left + 1);
            }
            while(curr > maxCost && left < s.length()){
                curr -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
        }
        return subLen;
    }
}
