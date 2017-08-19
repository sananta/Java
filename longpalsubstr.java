class Solution {
    //expand around center algorithm
    public String longestPalindrome(String s) {
        int start = 0; 
        int end = 0; 
        int len = 0; 
        int len1 = 0; 
        int len2 = 0; 
        for (int i = 0; i < s.length(); i++) {
            len1 = expandAroundCenter(s, i, i); //for odd length palindromes that have ONE center
            len2 = expandAroundCenter(s, i, i+1); //for even length palindromes that have TWO centers 
            //for each character in the string, we are going to find the maximum length palindrome where it is a center(s)
            len = Math.max(len1, len2);
            if (len > end-start) {
                //remember i is in the center, and to get to the start in an odd palindrome it's simply i - (len)/2, but we also                have to consider even palindromes, which would be different to get to the start, considering i in this case is the                 position of the center more close to the start we would have to do i-(len-1)/2, this won't affect the calculations for odd palindrome start because odd_values/2 would be the same as odd_values-1/2 if they are assigned to ints.
                start = i - (len-1)/2;
                //in order to find the end position for odd palindromes it would simply be i + len/2, for even palindromes since we are on the center closer to the left, we could still use i+len/2, consider position 3 in an palindrome of length 6, 3 + 6/2 =6
                end = i + len/2;
            }
            
        }
        return s.substring(start, end+1);
        
    }
    
    public int expandAroundCenter(String s, int L, int R) {
        while (L>= 0 && R<s.length() && s.charAt(L) == s.charAt(R)) {
            L--; 
            R++; 
        }
        //return how many actual characters are going to be in the final palindrome, consider the fact we are -1 on left and +1            on right out of bounds Ex. real indexes (1, 3) but we are returned (0, 4), so to get 3 we do 4-0-1
        int final_length = R-L-1; 
        return final_length; 
    }
}
