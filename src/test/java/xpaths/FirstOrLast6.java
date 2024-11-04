package xpaths;

public class FirstOrLast6 {
	public static void main(String[] args) {
        int[] nums1 = {1, 2, 6};
        int[] nums2 = {6, 1, 2, 3};
        int[] nums3 = {13, 6, 1, 2, 3};
        
        System.out.println(firstOrLast6(nums1)); // Output: true
        System.out.println(firstOrLast6(nums2)); // Output: true
        System.out.println(firstOrLast6(nums3)); // Output: false
    }

    public static boolean firstOrLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
	


