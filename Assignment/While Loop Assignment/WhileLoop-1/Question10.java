class Question10{
	public static void main(String[]args){
		int n=1001;
		int original=n;
		int rev=0;
		int rem=0;

		while(n!=0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(original==rev){
			System.out.println(+rev+" It is a palindrome number");
		}
		else{
			System.out.println(+rev+" It is not a palindrome number");
		}
	}
}

