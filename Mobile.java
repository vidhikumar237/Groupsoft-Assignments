package week1.day2;

public class Mobile {
	
		public void makeCall() {
		String mobileModel= "Samsung";
		float mobileWeight= 500.08f;
		System.out.println(mobileModel);		
		System.out.println(mobileWeight);
			
		}		
		public void sendMsg() {
		boolean isFullCharged=false;
		int mobileCost=80000; 
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		}
		
	public static void main(String[] args) {
		Mobile M=new Mobile();
		M.makeCall();
		M.sendMsg();

		
		System.out.println("This is my mobile");

	}

}
