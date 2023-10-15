/* 26 Z 25 Y
   24 X 23 W
   22 V 21 U
   20 T 19 S */

class Pattern5{
	public static void main(String[]args){
		int k=27;
		char ch='Z';

		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(k-1+" ");
					k--;
				}
				else{
					System.out.print(ch+" ");
					ch--;
				}
			}
			System.out.println( );
		}
	}
}



