package day6;

public class PluralPrint {
	public static void main(String[] args) {
		String[] words= {"books","pens","value","bikes","element"};
		for(int i=0;i<words.length;i++) {
			if(words[i].endsWith("s")) {
				System.out.println(words[i]);
			}
		}
	}

}
