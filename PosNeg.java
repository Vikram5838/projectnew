package day6;

public class PosNeg {
	public static void main(String[] args) {
		int[] nums= {-20,20,18,-22,-55,50};
		int pos=0;
		int neg=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				//System.out.println(nums[i]+" is Positive");
				pos++;
			}
			else {
				//System.out.println(nums[i]+" is Negative");
				neg++;
			}
		}
		System.out.println("Positive Count "+pos+"\n"+"Negative Count "+neg);
	}

}
