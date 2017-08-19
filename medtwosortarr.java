public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1_length = nums1.length;
        int nums2_length = nums2.length; 
        int x = nums1_length + nums2_length; 
        int median_array[] = new int[x]; 
        double median = 0;
        for (int i = 0; i < nums1.length; i++) 
            median_array[i] = nums1[i];
        for (int i = nums1.length; i < x; i++)
            median_array[i] = nums2[i-nums1.length];
        Arrays.sort(median_array);
        if (x % 2 == 1) {
            //System.out.println("goes here");
            median = median_array[(int) Math.ceil(x/2)];
        }
        else 
            median = (double) (median_array[x/2] + median_array[(x/2)-1])/2;
        
        //System.out.println(median);
        
        return median;
        
    }
}
