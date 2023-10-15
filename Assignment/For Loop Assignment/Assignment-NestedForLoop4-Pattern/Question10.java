/* 1
   8 9
   9 64 25
   64 25 216 49 */

class Question{
	public static void main(String[]args){
		int row=4;
		for(int i=1;i<=row;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				if(j%2!=1){
					System.out.print(temp*temp+ " ");
				}
				else{
					System.out.print(temp*temp*temp+ " ");
				}
				temp++;
			}
			System.out.println( );
		}
	}
}


