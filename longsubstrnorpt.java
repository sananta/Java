public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subs = new HashSet<>(); 
        //sliding window approach
        int i = 0, j = 0, n = s.length(), ans = 0; 
        while (i < n && j < n) { //initially j also starts with i, in the beginning of the string
            if (!subs.contains(s.charAt(j))) { //if the chaacter at position j hasn't been detected yet, add it to the set
                subs.add(s.charAt(j++));
                ans = Math.max(ans, j-i); //keep updating the ans for longestSubstring without repeating characters 
            }
            else { //if j is equal to another character already present, come here and keep doing so until it's not anymore
                subs.remove(s.charAt(i++)); 
            }
        }
        return ans;   
    }
}
