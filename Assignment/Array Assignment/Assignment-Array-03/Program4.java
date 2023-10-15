/*
 *Program 4
 WAP to find a prime number from an array and return its index.
 Take size and elements from the user
Input: 10 25 36 566 34 53 50 100
Output: prime no 53 found at index: 5 */

import java.util.*;    
class Demo{    
	public static void main(String[]args){        
		Scanner sc=new Scanner(System.in);         
		System.out.println("Enter size:");       
		int size=sc.nextInt();             
		System.out.println("Enter array elements:");    
		int arr[]=new int[size];    
		for(int i=0;i<arr.length;i++){      
			arr[i]=sc.nextInt();           
		}                       
		for(int i=0;i<arr.length;i++){     
			int count=0;            
			for(int j=1;j<=arr[i];j++){          
				if(arr[i]%j==0){       
					count++;      
				}             
			}        
			if(count==2){       
				System.out.print("Prime Number "+arr[i]+" found at index "+i+ " ");  
			}                                                                                              
		} 		
                  	System.out.println();    
	} 
}                                    
