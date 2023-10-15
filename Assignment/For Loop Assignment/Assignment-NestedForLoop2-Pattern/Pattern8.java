/* A b C d
   E f G h
   I j K l
   M n O p */

class Pattern8{
	public static void main(String[]args){
		char ch='A';
		char cha='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch+" ");
//					ch+2;
				}
				else{
					System.out.print(cha+" ");
//					cha+2;
				}ch++;
				cha++;
			}
			System.out.println( );
		}
	}
}
