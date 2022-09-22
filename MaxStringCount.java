package day6;

public class MaxStringCount {
	public static void main(String[] args) {
		String[] names= {"one","cardiff","stockholm","bergen"};
		int count =0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>4) {
				count++;
			}
		}
		System.out.println(count);
	}

}
