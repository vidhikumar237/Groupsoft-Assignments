package Week2.day2;

public class FindDups {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {12,14,15,14,12,17,15};
		 for (int i = 0; i < num.length - 1; i++) {
	            for (int n = i + 1; n < num.length; n++) {
	                if (num[i] == num[n]) {
	                    System.out.println("Duplicate: " + num[i]);
	                }
	            }
		 }
	}
}