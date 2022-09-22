package day6;

public class MaxStirngLen {
	public static void main(String[] args) {
		String[] words= {"laptop","Mobile","cellPhone","airport",};
		int max=0;String temp=""; int min=words[0].length();String temp1=words[0];String max1="";String min1=words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>max) {
			max=words[i].length();
			temp=words[i];
			}
		}
		System.out.println(temp);
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<min) {
				min=words[i].length();
				temp1=words[i];
			}
		}
		System.out.println(temp1);
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>max1.length()) {
				max1=words[i];
			}
		}
		System.out.println(max1);
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<min1.length()) {
				min1=words[i];
			}
		}
		System.out.println(min1);
	}
	

}
