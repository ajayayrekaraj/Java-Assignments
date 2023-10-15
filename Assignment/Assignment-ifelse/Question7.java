/* Calculate profit or loss
   Write a program that takes the cost price and spelling price and calculates its profit or loss
   Input1:
   selling price=1200;
   cost price=1000;
   Output:profit of 200

   Input2:
   selling price=300;
   cost price=500;
   Output:loss of 200;

   Input3:
   selling price=900;
   cost price=900;
   Output:no profit and no loss
  */

class Question7{
	public static void main(String[]args){
		float SellingPrice=900f;
		float CostPrice=900f;
		float Profit;
		float Loss;

		if(SellingPrice>CostPrice){
			Profit=SellingPrice-CostPrice;
			System.out.println("Profit of "+Profit);
		}
		else if(SellingPrice<CostPrice){
			Loss=CostPrice-SellingPrice;
			System.out.println("Loss of " +Loss);
		}
		else if(SellingPrice==CostPrice){
			System.out.println("No profit and no loss");
		}
	}
}

	 
