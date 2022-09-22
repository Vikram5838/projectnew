package day6;

public class HighestNumber {
	public static void main(String[] args) {
		int[] nums= {99,80,20,60};
		int max=0;
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println(min);
	}

}
