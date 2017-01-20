public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
        
        if(nums.length ==0 || nums == null) {
            return 0;
        }
        
        int begin = 0;
        int end = nums.length - 1;
        while(begin <= end) {
            if (nums[begin] != val) {
                begin++;
            }
            else if (nums[end] == val) {
                end--;
            }
            else {
                int a = nums[begin];
                nums[begin] = nums[end];
                nums[end] = a;
            }
        }
        return begin;
    }

}