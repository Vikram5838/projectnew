package day6;

public class ReversePrint {
	public static void main(String[] args) {
		int[] ids=new int[4];
		ids[0]=262002;
		ids[1]=214562;
		ids[2]=214631;
		ids[3]=216532;
		for(int i=ids.length-1;i>=0;i--) {
			System.out.println(ids[i]);
		}
	}

}
