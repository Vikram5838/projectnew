package day6;

public class MarksCount {
	public static void main(String[] args) {
		int[] marks= {400,450,444,560,600,424};
		int count=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=400&&marks[i]<=450) {
				count++;
			}
		}
		System.out.println("Marks Count "+count);
	}

}
