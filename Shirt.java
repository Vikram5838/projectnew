package day6;

public class Shirt {
	public static void main(String[] args) {
		String[] colors= {"red","violet","black","green"};
		/*for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(0));
		}*/
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(colors[i].length()-1));
		}
		/*for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i].charAt(i));
		}*/
		
	}

}
