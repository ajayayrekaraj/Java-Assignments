class Question6{
	public static void main(String[]args){
		int n=10;
		int i=1;
                int sum=0;
                int mul=1;		

		while(i<=10){
			if(i%2==0){
			        sum=sum+i;
			}
			else if(i%2==1){
				mul=mul*i;
                              }
			i++;
		}
		 System.out.println("sum of 1 to 10 even numbers: "+sum);
		System.out.println("mul of 1 to 10 even numbers: "+mul);
	}
}

