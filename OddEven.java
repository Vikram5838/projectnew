package day6;

public class OddEven {
	public static void main(String[] args) {
		int[] nums= {12,55,8,3,20};
		int even=0;
		int odd=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]+" is Even");
				even++;
			}
			else {
				System.out.println(nums[i]+" is odd");
				odd++;
			}
		}
		System.out.println("Even Count "+even+"\n"+"Odd Count "+odd);
	}

}
