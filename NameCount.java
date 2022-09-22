package day6;

public class NameCount {
	public static void main(String[] args) {
		String[] names= {"vikram","vignesh","dhanush"};
		int nameCount=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].toUpperCase().startsWith("v")) {
				nameCount++;
			}
		}
		System.out.println("Name Count "+nameCount);
	}

}
