/* 10 
    I H
    7 6 5
    D C B A */

class Question8{
	public static void main(String[]args){
		int row=4;
		int num=10;
		char ch='J';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch+ " ");
				}
				else{
					System.out.print(num+" ");
				}
			ch--;
			num--;
		}
		System.out.println( );
	}
}
}


