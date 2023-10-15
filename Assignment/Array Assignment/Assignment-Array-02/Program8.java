/* Program 8
 * WAP to find the uncommon elements between two arrays.
 * Input :
 * Enter first array : 1 2 3 5
 * Enter Second array: 2 1 9 8
 * Output: Uncommon elements :
 * 3
 * 5
 * 9
 * 8
 */


import java.util.*;      
class Demo{  
	public static void main(String[]args){        
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Size1:");  
		int size1=sc.nextInt();   
		System.out.println("Enter size2:");    
		int size2=sc.nextInt();    
		System.out.println("Enter first array elements:");
		int arr1[]=new int[size1];  

		for(int i=0;i<arr1.length;i++){  
		       	arr1[i]=sc.nextInt();
		}  

		System.out.println("Enter second array elements:");    
		int arr2[]=new int[size2]; 

		for(int i=0;i<arr2.length;i++){        
			arr2[i]=sc.nextInt();    
		}       
		int flag=0;
		System.out.println("Uncommon elements between arrays are ");
	
		for(int i=0;i<arr1.length;i++){   
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					flag=1;
				}
			}
			if(flag==0){
				System.out.println(arr1[i]);
			}
			flag=0;
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr2[i]==arr1[i]){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(arr2[i]);
			}
			flag=0;
		}
	}
}	

