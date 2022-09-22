package day6;

public class Car {
	public static void main(String[] args) {
		int[] speeds= {143,156,155,160,155};
		/*for(int i=0;i<speeds.length;i++) {
			System.out.println(speeds[i]);
		}*/
		
		//for(int i=(speeds.length-1)/2;i>=0;i--) {
			//System.out.println(speeds[i]);
		//}second half reverse
		/*for(int i=0;i<speeds.length/2;i++) {
			System.out.println(speeds[i]);
		}*/ //1st half reverse..................
		/*for(int i=(speeds.length-1);i>=speeds.length/2;i--){
			System.out.println(speeds[i]);//Second half reverse............
		}*/
		for(int i=speeds.length/2;i<speeds.length;i++) {
			System.out.println(speeds[i]);//second half forward
		}
	
	}

}
