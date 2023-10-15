class Question4{
	public static void main(String[]args){
		int n=942111423;
		int count=0;

		while(n!=0){
			int rem=n%10;
			if(rem%2==1){
				count++;
			}
			n=n/10;
		}
		System.out.println("count of digits:" +count);
	}
}

